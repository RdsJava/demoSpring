package org.example.spring.lang.impl;

import org.example.spring.lang.LanguageSp;

// Vietnamese
public class Vietnamese implements LanguageSp {

    @Override
    public String getGreeting() {
        return "Xin Chao";
    }

    @Override
    public String getBye() {
        return "Tam Biet";
    }

}
