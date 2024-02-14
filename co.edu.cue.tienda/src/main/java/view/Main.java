package view;

import model.Toys;
import model.Type;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("que quiere hacer? ");
        System.out.println("\n");
        System.out.println("1. agregar un nuevo juguete");
        System.out.println("2. informar cuantos juguetes hay y el precio total de todos los juguetes");
        System.out.println("3. aumentar o disminuir la cantidad de un juguete");
        System.out.println("4. cual es la mayor o menor cantidad de juguetes que tenemos de un juguete");
        System.out.println("5. ");
        int decision = sc.nextInt();
        int addition;
        int total;
        int increaseDecrease;
        int option;
        int greaterLesser;
        switch (decision){
            case 1:
                break;
            case 2:

                addition = Type.UNISEX.getAmount() + Type.MALE.getAmount() + Type.FEMALE.getAmount();
                total = Type.UNISEX.getPrice() + Type.MALE.getPrice() + Type.FEMALE.getPrice();
                System.out.println("desea un informe general de cuantos juguetes hay?(1) o o un informe de cuantos juguetes hay por tipo?(2)");
                 option = sc.nextInt();
                if (option == 1){
                    System.out.println("en general hay " + addition);
                }else {
                    System.out.println("en juguetes unisex hay:" + Type.UNISEX.getAmount() + ", juguetes masculinos hay:"+ Type.MALE.getAmount() + " y juguetes femeninos hay:" + Type.FEMALE.getAmount());
                }
                System.out.println("el precio en total de todos los juguetes de la tienda es " + total);
                break;
            case 3:

                increaseDecrease = 0;
                System.out.println("quiere aumentar(1) o disminuir?(2)");
                option = sc.nextInt();
                if (option == 1){
                    System.out.println(" de que juguete quiere aumentar");
                    System.out.println("1. unisex \n2. masculino \n3.femenino");
                    option = sc.nextInt();
                    if (option == 1){
                        System.out.println("cuanto quiere aumentar?");
                        increaseDecrease = sc.nextInt();
                        total = increaseDecrease + Type.UNISEX.getAmount();
                        System.out.println("la nueva cantidad es " + total);
                    } else if (option == 2) {
                        System.out.println("cuanto quiere aumentar?");
                        increaseDecrease = sc.nextInt();
                        total = increaseDecrease + Type.MALE.getAmount();
                        System.out.println("la nueva cantidad es " + total);
                    }else {
                        System.out.println("cuanto quiere aumentar?");
                        increaseDecrease = sc.nextInt();
                        total = increaseDecrease + Type.FEMALE.getAmount();
                        System.out.println("la nueva cantidad es " + total);
                    }

                }else {
                    System.out.println(" de que juguete quiere disminuir");
                    System.out.println("1. unisex \n2. masculino \n3.femenino");
                    option = sc.nextInt();
                    if (option == 1){
                        System.out.println("cuanto quiere disminuir?");
                        increaseDecrease = sc.nextInt();
                        total = Toys.UNISEX.getAmount() - increaseDecrease;
                        System.out.println("la nueva cantidad es " + total);
                    } else if (option == 2) {
                        System.out.println("cuanto quiere disminuir?");
                        increaseDecrease = sc.nextInt();
                        total = Type.MALE.getAmount() - increaseDecrease;
                        System.out.println("la nueva cantidad es " + total);
                    }else {
                        System.out.println("cuanto quiere disminuir?");
                        increaseDecrease = sc.nextInt();
                        total = Type.FEMALE.getAmount() - increaseDecrease;
                        System.out.println("la nueva cantidad es " + total);
                    }
                }
                break;
            case 4:

                greaterLesser = 0;
                System.out.println("desea saber el mayor(1) o menor?(2)");
                option=sc.nextInt();
                if (option == 1){
                

                }

                break;
        }

    }
}