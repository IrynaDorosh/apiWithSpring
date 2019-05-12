package com.dorosh.springPractice.autowired_ML_1;
import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

    @Autowired
    private SpellChecker spellChecker;

    public TextEditor() {
        System.out.println("inside TE constructor");
    }

    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
