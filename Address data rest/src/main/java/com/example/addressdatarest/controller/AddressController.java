package com.example.addressdatarest.controller;

import com.example.addressdatarest.entity.Address;
import com.example.addressdatarest.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/api/address")
public class AddressController {

//    @Autowired
//    AddressService addressService;
//
//    @GetMapping("")
//    public HttpEntity<?> getAddresses(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
//        List<Address> addresses = addressService.getAddresses(page, size);
//        return ResponseEntity.ok(addresses);
//    }
//
//    @GetMapping("/{id}")
//    public HttpEntity<?> getAddress(@PathVariable Integer id){
//        Address address = addressService.getAddress(id);
//        return ResponseEntity.status(address!=null? HttpStatus.OK:HttpStatus.CONFLICT).body(address);
//    }
//
//    @DeleteMapping("/{id}")
//    public HttpEntity<?> deleteAddress(@PathVariable Integer id){
//        boolean isDeleteAddress = addressService.deleteAddress(id);
//        if (isDeleteAddress)
//            return ResponseEntity.noContent().build();  //usually noContend returned if deleted successfully
//        return ResponseEntity.notFound().build();
//    }
//
//    @PostMapping("")
//    public HttpEntity<?> addAddress(@RequestBody Address address){
//        Address address1 = addressService.addAddress(address);
//        return ResponseEntity.status(200).body(address1);
//    }
//
//    @PutMapping("/{id}")
//    public HttpEntity<?> editAddress(@PathVariable Integer id, @RequestBody Address address){
//        Address address1 = addressService.editAddress(id, address);
//        return ResponseEntity.status(address1!=null?202:409).body(address1);
//    }
}
