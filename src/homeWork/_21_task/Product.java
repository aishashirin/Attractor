package homeWork._21_task;

import java.time.LocalDate;
import java.util.Random;

public  class  Product {
    private String name;
    private int expirationDate;
    private LocalDate today;
    private LocalDate prodDate;
    private boolean inFridge;
    private String storagePlace;

    public Product(String name, int expirationDate,  boolean inFridge) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.inFridge = inFridge;
    }

    public LocalDate prodDate(){
        Random random = new Random();
        int days = random.nextInt(200)+1;
        return  prodDate = LocalDate.now().minusDays(days);
    }

    public LocalDate getProdDate() {
        return prodDate();
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public LocalDate getToday() {
        today = LocalDate.now();
        return today;
    }

    public boolean fresh(boolean inFridge){
        boolean result = false;
        if (inFridge){
            if(getProdDate().plusDays(getExpirationDate()).isAfter(getToday())){
                result=true;
            }
        }
        return  result;
    }

    public String getName() {
        return name;
    }

    public void setStoragePlace(String storagePlace) {
        this.storagePlace = storagePlace;
    }

    public boolean isInFridge() {
        return inFridge;
    }

    public String getStoragePlace() {
        return storagePlace;
    }

    public String place(Product product){
        if (product.isInFridge()){
            return "IceBox";
        }
        else return "Showcase";
    }
}
