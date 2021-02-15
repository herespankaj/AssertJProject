package com.pankaj.AssertJProject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.assertj.core.api.Assertions.*;



@SpringBootApplication
public class AssertJProjectApplication {

	public static void main(String[] args) { 
		
		SpringApplication.run(AssertJProjectApplication.class, args);
		
		List<Employee> le = new ArrayList<>();
		
		le.add(new Employee(1, "Pankaj", 77.20));
		le.add(new Employee(2, "Rashmi", 67.20));
		le.add(new Employee(3, "Nishant", 37.20));
		le.add(new Employee(4, "Pinku", 87.20));
		le.add(new Employee(5, "Nilu", 57.20)); 
		
		assertThat(le.get(1).getName()).isEqualTo("Pankaj"); 
		assertThat(le.get(3).getName()).isEqualTo("Pankaj"); 

		assertThat(le.get(4).getName()).isEqualTo("Nilu");
		assertThat(le.get(3).getName()).isEqualTo("Pankaj");
		
	}
	
	
	
	

}

class Employee { 
	
	private int id;
	private String name; 
	private double weight;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", weight=" + weight + "]";
	} 
	
	
	
}