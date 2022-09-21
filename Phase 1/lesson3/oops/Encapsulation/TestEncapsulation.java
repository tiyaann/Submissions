package lesson3;
public class TestEncapsulation 
{     
    public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
        obj.setName("yuvarani"); 
        obj.setAge(21); 
        obj.setRoll(57); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll: " + obj.getRoll());      
    } 
}

