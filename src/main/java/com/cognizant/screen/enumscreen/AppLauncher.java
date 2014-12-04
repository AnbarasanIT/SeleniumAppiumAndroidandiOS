package com.cognizant.screen.enumscreen;

import org.openqa.selenium.WebDriver;

import com.cognizant.app.launchApp.AndroidLauncher;
import com.cognizant.data.model.TestNgParameters;

public enum AppLauncher {

	ANDROID() {
		public WebDriver execute(TestNgParameters tngparam) {
			try {
				AndroidLauncher al=new AndroidLauncher();
				return al.androidDriver(tngparam);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
	};

	public WebDriver execute(TestNgParameters tngparam) {
		return null;

	}

}
