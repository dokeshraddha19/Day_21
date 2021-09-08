package com.bridgelabz.Day21;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest {
	MoodAnalyser userMood = new MoodAnalyser();
	@Test
	public void ThisShouldGiveUsBackMoodThatIsEitherHappyOrSad() {
		assertEquals("Sad", userMood.analyseMood());
	}
	@Test
	public void ThisShouldGiveUsBackMoodThatIsEitherHappyOrSadByParamaterCons() {
		MoodAnalyser mood = new MoodAnalyser("yes yes happy today ");
		assertEquals("HAPPY", mood.analyseMood());
	}
	@Test
	public void ThisShouldGiveTheMessageFrom() throws Exception {
		assertEquals("HAPPY", userMood.analyseMood("no i am not in good mood or sad today "));
	}
	@Test
	public void ThisShouldGiveTheMessageFromGivingCorrectInput() throws Exception {
		assertEquals("HAPPY", userMood.analyseMood("yes I am in good mood happy today "));
	}
	@Test
	public void givenNullMoodShouldReturnHappy() throws Exception {

		assertEquals("HAPPY", userMood.analyseMood());
	}
	@Test
	public void givenNullMoodShouldReturnSad() throws Exception {

		assertEquals("SAD", userMood.analyseMood());
	}
	
	
	

	

} 


