package mareu.adriansng.maru.utils;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withSpinnerText;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.core.StringContains.containsString;

/**
 * Created by Adrian SENEGAS 23/04/2020.
 */
public class SpinnerSelect {
    public static void setSpinner(int spinnerId, int position, String selectionText){
        onView(withId(spinnerId)).perform(click());
        onData(anything()).atPosition(position).perform(click());
        onView(withId(spinnerId)).check(matches(withSpinnerText(containsString(selectionText))));
    }
}
