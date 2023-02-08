package org.example;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Hashmap {
    public static void main(String[] args){
        Logger l = Logger.getLogger("com.api.jar");
        HashMap<Integer,String> map=new HashMap<>();
        String s1= "Key-Value pairs: ";

        map.put(4,"Grapes");
        map.put(2,"Orange");
        map.put(3,"Apple");
        map.put(1,"JackFruit");

        l.log(Level.INFO,()->"Size: " +map.size());
        l.log(Level.INFO,()->"Values : " + map.values());
        l.log(Level.INFO,()->"Keys : " + map.keySet());
        l.log(Level.INFO,()-> s1 + map.entrySet());
        map.remove(2);

        l.log(Level.INFO,()-> "Getting a value"+map.get(2));
        map.replace(2,"Kiwi");

        l.info("After removing ");
        l.log(Level.INFO,()-> s1 +map.entrySet());

        l.info("After replacing ");
        l.log(Level.INFO,()-> s1 + map.entrySet());
    }
}
