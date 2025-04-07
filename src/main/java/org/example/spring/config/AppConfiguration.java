package org.example.spring.config;

import org.example.spring.lang.impl.English;
import org.example.spring.lang.LanguageSp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@Configuration это annotation, который аннотируется на классе, этот класс определяет Spring BEAN.
//@Configuration позволяет нам использовать аннотации для внедрения зависимостей.
@Configuration


//02 Далее, Spring ищет в пакете "org.o7planning.spring.bean" чтобы создать другие Spring BEAN,
// (Создать объекты из класса аннотированные с помощью @Service, @Component или @Repository).
// @ComponentScan - Говорит Spring про пакеты для поиска других Spring BEAN, Spring сканирует (scan) эти пакеты для поиска.
@ComponentScan({"org.example.spring.bean"})
public class AppConfiguration {

    //Spring создает Spring BEAN, в соответствии с определениями в классе AppConfiguration,
    // 01 (Примечание: Класс AppConfiguration должен быть аннотирован с помощью @Configuration).
    //Вызовы методов @Bean в классах @Configuration также можно использовать для определения зависимостей между компонентами.
    //

    //В примере beanOne получает ссылку на beanTwo через внедрение конструктора.
    //Этот метод объявления зависимостей между компонентами работает только тогда,
    // когда метод @Bean объявлен в классе @Configuration. Вы не можете объявлять зависимости между компонентами, используя простые классы @Component.
    @Bean(name ="Vasiya")
    public LanguageSp Vasiya() {
        return new English();
    }


}
