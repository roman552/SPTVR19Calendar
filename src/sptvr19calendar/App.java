/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19calendar;
import java.util.Scanner;
/**
 *
 * @author user
 */
class App {
    public void run() {
        System.out.println("---Calendar---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите год: ");
        int myYear = scanner.nextInt();
        int startYear = 1984;  
        int a = 0;
        String color = "";
        String animal = "";
        for (int i = startYear-1; i < myYear; i++) {
            if (a<=11) {
                color = "зеленый";
            }
            if (a>11) {
                if (a<=23) {
                    color = "красный";
                }
            }
            if (a>23) {
                if (a<=35) {
                    color = "желтый";
                }
            }
            if (a>35) {
                if (a<=47) {
                    color = "белый";
                }
            }
            if (a>47) {
                if (a<=59) {
                    color = "черный";
                }
            }
            if (a<59) {
                a++;
            }
            else {
                a = 0;
            }
        }
        int b = 1;
        for (int j = startYear-1; j < myYear; j++) {
            if (b==1) {
                animal = "крыса";
            }
            if (b==2) {
                animal = "корова";
            }
            if (b==3) {
                animal = "тигр";
            }
            if (b==4) {
                animal = "заяц";
            }
            if (b==5) {
                animal = "дракон";
            }
            if (b==6) {
                animal = "змей";
            }
            if (b==7) {
                animal = "лошадь";
            }            
            if (b==8) {
                animal = "овца";
            }
            if (b==9) {
                animal = "обезьяна";
            }
            if (b==10) {
                animal = "курица";
            }
            if (b==11) {                  
                animal = "собака";
            }
            if (b==12) {
                animal = "свинья";
            }            
            if (b<12) {
                b++;
            }
            else {
                b = 1;
            }
        }
        System.out.println(myYear+":"+" цвет- "+color+", животное- "+animal);
    }
}
