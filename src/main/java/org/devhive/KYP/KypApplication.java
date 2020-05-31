package org.devhive.KYP;

import org.devhive.KYP.data.entity.Sex;
import org.devhive.KYP.data.repository.SexRepository;
import org.devhive.KYP.service.SexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class KypApplication {
	private static final Logger logger = LoggerFactory.getLogger(KypApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KypApplication.class, args);

		logger.info("Hello World!");

	}

	@RestController
	@RequestMapping("/test")
	public class SexController{
		private final SexService sexService;

		@Autowired
		public SexController(SexService sexService) {
			this.sexService = sexService;
		}

		@GetMapping
		public Sex getSex(){
			String type = "Female";
			Sex sex = this.sexService.getSex(type);
			logger.info("I got this: " + sex.getSexType() + " with ID: " + sex.getSexId());
			return sex;
		}

	}

}
