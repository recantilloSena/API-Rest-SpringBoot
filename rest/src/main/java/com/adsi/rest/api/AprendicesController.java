/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.rest.api;

import com.adsi.rest.modelo.Aprendices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.adsi.rest.repository.AprendicesRepository;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Ricardo
 */

@RestController
public class AprendicesController {
    
    @Autowired
    AprendicesRepository repo;
    
    
    
    @RequestMapping (value="/rest/aprendices/list", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<Aprendices> findAll(){
       
        return repo.findAll();
    }
    
    @RequestMapping (value="/rest/aprendices/curso/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<Aprendices> findByFkCurso(@PathVariable("id") Integer idCurso ){
       
        return repo.findByFkCurso(idCurso);
    }
    
    
}
