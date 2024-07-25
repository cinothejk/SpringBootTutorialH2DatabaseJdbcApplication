package com.cino.SpringBootTutorialH2DatabaseJDBC.model;

import org.springframework.data.annotation.Id;

public record Users(@Id Integer id, String firstname, String lastname) {

	public String fullname() {
		return firstname + " " + lastname;
	}

}
