package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.BaseTest;

public class ToolFormPage extends BaseTest {

	@FindBy(id = "li-toolform")
	WebElement ToolFormTab;

	@FindBy(id = "Opportunity_CompanyId")
	WebElement EGCCompanyDD;

	@FindBy(id = "Opportunity_CustomerId")
	WebElement CustomerDD;

	@FindBy(id = "Opportunity_PlantId")
	WebElement PlanDD;

	@FindBy(id = "Opportunity_DepartmentId")
	WebElement DepartmentDD;

	@FindBy(id = "Opportunity_MachineOrStationId")
	WebElement StationOrMachineDD;

	@FindBy(id = "Opportunity_TransactionalCurrencyId")
	WebElement CurrencyDD;
}
