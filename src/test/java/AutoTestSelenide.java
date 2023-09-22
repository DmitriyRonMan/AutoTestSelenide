import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class AutoTestSelenide {
    @BeforeAll
    static void setUp() {
        open("https://the-internet.herokuapp.com/add_remove_elements/");
    }
    @Test
    void shouldTest() {
        Configuration.holdBrowserOpen = true;
        $("button").click();
    }


}
