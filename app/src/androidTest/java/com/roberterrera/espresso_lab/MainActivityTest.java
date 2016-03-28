package com.roberterrera.espresso_lab;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Rob on 3/28/16.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

  @Rule
  public ActivityTestRule<MainActivity> mainActivityActivityTestRule
      = new ActivityTestRule<MainActivity>(MainActivity.class);

  @Test
  public void testIsEverythingDisplays() throws Exception{
    onView(withId(R.id.current_balance)).check(matches(isDisplayed()));
    onView(withId(R.id.button_increase)).check(matches(isDisplayed()));
    onView(withId(R.id.button_decrease)).check(matches(isDisplayed()));
    onView(withId(R.id.button_contactinfo)).check(matches(isDisplayed()));


  }

  @Test
  public void testIfButtonsWork() throws Exception{
    int value1 = 100;
    int value2 = 100-5;
    int valueAdd= 105;

    onView(withId(R.id.button_increase)).perform(click());


    onView(withId(R.id.current_balance)).check(matches(withText(valueAdd)));


  }

}
