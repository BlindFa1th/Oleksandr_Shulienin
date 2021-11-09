package com.company;
import java.util.*;


class Main{
    public static List<Integer> getIntegersFromList(List<Object> list){
        List<Integer> list_int= new ArrayList<Integer>();
        for(Object arrayitem: list){
            if (arrayitem instanceof Integer){
                list_int.add((int)arrayitem);
            }
        }
        System.out.println(list_int);
        return list_int;
    }
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        list.add("D&T");
        list.add(50);
        list.add(3);
        list.add("2021");
        list.add(228);
        list.add(322);
        List<Integer> list_int = getIntegersFromList(list);
    }
}
