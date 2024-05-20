package com.sparta.myshop.service;

import com.sparta.myshop.dto.MyshopRequestDto;
import com.sparta.myshop.dto.MyshopResponseDto;
import com.sparta.myshop.entity.Myshop;
import com.sparta.myshop.repository.MyshopRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MyshopService {
    private final MyshopRepository myshopRepository;

    public MyshopService(MyshopRepository myshopRepository) {
        this.myshopRepository = myshopRepository;
    }

    public MyshopResponseDto createMyshop(MyshopRequestDto myshopRequestDto) {
        Myshop myshop = new Myshop(myshopRequestDto);
        Myshop savedMyshop = myshopRepository.save(myshop);
        MyshopResponseDto myshopResponseDto = new MyshopResponseDto(myshop);

        return myshopResponseDto;
    }

    public List<MyshopResponseDto> getMyshop(){
        return myshopRepository.findAll().stream().map(MyshopResponseDto::new).toList();
    }

    @Transactional
    public Long updateMyshop(Long id, MyshopRequestDto myshopRequestDto) {
        Myshop myshop = findMyshop(id);
        myshop.update(myshopRequestDto);

        return id;
    }

    public Long deleteMyshop(Long id) {
        Myshop myshop = findMyshop(id);
        myshopRepository.delete(myshop);

        return id;
    }

    private Myshop findMyshop(Long id) {
        return myshopRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("게시글을 찾을 수 없습니다."));
    }
}
