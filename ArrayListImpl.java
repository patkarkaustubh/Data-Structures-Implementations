import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayListImpl {

	int rollno;
	String fname;
	String lname;
	int cgpa;
	
	public ArrayListImpl(int rollno, String fname,String lname,int cgpa)
	{
		this.rollno=rollno;
		this.fname=fname;
		this.lname=lname;
		this.cgpa=cgpa;
		
		
	}
	
	public String toString()
	{
		return this.rollno+" "+this.fname+" "+this.lname+" "+this.cgpa;
		
	}
	
	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public int getCgpa() {
		return cgpa;
	}



	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}
	
	
	public static void main(String args[])
	{
		List<ArrayListImpl> list = new ArrayList<>(); 
		list.add(new ArrayListImpl(1,"Kaustubh","Patkar",3));
		list.add(new ArrayListImpl(2,"Venkatesh","Devale",4));
		list.add(new ArrayListImpl(3,"Kshitija","Godse",3));
		
	 System.out.println(list);
		System.out.println("The size of list is:"+list.size());
		System.out.println("The second element in list is "+list.get(2));
	
	}
}
