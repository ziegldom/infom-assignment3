package assignment3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import assignment3.entities.Steuerapp;

public interface SteuerappRepository extends JpaRepository<Steuerapp, Long> {

	//SELECT USER WHERE FK_STEUERERKLÄRUNG == ID_STEUERERKLÄRUNG && FK_USER == ID_USER
	
}
