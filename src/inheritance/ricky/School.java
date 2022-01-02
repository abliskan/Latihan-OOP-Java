package inheritance.ricky;

import java.util.List;

public class School {
	private List<Teachers> teachers;
	private List<Students> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/**
	 * new school object is created.
	 * @param teachers list of teachers in the school.
	 * @param students list of students in the school.
	 */
	public School(List<Teachers> teachers, List<Students> students) {
		super();
		this.teachers = teachers;
		this.students = students;
	}
	
	/**
	 * @return the list of the students.
	 */
	public List<Teachers> getTeachers() {
		return teachers;
	}
	
	/**
	 * Add teacher to the school.
	 * @param teachers the teacher to be added.
	 */
	public void addTeacher(Teachers teacher) {
		teachers.add(teacher);
	}
	
	public void setTeachers(List<Teachers> teachers) {
		this.teachers = teachers;
	}
	
	/**
	 * 
	 * @return the list of the student in the school.
	 */
	public List<Students> getStudents() {
		return students;
	}
	
	/**
	 * Add the student to the school.
	 * @param students the student to be added.
	 */
	/**
	 * Add teacher to the school.
	 * @param teachers the teacher to be added.
	 */
	public void addStudent(Students student) {
		students.add(student);
	}
	
	public void setStudents(List<Students> students) {
		this.students = students;
	}
	
	/**
	 * 
	 * @return the total money earned by the school.
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	/**
	 * 
	 * @param totalMoneyEarned 
	 */
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}
	
	public static void setTotalMoneyEarned(int totalMoneyEarned) {
		totalMoneyEarned = totalMoneyEarned;
	}
	
	/**
	 * 
	 * @return the total money spent by the school.
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	/**
	 * 
	 * @param totalMoneyEarned 
	 */
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned += moneySpent;
	}
	
	public void setTotalMoneySpent(int totalMoneySpent) {
		this.totalMoneySpent = totalMoneySpent;
	}
	// Last vid min: 1:11:33
}