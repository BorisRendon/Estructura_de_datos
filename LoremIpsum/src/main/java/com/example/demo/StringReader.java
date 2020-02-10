package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StringReader {

    public String x;


    public String StringReader(String str){

        Map<Character,Integer> ContadordeChars = new HashMap<>();

        for(Character c : str.toCharArray() ){
            if(ContadordeChars.containsKey(c)){
                ContadordeChars.put(c,ContadordeChars.get(c)+1);

            }else {
                ContadordeChars.put(c,1);
            }



        }

        Character  [] key = ContadordeChars.keySet().toArray(new Character [0]);
        //System.out.println(Arrays.toString((key)));

        Integer [] values = ContadordeChars.values().toArray(new Integer[0]);
        //System.out.println(Arrays.toString(values));

        for(int i =0; i <ContadordeChars.size();i++){
            System.out.println(key[i] + ":" + values[i]);
        }
        //System.out.println(ContadordeChars);
        return str;
    }


}
