package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Chuyskiy chuyskiy = applicationContext.getBean("chuyskiy", Chuyskiy.class);
        System.out.println(chuyskiy);

        JibekJoly jibekJoly = applicationContext.getBean("jibekJoly", JibekJoly.class);
        System.out.println(jibekJoly.getClass());

        Street street = applicationContext.getBean("street", Street.class);
        street.getInterface1().method1();
        street.getInterface2().method2();
        applicationContext.close();
    }
}
