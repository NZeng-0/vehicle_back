package com.ruoyi.vehicle.mapper;

import java.util.List;
import com.ruoyi.vehicle.domain.Users;
import org.apache.ibatis.annotations.*;
import org.springframework.security.core.parameters.P;

/**
 * 用户管理Mapper接口
 * 
 * @author me
 * @date 2025-04-05
 */
@Mapper
public interface UsersMapper 
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
     * 删除用户管理
     * 
     * @param id 用户管理主键
     * @return 结果
     */
    public int deleteUsersById(Long id);

    /**
     * 批量删除用户管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUsersByIds(Long[] ids);

    @Select("select * from t_users where username = #{username}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "password", column = "password"),
            @Result(property = "realName", column = "real_name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "role", column = "role")
    })
    Users selectUserByUserName(@Param("username") String username);


    @Select("SELECT COUNT(*) FROM t_users WHERE phone = #{phone}")
    int checkPhoneExists(@Param("phone") String phone);

    @Select("SELECT COUNT(*) FROM t_users WHERE real_name = #{realName}")
    int checkRealNameExists(@Param("realName") String realName);
}
