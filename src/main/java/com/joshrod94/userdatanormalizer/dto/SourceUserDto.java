package com.joshrod94.userdatanormalizer.dto;

public class SourceUserDto {
    private Integer id;
    private String name;
    private String username;
    private String email;

    private SourceAddressDto address;
    private SourceCompanyDto company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SourceAddressDto getAddress() {
        return address;
    }

    public void setAddress(SourceAddressDto address) {
        this.address = address;
    }

    public SourceCompanyDto getCompany() {
        return company;
    }

    public void setCompany(SourceCompanyDto company) {
        this.company = company;
    }
}
