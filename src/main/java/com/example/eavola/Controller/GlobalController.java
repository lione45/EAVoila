package com.example.eavola.Controller;

import com.example.eavola.DTO.TrenoDTO;
import com.example.eavola.Exception.GlobalExceptionHandler;
import com.example.eavola.Service.FermataService;
import com.example.eavola.Service.LineaService;
import com.example.eavola.Service.StazioneService;
import com.example.eavola.Service.TrenoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/global")
public class GlobalController {

    @Autowired
    private FermataService fermataService;

    @Autowired
    private LineaService lineaService;

    @Autowired
    private StazioneService stazioneService;

    @Autowired
    private TrenoService trenoService;

    @Autowired
    private GlobalExceptionHandler globalExceptionHandler;

    @GetMapping("/{fermata}/{modello}")
    public ResponseEntity<?> isCorrectTrain(@PathVariable("fermata") String fermata, @PathVariable("modello") String modello) {
        List<TrenoDTO> trenoDTO = trenoService.getTrenoByModelloAndLinea(fermata, modello);
        return (!trenoDTO.isEmpty()) ? new ResponseEntity<>(trenoDTO, HttpStatus.OK) : new ResponseEntity<>(trenoDTO, HttpStatus.NOT_FOUND);
    }



}
