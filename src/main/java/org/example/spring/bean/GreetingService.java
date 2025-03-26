package org.example.spring.bean;

import org.example.spring.lang.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// @Service это annotation, который используется для аннотации на одном классе чтобы сказать Spring,
// что этот класс является Spring BEAN.
//Аннотация @Service используется для обозначения классов в слое сервисов. Это особый случай @Component,
// который имеет больший семантический вес. Использование @Service вместо @Component может улучшить читаемость кода,
// указывая, что класс служит определенной бизнес-логике.
@Service
public class GreetingService {


    //@Autowired аннотирован на поле (field) чтобы сказать Spring что нужно вколоть (inject) значение в это поле.
    // Примечание: вколоть здесь означает наподобии прикреплении значения этому полю.
    @Autowired
    private Language language;

    public GreetingService() {

    }

    public void sayGreeting() {

        String greeting = language.getGreeting();

        System.out.println("Greeting: " + greeting);
    }

}