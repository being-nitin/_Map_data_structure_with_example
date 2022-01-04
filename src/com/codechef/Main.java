package com.codechef;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        // Map data structure:
  HashMap <String,Integer> map = new HashMap<>();
  map.put("nitin",20);
        map.put("nitish",22);
        map.put("alok",21);
        map.put("alok",20);
        map.put("ravit",23);
        System.out.println(map);

    /*
    Duplicate key values are not allowed like in above i have taken two keys same that is alok 20 and
    alok 21 so it will take 2nd alok as a key value pair.
     */

    }
}
