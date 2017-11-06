package com.project.Languages.models;

import javax.validation.constraints.Size;

public class Language {
    @Size(min=2, max=20)
    private String name;

    @Size(min=2, max=20)
    private String creator;

    @Size(min=1)
    private String version;

    public Language() {
    }

    public Language(String name, String creator, String version){
        this.name = name;
        this.creator = creator;
        this.version = version;
    }

	/**
	 * @return the version
	 */
	public String getversion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setversion(String version) {
		this.version = version;
	}

	/**
	 * @return the creator
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * @param creator the creator to set
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}