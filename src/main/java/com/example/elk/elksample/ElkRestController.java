package com.example.elk.elksample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sample
 * http://development.wombatsecurity.com/development/2018/12/20/json-logging-for-spring-boot/
 * https://medium.com/@d.lopez.j/easily-connecting-your-spring-boot-applications-to-the-elastic-stack-with-log4j2-1809e81c6a2e
 * https://qiita.com/DaichiKato/items/57f7f9a2a3c4991b3cf8
 */
@RestController
@RequestMapping("test")
public class ElkRestController {

    Logger logger = LoggerFactory.getLogger(ElkRestController.class);

    @GetMapping
    public String test() {
        // Logは出る
        logger.info("ElkRestController: information level from logger variable");
        logger.warn("ElkRestController: warn level from logger variable");

        // return値は出ない
        return "ElkRestController: from return message";
    }
}
