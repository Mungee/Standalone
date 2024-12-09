package com.lavish;

import java.util.ArrayList;
import java.util.List;

public class ImmutableClass {
    final List<String> names=new ArrayList<>();
}

class Child extends ImmutableClass{
    void myMethod(){
        names.add("sdas");
    }
}
