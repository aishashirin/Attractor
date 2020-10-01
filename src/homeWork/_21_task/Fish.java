package homeWork._21_task;

public class Fish extends Product {
    public Fish(String name, int expirationDate, boolean inFridge) {
        super(name, expirationDate, inFridge);
    }

    @Override
    public boolean fresh(boolean inFridge) {
        boolean result = false;
        if (inFridge){
            if(getProdDate().plusDays(getExpirationDate()).isAfter(getToday())){
                result=true;
            }
        }
        else{
            if (getProdDate().plusDays(getExpirationDate()/6).isAfter(getToday())){
                result = true;
            }
        }
        return  result;
    }
}
