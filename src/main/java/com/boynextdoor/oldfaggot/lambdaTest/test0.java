package com.boynextdoor.oldfaggot.lambdaTest;

import com.boynextdoor.oldfaggot.entity.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @Auther: wangc
 * @Date: 2018/12/22 10:59
 * @Description:
 */
public class test0 {

	public static void main(String[] args) {

		List<Person> javaProgrammers = new ArrayList<Person>() {
			{
				add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
				add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
				add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
				add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
				add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
				add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
				add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
				add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
				add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
				add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
			}
		};

		List<Person> phpProgrammers = new ArrayList<Person>() {
			{
				add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
				add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
				add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
				add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
				add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
				add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
				add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
				add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
				add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
				add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
			}
		};

		/*Consumer<Person> payRise = person -> person.setSalary(person.getSalary() / 100 * 150);
		javaProgrammers.forEach(payRise);
		javaProgrammers.forEach(System.out::println);*/

		/*Predicate<Person> salaryFilter = person -> (person.getSalary() > 1200);
		Predicate<Person> genderFilter = person -> ("male".equals(person.getGender()));
		javaProgrammers.stream().filter(salaryFilter).filter(genderFilter).forEach(System.out::println);*/

		/*Predicate<Person> salaryFilter = person -> (person.getSalary() > 1200);
		Predicate<Person> genderFilter = person -> ("male".equals(person.getGender()));
		javaProgrammers.stream().filter(salaryFilter).filter(genderFilter).limit(3).forEach(System.out::println);*/

		/*Predicate<Person> salaryFilter = person -> (person.getSalary() > 1200);
		Predicate<Person> genderFilter = person -> ("male".equals(person.getGender()));
		javaProgrammers.stream().filter(salaryFilter).filter(genderFilter).limit(3).forEach(person -> System.out.printf("%s %s; ", person.getFirstName(), person.getLastName()));*/

		/*List<Person> sortedJavaProgrammers = javaProgrammers
			.stream()
			.sorted((p, p2) -> (p.getFirstName().compareTo(p2.getFirstName())))
			.limit(5)
			.collect(toList());

		sortedJavaProgrammers.forEach((p) -> System.out.printf("%s %s; %n", p.getFirstName(), p.getLastName()));*/


		//phpProgrammers.stream().sorted((o1, o2) -> (o1.getFirstName().compareTo(o2.getFirstName()))).forEach(person -> System.out.println(person));

		/*List<Person> personList = javaProgrammers.stream().sorted((o1, o2) -> (o1.getSalary() - o2.getSalary())).collect(toList());
		personList.forEach(person -> System.out.printf("%s %s; %n",person.getFirstName(),person.getAge()));*/

		/*String firstNames = phpProgrammers.stream().map(Person::getFirstName).collect(joining("; "));
		System.out.println(firstNames);*/

		/*String javaNames = javaProgrammers.stream().sorted((o1, o2) -> (o1.getSalary() - o2.getSalary())).map(Person::getFirstName).collect(joining("; "));
		System.out.println(javaNames);*/

		/*Set<String> nameSet = phpProgrammers.stream().map(Person::getFirstName).collect(Collectors.toSet());
		nameSet.forEach(System.out::println);*/

		Function<Person, Integer> getSalary = Person::getSalary;
		//Integer integer = getSalary.apply();
		Function<Object, Object> identity = Function.identity();
	}
}
