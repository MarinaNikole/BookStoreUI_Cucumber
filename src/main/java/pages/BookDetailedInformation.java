package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class BookDetailedInformation {
    public SelenideElement ISBN = $(By.id("ISBN-label"));
    public SelenideElement title = $(By.id("title-label"));
    public SelenideElement author = $x("//*[text()='Author : ']");
    public SelenideElement publisher = $x("//*[text()='Publisher : ']");
    public SelenideElement totalPages = $(By.id("pages-label"));
    public SelenideElement synopsis = $(By.id("description-label"));
    public SelenideElement website = $x("//label[contains(text(),'http')]");
    public SelenideElement yearOfPublication = $(By.id("yearOfPublication-label"));


    public SelenideElement websiteBookHeader = $x( "//div[contains(text(), 'Profile')]");
    public SelenideElement bookRatingDisplay = $x( "//*[contains(text(), 'Rating')]");
    public SelenideElement bookReviewDisplay = $x( "//*[contains(text(), 'Review')]");
    public SelenideElement bookFormatEPUB = $x(  "//*[contains(text(), 'EPUB')]");
    public SelenideElement bookFormatFB2 = $x(  "//*[contains(text(), 'FB2')]");
    public SelenideElement bookFormatMOBI = $x( "//*[contains(text(), 'MOBI')]");
    public SelenideElement bookFormatTXT = $x( "//*[contains(text(), 'TXT')]");

    public SelenideElement addToYourCollectionButton = $(byText("Add To Your Collection"));
    public SelenideElement backToBookStoreButton = $("[class=\"text-left fullButton\"]");
    public SelenideElement confirmModalWindow = $(By.id("closeSmallModal-ok"));




}

