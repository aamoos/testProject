package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.example.demo.controller
 * fileName       : MainController
 * author         : 김재성
 * date           : 2023-03-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-23        김재성       최초 생성
 */

@RestController
public class MainController {

    @GetMapping("/main")
    public String main(){

        return "main page";
    }

}
