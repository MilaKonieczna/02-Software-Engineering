package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public double division(int a, int b) throws Exception {
        if(b==0){
            throw new Exception("Division by zero is forbidden");
        }
        return (double) a / b;
    }
}
