package pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import balajiadactin.adactin.Baseclass;

public class loginpage extends Baseclass {
	public loginpage() {
		PageFactory.initElements(driver, this);

}


@FindBy(id = "username")
private WebElement username;
@FindBy(id="password")
 private WebElement password;
@FindBy(id="login")
private WebElement login;
@FindBy(className="auth_error")
private WebElement errormgs;

public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}
public WebElement getErrormgs() {
	return errormgs;

}
public void login(String username,String password)
{
	sendKeys(getUsername(),username);
    sendKeys(getPassword(),password);
 clickElement(getLogin());
}
}


