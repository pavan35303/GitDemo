package com.example.myapplicationlearning;

import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;



import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void mainActivityView(){
            onView(withId(R.id.main)).check(matches(isDisplayed()));

    }
    @Test
    public void visibilityTitleNextbutton(){
        onView(withId(R.id.button_next_activity)).check(matches(isDisplayed()));

    }
    @Test
    public void titleTextView(){
        onView(withId(R.id.activity_main_title)).check(matches(withText(R.string.text_mainactivity)));

    }
    @Test
    public void navigate_SecActivity(){
        onView(withId(R.id.button_next_activity)).perform(click());
        onView(withId(R.id.secondary)).check(matches(isDisplayed()));


    }
    @Test
    public void navigate_toMain_Activity(){
        onView(withId(R.id.button_next_activity)).perform(click());
        onView(withId(R.id.secondary)).check(matches(isDisplayed()));
        pressBack();
        onView(withId(R.id.main)).check(matches(isDisplayed()));



    }

}