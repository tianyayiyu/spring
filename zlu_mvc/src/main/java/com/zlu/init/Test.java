package com.zlu.init;

import javax.servlet.ServletException;

public class Test {

    public static void main(String[] args) {
        try {
           SpringApplicationLuban.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
