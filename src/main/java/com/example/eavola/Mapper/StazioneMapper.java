package com.example.eavola.Mapper;

import com.example.eavola.DTO.StazioneDTO;
import com.example.eavola.Model.Stazione;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StazioneMapper {

    List<StazioneDTO> toDtos(List<Stazione> entity);
    StazioneDTO toDto(Stazione entity);
    Stazione toEntity(StazioneDTO dto);
    List<Stazione> toEntities(List<StazioneDTO> dtos);

}
