package cn.afterwin.controller;

import cn.afterwin.domain.User;


import cn.afterwin.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description:
 * @author: zhengchj
 * @create: 2019-05-09 17:24
 **/
@RestController
@RequestMapping("/movie")
public class MovieController {
    private static final Logger log = LoggerFactory.getLogger(MovieController.class);
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private UserService userService;
    @GetMapping("/user/{id}")
    //@HystrixCommand(fallbackMethod = "showUserFallback")
    public User showUser(@PathVariable long id){
        return userService.getById(id);
    }
    @GetMapping("/user/server-info")
    public String showUserServerInfo(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("user-service");
        log.info("{}:{}:{}", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort());
        return serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":" + serviceInstance.getPort();
    }
    /*private User showUserFallback(long id, Throwable throwable){
        log.error("异常：", throwable);
        User user = new User();
        user.setId(-1l);
        user.setAge(0);
        user.setUsername("none");
        return user;
    }*/

}
