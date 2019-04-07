package br.com.balatech.addressregister.resource;

import br.com.balatech.addressregister.bean.ZipCodeResponse;
import br.com.balatech.addressregister.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zipCode")
public class ZipCodeResource {

    @Autowired
    private AddressService addressService;

    @GetMapping("/{zipCode}")
    public ZipCodeResponse listAddressByZipCode(@PathVariable String zipCode, Model model) {
        return addressService.getAddressByZipCode(zipCode);
    }

}
