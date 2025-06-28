package com.example.eavola.Controller;

import com.example.eavola.Exception.GlobalExceptionHandler;
import com.example.eavola.Model.Treno;
import com.example.eavola.Service.TrenoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/treni")
public class TrenoController {

    @Autowired
    private TrenoService trenoService;

    @Autowired
    private GlobalExceptionHandler globalExceptionHandler;

    @GetMapping
    public List<Treno> getAll() {
        return new ArrayList<>();
    }

}