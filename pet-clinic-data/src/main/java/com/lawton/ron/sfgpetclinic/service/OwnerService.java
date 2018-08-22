package com.lawton.ron.sfgpetclinic.service;

import com.lawton.ron.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
