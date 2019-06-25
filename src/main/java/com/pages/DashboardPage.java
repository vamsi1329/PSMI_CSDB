package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseTest;

public class DashboardPage extends BaseTest {

	@FindBy(xpath = "//a[contains(text(),'Cost Savings')]")
	WebElement CostSavingsDDLink;

	@FindBy(xpath = "//a[contains(text(),'Tool Form')]")
	WebElement ToolFormLink;

	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickToolFomrLink() {
		Actions a = new Actions(driver);
		a.moveToElement(CostSavingsDDLink).perform();
		a.moveToElement(ToolFormLink).click().build().perform();
	}

}
