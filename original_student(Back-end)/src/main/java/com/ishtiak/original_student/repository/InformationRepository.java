package com.ishtiak.original_student.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ishtiak.original_student.model.Information;

public interface InformationRepository extends JpaRepository<Information, Integer>{
//	public List<Information> findAll();

}
