package com.example.eavola.Controller;

import com.example.eavola.Exception.GlobalExceptionHandler;
import com.example.eavola.Mapper.LineaMapper;
import com.example.eavola.Model.Linea;
import com.example.eavola.Service.LineaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/linee")
public class LineaController {

    @Autowired
    private LineaService lineaService;

    @Autowired
    private GlobalExceptionHandler globalExceptionHandler;

    @GetMapping
    public List<Linea> getAll() { return new ArrayList<>(); }

}