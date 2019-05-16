package cn.afterwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author: zhengchj
 * @create: 2019-05-16 17:00
 **/
@SpringBootApplication
@EnableEurekaClient
public class FileUploadServiceBoot {
    public static void main(String[] args){
        SpringApplication.run(FileUploadServiceBoot.class, args);
    }
}
