package com.example.pharmacy.controller;

import com.example.pharmacy.model.Medicine;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/medicines")
public class MedicineController {
    private Map<Integer, Medicine> medicineMap = new ConcurrentHashMap<>();
    private int nextMedicineId = 1;

    // Create a new medicine
    @PostMapping
    public boolean addMedicine(@RequestBody Medicine medicine) {
        medicine.setMedicineId(nextMedicineId);
        medicineMap.put(nextMedicineId, medicine);
        nextMedicineId++;
        return true; // You can add error handling and return false if necessary
    }

    // Update an existing medicine
    @PutMapping("/{medicineId}")
    public Medicine updateMedicine(@PathVariable int medicineId, @RequestBody Medicine updatedMedicine) {
        if (medicineMap.containsKey(medicineId)) {
            Medicine existingMedicine = medicineMap.get(medicineId);
            // Update the existing medicine with new details
            existingMedicine.setMedicineName(updatedMedicine.getMedicineName());
            existingMedicine.setPrice(updatedMedicine.getPrice());
            existingMedicine.setQuantity(updatedMedicine.getQuantity());
            existingMedicine.setDescription(updatedMedicine.getDescription());
            return existingMedicine;
        } else {
            return null; // You can handle this case differently, e.g., return an error message.
        }
    }
}
