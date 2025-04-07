package com.ruoyi.vehicle.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.vehicle.domain.Photos;
import com.ruoyi.vehicle.service.IPhotosService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

@RestController
@RequestMapping("/vehicle/photos")
public class PhotosController extends BaseController
{
    @Autowired
    private IPhotosService photosService;

    /**
     * 查询列表
     */
    @GetMapping("/list")
    public TableDataInfo list(Photos photos)
    {
        startPage();
        List<Photos> list = photosService.selectPhotosList(photos);
        return getDataTable(list);
    }

    /**
     * 获取详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(photosService.selectPhotosById(id));
    }

    /**
     * 新增
     */
    @PostMapping
    public AjaxResult add(@RequestBody Photos photos)
    {
        return toAjax(photosService.insertPhotos(photos));
    }

    /**
     * 修改
     */
    @PutMapping
    public AjaxResult edit(@RequestBody Photos photos)
    {
        return toAjax(photosService.updatePhotos(photos));
    }

    /**
     * 删除
     */
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(photosService.deletePhotosByIds(ids));
    }
}
