package com.company;
//класс, отвечающий за вывод простых чисел в диапазоне от 2 до 200
public class Primes {
    //метод перебора чисел от 2 до 200 и вывод простых чисел из этого списка
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    //метод проверки на простое число
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n%i == 0){
                return(false);
            }
        }
        return (true);
    }
}
