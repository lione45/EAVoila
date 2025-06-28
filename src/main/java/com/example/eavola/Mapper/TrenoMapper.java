package com.example.eavola.Mapper;

import com.example.eavola.DTO.TrenoDTO;
import com.example.eavola.Model.Treno;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TrenoMapper {

    TrenoDTO toDto(Treno entity);
    List<TrenoDTO> toDtos(List<Treno> entity);
    Treno toEntity(TrenoDTO dto);
    List<Treno> toEntities(List<TrenoDTO> dtos);

}