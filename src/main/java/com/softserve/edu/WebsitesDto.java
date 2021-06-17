package com.softserve.edu;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WebsitesDto {
    @JsonProperty("websites")
    List<Map<String, SiteDto>> websites = new ArrayList<Map<String, SiteDto>>();

    public WebsitesDto() {
    }

    public List<Map<String, SiteDto>> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Map<String, SiteDto>> websites) {
        this.websites = websites;
    }


}
