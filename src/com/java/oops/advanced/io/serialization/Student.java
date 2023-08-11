package com.java.oops.advanced.io.serialization;

import java.io.Serializable;

public class Student implements Serializable {

	static String uniName;// static things dont take part in serialization
	transient private int uan;// transient things don't take part in serialization
	
	public static final long serialVersionUID = 43243L;
	
	int id;
	String name;

	public Student(int uan, int id, String name) {
		super();
		this.uan = uan;
		this.id = id;
		this.name = name;
	}

	static void readUniName() {
		System.out.println(uniName);
	}

	@Override
	public String toString() {
		return "Student [uan=" + uan + ", id=" + id + ", name=" + name + "]";
	}

}
