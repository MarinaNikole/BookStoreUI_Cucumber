package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"steps", "hooks"},
        tags = "@login, @addDeleteAllBooks, @addDeleteAllBooks, @bookStoreSearch, @bookStoreSort, @deleteAccount, " +
                "@logout, @register_bookStoreSort, @register_bookStoreSearch, @registration"

        // tags = "@addDeleteAllBooks",
        //tags = "@bookStoreSearch"





    //   tags = "@bookStoreSearch"
       // tags = "@profile"
      //  tags = "@add_oneBook"
       // tags = "@profile"
       //tags = "@register_bookStoreSort"
      // tags = "@add_delete_allBooks"
      // tags = "@logout"
      // tags = "@register_withoutReCaptcha"
      // tags = "@delete_account"

)

public class RunnerTest {

}
