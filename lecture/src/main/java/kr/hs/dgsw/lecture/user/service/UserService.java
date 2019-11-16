package kr.hs.dgsw.lecture.user.service;

import kr.hs.dgsw.lecture.user.model.User;

public interface UserService {
    public User selectByEmail(String email);
    public User selectByEmailAndPw(User user);
}
