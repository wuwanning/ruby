package cn.mikulove;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Name:SystemApplication
 * @Description:
 * @Author: Neil
 * @Date: 2020-05-26 18:05
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.mikulove.system.dao")
public class SystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }
}
