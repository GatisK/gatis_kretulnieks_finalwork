package lv.lu.gatis.kretulnieks.finalwork;

import lv.lu.gatis.kretulnieks.finalwork.config.AppConfiguration;
import lv.lu.gatis.kretulnieks.finalwork.ui.ConsoleUi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ProductAccountingApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.getBean(ConsoleUi.class).run();
    }
}
