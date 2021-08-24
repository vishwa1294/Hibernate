package com.xworkz.Soap;

import com.xworkz.Soap.constant.SoapType;
import com.xworkz.Soap.dao.SoapDAO;
import com.xworkz.Soap.dao.SoapDAOImpl;
import com.xworkz.Soap.dto.SoapDTO;

public class SoapTester {
	
	public static void main(String[] args) {
		SoapDTO entity= new SoapDTO(1,"vaish","Lemon",true,false,SoapType.DETERGENT);
		SoapDAO ref = new SoapDAOImpl();
		ref.save(entity);
	}

}
