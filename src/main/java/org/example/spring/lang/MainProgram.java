package org.example.spring.lang;

import org.example.spring.bean.GreetingService;
import org.example.spring.bean.MyComponent;
import org.example.spring.config.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProgram {

    public static void main(String[] args) {

        // Creating a Context Application object by reading
        // the configuration of the 'AppConfiguration' class.
        //Вы создаете объект ApplicationContext читая конфигурацию в классе AppConfiguration, как в коде ниже.
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        System.out.println("----------");
        Language language = (Language) context.getBean("language");

        System.out.println("Bean Language: "+ language);
        System.out.println("Call language.sayBye(): "+ language.getBye());

        System.out.println("----------");

        GreetingService service = (GreetingService) context.getBean("greetingService");


        service.sayGreeting();

        System.out.println("----------");

        MyComponent myComponent = (MyComponent) context.getBean("myComponent");

        myComponent.showAppInfo();
        myComponent.formatAudioMp3();

    }

}
