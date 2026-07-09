package com.devtiro.maven.services.impl;

import com.devtiro.maven.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class SpanishRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "roja";
    }
}
