package com.bridgelabz.Day21;

public class MoodAnalyser {
	public String usermessage;
	public MoodAnalyser() {
		usermessage = " I am feeling sad today.  ";
	}
//Parameter
	public MoodAnalyser(String message) {
		usermessage = message;
	}
	public String analyseMood() {
		if (usermessage.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}

	public String analyseMood(String message) throws Exception {
		String newmessage = message;
		try {
			if (newmessage.contains("Sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (Exception exception) {
		}
		return "HAPPY";

	}

}
	
	


