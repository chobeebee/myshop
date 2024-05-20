package com.sparta.myshop.entity;

import com.sparta.myshop.dto.MyshopRequestDto;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="myshop")
@NoArgsConstructor
public class Myshop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "username", nullable = false)
    private String username;

    public Myshop(MyshopRequestDto myshopRequestDto) {
        this.title = myshopRequestDto.getTitle();
        this.content = myshopRequestDto.getContent();
        this.price = myshopRequestDto.getPrice();
        this.username = myshopRequestDto.getUsername();
    }

    public void update(MyshopRequestDto myshopRequestDto) {
        this.title = myshopRequestDto.getTitle();
        this.content = myshopRequestDto.getContent();
        this.price = myshopRequestDto.getPrice();
        this.username = myshopRequestDto.getUsername();
    }
}
