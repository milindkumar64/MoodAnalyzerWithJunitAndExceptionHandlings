package com.bridgelabz;a

public class MoodAnalyzer {

	public String analyseMood(String message) {

		if (message.contains("sad")) {
			return "sad";
		} else
			return "Happy";

	}
}
