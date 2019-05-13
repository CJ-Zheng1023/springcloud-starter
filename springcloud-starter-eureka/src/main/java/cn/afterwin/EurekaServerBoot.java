package cn.afterwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:
 * @author: zhengchj
 * @create: 2019-05-09 18:37
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerBoot {
    public static void main(String[] args){
        SpringApplication.run(EurekaServerBoot.class, args);
    }
}
