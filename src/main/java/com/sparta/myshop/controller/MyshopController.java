package com.sparta.myshop.controller;

import com.sparta.myshop.dto.MyshopRequestDto;
import com.sparta.myshop.dto.MyshopResponseDto;
import com.sparta.myshop.service.MyshopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyshopController {
    private final MyshopService myshopService;

    public MyshopController(MyshopService myshopService) {
        this.myshopService = myshopService;
    }

    @PostMapping("/post")
    public MyshopResponseDto createMyshop(@RequestBody MyshopRequestDto myshopRequestDto) {
        return myshopService.createMyshop(myshopRequestDto);
    }

    @GetMapping("/post")
    public List<MyshopResponseDto> getMyshop() {
        return myshopService.getMyshop();
    }

    @PutMapping("/post/{id}")
    public Long updateMyshop(@PathVariable Long id, @RequestBody MyshopRequestDto myshopRequestDto) {
        return myshopService.updateMyshop(id, myshopRequestDto);
    }

    @DeleteMapping("/post/{id}")
    public Long deleteMyshop(@PathVariable Long id) {
        return myshopService.deleteMyshop(id);
    }
}
