package com.example.eavola.Mapper;

import com.example.eavola.DTO.FermataDTO;
import com.example.eavola.Model.Fermata;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FermataMapper {

    FermataDTO toDto(Fermata entity);
    List<FermataDTO> toDtos(List<Fermata> entity);
    Fermata toEntity(FermataDTO dto);
    List<Fermata> toEntities(List<FermataDTO> dtos);

}
