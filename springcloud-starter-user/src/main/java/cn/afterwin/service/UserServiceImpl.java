package cn.afterwin.service;

import cn.afterwin.dao.UserRepository;
import cn.afterwin.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: zhengchj
 * @create: 2019-05-09 16:15
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User showUser(long id) {
        return userRepository.findOne(id);
    }
}
