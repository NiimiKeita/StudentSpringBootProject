package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    // GETリクエストを受け取ることを指定する。また、メソッドがマッピングするURLの定義する。
    @GetMapping("/hello2")
    // 返される文字列をHTTPレスポンスとすることを示す
    @ResponseBody
    // @RequestParam: リクエストパラメーターから受け取ったデータを変数にセット(バインド)する
    public String hello2(@RequestParam("name") String name) {
        // リクエストパラメータから取得した名前を用いて、「こんにちは、○○さん」という文字列を返す
        return "こんにちは、 "  + name + "さん";
    }
}