package com.xworkz.dryfruit;

import com.xworkz.dryfruit.dao.DryFruitDAOImpl;

import com.xworkz.dryfruit.dao.DryFruitDAO;

import com.xworkz.dryfruit.dto.DryFruitDTO;

public class DryFruitTester {

	public static void main(String[] args) {
		
		DryFruitDTO entity = new DryFruitDTO(10, "Badam", "Nutri Organics", "America", 1000, "grofers");

		DryFruitDAO dao = new DryFruitDAOImpl();
		dao.save(entity);

	}

}

