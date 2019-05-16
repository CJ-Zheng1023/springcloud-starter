package cn.afterwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: zhengchj
 * @create: 2019-05-09 17:21
 **/
@SpringBootApplication
@EnableFeignClients
public class MovieServiceBoot {
    public static void main(String[] args){
        SpringApplication.run(MovieServiceBoot.class, args);
    }
}
