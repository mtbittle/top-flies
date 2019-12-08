package com.bitnationcode.topflies.controller.home;

import lombok.Data;

@Data
public class SearchForm {

    private String region;
    private String flyType;
    private String season;
    private String river;
    private String state;

    public SearchForm() {}
}
