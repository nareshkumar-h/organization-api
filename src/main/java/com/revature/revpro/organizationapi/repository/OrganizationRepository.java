package com.revature.revpro.organizationapi.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import com.revature.revpro.organizationapi.model.Organization;

@RestResource(path = "organizations")
public interface OrganizationRepository extends PagingAndSortingRepository<Organization, Long>{

	@Override
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	List<Organization> findAll();
}
