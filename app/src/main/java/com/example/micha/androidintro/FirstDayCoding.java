package com.example.micha.androidintro;
import java.sql.SQLOutput;
import java.util.*;

/**
 * Created by micha on 1/9/2018.
 */

public class FirstDayCoding {

    public static void main(String[] args) {
        System.out.println(FirstDayCoding.palandrome("tv"));
        System.out.print("\n");
        String[] list = new String[]{"Party","Q","Q","Q","Happy","Party"};
        duplicate(new ArrayList(Arrays.asList(list)));
        System.out.print("\n");
        fizzbuzz();

    }

    public static void duplicate(List<String> array){
        int i = 0;
        int j = 1;
        while(i < array.size()-1){
            if(array.size() == 1){
                return;
            }
            if(array.get(i).equals(array.get(j))){
                System.out.println(array.get(j));
                array.remove(j);
            }
            else {
                j++;
            }
            if(j >= array.size()){
                i++;
                j = i + 1;
            }
        }
    }

    public static boolean palandrome(String string){
        int mid = string.length()/2;
        for(int i = 0; i < mid; i++){
           if(string.charAt(i)!=string.charAt(string.length()-1-i)){
               return false;
           }
        }
        return true;
    }

    public static void fizzbuzz(){
        for(int i = 0; i <= 20; i++){
            if(i%15 == 0){
                System.out.println("fizzbuzz");
            }
            else if(i%5 == 0){
                System.out.println("buzz");
            }
            else if(i%3 == 0){
                System.out.println("fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
