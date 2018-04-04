package com.mytaxi.android_demo;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.activities.DriverProfileActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class DriverProfileTest {
    @Rule
    public ActivityTestRule<DriverProfileActivity> driverProfileActivityActivityTestRule = new ActivityTestRule<>(DriverProfileActivity.class);
    //@Test
}
