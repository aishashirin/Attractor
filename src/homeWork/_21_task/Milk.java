package homeWork._21_task;

public class Milk extends Product {

    public Milk(String name, int expirationDate, boolean inFridge) {
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
            if (getProdDate().plusDays(getExpirationDate()/2).isAfter(getToday())){
                result = true;
            }
        }
        return  result;
    }
}
