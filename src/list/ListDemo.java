package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("1", "tom", 22));
        personList.add(new Person("2", "jack", 23));
        personList.add(new Person("3", "peter", 24));
        System.out.println("personList的数量" + personList.size());

        Optional<Person> personOptional = personList.stream().filter(object -> object.age == 22).findFirst();
        Person person = personOptional.get();
        person.setAge(100);
        personList.remove(person);
        System.out.println("删除后，personList的数量" + personList.size());

    }
}
class Person{
    String id;
    String name;
    Integer age;

    public Person(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
