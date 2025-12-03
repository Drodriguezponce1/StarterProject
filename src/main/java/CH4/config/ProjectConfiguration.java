package CH4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"CH4/proxies", "CH4/repositories", "CH4/services"}
)
public class ProjectConfiguration {
}
