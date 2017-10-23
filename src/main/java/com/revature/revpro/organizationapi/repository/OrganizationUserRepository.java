package com.revature.revpro.organizationapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.revature.revpro.organizationapi.model.OrganizationUser;

@RestResource(path="organizationUsers")
public interface OrganizationUserRepository extends PagingAndSortingRepository<OrganizationUser, Long>{

	
}
