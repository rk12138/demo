package com.yyy.springbootredis.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

//全局数据绑定

@ControllerAdvice
public class GlobalDataHandler {
    @ModelAttribute(name = "md")
    public Map<String, Object> setGlobalData() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("global", "true");
        return map;
    }
}
