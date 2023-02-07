package org.example;

import java.util.*;
import java.util.logging.Logger;
class Treeset {
    public static void main(String[] args){
        TreeSet<String> set=new TreeSet<>();
        Logger l = Logger.getLogger("com.api.jar");
        Scanner sc=new Scanner(System.in);

        String s;
        String s2="Enter your choice\n1.Add\n2.Remove\n3.size\n4.Print\n";
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
                    s=sc.next();
                    set.remove(s);
                    l.info("Removed the element");
                    break;
                }
                case 3:{
                    String k=String.valueOf(set.size());
                    l.info(k);
                    break;
                }
                case 4:{
                    String s1="The values in Set are "+set;
                    l.info(s1);
                    break;
                }
                default:{
                    System.exit(0);
                }
            }
        }
    }
}