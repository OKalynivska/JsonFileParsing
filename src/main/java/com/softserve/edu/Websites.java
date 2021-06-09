package com.softserve.edu;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Websites {
    @JsonProperty("websites")
    List<Map<String, Site>> websites = new ArrayList<Map<String, Site>>();

    public Websites() {
    }

    public List<Map<String, Site>> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Map<String, Site>> websites) {
        this.websites = websites;
    }


    @Override
    public String toString() {
        return "Websites " + websites;
    }
}
