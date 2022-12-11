/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Drugs;

/**
 *
 * @author HOME
 */
public class Drugs {
    
    private String Disease;
    private String DrugName;
    private String DrugCompostion;
    private String Id;
    //private int id;
    //private static int count = 1;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

//    public Drugs() {
//        id = count;
//        count++;
//    }

    public String getDisease() {
        return Disease;
    }

    public void setDisease(String Disease) {
        this.Disease = Disease;
    }

    public String getDrugName() {
        return DrugName;
    }

    public void setDrugName(String DrugName) {
        this.DrugName = DrugName;
    }

    public String getDrugCompostion() {
        return DrugCompostion;
    }

    public void setDrugCompostion(String DrugCompostion) {
        this.DrugCompostion = DrugCompostion;
    }

//    public int getId() {
//        return id;
//    }

//    public void setId(int id) {
//        this.id = id;
//    }

//    public static int getCount() {
//        return count;
//    }
//
//    public static void setCount(int count) {
//        Drugs.count = count;
//    }

    @Override
    public String toString() {
        return DrugName;
    }

   
}
