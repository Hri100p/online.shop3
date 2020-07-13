package com.advanced.shop.online.shop.servicee;

import com.advanced.shop.online.shop.modell.Address;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface AddressService {

    void createAddress(Address address);

    void updateAddress(Address address);

    Address getAddressById(Address address);

    List<Address> getAllAddresses();

    void deleteAddressById(Long addressId);


}
