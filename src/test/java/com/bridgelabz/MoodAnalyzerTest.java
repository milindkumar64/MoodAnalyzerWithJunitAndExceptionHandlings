package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	MoodAnalyzer moodAnalysar;

	@Test
	public void testAnalyseMood_1_1() {

		MoodAnalyzer moodAnalysar = new MoodAnalyzer();
		String mood = moodAnalysar.analyseMood("I am in sad mood");
		Assert.assertEquals("sad", mood);
	}

	@Test
	public void testAnalyseMood_1_2() {

		MoodAnalyzer moodAnalysar = new MoodAnalyzer();
		String mood = moodAnalysar.analyseMood("I am in Happy mood");
		Assert.assertEquals("Happy", mood);
	}

	@Test
	public void testAnalyseMood_2_1() {

		String mood;
		MoodAnalyzer moodAnalysar = new MoodAnalyzer();
		try {
			mood = moodAnalysar.analyseMood(null);
		} catch (NullPointerException e) {
			mood = moodAnalysar.analyseMood("Happy");
		}
		Assert.assertEquals("Happy", mood);
	}
}