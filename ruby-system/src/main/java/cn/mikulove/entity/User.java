package cn.mikulove.entity;

import lombok.Data;

/**
 * @Name:User
 * @Description:
 * @Author: Neil
 * @Date: 2020-05-26 18:09
 **/
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}