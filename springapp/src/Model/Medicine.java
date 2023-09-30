package com.example.pharmacy.model;

public class Medicine {
    private int medicineId;
    private String medicineName;
    private float price;
    private int quantity;
    private String description;

    public Medicine() {
    }

    public Medicine(int medicineId, String medicineName, float price, int quantity, String description) {
        this.medicineId = medicineId;
        this.medicineName = medicineName;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Medicine [medicineId=" + medicineId + ", medicineName=" + medicineName + ", price=" + price +
                ", quantity=" + quantity + ", description=" + description + "]";
    }
}
