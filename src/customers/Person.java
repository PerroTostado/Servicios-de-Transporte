/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customers;


public class Person {
    public class customers {
    private String name;
    private int age;
public customers(){
    
}
public customers(String name, int age){
    this.name=name;
    this.age=age;
}
protected final void setName(String name){
    this.name=name;
}
protected final String setName(){
    return this.name;
}
protected final void setAge(int age){
    this.age=age;
}
protected final int setAge(){
    return this.age;
}
@Override
public String toString(){
    String XD= "Name: " + this.name + "Age: " + this.age;
    return XD;
}
}
}
