package com.group8.dao.customer;

import com.group8.entity.Customer;
import com.group8.entity.Role;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * className:loginDao
 * discriptoin:
 * author:丁启斌
 * createTime:2018-11-22 09:05
 */
@Component
public interface LoginDao {
    /**
     * 用户注册
     * @param customer
     * @return
     */
    int register(Customer customer);


    Customer  SignIn(Customer customer);

    /**
     * 根据用户名查询师傅存在
     * @param userName
     * @return
     */
    Customer getByName(String userName);

    /**
     * 根据用户ID
     * 查询师傅存在
     * @param userId
     * @return
     */
    List<Role> getById(Integer userId);


}
