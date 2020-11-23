package com.ricky;

public class Students {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * To create a new student by initializing.
	 * Fees for every student is $30,000
	 * Fees paid initially is 0.
	 * @param id id for the student: unique.
	 * @param name name of the student.
	 * @param grade of the student.
	 */
	
	public Students(int id, String name, int grade) {
		this.feesPaid=0;
		this.feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	
	// not going to alter student's name, student's id
	
	/**
	 * Used to update the student's grade.
	 * @param grade new grade of the student.
	 */
	
	public void setGrade(int grade) {
		this.grade=grade;
	}
	
	/**
	 * Keep adding the fees to feesPaid Field.
	 * Add the fees to the fees paid.
	 * The school is going receive the funds.
	 * 
	 * @param fees the fees that the student pays.
	 */
	
	public void updateFeesPaid(int fees) {
		feesPaid = fees;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}
}
