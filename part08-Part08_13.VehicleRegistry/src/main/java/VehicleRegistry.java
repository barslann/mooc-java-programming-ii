
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bekirarslan
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> hm;

    public VehicleRegistry() {
        hm = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!(hm.containsKey(licensePlate))) {
            hm.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }
    
    public String get(LicensePlate licensePlate){
        if(hm.containsKey(licensePlate)){
            return hm.get(licensePlate);
        }else{
            return null;
        }
    }
    public boolean remove(LicensePlate licensePlate){
        if(hm.containsKey(licensePlate)){
            hm.remove(licensePlate);
            return true;
        }else{
            return false;
        }
    }
    
    public void printLicensePlates(){
        for (LicensePlate licenses : hm.keySet()) {
            System.out.println(licenses);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
         
        for (String owner : hm.values()) {
            if (!(owners.contains(owner))) {
                System.out.println(owner);
                owners.add(owner);
            }
        }
    }
}
