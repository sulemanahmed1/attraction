package com.jrp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "places")
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Column(unique=true)
    private String name;

    @NotBlank
    private String street;

    @NotNull
    private int streetnr;
    
    @NotBlank
    private String city;
    
    @NotNull
    private int postalcode;
    
    private int tlf;
    
    private String email;
    
    private String category;
 
	public Company() {
	}

	public Company(@NotBlank String name, @NotBlank String street, @NotBlank int streetnr, @NotBlank String city,
			@NotBlank int postalcode, int tlf, String email, String category) {
		super();
		this.name = name;
		this.street = street;
		this.streetnr = streetnr;
		this.city = city;
		this.postalcode = postalcode;
		this.tlf = tlf;
		this.email = email;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public int getStreetnr() {
		return streetnr;
	}

	public String getCity() {
		return city;
	}

	public int getPostalcode() {
		return postalcode;
	}

	public int getTlf() {
		return tlf;
	}

	public String getEmail() {
		return email;
	}

	public String getCategory() {
		return category;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setStreetnr(int streetnr) {
		this.streetnr = streetnr;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

	public void setTlf(int tlf) {
		this.tlf = tlf;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Json [id=" + id + ", name=" + name + ", street=" + street + ", streetnr=" + streetnr + ", city=" + city
				+ ", postalcode=" + postalcode + ", tlf=" + tlf + ", email=" + email + ", category=" + category + "]";
	}

}