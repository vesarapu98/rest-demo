package com.thinkconstructive.restdemo.modal;

public class CloudCompany
{
    private String CompanyId;
    private String CompanyName;
    private String CompanyAddress;
    private String CompanyPhoneNumber;

    public CloudCompany() {
    }

    public CloudCompany(String companyId, String companyName, String companyAddress, String companyPhoneNumber) {
        CompanyId = companyId;
        CompanyName = companyName;
        CompanyAddress = companyAddress;
        CompanyPhoneNumber = companyPhoneNumber;
    }

    public String getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(String companyId) {
        CompanyId = companyId;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getCompanyAddress() {
        return CompanyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        CompanyAddress = companyAddress;
    }

    public String getCompanyPhoneNumber() {
        return CompanyPhoneNumber;
    }

    public void setCompanyPhoneNumber(String companyPhoneNumber) {
        CompanyPhoneNumber = companyPhoneNumber;
    }
}
