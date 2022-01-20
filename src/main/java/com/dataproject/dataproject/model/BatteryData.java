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
public class BatteryData {
    @Id
    private String id;
    private int voltage;
    private int outputVoltage;

}
