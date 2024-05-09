package com.example.userservice.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dummy {
	@Id
	private String email;
}
