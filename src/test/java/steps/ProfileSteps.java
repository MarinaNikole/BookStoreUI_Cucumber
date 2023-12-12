package steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Selenide.confirm;

public class ProfileSteps extends BaseSteps{
    @And("^I see the Profile Book Catalog empty$")
    public void iSeeTheProfileBookCatalogEmpty() {
        profilePage.booksCollection.filter(not(empty)).shouldHave(size(0));
    }



    @When("^I follow the Book Store Link$")
    public void iFollowTheBookStoreLink() {
        profilePage.bookStoreLink.scrollIntoView(true).shouldBe(visible).click();
    }


    @Then("^I see the \"([^\"]*)\" book in User`s collection$")
    public void iSeeTheBookInUserSCollection(String title)  {
        for(SelenideElement book : profilePage.booksTitleCollection.filter(not(empty))){
            book.shouldBe(visible).shouldHave(text(title));
        }
    }

    @And("^I see that the book is only one in User`s collection$")
    public void iSeeThatTheBookIsOnlyOneInUserSCollection() {
        profilePage.booksCollection.filter(not(empty)).shouldHave(size(1));
    }

    @And("^I confirm the alert delete message$")
    public void iConfirmTheAlertDeleteMessage() {
        if (profilePage.confirmModalWindow.isDisplayed()) {
            profilePage.confirmModalWindow.click();
        } else {
            confirm();
        }
    }

    @When("^I click delete book icon$")
    public void iClickDeleteBookIcon() {
        profilePage.actionDelete.get(0).shouldBe(visible).click();
    }

    @And("^I see that there are only two books in User`s collection$")
    public void iSeeThatThereAreOnlyTwoBooksInUserSCollection() {
        profilePage.booksCollection.filter(not(empty)).shouldHave(size(2));
    }

    @And("^I click Back To Book Store button$")
    public void iClickBackToBookStoreButton() {
        bookDetailedInformation.backToBookStoreButton.scrollTo().shouldBe(visible).click();
    }

    @When("^I click Delete All Books button$")
    public void iClickDeleteAllBooksButton() {
        profilePage.deleteAllBooksButton.scrollIntoView(true).shouldBe(visible).click();
    }

    @When("^I click Log Out button$")
    public void iClickLogOutButton() {
        profilePage.logOutButton.shouldBe(visible).click();
    }

    @Then("^I see the the message \"([^\"]*)\"$")
    public void iSeeTheTheMessage(String message)  {
        profilePage.notLogginLabel.shouldBe(visible).shouldHave(text(message));
    }

    @When("^I click Delete Account button$")
    public void iClickDeleteAccountButton() {
        profilePage.deleteAccountButton.scrollTo().shouldBe(visible).click();
    }


//
//    @When("^I input the title \"([^\"]*)\" in the Profile search input field$")
//    public void iInputTheTitleInTheProfileSearchInputField(String bookTitle)  {
//       profilePage.searchInputField.scrollTo().shouldBe(visible).setValue(bookTitle);
//    }
//
//    @Then("^I see the book \"([^\"]*)\" in the Profile Book Catalog$")
//    public void iSeeTheBookInTheProfileBookCatalog(String bookTitle)  {
//        for (SelenideElement title : bookStorePage.booksTitleCollection.filter(not(empty))) {
//            title.shouldBe(visible).shouldHave(text(bookTitle));
//        }
//    }
//
//    @Then("^I see that the Profile Book Catalog has only one book\\.$")
//    public void iSeeThatTheProfileBookCatalogHasOnlyOneBook() {
//        int collectionSize = bookStorePage.booksCollection.filter(not(empty)).size();
//        assertEquals("The expected size of the book catalog does NOT correspond to actual", 1, collectionSize);
//    }
//
//    @When("^I input the publisher \"([^\"]*)\" in the Profile search input field$")
//    public void iInputThePublisherInTheProfileSearchInputField(String publisher)  {
//            bookStorePage.searchInputField.shouldBe(visible).setValue(publisher);
//    }
//
//    @Then("^I see only the books by publisher \"([^\"]*)\" in the Profile Book Catalog$")
//    public void iSeeOnlyTheBooksByPublisherInTheProfileBookCatalog(String publisher)  {
//        for (SelenideElement pubName : bookStorePage.booksPublisherCollection.filter(not(empty))) {
//            pubName.shouldBe(visible).shouldHave(text(publisher));
//        }
//    }
}
