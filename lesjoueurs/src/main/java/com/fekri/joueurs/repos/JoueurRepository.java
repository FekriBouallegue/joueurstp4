package com.fekri.joueurs.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fekri.joueurs.entities.Equipe;
import com.fekri.joueurs.entities.Joueur;

public interface JoueurRepository extends JpaRepository<Joueur, Long> {
	List<Joueur> findByNomJoueur(String nom);
	List<Joueur> findByNomJoueurContains(String nom);
	@Query("select p from Joueur p where p.nomJoueur like %?1 and p.age > ?2")
	List<Joueur> findByNomPrix (String nom, Double age);
	@Query("select p from Joueur p where p.equipe= ?1")
	List<Joueur> findByCategorie (Equipe equipe);
	List<Joueur> findByOrderByNomJoueurAsc();
	@Query("select p from Produit p order by p.nomProduit ASC, p.prixProduit DESC")
	List<Joueur> trierJoueursNomsage ();
	
	

}
