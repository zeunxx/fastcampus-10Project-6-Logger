package dev.be.logback.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController2 {

    public static final Logger log = LoggerFactory.getLogger("SQL_LOG2");

    @GetMapping("/query2")
    public String query2(){
        log.trace("log -> trace");
        log.debug("log -> debug");
        log.info("log -> info");
        log.warn("log -> warn");
        log.error("log -> error");
        return "query2";
    }
}
