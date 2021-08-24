package com.xworkz.dryfruit.dto;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.dryfruit.dto.DryFruitDTO;
@Entity
@Table(name = "dryfruits")
public class DryFruitDTO implements Serializable{
	
	@Column(name = "d_id")
	@Id
	private int id;
	@Column(name = "d_name")
	private String name;
	@Column(name = "d_brand")
	private String brand;
	@Column(name = "d_country")
	private String country;
	@Column(name = "d_cost")
	private int cost;
	@Column(name = "d_distributedBy")
	private String distributedBy;
	

	public DryFruitDTO() {
		
	}
public DryFruitDTO(int id, String name, String brand, String country, int cost, String distributedBY) {

			this.id = id;
			this.name = name;
			this.brand = brand;
			this.country = country;
			this.cost = cost;
			this.distributedBy = distributedBY;
		}

		@Override
		public String toString() {
			return "DryFruitDTO [id=" + id + ", name=" + name + ", brand=" + brand + ", country=" + country + ", cost="
					+ cost + ", distributedBY=" + distributedBy + "]";
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
			DryFruitDTO other = (DryFruitDTO) obj;
			if (id != other.id)
				return false;
			return true;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public int getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}

		public String getDistributedBY() {
			return distributedBy;
		}

		public void setDistributedBY(String distributedBY) {
			this.distributedBy = distributedBY;
		}

	}


