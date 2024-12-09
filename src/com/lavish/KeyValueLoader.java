package com.lavish;

import java.io.*;
import java.net.URL;
import java.util.*;

public class KeyValueLoader {

    public static void main(String[] args) throws IOException {
        URL url = KeyValueLoader.class.getResource("app.properties");
        Scanner scanner = new Scanner(new File(url.getPath()));
        Map<String, List<String>> keys = new HashMap<>();
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            String[] arr = line.split("=");
            keys.computeIfAbsent(arr[0], k->new ArrayList<String>());
            keys.get(arr[0]).add(arr[1]);
        }
        keys.keySet().stream().forEach(k->{
            if(keys.get(k).size()>1){
                System.out.println(k+"::"+keys.get(k));
            }
        });
    }
}
