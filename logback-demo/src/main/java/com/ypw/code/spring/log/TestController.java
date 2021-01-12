package com.ypw.code.spring.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/info")
    public String info() {
        log.trace(">>>>>>> trace <<<<<<<");
        log.debug(">>>>>>> debug <<<<<<<");
        log.info(">>>>>>> info <<<<<<<");
        log.warn(">>>>>>> warn <<<<<<<");
        log.error(">>>>>>> error <<<<<<<");
        return "info success";
    }

}
