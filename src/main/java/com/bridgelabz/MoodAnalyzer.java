package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoodAnalyzer {
	
	public String analyseMood(String message) {

		if (message.contains("sad")) {
			return "sad";
		} else
			return "Happy";

	}
}
