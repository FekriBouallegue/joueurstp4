package com.fekri.joueurs.entities;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Equipe {
	
	private Long idEquipe;
	private String Nomeq;
	private String CountryEq;
	@OneToMany(mappedBy = "equipe")
	private List<Joueur> joueurs;
	
	
	public Equipe( String nomeq, String countryEq, List<Joueur> joueurs) {
		
		
		Nomeq = nomeq;
		CountryEq = countryEq;
		this.joueurs = joueurs;
	}
	public Long getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(Long idEquipe) {
		this.idEquipe = idEquipe;
	}
	public String getNomeq() {
		return Nomeq;
	}
	public void setNomeq(String nomeq) {
		Nomeq = nomeq;
	}
	public String getCountryEq() {
		return CountryEq;
	}
	public void setCountryEq(String countryEq) {
		CountryEq = countryEq;
	}
	

}
