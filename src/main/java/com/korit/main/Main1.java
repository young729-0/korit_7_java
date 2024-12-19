package com.korit.main;

import com.korit.service.ATestService;
import com.korit.service.BTestService;

public class Main1 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a);

        ATestService aTestService = new ATestService();
        BTestService bTestService = new BTestService();

        System.out.println(aTestService);
        System.out.println(bTestService);



    }
}
