package kr.hs.dgsw.lecture.user.mapper;

import kr.hs.dgsw.lecture.user.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    public User selectByEmail(String email);
    public User selectByEmailAndPw(User user);
}
