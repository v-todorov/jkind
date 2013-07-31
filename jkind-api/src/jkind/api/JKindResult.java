package jkind.api;

import java.util.List;

public class JKindResult {
	private String text;
	private List<Property> properties;

	public JKindResult(String text, List<Property> properties) {
		this.text = text;
		this.properties = properties;
	}

	public String getText() {
		return text;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public Property getProperty(String name) {
		for (Property property : properties) {
			if (property.getName().equals(name)) {
				return property;
			}
		}

		return null;
	}
}
