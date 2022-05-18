package org.orph.dataservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import com.alibaba.nacos.api.config.annotation.NacosValue;
//import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;

//@MapperScan("org.orph.dataservice.mapper")
@SpringBootApplication
//@NacosPropertySource(dataId = "bamboo.test", autoRefreshed = true)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
