package com.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时任务
 * @author lirt
 */

@Configuration
@EnableScheduling
public class QuartzConfig {

    /** 每20秒执行一次 **/
    @Scheduled(cron = "0/20 * * * * ?")
    public void scheduler() {
        System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");
    }
}
