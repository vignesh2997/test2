package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageobject extends basepage {
	
	int qa= 10;


	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement womenBox;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dressBox;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement tshirtBox;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/h1/span[1]")
	private WebElement verifyWomentext;
	
	public homepageobject() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getWomen() {
		return womenBox;
	}
	public String getTextWomen() {
		return verifyWomentext.getText();
	}
	
	public WebElement getDress() {
		return dressBox;
	}
	public WebElement getTshirt() {
		return tshirtBox;
	}
	
	
	
	

}
