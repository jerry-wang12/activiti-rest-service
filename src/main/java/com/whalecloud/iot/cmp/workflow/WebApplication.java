package com.whalecloud.iot.cmp.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <Description> <br>
 *
 * @author zhangliang <br>
 * @version 9.0 <br>
 * @taskId <br>
 * @CreateDate 18/6/27 <br>
 * @since V9.0 <br>
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = {
    org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class
})
@ComponentScan({
    "org.activiti.app.conf", "org.activiti.app.rest.*", "com.whalecloud.iot.cmp.workflow"
})
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
