package com.example.eavola.Service;

import com.example.eavola.DTO.LineaDTO;
import com.example.eavola.DTO.StazioneDTO;
import com.example.eavola.Mapper.StazioneMapper;
import com.example.eavola.Repository.StazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StazioneService {

    @Autowired
    private StazioneRepository stazioneRepository;

    @Autowired
    private StazioneMapper stazioneMapper;

    public StazioneDTO getStazioneDTOByNome(String nome){
        return stazioneMapper.toDto(stazioneRepository.getStazioneByNome(nome));
    }

}
