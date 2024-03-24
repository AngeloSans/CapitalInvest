package com.example.CapitalInvest.Service;


import com.example.CapitalInvest.Model.Acoes;
import com.example.CapitalInvest.Repository.AcoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcoesService {

    @Autowired
    AcoesRepository acoesRepository;

    //Create
    public Acoes salvarAcao(Acoes acoes){
        return acoesRepository.save(acoes);
    }
    //read
    public Acoes buscarAcao(Long id){
        return acoesRepository.findById(id).orElse(null);
    }
    //update
    public List<Acoes> mostrarAcoes(){
        return acoesRepository.findAll();
    }
    //delete
    public void excluirAcao(Long id){
        acoesRepository.deleteById(id);
    }
}
