package com.example.handson;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface MedicalRepository extends JpaRepository<Medical, Long>{
	
	
	public Medical findByempid(Long empid);
	public List<Medical> findAll();

}
