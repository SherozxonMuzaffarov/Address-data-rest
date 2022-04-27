package com.example.addressdatarest.service;

import com.example.addressdatarest.entity.Address;
import com.example.addressdatarest.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



//@Service
public class AddressService {

//    @Autowired
//    AddressRepository addressRepository;
//
//    public List<Address> getAddresses(int page, int size) {
//        Pageable pageable = PageRequest.of(page,size);
//        Page<Address> all = addressRepository.findAll(pageable);
//        return all.getContent();
//    }
//
//    public Address getAddress(Integer id) {
//        Optional<Address> optionalAddress = addressRepository.findById(id);
//        if (optionalAddress.isPresent())
//            return optionalAddress.get();
//        return null;
//    }
//
//    public boolean deleteAddress(Integer id) {
//        Optional<Address> optionalAddress = addressRepository.findById(id);
//        if (!optionalAddress.isPresent())
//            return false;
//        addressRepository.deleteById(id);
//        return true;
//    }
//
//    public Address addAddress(Address address) {
//        Address save = addressRepository.save(address);
//        return save;
//    }
//
//    public Address editAddress(Integer id, Address address) {
//        Optional<Address> optionalAddress = addressRepository.findById(id);
//        if (!optionalAddress.isPresent())
//            return null;
//        Address address1 = optionalAddress.get();
//        address1.setCity(address.getCity());
//        address1.setStreet(address.getStreet());
//        addressRepository.save(address1);
//        return address1;
//    }
}
