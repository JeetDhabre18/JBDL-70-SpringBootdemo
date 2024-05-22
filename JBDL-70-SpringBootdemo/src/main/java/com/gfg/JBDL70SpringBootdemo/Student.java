package com.gfg.JBDL70SpringBootdemo;

import lombok.*;
// like lombook after java 17 record is came same like lombook just explore it
// lombook demo
//default constructor
@NoArgsConstructor

// tostring method
@ToString

//getter and setter
@Getter
@Setter

//argument constructor
@AllArgsConstructor

//design pattern
@Builder
public class Student {
    private String name;

    private int age;


}
