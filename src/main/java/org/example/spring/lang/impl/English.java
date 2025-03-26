package org.example.spring.lang.impl;

import org.example.spring.lang.Language;

public class English  implements Language {

    @Override
    public String getGreeting() {
        return "Hello";
    }

    @Override
    public String getBye() {
        return "Bye bye";
    }


}