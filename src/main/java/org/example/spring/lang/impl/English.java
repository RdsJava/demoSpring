package org.example.spring.lang.impl;

import org.example.spring.lang.LanguageSp;

public class English  implements LanguageSp {

    @Override
    public String getGreeting() {
        return "Hello";
    }

    @Override
    public String getBye() {
        return "Bye bye";
    }


}