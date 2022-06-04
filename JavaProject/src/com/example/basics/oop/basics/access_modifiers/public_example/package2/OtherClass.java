package com.example.basics.oop.basics.access_modifiers.public_example.package2;

import com.example.basics.oop.basics.access_modifiers.public_example.package1.BasicClass;

public class OtherClass extends BasicClass {
    public OtherClass(){
        name = "Other Class";
        this.setName("OtherClass");
    }
}
