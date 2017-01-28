package com.spring.project1;

public class FootballCoach implements Coach {

	private String emailAddress;
	private String team;
	
	private FortuneService fortuneService;
	
	public FootballCoach(){
		System.out.println("FootballCoach: Inside no-arg constructor");
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("FootballCoach: Inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("FootballCoach: Inside setter method - setTeam");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("FootballCoach: Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do passing training for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
