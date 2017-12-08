package com.danyuan;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class appInstrumentedTest extends ActivityInstrumentationTestCase2 {
    private Solo solo;
    private MainActivity mActivity;
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    public appInstrumentedTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(), getActivity());
        mActivity = (MainActivity) solo.getCurrentActivity();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }


    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        //子线程
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals(true, AppUtil.testData3());
        MainActivity mActivity = mActivityRule.getActivity();
        mActivity.testData();
//        solo.getCurrentActivity();
//        Espresso.onView(ViewMatchers.withId(R.id.app_tv)).check(matches(isDisplayed()));

        assertEquals("com.danyuan", appContext.getPackageName());
    }
}
