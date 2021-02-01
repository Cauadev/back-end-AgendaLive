package com.spring.agendalive.utils;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.agendalive.document.LiveDocument;
import com.spring.agendalive.repository.LiveRepository;

@Component
public class DannyData {
	
	@Autowired
	LiveRepository liveRepo;

//	@PostConstruct
	public void savePosts() {
		LiveDocument live1 = new LiveDocument();
		live1.setLiveDate(LocalDateTime.now());
		live1.setRegistrationDate(LocalDateTime.now());
		live1.setLiveLink("https://www.youtube.com/embed/oXdWr41uEUo");
		live1.setLiveName("Salário com Lucas Montano // Live #31");
		live1.setChannelName("Rodrigo Branas");
		
		LiveDocument live2 = new LiveDocument();
		live2.setLiveDate(LocalDateTime.now());
		live2.setRegistrationDate(LocalDateTime.now());
		live2.setLiveLink("https://www.youtube.com/embed/DKZxjCic0Js");
		live2.setLiveName("Imersão Carreira Tech #12 Aprendendo a aprender");
		live2.setChannelName("Forte Maciel");
		
		
		LiveDocument live3 = new LiveDocument();
		live3.setLiveDate(LocalDateTime.now());
		live3.setRegistrationDate(LocalDateTime.now());
		live3.setLiveLink("https://www.youtube.com/embed/Pxl5eSEny9A");
		live3.setLiveName("Live 100 MIL Youtube INSCRITOS");
		live3.setChannelName("Lucas Montano");
		
		LiveDocument live4 = new LiveDocument();
		live4.setLiveDate(LocalDateTime.now());
		live4.setRegistrationDate(LocalDateTime.now());
		live4.setLiveLink("https://www.youtube.com/embed/NDCdu_y4yFY");
		live4.setLiveName("A importância da contribuição em Open Source | Podcast Faladev #30");
		live4.setChannelName("Rocketseat");
		
		LiveDocument live5 = new LiveDocument();
		live5.setLiveDate(LocalDateTime.now().plusMonths(1));
		live5.setRegistrationDate(LocalDateTime.now());
		live5.setLiveLink("https://www.youtube.com/embed/Fjmd-uWir0Q");
		live5.setLiveName("Por trás de barreiras e soluções propostas por micro-serviços | Podcast Faladev #28");
		live5.setChannelName("Rocketseat");
		
		List<LiveDocument> lives = Arrays.asList(live1,live2,live3,live4,live5);
		
		lives.forEach(liveRepo::save);
	}

}
