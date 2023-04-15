package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	MoodAnalyzer moodAnalysar;

	@Test
	public void testAnalyseMood_1_1() {

		MoodAnalyzer moodAnalysar = new MoodAnalyzer("I am in sad mood");
		String mood = moodAnalysar.analyseMood();
		Assert.assertEquals("sad", mood);
	}

	@Test
	public void testAnalyseMood_1_2() {

		MoodAnalyzer moodAnalysar = new MoodAnalyzer("I am in Happy mood");
		String mood = moodAnalysar.analyseMood();
		Assert.assertEquals("Happy", mood);
	}
}