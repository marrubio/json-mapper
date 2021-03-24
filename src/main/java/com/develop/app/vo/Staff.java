package com.develop.app.vo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Staff {

    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private int age;
    @JsonProperty("position")
    private String[] position;              //  Array
    @JsonProperty("skills")
    private List<String> skills;            //  List
    @JsonProperty("salary")
    private Map<String, BigDecimal> salary; //  Map

    // getters , setters, some boring stuff
}
