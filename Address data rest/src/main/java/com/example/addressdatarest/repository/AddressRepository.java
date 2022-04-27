package com.example.addressdatarest.repository;

import com.example.addressdatarest.entity.Address;
import com.example.addressdatarest.projection.ProjectionAddress;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

//path = "address"

//collectionResourceRel = "list" bu getAlldagi kelgandagi arrayni nomi , default= className+s

//excerptProjection = ProjectionAddress.class bu interfaceda biz objectni qaysi fieldlarini bermoqchi bolsak method korinishida(Getter) yozamiz



@RepositoryRestResource(path = "address", collectionResourceRel = "list",excerptProjection = ProjectionAddress.class)
public interface AddressRepository extends JpaRepository<Address, Integer> {

    //http://localhost:8080/api/address/search/byName?city=Samarqand
    @RestResource(path = "byName")
    public Page<Address> findAllByCity(@Param("city") String city, Pageable pageable);



    //sort qilish
    //http://localhost:8080/api/address?sort=street,desc    //default asc yani osish tartibida

    //http://localhost:8080/api/address?sort=street,city,desc  //birinchi street keyin city boyicha sort qiladi

}
