package com.xworkz.bird;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOImpl;
import com.xworkz.bird.entity.BirdEntity;

public class BirdTester {

	public static void main(String[] args) {
		
		BirdEntity entity=new BirdEntity(2,"Duck","White","Vegeterian",2,1,"Strong",4,2,"Reptiles");
		
		
		BirdDAO dao = new BirdDAOImpl();
		dao.save(entity);
		
		
		BirdEntity temp=dao.readById(2);
		System.out.println(temp);		
}
}