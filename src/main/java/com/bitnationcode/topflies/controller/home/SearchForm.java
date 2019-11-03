package com.bitnationcode.topflies.controller.home;

import lombok.Data;

@Data
public class SearchForm {

    private String location;
    private String flyType;
    private String season;
    private String river;

    public SearchForm() {}
}
