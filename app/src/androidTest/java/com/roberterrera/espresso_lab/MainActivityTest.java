package com.roberterrera.espresso_lab;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;


import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import org.junit.Rule;
import org.junit.runner.RunWith;

/**
 * Created by Rob on 3/28/16.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

  @Rule
  public ActivityTestRule<MainActivity> mainActivityActivityTestRule
      = new ActivityTestRule<MainActivity>(MainActivity.class);

}
