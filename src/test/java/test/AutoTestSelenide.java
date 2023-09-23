package test;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class AutoTestSelenide {
    @BeforeAll
    static void setUp() {
        open("https://the-internet.herokuapp.com/add_remove_elements/");
    }
    @Test
    @DisplayName("Добавление элемента")
    void shouldTestAddElement() {
        Configuration.holdBrowserOpen = true;
        $("button").click();
    }

    @Test
    @DisplayName("Удаление элемента")
    void shouldTestRemoveElement() {
        Configuration.holdBrowserOpen = true;
        $("button").click();
        $(".added-manually").click();
    }

}
