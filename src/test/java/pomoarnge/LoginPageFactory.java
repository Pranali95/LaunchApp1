
/********************************WITH USING PAGE FACTORY*********************************************************************/

package pomoarnge;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
		
	
	//Constructor
	WebDriver driver;
	
		public LoginPageFactory(WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
	//Locators
		
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username_loc;
	
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password_loc;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_login_loc;
	
	@FindBy(tagName ="a")
	List<WebElement> links;
	
	
	//Action Methods
	
	public void setUserName(String username) {
		txt_username_loc.sendKeys(username);
		}
	
	public void setPassword(String password) {
		txt_password_loc.sendKeys(password);
	}
	
	public void loginclick() {
		btn_login_loc.click();
	}
	

		
		

}
