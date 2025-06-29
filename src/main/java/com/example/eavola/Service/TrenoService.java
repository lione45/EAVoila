package com.example.eavola.Service;

import com.example.eavola.DTO.LineaDTO;
import com.example.eavola.DTO.TrenoDTO;
import com.example.eavola.Mapper.LineaMapper;
import com.example.eavola.Mapper.StazioneMapper;
import com.example.eavola.Mapper.TrenoMapper;
import com.example.eavola.Repository.LineaRepository;
import com.example.eavola.Repository.StazioneRepository;
import com.example.eavola.Repository.TrenoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class TrenoService {

    @Autowired
    private TrenoMapper trenoMapper;

    @Autowired
    private TrenoRepository trenoRepository;

    @Autowired
    private StazioneService stazioneService;

    public List<TrenoDTO> getTrenoByModelloAndLinea(String fermata, String modello) {
        return trenoMapper.toDtos(trenoRepository.getTrenoByModelloAndLinea(modello, stazioneService.getStazioneDTOByNome(fermata).getId()).orElse(null));
    }

}
