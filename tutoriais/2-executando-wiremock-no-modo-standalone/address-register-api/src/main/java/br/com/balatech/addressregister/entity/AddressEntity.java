package br.com.balatech.addressregister.entity;

public class AddressEntity {

    private String zipCode;
    private String address;
    private String number;
    private String complement;
    private String neighborhood;
    private String state;
    private String city;

    public AddressEntity() {
    }

    public AddressEntity(String zipCode, String address, String number, String complement, String neighborhood, String state, String city) {
        this.zipCode = zipCode;
        this.address = address;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.state = state;
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
