package com.dataproject.dataproject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Data;


@Document
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class Module_1 {
    @Id
    private String id;
    private int modulesn;
    private int current;
    private double soh;
    private double soc;
    private int temperature_senior;
    private int temperature_uc;

}
