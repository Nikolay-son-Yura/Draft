package lesson3.Task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
    private  String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        List<Person> persons=new ArrayList<>();
        persons.add(new Person("Alisa",25));
        persons.add(new Person("Bob",30));
        persons.add(new Person("Charlie",20));


        Comparator<Person> nameComparator =Comparator.comparing(Person::getName);
        Collections.sort(persons,nameComparator);

        Comparator<Person> ageComparator =Comparator.comparing(Person::getAge);
        Collections.sort(persons,ageComparator);

        for (Person person:persons){
            System.out.println(person.getName()+" - "+person.getAge());
        }
    }
}
