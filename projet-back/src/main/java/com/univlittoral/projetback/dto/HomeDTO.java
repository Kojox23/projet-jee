package com.univlittoral.projetback.dto;

import java.util.List;

public class HomeDTO { 
	private List<LivreDTO> livres;
	private IndicateurDTO indicateurs;
	
	public List<LivreDTO> getLivres() {
		return livres;
	}
	public void setLivres(List<LivreDTO> livres) {
		this.livres = livres;
	}
	public IndicateurDTO getIndicateurs() {
		return indicateurs;
	}
	public void setIndicateurs(IndicateurDTO indicateurs) {
		this.indicateurs = indicateurs;
	}
	
	
}
