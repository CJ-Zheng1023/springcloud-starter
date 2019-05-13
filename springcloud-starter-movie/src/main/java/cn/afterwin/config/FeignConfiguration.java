package cn.afterwin.config;

import com.google.common.collect.Maps;
import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @description: 自定义feign client
 * @author: zhengchj
 * @create: 2019-05-13 15:02
 **/
public class FeignConfiguration {
    /**
     * 修改默认契约，如下配置可以使用feign提供的注解
     * @return
     */
    @Bean
    public Contract feignContract(){
        return new Contract.Default();
    }
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
