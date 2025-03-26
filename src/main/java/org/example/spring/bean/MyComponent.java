package org.example.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//@Component это annotation, который используется для аннотации на классе чтобы сказать Spring что этот класс является Spring BEAN
//Аннотация @Component является общей аннотацией, которая указывает, что класс является частью компонентов приложения.
// Она не предоставляет никакой дополнительной функциональности, и ее можно считать «по умолчанию» для любого Spring-управляемого компонента.
@Component
public class MyComponent {


    //@Autowired аннотирован на поле (field) чтобы сказать Spring что нужно вколоть (inject) значение в это поле.
    // Примечание: вколоть здесь означает наподобии прикреплении значения этому полю.
    @Autowired
    private MyRepository repository;

    public void showAppInfo() {
        System.out.println("Now is: "+ repository.getSystemDateTime());
        System.out.println("App Name: "+ repository.getAppName());
    }

    public void formatAudioMp3(){
        System.out.println("Format audio: "+ repository.getFormatAudio());
    }

}
