package kr.hs.dgsw.lecture.user.controller;

import kr.hs.dgsw.lecture.user.model.User;
import kr.hs.dgsw.lecture.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public User getUserByEmail(@RequestParam("email") String email, @RequestParam("pw") String pw) {
        User requestUser = new User();
        requestUser.setEmail(email);
        requestUser.setPw(pw);
        User user = userService.selectByEmailAndPw(requestUser);
        return user;
    }
}
