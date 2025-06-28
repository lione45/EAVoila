package com.example.eavola.Controller;

import com.example.eavola.Exception.GlobalExceptionHandler;
import com.example.eavola.Mapper.FermataMapper;
import com.example.eavola.Model.Fermata;
import com.example.eavola.Repository.FermataRepository;
import com.example.eavola.Service.FermataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/fermate")
public class FermataController {

    @Autowired
    private FermataService fermataService;

    @Autowired
    private GlobalExceptionHandler globalExceptionHandler;

    @GetMapping
    public List<Fermata> getAll() {
        return new ArrayList<>();
    }



}
