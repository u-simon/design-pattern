package com.simon.pattern.facade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		homeTheaterFacade.ready();
		homeTheaterFacade.play();
		
		
		homeTheaterFacade.end();
	}

}
