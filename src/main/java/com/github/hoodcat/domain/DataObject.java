package com.github.hoodcat.domain;

import lombok.Data;

@Data
public class DataObject {
    private Integer id;
    private String  name;
    private String  value;

    public DataObject(Integer id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }
}
