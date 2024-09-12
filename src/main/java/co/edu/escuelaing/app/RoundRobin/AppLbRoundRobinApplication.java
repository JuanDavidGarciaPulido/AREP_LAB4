package co.edu.escuelaing.app.RoundRobin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
        basePackages = {"co.edu.escuelaing.app.RoundRobin"},
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = co.edu.escuelaing.app.RoundRobin.LoadBalancerController.class),
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = co.edu.escuelaing.app.RoundRobin.WebController.class)
        },
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = co.edu.escuelaing.app.LogController.class)
        }
)
public class AppLbRoundRobinApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppLbRoundRobinApplication.class, args);
    }
}
