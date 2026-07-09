package com.devtiro.maven.services.impl;

import com.devtiro.maven.services.GreenPrinter;
import org.springframework.stereotype.Component;


@Component
public class SpanishGreenPrinter implements GreenPrinter {
    public String print(){
        return "verde";
    }
}
