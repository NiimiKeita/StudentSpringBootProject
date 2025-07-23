package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// ControllerクラスがマッピングするURLを定義する
@RequestMapping("/")
// Controllerクラスであることを示す
@Controller
public class HelloController {

    // GETリクエストを受け取ることを指定する。また、メソッドがマッピングするURLの定義する。
    @GetMapping("/hello1")
    // 返される文字列をHTTPレスポンスとすることを示す
    @ResponseBody
    public String hello1() {
        // Hello Worldという文字列を返す
        return "Hello World";
    }
}