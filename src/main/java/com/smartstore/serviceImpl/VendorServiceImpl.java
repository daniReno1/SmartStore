package com.smartstore.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartstore.domain.Vendor;
import com.smartstore.repository.CredentialRepository;
import com.smartstore.repository.VendorRepository;
import com.smartstore.service.VendorService;

@Service
@Transactional
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository vendorRepository;

	@Autowired
	private CredentialRepository credentialRepository;

	public void addNewVendor(Vendor vendor) {
		credentialRepository.save(vendor.getCredentials());
		vendorRepository.save(vendor);
	}

	public Vendor getVendor(Long vendorId) {
		return vendorRepository.findOne(vendorId);

	}

	public void saveVendor(Vendor vendor) {
		vendorRepository.save(vendor);
	}

	public Vendor getVendorByUserName(String name) {
		return vendorRepository.findVendorByUserName(name);
	}

	/*
	 * public Vendor getVendorByProductId(Long productId){ return
	 * vendorRepository.getVendorByProductId(productId); }
	 */

}
