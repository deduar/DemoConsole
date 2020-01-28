package com.deduar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deduar.service.IPersonaService;

@SpringBootApplication
public class DemoConsoleApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(DemoConsoleApplication.class);
	@Autowired
	private IPersonaService service; 
	
	public static void main(String[] args) {
		SpringApplication.run(DemoConsoleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//LOG.info("Hello word");
		//LOG.warn("Advertencia");
		service.registrar("deduar");
		service.registrar("fulano");
	}

}
