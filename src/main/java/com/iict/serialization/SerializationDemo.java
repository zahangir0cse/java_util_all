package com.iict.serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "D:\\serialization_test\\employee.ser";
        Employee employee = new Employee();
        employee.setAddress("Dhaka, Bangladesh");
        employee.setName("Zahangir Alam");
        employee.setAge(27);
        FileOutputStream file = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(employee);
        out.close();
        file.close();
        System.out.println("Object serialized successfully");
        FileInputStream fileIn = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Employee employeeDeserializedObject = (Employee) in.readObject(); // Object deserialized here.
        System.out.println("Name: " + employeeDeserializedObject.getName());
        System.out.println("Address: " + employeeDeserializedObject.getAddress());
        System.out.println("Age: " + employeeDeserializedObject.getAge());
        fileIn.close();
        in.close();
    }
}
