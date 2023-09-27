/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
import com.mycompany.posttest1.Motorcycle;
import java.util.ArrayList;

/**
 *
 * @author udinkosd12
 */

public class Posttest1 {

    public static void main(String[] args) {
        Motorcycle motorcycle1 = new Motorcycle("Honda", "CBR500R", "500cc", 30000000);
        Motorcycle motorcycle2 = new Motorcycle("Honda", "CBR500R", "500cc", 30000000);
        Motorcycle motorcycle3 = new Motorcycle("Honda", "CBR500R", "500cc", 30000000);
        Motorcycle motorcycle4 = new Motorcycle("Honda", "CBR500R", "500cc", 30000000);
        Motorcycle motorcycle5 = new Motorcycle("Honda", "CBR500R", "500cc", 30000000);
        
        ArrayList<Motorcycle> motorcycles = new ArrayList<>();
        motorcycles.add(motorcycle1);
        motorcycles.add(motorcycle2);
        motorcycles.add(motorcycle3);
        motorcycles.add(motorcycle4);
        motorcycles.add(motorcycle5);
        
        for (Motorcycle motorcycle : motorcycles){
            String brand = "Nama Motor: " + motorcycle.brand;
            String model = ", Model: " + motorcycle.model;
            String machine = ", Mesin: " + motorcycle.machine;
            String price = ", Price: " + motorcycle.price;
            System.out.println(brand.concat(model + machine + price));
        }
    }
}
