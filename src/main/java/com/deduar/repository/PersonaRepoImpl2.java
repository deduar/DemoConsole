package com.deduar.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.deduar.DemoConsoleApplication;

@Repository
@Qualifier("persona2")
public class PersonaRepoImpl2 implements  IPersonaRepo {

	private static Logger LOG = LoggerFactory.getLogger(DemoConsoleApplication.class);
	
	@Override
	public void registrar(String nombre) {
		LOG.info("NO Se registro a: " + nombre);
	}

}
