package org.example;

import java.util.*;
import java.util.logging.Logger;
public class Hashset {
    public static void main(String[] args){
        Logger l = Logger.getLogger("com.api.jar");
        String s;
        String s2="Enter your choice\n1.Add\n2.Print\n3.Size\n4.Remove";

        Scanner sc=new Scanner(System.in);
        HashSet<String> set=new HashSet<>();

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
                    String k=String.valueOf(set.size());
                    l.info(k);
                    break;
                }
                case 4:{
                    s=sc.next();
                    set.remove(s);
                    l.info("Removed the element");
                    break;
                }
                default:{
                    System.exit(0);
                }
            }
        }
    }
}