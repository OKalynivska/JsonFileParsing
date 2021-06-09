package com.softserve.edu;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        File file =new File("jsonTask.json");
        if (file.exists()){
        ObjectMapper objectMapper = new ObjectMapper();
            Websites websites   = null;
            try {
                websites = objectMapper.readValue(file, Websites.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
 //           for(Map<String, Site> website:websites.getWebsites()){
//                for(Map.Entry<String,Site> entry:website.entrySet()){
//                    System.out.println(entry.getKey());
//                    System.out.println("id "+entry.getValue().getId());
//                    System.out.println("books ");
//                    for(Book book:entry.getValue().getBooks()){
//                        System.out.println(book);


        System.out.println(websites);}

    }
}//}
//}
//}
