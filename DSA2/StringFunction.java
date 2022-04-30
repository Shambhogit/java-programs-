package com.DSA2;

public class StringFunction {
    public static void main(String[] args) {
        // function to replace char in string
        // ---> stringName.replace('what to replace','with what');
        String name = "shambho jaybhaye";
        System.out.println(name);
        System.out.println(name.replace('h', 'a'));

        // to know the size of String we have length() method;
        System.out.println(name.length());

        //to convert any String to upper and lower case we have following two methode;
        System.out.println(name.toUpperCase());
        name = "SHAMBHO";
        System.out.println(name.toLowerCase());

        //to convert char array to String we have valueOf() methode;
        char[] a = {'r', 'e', 'y', 'w', 'o'};
        System.out.println(String.valueOf(a));

        //to make part of String we have
        System.out.println(name.substring(5));
        System.out.println(name.substring(0, 5));

        //to split string form any perticular point we have split() methode
//        String s = "shambho ramchndray jaybhaye";
//        String[] arr = s.split(" ");
//        System.out.println(Arrays.toString(arr));

        String s = "race a car";
        String aa = s.replaceAll(" ", "");
        String b = aa.replaceAll(",", "");
        System.out.println(aa);

    }
}
