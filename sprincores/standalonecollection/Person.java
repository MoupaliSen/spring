package com.mou.sprincores.standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String,String> feesstructure;
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	

	public Map<String, String> getFeesstructure() {
		return feesstructure;
	}

	public void setFeesstructure(Map<String, String> feesstructure) {
		this.feesstructure = feesstructure;
	}

		

}
