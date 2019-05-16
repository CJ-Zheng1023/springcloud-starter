package cn.afterwin.service;

import cn.afterwin.config.FeignConfiguration;
import cn.afterwin.domain.User;
import feign.Param;
import feign.RequestLine;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zhengchj
 * @create: 2019-05-13 14:23
 **/
@FeignClient(name = "user-service", configuration = FeignConfiguration.class)
public interface UserService {
    //@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    //User getById(@PathVariable("id") long id);
    //使用feign提供的注解
    @RequestLine("GET /user/{id}")
    User getById(@Param("id") long id);
}
/*@Component
class UserServiceFallback implements UserService {
    @Override
    public User getById(long id) {
        User user = new User();
        user.setId(-1l);
        user.setAge(0);
        user.setUsername("none");
        return user;
    }
}*/
/*@Component
class UserServiceFallbackFactory implements FallbackFactory<UserService>{
    private static final Logger log = LoggerFactory.getLogger(UserServiceFallbackFactory.class);
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public User getById(long id) {
                log.info("fallback reason:", throwable);
                User user = new User();
                user.setId(-1l);
                user.setAge(0);
                user.setUsername("none");
                return user;
            }
        };
    }
}*/
