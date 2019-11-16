package kr.hs.dgsw.lecture.user.service;

import kr.hs.dgsw.lecture.user.mapper.UserMapper;
import kr.hs.dgsw.lecture.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public User selectByEmail(String email) {
        return userMapper.selectByEmail(email);
    }

    @Override
    public  User selectByEmailAndPw(User user) {
        return userMapper.selectByEmailAndPw(user);
    }
}
