package steps;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    @Before
    public void openUrl () {
        open("https://grinfer.com/");
    }

}