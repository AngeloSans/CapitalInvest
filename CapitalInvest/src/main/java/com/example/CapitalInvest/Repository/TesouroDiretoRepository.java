package com.example.CapitalInvest.Repository;


import com.example.CapitalInvest.Model.TesouroDireto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesouroDiretoRepository extends JpaRepository<TesouroDireto, Long> {
}
