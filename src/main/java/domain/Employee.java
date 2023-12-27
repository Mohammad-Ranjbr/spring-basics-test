package domain;

import lombok.Getter;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Getter
@Profile("prod")
@EnableScheduling
@EnableAsync
@PropertySource("classpath:application.properties")
public class Employee {

    private String name = "Akbar";

    public Employee(String employeeName) {
        this.name = employeeName;
    }

    @Scheduled(fixedDelay = 1000 , initialDelay = 9000)
    public void scheduleFixedDelayTask(){
        System.out.println("Fixed delay task - "+System.currentTimeMillis() / 1000);
    }

    @Scheduled(fixedRate = 1000)
    public void scheduleFixedRateTask(){
        System.out.println("Fixed rate task - "+System.currentTimeMillis() / 1000);
    }

    @Async
    @Scheduled(fixedRate = 1000)
    public void scheduleFixedRateTaskAsync() throws InterruptedException{
        System.out.println("Fixed rate task async - "+System.currentTimeMillis() / 1000);
        Thread.sleep(2000);
    }

}
