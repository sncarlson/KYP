package org.devhive.KYP;

import org.devhive.KYP.data.entity.Age;
import org.devhive.KYP.data.entity.Cardio;
import org.devhive.KYP.data.entity.Component;
import org.devhive.KYP.data.entity.Sex;
import org.devhive.KYP.service.AgeService;
import org.devhive.KYP.service.CardioService;
import org.devhive.KYP.service.ComponentService;
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
	public class CardioController{
		private final SexService sexService;
		private final AgeService ageService;
		private final ComponentService componentService;
		private final CardioService cardioService;

		@Autowired
		public CardioController(SexService sexService,
								AgeService ageService,
								ComponentService componentService,
								CardioService cardioService) {
			this.sexService = sexService;
			this.ageService = ageService;
			this.componentService = componentService;
			this.cardioService = cardioService;
		}

		@GetMapping
		public Iterable<Cardio> getCardio(){
			String sexSelection = "Male";
			String ageRange = "30 - 39";
			String componentType = "Run";
			Sex sex = this.sexService.getSex(sexSelection);
			Age age =  this.ageService.getAge(ageRange);
			Component component = this.componentService.getComponent(componentType);


			logger.info("I got this: " + this.cardioService.getCardioScores(sex,age));
			return this.cardioService.getCardioScores(sex,age);
		}

	}

}
