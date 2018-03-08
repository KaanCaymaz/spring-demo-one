package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneneService;
	
	public TrackCoach()	{
		
	}
	
	public TrackCoach(FortuneService fortuneneService) {
		this.fortuneneService = fortuneneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it:"+ fortuneneService.getFortune();
	}

}
