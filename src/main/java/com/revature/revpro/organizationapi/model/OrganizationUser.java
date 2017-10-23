package com.revature.revpro.organizationapi.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "organization_users")
public class OrganizationUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="org_id")
	private Organization organization;
	
	private Long userId;
	
	private Boolean active;
}
