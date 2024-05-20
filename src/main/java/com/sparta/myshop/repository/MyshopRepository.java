package com.sparta.myshop.repository;

import com.sparta.myshop.entity.Myshop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyshopRepository extends JpaRepository<Myshop, Long> {
    List<Myshop> findAll();
}
