package com.example.eavola.Service;

import com.example.eavola.DTO.LineaDTO;
import com.example.eavola.Mapper.LineaMapper;
import com.example.eavola.Repository.LineaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class LineaService {

    @Autowired
    private LineaRepository lineaRepository;

    @Autowired
    private LineaMapper lineaMapper;

    public LineaDTO getLineaDTOByNome(String nome){
        return lineaMapper.toDto(lineaRepository.getLineaByNome(nome));
    }
}
