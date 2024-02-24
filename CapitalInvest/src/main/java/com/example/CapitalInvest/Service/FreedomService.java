package com.example.CapitalInvest.Service;



import org.springframework.stereotype.Service;

@Service
public class FreedomService {

    public double calcularLiberdade(int anos, double valorMensal){
        double taxaSelic = 11.25;
        double valorFinal = 0;
        if(valorMensal != 0 && anos != 0){
            valorFinal = valorMensal * taxaSelic * (12 * anos);
        }
        return valorFinal;
    }

}
