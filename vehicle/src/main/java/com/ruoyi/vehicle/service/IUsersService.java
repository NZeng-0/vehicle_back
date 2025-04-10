package com.ruoyi.vehicle.service;

import java.util.List;
import com.ruoyi.vehicle.domain.Users;

/**
 * 用户管理Service接口
 * 
 * @author me
 * @date 2025-04-05
 */
public interface IUsersService 
{
    /**
     * 查询用户管理
     * 
     * @param id 用户管理主键
     * @return 用户管理
     */
    public Users selectUsersById(Long id);


    /**
     * 查询用户管理列表
     * 
     * @param users 用户管理
     * @return 用户管理集合
     */
    public List<Users> selectUsersList(Users users);

    /**
     * 新增用户管理
     * 
     * @param users 用户管理
     * @return 结果
     */
    public int insertUsers(Users users);

    /**
     * 修改用户管理
     * 
     * @param users 用户管理
     * @return 结果
     */
    public int updateUsers(Users users);

    /**
     * 批量删除用户管理
     * 
     * @param ids 需要删除的用户管理主键集合
     * @return 结果
     */
    public int deleteUsersByIds(Long[] ids);

    /**
     * 删除用户管理信息
     * 
     * @param id 用户管理主键
     * @return 结果
     */
    public int deleteUsersById(Long id);

    String login(String username, String password);
    String logout(String token);
    Users getUserByName(String token);
    boolean checkPassword(Users user);
}
