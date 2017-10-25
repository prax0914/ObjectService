package com.oracle.diva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.diva.model.DivaObject;
import com.oracle.diva.repository.ObjectRepository;

@RestController
public class ObjectController {

	@Autowired
	private ObjectRepository Objectrepository;
	
	@RequestMapping(value="/objects",method=RequestMethod.GET)
	public ResponseEntity<Iterable<DivaObject>> getObjects(Pageable pageable)
	{
		Iterable<DivaObject> objects = Objectrepository.findAll(pageable);
		return new ResponseEntity<>(objects,HttpStatus.OK);
	}
}
