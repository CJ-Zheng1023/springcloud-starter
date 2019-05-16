package cn.afterwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description:
 * @author: zhengchj
 * @create: 2019-05-16 15:17
 **/
@SpringBootApplication
@EnableZuulProxy
public class ZuulBoot {
    public static void main(String[] args){
        SpringApplication.run(ZuulBoot.class, args);
    }
}
