package com.vytrack.pageObjects;

import org.openqa.selenium.WebElement;

public class login_Page {
    private String TD_Username;
    private String TD_Password;
    private String SalesM_Username;
    private String SalesM_Password;
    private String StoreM_Username;
    private String StoreM_Password;

    WebElement Username_InputBox;
    WebElement Password_InputBox;
    WebElement LogIn_Button;
    WebElement Login_Text;
    WebElement Username_Text;
    WebElement Password_Text;
    WebElement RememberMe_TickBox;
    WebElement RememberMe_Text;
    WebElement ForgotPW_Text;

    public login_Page(WebElement username_InputBox, WebElement password_InputBox, WebElement logIn_Button,
                     WebElement login_Text, WebElement username_Text, WebElement password_Text,
                     WebElement rememberMe_TickBox,WebElement rememberMe_Text, WebElement forgotPW_Text) {
        Username_InputBox = username_InputBox;
        Password_InputBox = password_InputBox;
        LogIn_Button = logIn_Button;
        Login_Text = login_Text;
        Username_Text = username_Text;
        Password_Text = password_Text;
        RememberMe_TickBox = rememberMe_TickBox;
        RememberMe_Text = rememberMe_Text;
        ForgotPW_Text = forgotPW_Text;
    }

    public void LoginAsTD(String TD_Username,String TD_Password){
        Username_InputBox.sendKeys(TD_Username);
        Password_InputBox.sendKeys(TD_Password);
        LogIn_Button.click();
    }
    public void LoginAsSalesM(String SalesM_Username,String SalesM_Password){
        Username_InputBox.sendKeys(SalesM_Username);
        Password_InputBox.sendKeys(SalesM_Password);
        LogIn_Button.click();
    }
    public void LoginAsStoreM(String StoreM_Username,String StoreM_Password){
        Username_InputBox.sendKeys(StoreM_Username);
        Password_InputBox.sendKeys(StoreM_Password);
        LogIn_Button.click();
    }


}
