package org.example;

import java.util.*;
import java.util.logging.Logger;
public class Hashset {
    public static void main(String[] args){
        HashSet<String> set=new HashSet<>();
        Logger l = Logger.getLogger("com.api.jar");
        Scanner sc=new Scanner(System.in);

        String s;
        String s2="Enter your choice\n1.Add\n2.Print\n3.Remove\n4.Size";
        while (true) {
            l.info(s2);
            int ch=sc.nextInt();
            switch(ch){
                case 1:{
                    set.add(sc.next());
                    l.info("Added the element");
                    break;
                }
                case 2:{
                    String s1="The values in Set are "+set;
                    l.info(s1);
                    break;
                }
                case 3:{
                    s=sc.next();
                    set.remove(s);
                    l.info("Removed the element");
                    break;
                }
                case 4:{
                    String k=String.valueOf(set.size());
                    l.info(k);
                    break;
                }
                default:{
                    System.exit(0);
                }
            }
        }
    }
}