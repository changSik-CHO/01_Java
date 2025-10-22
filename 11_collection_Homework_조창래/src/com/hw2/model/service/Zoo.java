package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {
		
		private List<Animal> animals = new ArrayList<>();
		private Scanner sc = new Scanner (System.in);
		
		public Zoo () {
			
			
		}
			
		public void addAnimal(Animal animal) {
			animals.add(animal);
		}	
		
		public void showAnimals() {
			
			
		}
		
		
		

}