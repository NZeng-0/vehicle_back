package com.ruoyi.vehicle.service.impl;

import java.util.List;

import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.exception.user.UserPasswordNotMatchException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.manager.AsyncManager;
import com.ruoyi.framework.manager.factory.AsyncFactory;
import com.ruoyi.vehicle.utils.TokenUtils;
import org.apache.el.parser.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.ruoyi.vehicle.mapper.UsersMapper;
import com.ruoyi.vehicle.domain.Users;
import com.ruoyi.vehicle.service.IUsersService;

@Service
public class UsersServiceImpl implements IUsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Value("m91231e")
    private String secret;

    /**
     * 查询用户
     *
     * @param id 用户主键
     * @return 用户
     */
    @Override
    public Users selectUsersById(Long id) {
        Users users = usersMapper.selectUsersById(id);
        users.setPassword(null);
        return users;
    }

    /**
     * 查询用户列表
     *
     * @param users 用户
     * @return 用户
     */
    @Override
    public List<Users> selectUsersList(Users users) {
        return usersMapper.selectUsersList(users);
    }

    /**
     * 新增用户
     *
     * @param users 用户
     * @return 结果
     */
    @Override
    public int insertUsers(Users users) {
        // 检查手机号是否已存在
        if (usersMapper.checkPhoneExists(users.getPhone()) > 0) {
            throw new ServiceException("该手机号已被注册");
        }

        // 检查真实姓名是否已存在
        if (usersMapper.checkRealNameExists(users.getRealName()) > 0) {
            throw new ServiceException("该真实姓名已被使用");
        }
        String encryptedPassword = SecurityUtils.encryptPassword(users.getPassword());
        users.setPassword(encryptedPassword);

        users.setCreateTime(DateUtils.getNowDate());
        users.setRole("user");
        users.setStatus("pending");
        return usersMapper.insertUsers(users);
    }

    /**
     * 修改用户信息
     *
     * @param users 用户
     * @return 结果
     */
    @Override
    public int updateUsers(Users users) {
        if (users.getPassword() != null && !users.getPassword().isEmpty()) {
            String encryptedPassword = SecurityUtils.encryptPassword(users.getPassword());
            users.setPassword(encryptedPassword);
        }
        return usersMapper.updateUsers(users);
    }

    /**
     * 批量删除用户
     *
     * @param ids 需要删除的用户主键
     * @return 结果
     */
    @Override
    public int deleteUsersByIds(Long[] ids) {
        return usersMapper.deleteUsersByIds(ids);
    }

    /**
     * 删除用户信息
     *
     * @param id 用户主键
     * @return 结果
     */
    @Override
    public int deleteUsersById(Long id) {
        return usersMapper.deleteUsersById(id);
    }

    // 登录
    @Override
    public String login(String username, String password) {
        // 查询用户信息
        Users user = usersMapper.selectUserByUserName(username);

        if (user == null) {
            throw new ServiceException("用户不存在");
        }

        // 校验审核状态
        if (!"approved".equals(user.getStatus())) {
            // 你可以抛异常，或直接返回 null
            // 推荐抛出自定义异常，前端可显示具体提示
            throw new ServiceException("账号未审核或未通过，无法登录");
        }

        // 校验密码
        if (!SecurityUtils.matchesPassword(password, user.getPassword())) {
            throw new UserPasswordNotMatchException();
        }

        // 记录登录信息
        AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, Constants.LOGIN_SUCCESS, "登录成功"));
        // 生成 Token
        return TokenUtils.createToken(user.getUsername(), secret);
    }


    // 登出
    @Override
    public String logout() {
        // 记录登出日志
        AsyncManager.me().execute(AsyncFactory.recordLogininfor(SecurityUtils.getUsername(), Constants.LOGOUT, "退出成功"));
        return "登出成功";
    }

    @Override
    public Users getUserByName(String token) {
        String username = TokenUtils.getUsernameFromToken(token, secret);
        return usersMapper.selectUserByUserName(username);
    }
}
