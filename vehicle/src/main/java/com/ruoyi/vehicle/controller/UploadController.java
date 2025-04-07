package com.ruoyi.vehicle.controller;

import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/vehicle/uploads")
public class UploadController {

    private static final String UPLOAD_DIR = new File("uploads").getAbsolutePath();

    @PostMapping
    public AjaxResult upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return AjaxResult.error("上传文件不能为空");
        }

        try {
            // 确保目录存在
            File uploadDir = new File(UPLOAD_DIR);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }

            // 生成唯一文件名
            String originalFilename = file.getOriginalFilename();
            assert originalFilename != null;
            String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
            String filename = "img_" + System.currentTimeMillis() + suffix;

            // 保存文件
            File destFile = new File(uploadDir, filename);
            file.transferTo(destFile);

            // 返回可访问路径
            String fileUrl = "/uploads/" + filename;
            return AjaxResult.success("上传成功", fileUrl);

        } catch (IOException e) {
            e.printStackTrace();
            return AjaxResult.error("上传失败：" + e.getMessage());
        }
    }
}

