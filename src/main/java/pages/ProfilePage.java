package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    public SelenideElement logOutButton = $x("//*[text()='Log out']");
    public SelenideElement registeredUserName = $(By.id("userName-value"));
    public SelenideElement notLogginLabel = $(By.id("notLoggin-label"));
    public ElementsCollection booksCollection = $$(By.cssSelector("[class ='rt-tr-group']"));
    public ElementsCollection booksTitleCollection = $$(By.className("action-buttons"));
    public SelenideElement searchInputField = $(By.id("searchBox"));
    public SelenideElement titleHeaderButton = $x("//div[text() ='Title']");
    public SelenideElement authorHeaderButton = $x("//div[text() ='Author']");
    public SelenideElement publisherHeaderButton = $x("//div[text() ='Publisher']");

    public SelenideElement goToBookStoreButton = $(By.id("gotoStore"));
    public SelenideElement bookStoreLink = $x("//*[text()='Book Store']");
    public SelenideElement headerBooksTable = $(By.cssSelector("[class='rt-table']"));
    public SelenideElement actionColumn = $x("//div[text() ='Action']");
    public ElementsCollection actionDelete = $$(By.id("delete-record-undefined"));
    public SelenideElement recommendedBooks = $x("//*[text()='recommended books']");


    public SelenideElement rowsSelector = $(By.cssSelector("[aria-label='rows per page']"));
    public SelenideElement pageActualValue = $("[aria-label='jump to page']");
    public SelenideElement totalPagesActualValue = $("[class='-totalPages']");

    public SelenideElement nextButton = $(byText("Next"));
    public SelenideElement previousButton = $(byText("Previous"));
    //private SelenideElement deleteAllBooksButton = $(byText("Delete All Books"));
    public SelenideElement deleteAllBooksButton = $("[class='text-right button di']");
    public SelenideElement confirmModalWindow = $(By.id("closeSmallModal-ok"));
    public SelenideElement deleteAccountButton = $x("//*[text()='Delete Account']");



    private ElementsCollection rowsCollection = $$(By.cssSelector("[aria-label='rows per page']"));
    private SelenideElement fiveRowsPerPage = $(By.cssSelector("[value='5']"));
    private SelenideElement tenRowsPerPage = $(By.cssSelector("[value='10']"));
    private SelenideElement twentyRowsPerPage = $(By.cssSelector("[value='20']"));
    private SelenideElement twentyFiveRowsPerPage = $(By.cssSelector("[value='25']"));
    private SelenideElement fiftyRowsPerPage = $(By.cssSelector("[value='50']"));
    private SelenideElement hundredRowsPerPage = $(By.cssSelector("[value='100']"));
    private SelenideElement borrowingHistory = $x("//*[text()='Borrowing History']");
    private SelenideElement twoFAAuthentication = $(byText("2FA"));
    private SelenideElement writeReviewInputField = $(byText("Review"));
}
