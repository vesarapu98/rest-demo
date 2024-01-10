package com.thinkconstructive.restdemo.modal;

public class IPhone
{
    private String IPhoneModal;
    private String IPhoneColor;
    private String Storage;
    private String Price;

    public IPhone() {
    }

    public IPhone(String IPhoneModal, String IPhoneColor, String storage, String price) {
        this.IPhoneModal = IPhoneModal;
        this.IPhoneColor = IPhoneColor;
        Storage = storage;
        Price = price;
    }

    public String getIPhoneModal() {
        return IPhoneModal;
    }

    public void setIPhoneModal(String IPhoneModal) {
        this.IPhoneModal = IPhoneModal;
    }

    public String getIPhoneColor() {
        return IPhoneColor;
    }

    public void setIPhoneColor(String IPhoneColor) {
        this.IPhoneColor = IPhoneColor;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String storage) {
        Storage = storage;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
