package com.xworkz.Soap.dto;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.Soap.constant.SoapType;

@Entity
@Table(name = "Soap_table")
public class SoapDTO implements Serializable {
	@Column(name = "S_ID")
	@Id
	private int id;
	private String brandAmbassador;
	private String odour;
	private boolean certified;
	private boolean antiBacteria;
	private SoapType type;

	public SoapDTO() {
	}

	public SoapDTO(int id, String brandAmbassador, String odour, boolean certified, boolean antiBacteria,
			SoapType type) {
		super();

		this.id = id;
		this.brandAmbassador = brandAmbassador;
		this.odour = odour;
		this.certified = certified;
		this.antiBacteria = antiBacteria;
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SoapDTO other = (SoapDTO) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SoapDTO [id=" + id + ", brandAmbassador=" + brandAmbassador + ", odour=" + odour + ", certified="
				+ certified + ", antiBacteria=" + antiBacteria + ", type=" + type + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandAmbassador() {
		return brandAmbassador;
	}

	public void setBrandAmbassador(String brandAmbassador) {
		this.brandAmbassador = brandAmbassador;
	}

	public String getOdour() {
		return odour;
	}

	public void setOdour(String odour) {
		this.odour = odour;
	}

	public boolean isCertified() {
		return certified;
	}

	public void setCertified(boolean certified) {
		this.certified = certified;
	}

	public boolean isAntiBacteria() {
		return antiBacteria;
	}

	public void setAntiBacteria(boolean antiBacteria) {
		this.antiBacteria = antiBacteria;
	}

	public SoapType getType() {
		return type;
	}

	public void setType(SoapType type) {
		this.type = type;
	}
}

