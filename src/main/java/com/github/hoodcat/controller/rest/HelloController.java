package com.github.hoodcat.controller.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hoodcat.domain.DataObject;

/* 해당 클래스가 RestController 라는 것을 나타냄 */
@RestController(value="restHelloController")
public class HelloController {
    String[] names = { "kim", "lee", "park", "choi", "jo" };

    String[] mails = { "kim@tuuyano.com", "lee@flower", "park@yamda", "choi@happy", "jo@baseball" };

    /* 브라우저의 경로를 지정하는 어노테이션이다. */
    @RequestMapping(path = "/")
    /* 반환형은 항상 String. 반환하는 텍스트가 클라이언트 측에 전송되는 텍스트다. */
    public String index() {
        return "Hello Spring-Boot World!";
    }

    /*@RequestMapping(path = "/{num}")
    public String hasArguIndex(@PathVariable int num) {
        int res = 0;
        for (int i = 0; i <= num; i++) {
            res += i;
        }
        return "total: " + res;
    }*/
    
    /* RestController는 객체를 반환하면 자동으로 JSON 형태로 반환이 된다 */
    @RequestMapping(path = "/{id}")
    public DataObject hasArguIndex(@PathVariable int id) {
        return new DataObject(id, names[id], mails[id]);
    }
}
