package com.mklachl.swb.model;

import java.time.LocalDate;

public class Pet {
	
	private PetType type;
	private LocalDate birthDate;
	private Owner owner;
	
	
	
	public PetType getType() {
		return type;
	}
	
	public void setType(PetType type) {
		this.type = type;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public Owner getOwner() {
		return owner;
	}
	
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	

	
}
