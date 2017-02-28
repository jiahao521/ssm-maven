package com.kaishengit.dao;

import com.kaishengit.pojo.User;

/**
 * Created by jiahao0 on 2017/2/28.
 */
public class UserDao {
    public void save(User user) {
        System.out.println(user.getName() + "saved");
    }
}
