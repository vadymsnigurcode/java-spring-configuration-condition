import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.sql.Driver;

@Configuration
@PropertySources({
        @PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true),
//        @PropertySource(value = "classpath:application-${spring.profiles.active}.properties", ignoreResourceNotFound = true)
})
public class DefaultConfig {

    @Bean
    @Conditional(DataSourcePropertiesSetCondition.class)
    public DataSource dataSource(Environment environment) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Driver driver = (Driver) Class.forName(environment.getProperty("spring.datasource.driver-class-name")).newInstance();
        String url = environment.getProperty("spring.datasource.url");
        return new SimpleDriverDataSource(driver, url);
    }
}
