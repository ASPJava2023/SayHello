package com.test;

public class MyMessageImp  implements MyMessage{

	@Override
	public void morningmsg() {
		// TODO Auto-generated method stub
		System.out.println("Very Good Morning");
	}

	@Override
	public void afternoonmsg(int time) {
		// TODO Auto-generated method stub
		if(time> 12){
			System.out.println("Very afternoo");
		}
	}

	@Override
	public String nightmsg(int time) {
		// TODO Auto-generated method stub
			return "Very Good Morning";
		}
}
