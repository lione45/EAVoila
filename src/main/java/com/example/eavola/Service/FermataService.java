package com.example.eavola.Service;

import com.example.eavola.Mapper.FermataMapper;
import com.example.eavola.Repository.FermataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FermataService {

    @Autowired
    private FermataRepository fermataRepository;

    @Autowired
    private FermataMapper fermataMapper;

}
