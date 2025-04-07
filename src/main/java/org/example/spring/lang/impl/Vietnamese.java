package org.example.spring.lang.impl;

import org.example.spring.lang.ILanguage;

// Vietnamese
public class Vietnamese implements ILanguage {

    @Override
    public String textToAudio() {
        return "Xin Chao";
    }

    @Override
    public String getBye() {
        return "Tam Biet";
    }

}
