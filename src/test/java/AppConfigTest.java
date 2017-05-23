import am.ak.full.annotation.AppConfig;
import am.ak.full.annotation.service.Bar;
import am.ak.full.annotation.service.Foo;
import am.ak.full.annotation.service.MyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * Created by karlen on 5/17/17.
 */
public class AppConfigTest {

    @Test
    public void testAnnotationConfigApplicationContext() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService bean = applicationContext.getBean(MyService.class);
        assertNotNull(bean);
    }

    @Test
    public void testInitMethod() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Foo bean = applicationContext.getBean(Foo.class);
        assertNotNull(bean);
    }

    @Test
    public void testDestroyMethod() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Bar bean = applicationContext.getBean(Bar.class);
        assertNotNull(bean);
    }
}
