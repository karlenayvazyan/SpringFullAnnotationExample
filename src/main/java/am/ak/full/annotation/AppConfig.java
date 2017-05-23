package am.ak.full.annotation;

import am.ak.full.annotation.service.Bar;
import am.ak.full.annotation.service.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by karlen on 5/17/17.
 */
@Configuration
@ComponentScan(basePackages = "am.ak.full.annotation")
public class AppConfig {

    @Bean(initMethod = "init")
    public Foo foo() {
        return new Foo();
    }

    @Bean(destroyMethod = "cleanUp")
    public Bar bar() {
        return new Bar();
    }
}
