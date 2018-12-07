package com.Assessment;

import java.util.ArrayList;
import java.util.List;
import com.Assessment.Patient;

public class Database {
	static List<Patient> list=new ArrayList<>();

	//GETTER OF LIST
	public static List<Patient> getList() {
		return list;
	}


	static Patient p;
	//ADD OBJECTS TO THE LIST BY USING STATIC BLOCK
	static
	{
		p=new Patient();
		p.setPatientNo(001);
		p.setPatientName("Avantika Gaur");
		p.setPatientAge(23);
		p.setPatientPhone("9087564321");
		p.setPatientBlood("A+");
		p.setDateOfArrival("23-march-2017");
		p.setDateOfRelease("30-march-2017");
		list.add(p);

		p=new Patient();
		p.setPatientNo(002);
		p.setPatientName("Rohan sharma");
		p.setPatientAge(10);
		p.setPatientPhone("9087456723");
		p.setPatientBlood("B-");
		p.setDateOfArrival("04-august-2017");
		p.setDateOfRelease("10-august-2017");
		list.add(p);

		p=new Patient();
		p.setPatientNo(003);
		p.setPatientName("Ram pal");
		p.setPatientAge(68);
		p.setPatientPhone("9082389000");
		p.setPatientBlood("B+");
		p.setDateOfArrival("05-sept-2017");
		p.setDateOfRelease("07-sept-2017");
		list.add(p);

		p=new Patient();
		p.setPatientNo(004);
		p.setPatientName("Anuj teotia");
		p.setPatientAge(34);
		p.setPatientPhone("7908543262");
		p.setPatientBlood("A-");
		p.setDateOfArrival("12-oct-2017");
		p.setDateOfRelease("15-oct-2017");
		list.add(p);

		p=new Patient();
		p.setPatientNo(005);
		p.setPatientName("Vimla devi");
		p.setPatientAge(79);
		p.setPatientPhone("8097654350");
		p.setPatientBlood("A+");
		p.setDateOfArrival("19-oct-2017");
		p.setDateOfRelease("19-oct-2017");
		list.add(p);

		p=new Patient();
		p.setPatientNo(006);
		p.setPatientName("Shubhash anand");
		p.setPatientAge(45);
		p.setPatientPhone("9456789022");
		p.setPatientBlood("A-");
		p.setDateOfArrival("23-nov-2017");
		p.setDateOfRelease("29-nov-2017");
		list.add(p);

		p=new Patient();
		p.setPatientNo(007);
		p.setPatientName("Dimple khanna");
		p.setPatientAge(24);
		p.setPatientPhone("9085678999");
		p.setPatientBlood("B+");
		p.setDateOfArrival("02-dec-2017");
		p.setDateOfRelease("06-dec-2017");
		list.add(p);
		
		p=new Patient();
		p.setPatientNo(000);
		p.setPatientName("Rohan sharma");
		p.setPatientAge(44);
		p.setPatientPhone("9087434325");
		p.setPatientBlood("B-");
		p.setDateOfArrival("23-august-2017");
		p.setDateOfRelease("01-august-2017");
		list.add(p);
	}
}
