package edu.mum.bloodbankrest.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name="credentials")
@Data
public class UserCredentials {

	@Id
	@Column(nullable = false, unique = true, length =16)
	String username;
	@Column(nullable = false)
	String password;

	@Transient
	String verifyPassword;
	Boolean enabled;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="credentials_id")
	List<Authority> authority = new ArrayList<Authority>();

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}