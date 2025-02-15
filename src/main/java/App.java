import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorld2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorld.getMessage());

        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getName());

        System.out.println("Do the variables \"helloWorld\" refer to the same object? "
                + (helloWorld == helloWorld2));
        System.out.println("Do the variables \"cat\" refer to the same object? "
                + (cat == cat2));
    }
}