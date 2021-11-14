package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MybeanWithDependencyImplement implements  MyBeanWithDependency{

    private MyOperation myOperation;

    public MybeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero = 1;
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola desde la implemntación de un bean condependencia");
    }
}
