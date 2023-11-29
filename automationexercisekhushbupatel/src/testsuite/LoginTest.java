package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl =  "http://automationexercise.com";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void loginUserWithCorrectEmailAndPassword(){
//        3. Verify that home page is visible successfully
        boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
        System.out.println(result);
//        4. Click on 'Signup / Login' button
        WebElement login = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a"));
        login.click();
//        5. Verify 'Login to your account' is visible
        String actualResult = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
        System.out.println(actualResult);
        String expectedResult = "Login to your account";
        Assert.assertEquals(actualResult,expectedResult);
//        6. Enter correct email address and password
        WebElement emailAddress = driver.findElement(By.xpath("//form[@action='/login']/input[2]"));
        emailAddress.sendKeys("khushbu2827@gmail.com");
        WebElement passwordField = driver.findElement(By.xpath("//form[@action='/login']/input[3]"));
        passwordField.sendKeys("Khushbu@2802#");
//        7. Click 'login' button
        WebElement loginButton = driver.findElement(By.xpath("//form[@action='/login']/button"));
        loginButton.click();
//        8. Verify that 'Logged in as username' is visible
        String actualResult1 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[10]")).getText();
        System.out.println(actualResult1);
        String expectedResult1 = "Logged in as KhushbuKhushbu";
        Assert.assertEquals(actualResult1,expectedResult1);
//        9. Click 'Delete Account' button
//        WebElement delete = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[5]/a"));
//        delete.click();
//        10. Verify that 'ACCOUNT DELETED!' is visible
//        String actualResult2 = driver.findElement(By.xpath("//div[@class='col-sm-9 col-sm-offset-1']/h2/b")).getText();
//        System.out.println(actualResult2);
//        String expectedResult2 = "ACCOUNT DELETED!";
//        Assert.assertEquals(actualResult2,expectedResult2);

    }
    @Test
    public void loginUserWithIncorrectEmailAndPassword(){

//   3. Verify that home page is visible successfully
        boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
        System.out.println(result);
//4. Click on 'Signup / Login' button
        WebElement login = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a"));
        login.click();
//5. Verify 'Login to your account' is visible
        String actualResult = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
        System.out.println(actualResult);
        String expectedResult = "Login to your account";
        Assert.assertEquals(actualResult,expectedResult);
//6. Enter incorrect email address and password
        WebElement emailAddress = driver.findElement(By.xpath("//form[@action='/login']/input[2]"));
        emailAddress.sendKeys("khushbu28@gmail.com");
        WebElement passwordField = driver.findElement(By.xpath("//form[@action='/login']/input[3]"));
        passwordField.sendKeys("Khushbu@28#");
//7. Click 'login' button
        WebElement loginButton = driver.findElement(By.xpath("//form[@action='/login']/button"));
        loginButton.click();
//8. Verify error 'Your email or password is incorrect!' is visible
        String actualResult1 = driver.findElement(By.xpath("//form[@action='/login']/p")).getText();
        System.out.println(actualResult1);
        String expectedResult1 = "Your email or password is incorrect!";
        Assert.assertEquals(actualResult1,expectedResult1);
    }
    @Test
     public void logoutUser(){
//3. Verify that home page is visible successfully
        boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
        System.out.println(result);
//4. Click on 'Signup / Login' button
        WebElement login = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a"));
        login.click();
//5. Verify 'Login to your account' is visible
        String actualResult = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
        System.out.println(actualResult);
        String expectedResult = "Login to your account";
        Assert.assertEquals(actualResult,expectedResult);
//6. Enter correct email address and password
        WebElement emailAddress = driver.findElement(By.xpath("//form[@action='/login']/input[2]"));
        emailAddress.sendKeys("khushbu2827@gmail.com");
        WebElement passwordField = driver.findElement(By.xpath("//form[@action='/login']/input[3]"));
        passwordField.sendKeys("Khushbu@2802#");
//7. Click 'login' button
        WebElement loginButton = driver.findElement(By.xpath("//form[@action='/login']/button"));
        loginButton.click();
//8. Verify that 'Logged in as username' is visible
        String actualResult1 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[10]")).getText();
        System.out.println(actualResult1);
        String expectedResult1 = "Logged in as KhushbuKhushbu";
        Assert.assertEquals(actualResult1,expectedResult1);
//9. Click 'Logout' button
        WebElement logoutButton = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]"));
        logoutButton.click();
