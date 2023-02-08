package org.example;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Treemap {
    public static void main(String[] args){
        String s1="Key-Value pairs: ";
        TreeMap<Integer,String> map=new TreeMap<>();
        Logger l = Logger.getLogger("com.api.jar");

        map.put(3,"Apple");
        map.put(1,"JackFruit");
        map.put(2,"Orange");
        map.put(4,"Grapes");

        l.log(Level.INFO,()->"Size: " +map.size());
        l.log(Level.INFO,()->"Keys : " + map.keySet());
        l.log(Level.INFO,()->"Values : " + map.values());
        l.log(Level.INFO,()-> s1 + map.entrySet());
        map.remove(3);

        l.info("After removing ");
        l.log(Level.INFO,()-> s1 + map.entrySet());

        l.log(Level.INFO,()->"Getting a value" + map.get(2));

        l.info("Replacing a value");
        map.replace(2,"Kiwi");

        l.info("After replacing ");
        l.log(Level.INFO,()-> s1 + map.entrySet());
    }
}
