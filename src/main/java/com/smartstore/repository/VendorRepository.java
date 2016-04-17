package com.smartstore.repository;




import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.mum.eselling.domain.Vendor;

@Repository
public interface VendorRepository extends CrudRepository<Vendor, Long> {
	
	
	@Query("SELECT v FROM Vendor v WHERE v.credentials.username = :name")
	public Vendor findVendorByUserName(
			@Param(value = "name") String name);


	
	/*@Query("SELECT vendor FROM Vendor v  INNER JOIN v.products product WHERE WHERE p.id= :id")
	 public Vendor getVendorByProductId(@Param(value = "id")Long id);*/
}