package com.semicolon.FibonacciApp.controller;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReportController {

    @GetMapping("/surefire-report")
    @ResponseBody
    public Resource getSurefireReport() {
        return new FileSystemResource("target/site/surefire-report.html");
    }

}
