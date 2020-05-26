package com.test.test.jenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wdk
 * @version v1.0.0
 * @date 2020/5/26
 */
@RestController
public class TestController {


    @RequestMapping("/test")
    public String hello(){
        return "hello jenkins!";
    }
}
