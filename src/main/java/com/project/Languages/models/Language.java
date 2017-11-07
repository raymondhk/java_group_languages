package com.project.Languages.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Language {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
    @Size(min=2, max=20)
    private String name;

	@Column
    @Size(min=2, max=20)
    private String creator;

	@Column
    @Size(min=1, message="must exist!")
	private String version;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date createdAt;
    @Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date updatedAt;

	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
	}
	
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
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
}