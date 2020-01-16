package com.example.Pigeons.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigeonsUtils {
      //porownuje email albo possword
    public static boolean checkEmailOrPassword(String pattern,String pStr){
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(pStr);
        return m.matches();
    }
}
