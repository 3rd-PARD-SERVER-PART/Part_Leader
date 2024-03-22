package com.pard.seminar.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RequestParamController {
    @RequestMapping("/basic")
    public String requestParam(
            @RequestParam("name") String hiName,
            @RequestParam("age") int hiAge) {
        return "requestParam 연습 name : " + hiName + " age : " + hiAge;
    }

    @RequestMapping("/v2")
    public String requestParamV2(
            @RequestParam String name,
            @RequestParam int age) {
        return "requestParamV2 연습 name : " + name + " age : " + age;
    }
    @RequestMapping("/v3")
    public String requestParamV3(
            String name,
            int age) {
        return "requestParamV3 연습 name : " + name + " age : " + age;
    }
    @RequestMapping("/v4")
    public String requestParamV4(
            @RequestParam(required = true) String name,
            @RequestParam(required = false) Integer age) {
        return "requestParamV4 연습 name : " + name + " age : " + age;
    }
    @RequestMapping("/default")
    public String requestParamDefault(
            @RequestParam(required = true, defaultValue = "guest") String name,
            @RequestParam(required = false, defaultValue = "-1") int age) {
        return "requestParamV5 연습 name : " + name + " age : " + age;
    }
    @RequestMapping("/map")
    public String requestParamMap(@RequestParam Map<String, Object> paramMap) {
        return "requestParamV6 연습 name : " + paramMap.get("name") + " age : " + paramMap.get("age");
    }
}
