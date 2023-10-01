package Test;

import com.smartbear.zephyrscale.junit.annotation.TestCase;
import com.triomics.framework.type.test.Functional;
import com.triomics.framework.type.test.Smoke;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.Duration;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

@DisplayName("TESTCASE-ID")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginViaPlatformTest extends BaseTest {


    @Smoke
    @Test
 
    public void login() {
        title().equalsIgnoreCase("Harmony");
        $(".MuiTypography-root.MuiTypography-subtitle1").shouldHave(text("Select Organization")).exists();
       
    }
  @Test
    @Functional
    
    public void login_as_platform_admin() throws InterruptedException {
        $("div[role='button']").click();
        $(byXpath("//span[normalize-space()='Test_Org_1']")).click();
        $(".MuiButton-label").click();
        
    }


 /*   protected void waitUntilPagesIsLoaded() {
        $(byText("Sign in with your username and password")).should(appear, Duration.ofSeconds(2));
    }
*/
}
