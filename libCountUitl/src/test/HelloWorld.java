package test;

import java.util.Arrays;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        String str = "hello world   xxxxx   world";

//        List<String> list= Arrays.asList(str);
//        for (String s1:list) {
//            System.out.println(s1.charAt(2));
//        }

        char a = '2';
        char c = 'e';
        String ss = String.valueOf(c);
        char b = str.charAt(1);
//        System.out.println(b);
//        System.out.println(ss);

        System.out.println(str.indexOf("world"));
    }
}
