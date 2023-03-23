package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * packageName    : com.example.demo.entity
 * fileName       : Test
 * author         : 김재성
 * date           : 2023-03-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-23        김재성       최초 생성
 */

@Entity
public class Test {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String nickName;

}
