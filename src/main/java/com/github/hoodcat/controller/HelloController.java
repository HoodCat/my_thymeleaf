package com.github.hoodcat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("variable_expression")
    public String variableExpression() {
        return "variable_expression";
    }

    @RequestMapping("utility_object")
    public String utilityObject() {
        return "utility_object";
    }

    @RequestMapping("parameter")
    public String parameter() {
        return "parameter";
    }
}
