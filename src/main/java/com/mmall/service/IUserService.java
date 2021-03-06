package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import org.springframework.stereotype.Service;


public interface IUserService {
    ServerResponse<User> login(String username, String password);
    ServerResponse<String> register(User user);
    ServerResponse<String> checkValid(String str,String type);
    ServerResponse<String> selectQuestion(String username);
    ServerResponse<Integer> checkAnswer(String username,String password,String question);
    ServerResponse<String> forgetResetPassword(String passwordOld,String passwordNew,String forgetToken);
    ServerResponse<String> resetPassword(String passwordOld,String passwordNew,User user);
    ServerResponse<User> updateInformation(User user);
    ServerResponse<User> getInformation(Integer userId);
    ServerResponse checkAdminRole(User user);

}
