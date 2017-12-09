package com.example.handson;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface MedicalDrugRepository extends JpaRepository<MedicalDrug, Long>{
	
	
	public MedicalDrug findByempid(Long drugid);
	public List<MedicalDrug> findAll();

}