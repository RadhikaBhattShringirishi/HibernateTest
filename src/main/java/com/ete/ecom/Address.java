package com.ete.ecom;

import java.util.Arrays;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
    private int addressId;
	
    @Column(name= "street")
	private String street;
	
    @Column(name= "city")
	private String city;
	
    @Lob
    private byte[] image;
	
   
	private boolean isOpen;
	
	@Temporal(TemporalType.DATE)
	private Date createdAt;
	
	@Transient
	private Double xyz;

	public Address(int addressId, String street, String city, byte[] image, boolean isOpen, Date createdAt,
			Double xyz) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.image = image;
		this.isOpen = isOpen;
		this.createdAt = createdAt;
		this.xyz = xyz;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Double getXyz() {
		return xyz;
	}

	public void setXyz(double d) {
		this.xyz = d;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", image="
				+ Arrays.toString(image) + ", isOpen=" + isOpen + ", createdAt=" + createdAt + ", xyz=" + xyz + "]";
	}
	
	

}
