package com.softserve.edu;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class Helper {
    public static ObjectMapper objectMapper = new ObjectMapper();
    WebsitesDto websites;
    File file = new File("jsonTask.json");

    {
        try {
            websites = objectMapper.readValue(file, WebsitesDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

