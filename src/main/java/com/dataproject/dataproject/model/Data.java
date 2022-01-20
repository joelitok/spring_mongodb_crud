package com.dataproject.dataproject.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




@Document
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor @ToString
public class Data{
    @Id
    private String id;
    private BatteryData batteryData;
    private Module_1 module_1;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") 
    private Date time;


}
