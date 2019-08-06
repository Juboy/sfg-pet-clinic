package com.brains.sfgpetclinic.services;

import com.brains.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
		
	Owner findByLastName(String lastName);
	
}
