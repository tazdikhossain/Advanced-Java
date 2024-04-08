package com.java.first.model;

public class CloudVendor {
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber)
    {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public CloudVendor()
    {}

    public String getvendorId()
    {
        return vendorId;
    }

    public void setvendorId(String vendorId)
    {
        this.vendorId = vendorId;
    }

    public String getvendorName()
    {
        return vendorName;
       
    }

    public void setvendorName( String vendorName)
    {
        this.vendorName  = vendorName;
    }

    public String getvendorAddress()
    {
        return vendorAddress;
    }

    public void setvendorAddress(String Address)
    {
        this.vendorAddress = vendorAddress;
    }

    public String getvendorPhoneNumber()
    {
        return vendorPhoneNumber;
    }

    public void setvendorPhoneNumber(String vendorPhoneNumber)
    {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    // REST API







}
