package com.ricky;

/**
 * @author Ricky Suhanry on 23/11/2020
 * This class is responsible for keeping the track
 * of teacher's name, id, salary.
 */

public class Teachers {
	
    /**
    * @author Ricky Suhanry on 23/11/2020
    * This class is responsible for keeping the track
    * of teacher's name, id, salary.
    */
    private int id;
	private String name;
	private int salary;
	
	/**
	* Create a new Teacher object.
	* @param id id for the student: unique.
	* @param name name of the student.
	 * @param salary 
	* @param grade of the student.
	*/
	
	public Teachers(int id, String name, int salary) {
		// TODO Auto-generated constructor stub
        this.id = id;
        this.name = name;
		this.salary = salary;
	}
	
	/**
	* @return the id of the teacher.
	*/
	
	public int getId(){
        return id;	
	}
	
	/*
	*@return name of the teacher.
	*/
	
	public String getName(){
		return name;
    }
	
	/*
	*@return the salary of the teacher.
	*/
	
	public int getSalary(){
        return salary;	
	}
	
	/*
	* Update the salary.
	*@param salary
	*/
	
	public void setSalary(int salary){
		this.salary = salary;
    }
}
