package com.example.demo;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.person.Person;
import com.example.demo.service.PersonService;

@SpringBootApplication
public class PersonTicketApplication implements CommandLineRunner {

	
		@Autowired
		private PersonService service;
		public static void main(String[] args) {
			SpringApplication.run(PersonTicketApplication.class,args);
			
		}
		@Override
		public void run(String...args) throws Exception{
			createPerson();
			
		}
		public void findByLastName() {
			List<Person> Personlist = service.findBylastName("kumar");
			for(Person person : Personlist) {
				
			
			System.out.println(person.toString());
		}
		}
			public void findByFirstNameOrLastName() {
				List<Person> list = service.findByFirstNameOrLastName("ashok", "Kumar");
				for(Person person : list)
				{
					System.out.println(person.toString());
				}
			}
				public void createPerson() {
					List<Person> personList = Arrays.asList(
							new Person(1, "ashok","Kumar","ashokvar2gmail.com", 82),
							new Person(2, "ashok","Kumar","ashokvar2gmail.com", 2),
							new Person(3, "maya","Kumari","maya6gmail.com", 1));
					
					
					Iterable<Person> list1 = service.SavePersonDatalist(personList);
					for(Person person : list1) {
						System.out.println("person Object" +person.toString());
					}
					
		           			
				}
				
			
	}
