/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.rest.repository;

import com.adsi.rest.modelo.Aprendices;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Ricardo
 */
public interface AprendicesRepository extends JpaRepository<Aprendices, Integer>{
    
    /**
     *
     * @param idCurso curso a Consultar 
     * @return una lista de Aprendices
     */
    @Query("SELECT a FROM Aprendices a WHERE a.fkCurso.idCurso  = :idCurso")
    List<Aprendices> findByFkCurso(@Param("idCurso") Integer idCurso );
    
}
