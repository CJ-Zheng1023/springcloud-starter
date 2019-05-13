package cn.afterwin.service;

import cn.afterwin.config.FeignConfiguration;
import cn.afterwin.domain.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
