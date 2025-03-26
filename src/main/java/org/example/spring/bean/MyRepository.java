package org.example.spring.bean;

import org.springframework.stereotype.Repository;

import java.util.Date;


//@Repository это annotation, который используется для аннотации на классе чтобы сказать Spring что этот класс является Spring BEAN.
//Аннотация @Repository используется для обозначения классов в слое доступа к данным.
// Она не только служит индикатором для Spring, но и предоставляет дополнительные преимущества,
// такие как перехват исключений и преобразование их в Spring DataAccessException.
@Repository
public class MyRepository {

    public String getAppName() {
        return "Hello Spring App";
    }

    public Date getSystemDateTime() {
        return new Date();
    }

    public String getFormatAudio() {
        return "mp3";

    }
}
