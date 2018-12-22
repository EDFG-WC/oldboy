package com.boynextdoor.oldfaggot.entity;

/**
 * @Auther: wangc
 * @Date: 2018/12/22 10:59
 * @Description:
 */
public class Person {

	private String firstName;
	private String lastName;
	private String job;
	private String gender;
	private int age;
	private int salary;

	public Person(String firstName, String lastName, String job, String gender, int age, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.job = job;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}

	public Person() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person{" +
			"firstName='" + firstName + '\'' +
			", lastName='" + lastName + '\'' +
			", job='" + job + '\'' +
			", gender='" + gender + '\'' +
			", age=" + age +
			", salary='" + salary + '\'' +
			'}';
	}
}
