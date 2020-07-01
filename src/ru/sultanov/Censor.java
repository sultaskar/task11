package ru.sultanov;

import java.util.regex.*;

public class Censor {

    private String exp;

    public void Cense(String exp) {
        this.exp = exp;
        System.out.println(exp.replaceAll("\\b(?i)бяка\\b","***"));
    }
}
