package assignment3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import assignment3.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}
