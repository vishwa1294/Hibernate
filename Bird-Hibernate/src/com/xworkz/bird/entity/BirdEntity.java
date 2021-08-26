package com.xworkz.bird.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.xworkz.bird.entity.BirdEntity;
@Entity
@Table(name = "bird_table")

public class BirdEntity implements Serializable{
		
		@Column(name = "b_id")
		@Id
		private int id;
		@Column(name = "b_name")
		private String name;
		@Column(name = "b_color")
		private String color;
		@Column(name = "b_Type")
		private String Type;
		@Column(name = "b_wings")
		private int wings;
		@Column(name = "b_skeleton")
		private int skeleton ;
		@Column(name = "b_beak")
		private String beak ;
		@Column(name = "b_size")
		private int size ;
		@Column(name = "b_legs")
		private int legs ;
		@Column(name = "b_TypeOfClass")
		private String typeOfClass ;
		
		public BirdEntity() {
			
		}
		
		
		public BirdEntity(int id, String name, String color, String type, int wings, int skeleton, String beak,
				int size, int legs, String typeOfClass) {
			super();
			this.id = id;
			this.name = name;
			this.color = color;
			this.Type = type;
			this.wings = wings;
			this.skeleton = skeleton;
			this.beak = beak;
			this.size = size;
			this.legs = legs;
			this.typeOfClass = typeOfClass;
		}

      @Override
		public String toString() {
			return "BirdEntity [id=" + id + ", name=" + name + ", color=" + color + ", Type=" + Type + ", wings="
					+ wings + ", skeleton=" + skeleton + ", beak=" + beak + ", size=" + size + ", legs=" + legs
					+ ", TypeOfClass=" + typeOfClass + "]";
			
		}
      

		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Type == null) ? 0 : Type.hashCode());
		result = prime * result + ((typeOfClass == null) ? 0 : typeOfClass.hashCode());
		result = prime * result + ((beak == null) ? 0 : beak.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + id;
		result = prime * result + legs;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + size;
		result = prime * result + skeleton;
		result = prime * result + wings;
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
		BirdEntity other = (BirdEntity) obj;
		if (Type == null) {
			if (other.Type != null)
				return false;
		} else if (!Type.equals(other.Type))
			return false;
		if (typeOfClass == null) {
			if (other.typeOfClass != null)
				return false;
		} else if (!typeOfClass.equals(other.typeOfClass))
			return false;
		if (beak == null) {
			if (other.beak != null)
				return false;
		} else if (!beak.equals(other.beak))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (id != other.id)
			return false;
		if (legs != other.legs)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (size != other.size)
			return false;
		if (skeleton != other.skeleton)
			return false;
		if (wings != other.wings)
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


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public int getWings() {
		return wings;
	}


	public void setWings(int wings) {
		this.wings = wings;
	}


	public int getSkeleton() {
		return skeleton;
	}


	public void setSkeleton(int skeleton) {
		this.skeleton = skeleton;
	}


	public String getBeak() {
		return beak;
	}


	public void setBeak(String beak) {
		this.beak = beak;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getLegs() {
		return legs;
	}


	public void setLegs(int legs) {
		this.legs = legs;
	}


	public String getTypeOfClass() {
		return typeOfClass;
	}


	public void setTypeOfClass(String typeOfClass) {
		typeOfClass = typeOfClass;
	}
	



}
