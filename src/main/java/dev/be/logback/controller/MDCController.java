package dev.be.logback.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MDCController {

    @GetMapping("/mdc")
    public String mdc(){
        /**
         * mdc : 멀티쓰레드 환경에서 로그를 남길때 사용
         * 멀티스레드 환경에서 스레드마다 고유한 로그값을 가지는데, 그걸 logback에 전달하기 위해 사용
         */

        // MDC를 사용할땐 put과 clear를 pair 처럼 사용!
        // 그렇지 않으면 다른 스레드가 get(job)을 했을때 dev를 얻을 수 있음
        MDC.put("job","dev");
        log.trace("log -> trace");
        log.debug("log -> debug");
        log.info("log -> info");
        log.warn("log -> warn");
        log.error("log -> error");
        MDC.clear();
        return "mdc";
    }
}
