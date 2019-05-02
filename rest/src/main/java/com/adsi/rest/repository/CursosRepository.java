/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.rest.repository;

import com.adsi.rest.modelo.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ricardo
 */
public interface CursosRepository extends JpaRepository<Cursos, Integer>{
    
}
