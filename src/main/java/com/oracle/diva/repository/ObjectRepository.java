package com.oracle.diva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oracle.diva.model.DivaObject;

public interface ObjectRepository extends JpaRepository<DivaObject,Long>{

}