//10. Verify that user is navigated to login page
        String actualResult2 = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
        System.out.println(actualResult2);
        String expectedResult2 = "Login to your account";
        Assert.assertEquals(actualResult2,expectedResult2);
    }
    @Test
    public void registerUserWithExistingEmail(){
//        3. Verify that home page is visible successfully
        boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
        System.out.println(result);
//4. Click on 'Signup / Login' button
        WebElement login = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a"));
        login.click();
//        5. Verify 'New User Signup!' is visible
        String actualResult = driver.findElement(By.xpath("//div[@class='signup-form']/h2")).getText();
        System.out.println(actualResult);
        String expectedResult = "New User Signup!";
        Assert.assertEquals(actualResult,expectedResult);
//        6. Enter name and already registered email address
        WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
        name.sendKeys("Khushbu");
        WebElement emailAddress = driver.findElement(By.xpath("//form[@action='/signup']/input[3]"));
        emailAddress.sendKeys("khushbu2827@gmail.com");
//        7. Click 'Signup' button
        WebElement signUp = driver.findElement(By.xpath("//form[@action='/signup']/button"));
        signUp.click();
//        8. Verify error 'Email Address already exist!' is visible
        String actualResult1 = driver.findElement(By.xpath("//form[@action='/signup']/p")).getText();
        System.out.println(actualResult1);
        String expectedResult1 = "Email Address already exist!";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void verifyTestCasesPage(){
//        3. Verify that home page is visible successfully
        boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
        System.out.println(result);
//        4. Click on 'Test Cases' button
        WebElement testCasesButton = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[5]/a"));
        testCasesButton.click();
//        5. Verify user is navigated to test cases page successfully
        String actualResult = driver.findElement(By.xpath("//h2[@class='title text-center']/b")).getText();
        System.out.println(actualResult);
        String expectedResult = "TEST CASES";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void verifyAllProductsAndProductDetailPage(){
//        3. Verify that home page is visible successfully
        boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
        System.out.println(result);
//        4. Click on 'Products' button
        WebElement productsButton = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/a"));
        productsButton.click();
//        5. Verify user is navigated to ALL PRODUCTS page successfully
        String actualResult = driver.findElement(By.xpath("//h2[@class='title text-center']")).getText();
        System.out.println(actualResult);
        String expectedResult = "ALL PRODUCTS";
        Assert.assertEquals(actualResult,expectedResult);
//        6. The products list is visible
//        7. Click on 'View Product' of first product
        driver.findElement(By.xpath("//div[@class='features_items']/div[2]/div/div[2]/ul/li")).click();
//        8. User is landed to product detail page
        boolean result1 = driver.findElement(By.xpath("//div[@class='product-details']/div[2]/div")).isEnabled();
        System.out.println(result1);
//        9. Verify that detail is visible: product name, category, price, availability, condition, brand
//        driver.findElement(By.xpath("//div[@class='product-details']/div[2]/div/h2")).getText(); //Product Name
//        driver.findElement(By.xpath("//div[@class='product-details']/div[2]/div/p")).getText(); //category
//        driver.findElement(By.xpath("//div[@class='product-details']/div[2]/div/span/span")).getText(); //price
//        driver.findElement(By.xpath("//div[@class='product-details']/div[2]/div/p[2]")).getText(); //availability
//        driver.findElement(By.xpath("//div[@class='product-details']/div[2]/div/p[3]")).getText(); //condition
//        driver.findElement(By.xpath("//div[@class='product-details']/div[2]/div/p[4]")).getText(); //brand
    }
    @Test
    public void searchProduct(){
//        3. Verify that home page is visible successfully
        boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();
        System.out.println(result);
//        4. Click on 'Products' button
        WebElement productsButton = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/a"));
        productsButton.click();
//        5. Verify user is navigated to ALL PRODUCTS page successfully
        String actualResult = driver.findElement(By.xpath("//h2[@class='title text-center']")).getText();
        System.out.println(actualResult);
        String expectedResult = "ALL PRODUCTS";
        Assert.assertEquals(actualResult,expectedResult);
//        6. Enter product name in search input and click search button
        WebElement search = driver.findElement(By.xpath("//input[@id='search_product']"));
        search.sendKeys("tops");
        WebElement searchButton = driver.findElement(By.xpath("//button[@id='submit_search']"));
        searchButton.click();
//        7. Verify 'SEARCHED PRODUCTS' is visible
        String actualResult1 = driver.findElement(By.xpath("//h2[@class='title text-center']")).getText();
        System.out.println(actualResult1);
        String expectedResult1 = "SEARCHED PRODUCTS";
        Assert.assertEquals(actualResult1,expectedResult1);
//        8. Verify all the products related to search are visible
        String actualResult2 = driver.findElement(By.xpath("//div[@class='features_items']")).getText();
        System.out.println(actualResult2);
    }
    @After
    public void endTest(){
        //closeBrowser();
    }
}
