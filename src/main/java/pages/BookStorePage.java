package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class BookStorePage {
    public SelenideElement loginButton = $(By.id("login"));
    public SelenideElement searchInputField = $(By.id("searchBox"));

    public SelenideElement registeredUserName = $(By.id("userName-value"));

    public SelenideElement imageHeaderButton = $x("//div[text() ='Image']");
    public SelenideElement titleHeaderButton = $x("//div[text() ='Title']");
    public SelenideElement authorHeaderButton = $x("//div[text() ='Author']");
    public SelenideElement publisherHeaderButton = $x("//div[text() ='Publisher']");

    public ElementsCollection booksCollection = $$(By.cssSelector("[class ='rt-tr-group']"));
    public ElementsCollection booksTitleCollection = $$(By.className("action-buttons"));
    public ElementsCollection booksAuthorCollection = $$x("//div[@class='rt-td'][3]");
    public ElementsCollection booksPublisherCollection = $$x("//div[@class='rt-td'][4]");
    public SelenideElement genreColumn = $x("//div[text() ='Genre']");
    public SelenideElement publicationDateColumn = $x("//div[text() ='Publication date']");


    public SelenideElement rowsSelector = $(By.cssSelector("[aria-label='rows per page']"));
    public SelenideElement nextButton = $(byText("Next"));
    public SelenideElement previousButton = $(byText("Previous"));
    public ElementsCollection rowsCollection = $$(By.cssSelector("[aria-label='rows per page']"));
    public SelenideElement fiveRowsPerPage = $(By.cssSelector("[value='5']"));
    public SelenideElement tenRowsPerPage = $(By.cssSelector("[value='10']"));
    public SelenideElement twentyRowsPerPage = $(By.cssSelector("[value='20']"));
    public SelenideElement twentyFiveRowsPerPage = $(By.cssSelector("[value='25']"));
    public SelenideElement fiftyRowsPerPage = $(By.cssSelector("[value='50']"));
    public SelenideElement hundredRowsPerPage = $(By.cssSelector("[value='100']"));
    public SelenideElement pageActualValue = $("[aria-label='jump to page']");
    public SelenideElement totalPagesActualValue = $("[class='-totalPages']");
    public SelenideElement bookStatus = $(byText("Status"));
    public SelenideElement bookStoreHeader = $("[class='main-header']");
}
