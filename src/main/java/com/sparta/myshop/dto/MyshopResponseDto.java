package com.sparta.myshop.dto;

import com.sparta.myshop.entity.Myshop;
import lombok.Getter;

@Getter
public class MyshopResponseDto {
    private Long id;
    private String title;
    private String content;
    private int price;
    private String username;

    public MyshopResponseDto(Myshop myshop) {
        this.id = myshop.getId();
        this.title = myshop.getTitle();
        this.content = myshop.getContent();
        this.price = myshop.getPrice();
        this.username = myshop.getUsername();
    }
}
