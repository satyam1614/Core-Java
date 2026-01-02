package com.rays.collectionss.sorting;

public class Marksheet implements Comparable<Marksheet> {
	
	private String name;
	private int rollno;
	private int phy;
	
	public Marksheet(String name,int rollno,int phy ) {
		this.name = name;
		this.rollno = rollno;
		this.phy =phy;
	}
@Override
public String toString() {
	
	return "name:" + name + " | rollno:" + rollno +" | phy:" + phy + "\n";
}
@Override
public int compareTo(Marksheet o) {
	//return this.rollno - o.rollno;
	 // return this.phy -o.phy;
	return this.name.compareTo(o.name);
}

}
