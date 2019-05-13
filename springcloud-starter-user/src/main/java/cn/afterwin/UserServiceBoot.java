package cn.afterwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author: zhengchj
 * @create: 2019-05-09 14:59
 **/
@SpringBootApplication
@EnableEurekaClient
public class UserServiceBoot {
    public static void main(String[] args){
        SpringApplication.run(UserServiceBoot.class, args);
    }
}
