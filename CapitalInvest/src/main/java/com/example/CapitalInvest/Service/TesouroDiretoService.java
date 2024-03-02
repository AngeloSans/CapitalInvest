package com.example.CapitalInvest.Service;


import com.example.CapitalInvest.Model.TesouroDireto;
import com.example.CapitalInvest.Repository.TesouroDiretoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TesouroDiretoService {

    @Autowired
    TesouroDiretoRepository tesouroDiretoRepository;

    //create
    public TesouroDireto salvarTesouroDireto(TesouroDireto tesouroDireto){
        return tesouroDiretoRepository.save(tesouroDireto);
    }
    //read
    public TesouroDireto buscarTesouroDireto(Long id){
        return tesouroDiretoRepository.findById(id).orElse(null);
    }
    //update
    public List<TesouroDireto> mostrarTesouroDireto(){
        return tesouroDiretoRepository.findAll();
    }
    //delete
    public void exlucirTesouroDireto(Long id){
        tesouroDiretoRepository.deleteById(id);
    }
}
