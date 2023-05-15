package com.greatlearning.ems.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {
	private long id;
	private String firstName;
	private String lastName;
	private String email;

}
