package com.bridgelabz;

public class MoodAnalyzer {

	String message;

	public MoodAnalyzer() {
		super();
	}

	public MoodAnalyzer(String message) {
		super();
		this.message = message;
	}

	public String analyseMood() {

		if (message.contains("sad")) {
			return "sad";
		} else
			return "Happy";

	}
}
