package com.example.lab5;

import java.io.Serializable;
import java.util.ArrayList;

public class Sentence implements Serializable {
    public ArrayList<String> badSentence;
    public ArrayList<String> goodSentence;

    public Sentence(){
        this.badSentence = new ArrayList();
        this.goodSentence = new ArrayList();
    }
}
