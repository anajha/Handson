package com.example.handson;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface DrugsRepository extends JpaRepository<Drugs, Long>{
	
	
	public Drugs findBydrugid(Long drugid);
	public List<Drugs> findAll();

}
