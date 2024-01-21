package com.test;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Main Program Begin");
		MyMessage m = new MyMessageImp();
		m.morningmsg();
		m.afternoonmsg(13);
		String s= m.nightmsg(17);
		System.out.println(s);
		System.out.println("The Main Program End");
	}

}
