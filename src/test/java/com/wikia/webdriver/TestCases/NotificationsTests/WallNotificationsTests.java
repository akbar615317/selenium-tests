package com.wikia.webdriver.TestCases.NotificationsTests;

import org.testng.annotations.Test;

import com.wikia.webdriver.Common.Core.CommonFunctions;
import com.wikia.webdriver.Common.Properties.Properties;
import com.wikia.webdriver.Common.Templates.TestTemplate;
import com.wikia.webdriver.PageObjectsFactory.ComponentObject.Notifications.NotificationsComponentObject;

public class WallNotificationsTests extends TestTemplate {
	
	@Test(groups= {"NotificationsTests", "Wall"} )
	public void wallNotificationsTests_001_wallOwnerReceivesANotification() {
		CommonFunctions.logOut(driver);
		CommonFunctions.logIn(Properties.userName, Properties.password, driver);
		
		NotificationsComponentObject notifications = new NotificationsComponentObject(driver);
		notifications.showNotifications();
		notifications.clickNotifications();
		System.out.println("MECH " + notifications.getNumberOfUnreadNotifications());
	}
}
