package br.com.gamastore.rentcar.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name="TB_PROFILE")
public class Profile extends AbstractEntity implements GrantedAuthority {
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	@Override
	public String getAuthority() {
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
