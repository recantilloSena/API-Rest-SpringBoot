/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.rest.api;

import com.adsi.rest.modelo.Cursos;
import com.adsi.rest.repository.CursosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ricardo
 */

@RestController
public class CursosController {
    
    @Autowired
    private CursosRepository cursosRepository;
    
    @RequestMapping (value="/rest/cursos/list", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<Cursos> findAll(){
        return cursosRepository.findAll();
      }
    
    
}
