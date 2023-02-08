package org.example;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Hashmap {
    public static void main(String[] args){
        HashMap<Integer,String> map=new HashMap<>();
        Logger l = Logger.getLogger("com.api.jar");

        map.put(3,"Apple");
        map.put(1,"JackFruit");
        map.put(2,"Orange");
        map.put(4,"Grapes");

        l.log(Level.INFO,()->"Size: " +map.size());
        l.log(Level.INFO,()->"Keys : " + map.keySet());
        l.log(Level.INFO,()->"Values : " + map.values());
        l.log(Level.INFO,()-> "Key-Value pairs: " + map.entrySet());
        map.remove(3);

        l.info("After removing ");
        l.log(Level.INFO,()-> "Key-Value pairs: " + map.entrySet());

        l.log(Level.INFO,()-> "Getting a value"+map.get(2));
        map.replace(2,"Kiwi");

        l.info("After replacing ");
        l.log(Level.INFO,()-> "Key-Value pairs: " + map.entrySet());
    }
}
