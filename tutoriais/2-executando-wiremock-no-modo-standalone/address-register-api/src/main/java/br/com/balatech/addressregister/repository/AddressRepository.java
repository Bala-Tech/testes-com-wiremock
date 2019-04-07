package br.com.balatech.addressregister.repository;

import br.com.balatech.addressregister.entity.AddressEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AddressRepository {

    private static List<AddressEntity> listOfAddress = new ArrayList<>();

    public void saveAddress(AddressEntity addressEntity) {
        listOfAddress.add(addressEntity);
    }

    public List<AddressEntity> listAddress() {
        return listOfAddress;
    }

}
