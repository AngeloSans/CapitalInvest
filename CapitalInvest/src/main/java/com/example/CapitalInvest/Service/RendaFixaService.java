package com.example.CapitalInvest.Service;


import com.example.CapitalInvest.Model.RendaFixa;
import com.example.CapitalInvest.Repository.RendaFixaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class RendaFixaService {

    @Autowired
    RendaFixaRepository rendaFixaRepository;

    //create
    public RendaFixa salvarRendaFixa(RendaFixa rendaFixa){
        return rendaFixaRepository.save(rendaFixa);
    }
    //read
    public RendaFixa buscarRendaFixa(Long id){
        return rendaFixaRepository.findById(id).orElse(null);
    }
    //update
    public List<RendaFixa> MostrarTodasRendasFIxas(){
        return rendaFixaRepository.findAll();
    }
    //Delete
    public void excluirRendaFixa(Long id){
        rendaFixaRepository.deleteById(id);
    }
}
