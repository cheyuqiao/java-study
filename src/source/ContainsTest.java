package source;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContainsTest {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("tom");
        nameList.add("jack");

        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("tom", 15));
        peopleList.add(new Person("jack", 16));
        peopleList.add(new Person("peter", 16));
        
        // 筛选，并 获取其中的字段
        List<String> users = peopleList.stream().filter(person -> person.getAge() == 16).map(Person::getName).collect(Collectors.toList());
        // 筛选一个list中的某个字段，不在另外一个list中
        peopleList = peopleList.stream().filter(person -> !nameList.contains(person.getName())).collect(Collectors.toList());
    }
}
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
