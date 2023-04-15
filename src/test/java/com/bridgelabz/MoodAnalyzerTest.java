package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyzerTest {

	MoodAnalyzer moodAnalysar;

	@Before
	public void setup() {
		moodAnalysar = new MoodAnalyzer();
	}

	@Test
	public void testAnalyseMood_1_1() {

		String mood = moodAnalysar.analyseMood("This is a sad mood");
		Assert.assertEquals("sad", mood);
	}

	@Test
	public void testAnalyseMood_1_2() {

		String mood = moodAnalysar.analyseMood("I am in any mood");
		Assert.assertEquals("Happy", mood);
	}
}