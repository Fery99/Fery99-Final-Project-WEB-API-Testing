package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WebPage;

public class WebStep {
    WebPage webPage;

    public WebStep() {
        this.webPage = new WebPage();
    }

    //Contoh account
    @Given("user go to login page")
    public void userGoToLoginPage() {
        webPage.goToLoginPage();
    }

    @And("user input username {string}")
    public void userInputUsername(String username) {
        webPage.inputUsername(username);
    }

    @And("user input pwd {string}")
    public void userInputPwd(String pwd) {
        webPage.inputPwd(pwd);
    }

    @And("user click button login")
    public void userClickButtonLogin() {
        webPage.clickBtnLogin();
    }

    @Then("validation users can show side nav")
    public void validationUsersCanShowSideNav() {
        webPage.assert_show_sidebar_my_info();
    }


    //Sigup and Create Account
    @Given("user is on page")
    public void userIsOnPage() {
        webPage.userIsOnPage();
    }

    @When("user click Sign Up  button")
    public void userClickSignUpButton() {
        webPage.userClickSignUpButton();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        webPage.userInputUsernameWith(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        webPage.userInputPasswordWith(password);
    }

    @When("user clear register  & click SignUp  button")
    public void userClearRegisterClickSignUpButton() {
        webPage.userClearRegisterClickSignUpButton();
    }

//user add item and detail item
    @Then("user is on homepage")
    public void userIsOnHomepage() {
        webPage.userIsOnHomepage();
    }

    //Login Account
    @When("user click Sign In Button")
    public void userClickSignInButton() {
        webPage.userClickSignInButton();
    }

    @And("user input Login username with {string}")
    public void userInputLoginUsernameWith(String LoginUsername) {
        webPage.userInputLoginUsernameWith(LoginUsername);
    }

    @And("user input Login  password with {string}")
    public void userInputLoginPasswordWith(String LoginPwd) {
        webPage.userInputLoginPasswordWith(LoginPwd);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        webPage.userClickLoginButton();
    }

 //   User Contact Customer Service
    @And("User Click contact")
    public void userClickContact() {
        webPage.userClickContact();
    }

    @And("user input Email {string}")
    public void userInputEmail(String ContactEmail) {
        webPage.userInputEmail(ContactEmail);
    }

    @And("User input Contact  Name {string}")
    public void userInputContactName(String ContactName) {
        webPage.userInputContactName(ContactName);
    }

    @And("User Input Message {string}")
    public void userInputMessage(String ContactMessage) {
        webPage.userInputMessage(ContactMessage);
    }

    @Then("User Click Send Message")
    public void userClickSendMessage() {
        webPage.userClickSendMessage();
    }

//    //view category of laptop
    @And("user click category of laptop")
    public void userClickCategoryOfLaptop() {
        webPage.userClickCategoryOfLaptop();
    }

    @Then("user can see list of laptop")
    public void userCanSeeListOfLaptop() {
        webPage.userCanSeeListOfLaptop();
    }

// view category of All Phone

    @And("user click category of Phone")
    public void userClickCategoryOfPhone() {
        webPage.userClickCategoryOfPhone();
    }

    @Then("user can see list of All Phone")
    public void userCanSeeListOfAllPhone() {
        webPage.userCanSeeListOfAllPhone();
    }

//    user add item and detail item
    @And("user click item selection")
    public void userClickItemSelection() {
        webPage.userClickItemSelection();
    }

    @Then("User can get more information from item selection")
    public void userCanGetMoreInformationFromItemSelection() {
        webPage.userCanGetMoreInformationFromItemSelection();
    }

    @And("user add item selection to chart")
    public void userAddItemSelectionToChart() {
        webPage.userAddItemSelectionToChart();
    }

    @And("User click chart")
    public void userClickChart() {
        webPage.userClickChart();
    }

    @Then("user can see add item selection on chart page")
    public void userCanSeeAddItemSelectionOnChartPage() {
        webPage.userCanSeeAddItemSelectionOnChartPage();
    }


// User buying item selection and clear Payment
    @And("user click Place Order for clear register of  payment")
    public void userClickPlaceOrderForClearRegisterOfPayment() {
        webPage.userClickPlaceOrderForClearRegisterOfPayment();
    }

    @And("user input name  with {string}")
    public void userInputNameWith(String payName) {
        webPage.userInputNameWith(payName);
    }

    @And("user input country with {string}")
    public void userInputCountryWith(String payCountry) {
        webPage.userInputCountryWith(payCountry);
    }

    @And("user input city  with {string}")
    public void userInputCityWith(String payCity) {
        webPage.userInputCityWith(payCity);
    }

    @And("user input Credit Card  with {string}")
    public void userInputCreditCardWith(String payCard) {
        webPage.userInputCreditCardWith(payCard);
    }

    @And("user input Month with {string}")
    public void userInputMonthWith(String payMonth) {
        webPage.userInputMonthWith(payMonth);
    }

    @And("user input Year with {string}")
    public void userInputYearWith(String payYear) {
        webPage.userInputYearWith(payYear);
    }

    @And("User click Purchase")
    public void userClickPurchase() {
        webPage.userClickPurchase();
    }

    @Then("user clear payment")
    public void userClearPayment() {
        webPage.userClearPayment();
    }
}
