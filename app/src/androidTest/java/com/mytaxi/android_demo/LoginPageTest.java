package com.mytaxi.android_demo;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.typeText;

import com.mytaxi.android_demo.activities.AuthenticationActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class LoginPageTest {

    @Rule
    public ActivityTestRule<AuthenticationActivity> authenticationActivityActivityTestRule = new ActivityTestRule<>(AuthenticationActivity.class);

    @Test
    public void typeUsernameAndPassword(){
        onView(withId(R.id.edt_username)).perform(typeText("whiteelephant261"), closeSoftKeyboard());
            onView(withId(R.id.edt_password)).perform(typeText("video"), closeSoftKeyboard());
            onView(withId(R.id.btn_login)).perform(click());
    }

//    public class MainPage{
//
//    }
}
