package com.example.eavola.Controller;

import com.example.eavola.Exception.GlobalExceptionHandler;
import com.example.eavola.Mapper.StazioneMapper;
import com.example.eavola.Model.Stazione;
import com.example.eavola.Service.StazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stazioni")
public class StazioneController {

    @Autowired
    private StazioneService stazioneService;

    @Autowired
    private GlobalExceptionHandler globalExceptionHandler;

    @GetMapping
    public List<Stazione> getAll() {
        return new ArrayList<>();
    }

}