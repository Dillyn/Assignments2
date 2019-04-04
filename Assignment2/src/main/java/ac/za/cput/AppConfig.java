package ac.za.cput;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
    public class AppConfig {

        @Bean(name="calc")

        public HelloInterface getService(){
            return new HelloImpl();
        }

    @Bean(name="HelloWorld")

    public HelloInterface getNewService(){
        return new HelloWorld();
    }
    }

