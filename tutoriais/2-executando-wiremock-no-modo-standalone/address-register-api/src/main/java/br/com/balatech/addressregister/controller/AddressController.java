package br.com.balatech.addressregister.controller;

import br.com.balatech.addressregister.bean.Address;
import br.com.balatech.addressregister.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Controller
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    private static Logger LOG = Logger.getLogger(AddressController.class.getName());

    @GetMapping
    public String homePage(Model model) {
        model.addAttribute("address", new Address());
        return "address";
    }

    @PostMapping
    public String saveNewAddress(@ModelAttribute("address") Address address) {
        LOG.info("nova requisição para cadastro de endereço");
        return "list-address";
    }
}