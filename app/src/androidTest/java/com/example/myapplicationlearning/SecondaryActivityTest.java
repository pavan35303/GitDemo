package com.example.myapplicationlearning;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4ClassRunner.class)
public class SecondaryActivityTest {

    @Rule
    public ActivityScenarioRule<SecondaryActivity> mActivityRule = new ActivityScenarioRule<>(SecondaryActivity.class);

    @Test
    public void secActivityView(){
        onView(withId(R.id.secondary)).check(matches(isDisplayed()));

    }
    @Test
    public void visibility_title_Backbutton(){
        onView(withId(R.id.activity_secondary_title)).check(matches(isDisplayed()));

    }
    @Test
    public void titleTextView(){
        onView(withId(R.id.activity_secondary_title)).check(matches(withText(R.string.text_secondaryactivity)));

    }
}