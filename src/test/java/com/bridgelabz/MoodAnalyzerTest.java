package com.bridgelabz;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	MoodAnalyzer moodAnalysar;

	@Test
	public void testAnalyseMood_1_1() {

		MoodAnalyzer moodAnalysar = new MoodAnalyzer();
		String mood = moodAnalysar.analyseMood("I am in Sad mood");
		Assert.assertEquals("Sad", mood);
	}

	@Test
	public void testAnalyseMood_1_2() {

		MoodAnalyzer moodAnalysar = new MoodAnalyzer();
		String mood = moodAnalysar.analyseMood("I am in Happy mood");
		Assert.assertEquals("Happy", mood);
	}

	@Test
	public void testAnalyseMood_3_1() {
       
		System.out.println("Enter Your Mood");
		Scanner sc = new Scanner(System.in);
		String mood = sc.next();
		String result;
		MoodAnalyzer moodAnalysar = new MoodAnalyzer();
		if (!mood.equals("Happy")||!mood.equals("Sad")) {
			try {
				result = moodAnalysar.analyseMood(mood);
				throw new MoodAnalysisException("please input valid mood either Happy or Sad ");

			} catch (MoodAnalysisException e) {
				result = moodAnalysar.analyseMood("Happy");
				System.out.println(e.getMessage());
			}
		} else {
			result = moodAnalysar.analyseMood(mood);
		}
		Assert.assertEquals("Happy", result);
	}
	@Test
	public void testAnalyseMood_3_2() {
       
		System.out.println("Enter Your Mood");
		Scanner sc = new Scanner(System.in);
		String mood = sc.next();
		String result;
		MoodAnalyzer moodAnalysar = new MoodAnalyzer();
		if (mood.equals("Empty")) {
			try {
				result = moodAnalysar.analyseMood(mood);
				throw new MoodAnalysisException("please input valid mood either Happy or Sad ");

			} catch (MoodAnalysisException e) {
				result = moodAnalysar.analyseMood("Happy");
				System.out.println(e.getMessage());
			}
		} else {
			result = moodAnalysar.analyseMood(mood);
		}
		Assert.assertEquals("Happy", result);
	}
}