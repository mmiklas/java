package chapter5; /**
   @version 1.10 2004-08-02
   @author Cay Horstmann
*/

import java.util.*;

/**
   Program demonstruj�cy wykorzystanie mapy
   o kluczach klasy String i warto�ciach klasy Employee.
*/
public class MapTest
{  
   public static void main(String[] args)
   {  
      Map<String, Employee> staff = new HashMap<String, Employee>();
      staff.put("144-25-5464", new Employee("Amy Lee"));
      staff.put("567-24-2546", new Employee("Harry Hacker"));
      staff.put("157-62-7935", new Employee("Gary Cooper"));
      staff.put("456-62-5527", new Employee("Francesca Cruz"));

      // pokazuje wszystkie pozycje mapy

      System.out.println(staff);

      // usuwa pozycj�

      staff.remove("567-24-2546");

      // zast�puje pozycj�

      staff.put("456-62-5527", new Employee("Francesca Miller"));

      // wyszukuje warto��

      System.out.println(staff.get("157-62-7935"));

      // przegl�da wszystkie pozycje

      for (Map.Entry<String, Employee> entry : staff.entrySet())
      {  
         String key = entry.getKey();
         Employee value = entry.getValue();
         System.out.println("klucz=" + key + ", warto��=" + value);
      }
   }
}

/**
   Klasa reprezentuj�ca pracownika.
*/
class Employee
{ 
   /**
      Tworzy obiekt reprezentuj�cy pracownika o wynagrodzeniu $0.
      @param n nazwisko pracownika
   */
   public Employee(String n)
   {  
      name = n;
      salary = 0;
   }

   public String toString()
   {  
      return "[nazwisko=" + name + ", wynagrodzenie=" + salary + "]";
   }

   private String name;
   private double salary;
}

