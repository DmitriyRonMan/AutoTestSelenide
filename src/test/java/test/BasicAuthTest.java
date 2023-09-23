package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BasicAuthTest {

    @BeforeAll
    static void setUp() {
        open("https://the-internet.herokuapp.com/");
    }

    @Test
    void shouldTest() {
        Configuration.holdBrowserOpen = true;
        $("[href=\"/basic_auth\"]").click();
        $(withText("Имя пользователя")).shouldBe(Condition.visible);
    }

}

