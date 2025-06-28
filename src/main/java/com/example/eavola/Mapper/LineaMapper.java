package com.example.eavola.Mapper;

import com.example.eavola.DTO.LineaDTO;
import com.example.eavola.Model.Linea;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LineaMapper {

    LineaDTO toDto(Linea entity);
    List<LineaDTO> toDtos(List<Linea> entity);
    Linea toEntity(LineaDTO dto);
    List<Linea> toEntities(List<LineaDTO> dtos);

}
