package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.dto.AuteurRequestSaveDTO;
import com.univlittoral.projetback.entity.AuteurEntity;


public class AuteurMapper {
	public static AuteurDTO map(AuteurEntity auteurEntity) {
		AuteurDTO result = new AuteurDTO();
		result.setId(auteurEntity.getId());
		result.setNom (auteurEntity.getNom());
		result.setPrenom (auteurEntity.getPrenom());
		result.setDateNaissance (auteurEntity.getDateNaissance());

		return result;
	}
	
	
	public static AuteurEntity mapSave(AuteurRequestSaveDTO AuteurDTO) {

	    AuteurEntity result = new AuteurEntity();


	    result.setId(AuteurDTO.getId());
		result.setNom(AuteurDTO.getNom());
		result.setPrenom(AuteurDTO.getPrenom());
		result.setDateNaissance(AuteurDTO.getDateNaissance());		
	    return result;
	    }
	
	public static List <AuteurDTO> map(List<AuteurEntity> AuteurEntities){
		List <AuteurDTO>result= new ArrayList<AuteurDTO>();
		for(final AuteurEntity entity : AuteurEntities) {
			result.add(AuteurMapper.map(entity));
		}
		return result;
	}
}
