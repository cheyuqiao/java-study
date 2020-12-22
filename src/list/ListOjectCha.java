package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * list对象做差集
 */
public class ListOjectCha {
    public static void main(String[] args) {
        List<People> list1 = new ArrayList<>();
        People p1 = new People("tom", 12);
        list1.add(p1);
        People p2 = new People("jace", 13);
        list1.add(p2);
        People p3 = new People("yum", 13);
        list1.add(p3);

        List<People> list2 = new ArrayList<>();
        People pp1 = new People("1", "tom", 12);
        list1.add(pp1);
        People pp2 = new People("2", "jace", 13);
        list1.add(pp2);

        List<People> result = list1.stream().filter(people -> !list2.contains(people)).collect(Collectors.toList());
        System.out.println(result.size()); //size是5.能这么减
        // 使用见https://www.it610.com/article/1305301973314080768.htm
    }

}
class People {
    String id;
    String name;
    Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(id, people.id) &&
                name.equals(people.name) &&
                age.equals(people.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    public People(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public People(String name, Integer age) {
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