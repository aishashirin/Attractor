package homeWork._21_task;

import java.util.Random;

public class Store {
    Random random = new Random();
    Product[] products = new Product[20];
    Store(){
        for(int i = 0; i <20; i++){
            int a = random.nextInt(5);
            switch (a) {
                case 0:
                    products[i] = new Milk("milk", 60, inFridge());
                    break;
                case 1:
                    products[i] = new Salt("salt", 0, inFridge());
                    break;
                case 2 :
                    products[i] = new Fish("fish", 20, inFridge());
                    break;
                case 3:
                    products[i] = new Corn("corn", 150, inFridge());
                    break;
                case 4:
                    products[i] = new Stew("Stew", 180, inFridge());
                    break;
            }
        }
    }

    public boolean inFridge(){
        boolean result = false;
        int a = random.nextInt(2)+1;
        if (a == 1){
            result = true;

        }
        else{
            result = false;
        }

        return result;
    }

    public void inspection(){
        System.out.println("Inspection result.");
        System.out.println("Product |  Produced on |  Storage place |  S. life days |  Fresh");
        for (int i = 0; i < 20; i++){
            System.out.printf("%2s    | %12s | %14s | %8s      |  %5s",products[i].getName() ,  products[i].getProdDate() , products[i].place(products[i]) ,
                    products[i].getExpirationDate() ,  products[i].fresh(products[i].isInFridge()));
            System.out.println();
        }
    }
}
