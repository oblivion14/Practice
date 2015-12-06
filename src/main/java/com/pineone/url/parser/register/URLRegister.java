package com.pineone.url.parser.register;

import com.pineone.url.parser.itf.register.IURLRegister;

/**
 * Created by Melvin on 2015. 12. 6..
 */
public class URLRegister implements IURLRegister {


    public static String Host = "http://c.pineone.net:48080/hello";

    @Override
    public String putURL() {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("URL을 입력하세요 : ");
//        String InputURL = scanner.next();
//
//        System.out.println("입력 받은 URL은 " + InputURL + "입니다");
//
//        return InputURL;

        System.out.println("Test :" + Host);

        return Host;
    }
}
