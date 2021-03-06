package edu.mum.bloodbankrest.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators
		.PropertyGenerator.class,property="id")
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotEmpty
	private String name;
	@Email
	private String email;

	@OneToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@Valid
	private Address address;

	@OneToMany(mappedBy="hospital",fetch=FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Request> requests = new ArrayList<>();

	public Hospital() {}

	public Hospital(String name, Address address,String email) {
		this.name = name;
		this.address = address;
		this.email=email;
	}

	public void addRequest(Request request) {
		this.requests.add(request);
		request.setHospital(this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}
}
