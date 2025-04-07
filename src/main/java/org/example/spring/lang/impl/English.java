package org.example.spring.lang.impl;

import org.example.spring.lang.ILanguage;

public class English  implements ILanguage {

    @Override
    public String textToAudio() {
        return "Hello";
    }

    @Override
    public String getBye() {
        return "Bye bye";
    }


}