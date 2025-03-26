package org.example.spring.lang.impl;

import org.example.spring.lang.Language;

// Vietnamese
public class Vietnamese implements Language {

    @Override
    public String getGreeting() {
        return "Xin Chao";
    }

    @Override
    public String getBye() {
        return "Tam Biet";
    }

}
