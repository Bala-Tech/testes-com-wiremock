package br.com.balatech.addressregister.bean;

import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

public class ZipCodeResponse {

    private String zipCode;
    private String address;
    private String complement;
    private String neighborhood;
    private String state;
    private String city;

    public ZipCodeResponse(String zipCode, String address, String complement, String neighborhood, String state, String city) {
        this.zipCode = zipCode;
        this.address = address;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.state = state;
        this.city = city;
    }

    public ZipCodeResponse() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZipCodeResponse that = (ZipCodeResponse) o;
        return Objects.equals(zipCode, that.zipCode) &&
                Objects.equals(address, that.address) &&
                Objects.equals(complement, that.complement) &&
                Objects.equals(neighborhood, that.neighborhood) &&
                Objects.equals(state, that.state) &&
                Objects.equals(city, that.city);
    }

    public boolean isObjectEmpty() {
        Iterator<String> iterator = Stream.of(zipCode, address, complement, neighborhood, state, city).iterator();

        while (iterator.hasNext()) {
            if (Objects.isNull(iterator.next())) {
                return true;
            }
        }

        return false;
    }
}
