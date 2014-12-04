package com.cognizant.screen.enumscreen;

import com.cognizant.data.model.UiIdentifiers;
import com.cognizant.data.parser.CoreBlueIdentifiersParser;

public enum LoadXmlParser {

	ANDROID{
		public UiIdentifiers execute(){
			CoreBlueIdentifiersParser uid= new CoreBlueIdentifiersParser();
			try {
				return uid.parseXml("./src/main/resources/CoreBlueUiIdentifiers.xml");
			} catch (Exception e) {

				e.printStackTrace();
			}
			return null;
		}
	};

	public UiIdentifiers execute(){
		return null;
	}
}
