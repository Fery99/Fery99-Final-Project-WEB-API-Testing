package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebPage {

    By input_username = By.name("username");
    By input_pwd = By.name("password");
    By btn_login = By.xpath("//button[@type = 'submit']");
    By sidenav_my_indo = By.xpath("//*[text() = 'My Info']");

    //ini sample contoh
    public void goToLoginPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    public void inputUsername(String username) {
        driver.findElement(input_username).sendKeys(username);
    }

    public void inputPwd(String pwd) {
        driver.findElement(input_pwd).sendKeys(pwd);
    }

    public void clickBtnLogin(){
        driver.findElement(btn_login).click();
    }

    public void assert_show_sidebar_my_info(){
        driver.findElement(sidenav_my_indo).isDisplayed();
    }



    //Sigup and Create Account
    By inputuserClickSignUpButton = By.xpath("//*[@id=\"signin2\"]");
    By inputuserInputUsernameWith = By.cssSelector("#sign-username");
    By inputuserInputPasswordWith = By.xpath("//*[@id=\"sign-password\"]");
    By inputuserClearRegisterClickSignUpButton= By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    By inputuserIsOnHomepage = By.xpath("//*[@id=\"cat\"]");

    //Login
    By inputuserClickSignInButton = By.xpath("//*[@id=\"login2\"]");
    By inputuserInputLoginUsernameWith = By.xpath("//*[@id=\"loginusername\"]");
    By inputuserInputLoginPasswordWith = By.xpath("//*[@id=\"loginpassword\"]");
    By inputuserClickLoginButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
//    //User Contact Customer Service
    By inputuserClickContact = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
    By inputuserInputEmail = By.xpath("//*[@id=\"recipient-email\"]");
    By inputuserInputContactName = By.xpath("//*[@id=\"recipient-name\"]");
    By inputuserInputMessage = By.xpath("//*[@id=\"message-text\"]");
    By inputuserClickSendMessage = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");

//view category of laptop
    By inputuserClickCategoryOfLaptop= By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a");
    By inputuserCanSeeListOfLaptop= By.xpath("//*[@id=\"tbodyid\"]/div[9]/div/div/h4/a");

//view category of Monitor
    By inputuserClickCategoryOfPhone= By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a") ;
    By inputuserCanSeeListOfAllPhone= By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");

//user add item and detail item
    By inputuserClickItemSelection= By.xpath("//*[@id=\"tbodyid\"]/div[9]/div/div/h4/a");
    By inputuserCanGetMoreInformationFromItemSelection= By.xpath("//*[@id=\"tbodyid\"]/h2");
    By inputuserAddItemSelectionToChart= By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    By inputuserClickChart= By.xpath("//*[@id=\"cartur\"]");
    By inputuserCanSeeAddItemSelectionOnChartPage= By.xpath("//*[@id=\"page-wrapper\"]/div/div[1]/h2");

// User buying item selection and clear Payment
    By inputuserClickPlaceOrderForClearRegisterOfPayment= By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
    By inputuserInputNameWith= By.xpath("//*[@id=\"name\"]");
    By inputuserInputCountryWith=By.xpath("//*[@id=\"country\"]");
    By inputuserInputCityWith= By.xpath("//*[@id=\"city\"]");
    By inputuserInputCreditCardWith= By.xpath("//*[@id=\"card\"]");
    By inputuserInputMonthWith= By.xpath("//*[@id=\"month\"]");
    By inputuserInputYearWith= By.xpath("//*[@id=\"year\"]");
    By inputuserClickPurchase= By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    By inputuserClearPayment= By.xpath("/html/body/div[10]/h2");


//    //Sigup and Create Account
    public void userIsOnPage(){
        driver.get("https://www.demoblaze.com/");
    }

    public void userClickSignUpButton(){
        driver.findElement(inputuserClickSignUpButton).click();
    }

    public void userInputUsernameWith(String username){

        //use implicit wait bcs page on website has loading sesion
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(inputuserInputUsernameWith).sendKeys(username);
//        WebElement usernameInput = driver.findElement(inputuserInputUsernameWith); // Timeout in seconds
//        if (usernameInput != null) {
//            usernameInput.sendKeys(username);
//            System.out.println("oke: " + usernameInput);
//        } else {
//            System.out.println("Element not found or not interactable within the specified time");
//        }
    }

    public void userInputPasswordWith(String password){
        driver.findElement(inputuserInputPasswordWith).sendKeys(password);
    }

    public void userClearRegisterClickSignUpButton(){
        driver.findElement(inputuserClearRegisterClickSignUpButton).click();
    }

    public void userIsOnHomepage(){
        WebElement homePage = driver.findElement(inputuserIsOnHomepage);
        assertTrue(homePage.isDisplayed());
        assertEquals("CATEGORIES", homePage.getText());
        System.out.println("ini adalah page= " + homePage);

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        try {
            Thread.sleep(5000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

// User Login
    public void userClickSignInButton(){
        driver.findElement(inputuserClickSignInButton).click();
    }

    public void userInputLoginUsernameWith(String LoginUsername){
        driver.findElement(inputuserInputLoginUsernameWith).sendKeys(LoginUsername);
    }

    public void userInputLoginPasswordWith(String LoginPwd){
        driver.findElement(inputuserInputLoginPasswordWith).sendKeys(LoginPwd);
    }

    public void userClickLoginButton(){
        driver.findElement(inputuserClickLoginButton).click();
    }

//    //User Contact Customer Service
    public void userClickContact(){
        driver.findElement(inputuserClickContact).click();

        try {
            Thread.sleep(9000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void userInputEmail(String ContactEmail){
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(inputuserInputEmail).sendKeys(ContactEmail);
    }
    public void userInputContactName(String ContactName){
        driver.findElement(inputuserInputContactName).sendKeys(ContactName);

    }
    public void userInputMessage(String ContactMessage){
        driver.findElement(inputuserInputMessage).sendKeys(ContactMessage);

    }
    public void userClickSendMessage(){
        driver.findElement(inputuserClickSendMessage).click();

    }

//view category of laptop
    public void userClickCategoryOfLaptop(){
        driver.findElement(inputuserClickCategoryOfLaptop).click();
    }

    public void userCanSeeListOfLaptop(){
        WebElement listLaptop = driver.findElement(inputuserCanSeeListOfLaptop);
        assertTrue(listLaptop.isDisplayed());
        assertEquals("Sony vaio i7", listLaptop.getText());
        System.out.println("ini adalah page= " + listLaptop);

        try {
            Thread.sleep(9000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

//    view category of Phone
    public void userClickCategoryOfPhone(){
        driver.findElement(inputuserClickCategoryOfPhone).click();
    }

    public void userCanSeeListOfAllPhone(){
        WebElement listAllPhone = driver.findElement(inputuserCanSeeListOfAllPhone);
        assertTrue(listAllPhone.isDisplayed());
        assertEquals("Samsung galaxy s6", listAllPhone.getText());
        System.out.println("ini adalah page= " + listAllPhone);

        try {
            Thread.sleep(9000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }


//    user add item and detail item
    public void userClickItemSelection(){
        driver.findElement(inputuserClickItemSelection).click();
        try {
            Thread.sleep(9000); // Jeda selama 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userCanGetMoreInformationFromItemSelection(){
        WebElement itemselection = driver.findElement(inputuserCanGetMoreInformationFromItemSelection);
        assertTrue(itemselection.isDisplayed());
        assertEquals("Sony vaio i7", itemselection.getText());
        System.out.println("ini adalah page= " + itemselection);
    }

    public void userAddItemSelectionToChart(){
        driver.findElement(inputuserAddItemSelectionToChart).click();

    }

    public void userClickChart(){
        driver.findElement(inputuserClickChart).click();
    }

    public void userCanSeeAddItemSelectionOnChartPage(){
        WebElement itemChart = driver.findElement(inputuserCanSeeAddItemSelectionOnChartPage);
        assertTrue(itemChart.isDisplayed());
        assertEquals("Products", itemChart.getText());
        System.out.println("ini adalah page= " + itemChart);
    }

//  User buying item selection and clear Payment
    public void userClickPlaceOrderForClearRegisterOfPayment(){
        driver.findElement(inputuserClickPlaceOrderForClearRegisterOfPayment).click();
    }

    public void userInputNameWith(String payName){
        driver.findElement(inputuserInputNameWith).sendKeys(payName);
    }

    public void userInputCountryWith(String payCountry){
        driver.findElement(inputuserInputCountryWith).sendKeys(payCountry);
    }

    public void userInputCityWith(String payCity){
        driver.findElement(inputuserInputCityWith).sendKeys(payCity);
    }

    public void userInputCreditCardWith(String payCard){
        driver.findElement(inputuserInputCreditCardWith).sendKeys(payCard);
    }

    public void userInputMonthWith(String payMonth){
        driver.findElement(inputuserInputMonthWith).sendKeys(payMonth);
    }

    public void userInputYearWith(String payYear){
        driver.findElement(inputuserInputYearWith).sendKeys(payYear);
    }

    public void userClickPurchase(){
        driver.findElement(inputuserClickPurchase).click();
    }

    public void userClearPayment(){
        WebElement clearPayment = driver.findElement(inputuserClearPayment);
        assertTrue(clearPayment.isDisplayed());
        assertEquals("Thank you for your purchase!",clearPayment.getText());
        System.out.println("item ini adalah= "+ clearPayment);
    }
}
