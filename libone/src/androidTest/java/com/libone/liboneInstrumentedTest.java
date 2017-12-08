package com.libone;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class liboneInstrumentedTest {
    @Rule
    public ActivityTestRule<LibOneActivity> mActivityRule = new ActivityTestRule<>(LibOneActivity.class);

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        //子线程
        Context appContext = InstrumentationRegistry.getTargetContext();
        LibOneActivity activity = mActivityRule.getActivity();
        activity.testData();
        Espresso.onView(ViewMatchers.withId(R.id.tv)).check(matches(isDisplayed()));
        assertEquals("com.libone.test", appContext.getPackageName());
    }
}
