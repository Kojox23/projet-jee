package com.univlittoral.projetback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.mapper.AuteurMapper;
import com.univlittoral.projetback.service.AuteurService;

@RestController
@RequestMapping(value = "rest/bd/auteurs")
public class AuteurController {

     @Autowired
     private AuteurService service;
     
     @GetMapping
     public List<AuteurDTO> findAll(){
        return AuteurMapper.map(service.findAll());
     }
     
     @GetMapping("/{id}")
     public AuteurDTO findOne(@PathVariable Long id) {
         return AuteurMapper.map(service.findOne(id));
     }
     
}