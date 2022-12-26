package com.univlittoral.projetback.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projetback.dto.HomeDTO;
import com.univlittoral.projetback.dto.IndicateurDTO;
import com.univlittoral.projetback.entity.AuteurEntity;
import com.univlittoral.projetback.entity.LivreEntity;
import com.univlittoral.projetback.enums.GenresEnum;
import com.univlittoral.projetback.mapper.LivreMapper;
import com.univlittoral.projetback.service.AuteurService;
import com.univlittoral.projetback.service.LivreService;

@RestController
public class HomeController {
	@Autowired
    private LivreService service;
	@Autowired
	private AuteurService serv;
	@GetMapping(value="/rest/bd/home/")
	public HomeDTO findAll() {
		HomeDTO home = new HomeDTO();
        IndicateurDTO indicateurs = new IndicateurDTO();
        List<LivreEntity> Livres = service.findAll();
        List<AuteurEntity> Auteurs = serv.findAll();
        List<GenresEnum> listGenre = new ArrayList<GenresEnum>();
        
        for(LivreEntity l : service.findAll()) {
            if(!listGenre.contains(l.getGenre())) {
                listGenre.add(l.getGenre());
            }
        }
        
        indicateurs.setNbAuteurs(Auteurs.size());
        indicateurs.setNbLivres(Livres.size());
        indicateurs.setNbGenres(listGenre.size());
        
        home.setLivres(LivreMapper.map(service.findAll()));
        home.setIndicateurs(indicateurs);

        
        
        return home;
	}
}
