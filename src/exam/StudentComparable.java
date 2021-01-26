package exam;

import java.util.*;
/**
 * 键盘录入学生信息（姓名，语文成绩，数学成绩，英语成绩）按照分数从高到低进行排序。
 * 如果总分相等，按照语文成绩进行排序；
 * 如果语文成绩相等，按照数学成绩进行排序；
 * 如果数学成绩相等，按照英语成绩进行排序。
 * @author cmcc-cheyq
 *
 */
public class StudentComparable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        TreeSet studentTree = new TreeSet<Student>();
        for (int i = 0; i < num; i++) {
            String tmp = sc.nextLine();
            String[] temp = tmp.trim().split(" ");
            studentTree.add(new Student(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3])));
        }
        for (Iterator iterator = studentTree.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int total;
    int chinese;
    int math;
    int english;

    Student(String name, int chinese, int math, int english){
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.total = this.chinese + this.math + this.english;
    }

    @Override
    public int compareTo(Student o) {
        if (o.total > this.total) {
            return 1;
        }
        if (o.total < this.total) {
            return -1;
        }
        if (o.total == this.total) {
            if (o.chinese > this.chinese) {
                return 1;
            }
            if (o.chinese < this.chinese) {
                return -1;
            }
            if (o.chinese == this.chinese) {
                if (o.math > this.math) {
                    return 1;
                }
                if (o.math < this.math) {
                    return -1;
                }
                if (o.math == this.math) {
                    if (o.english > this.english) {
                        return 1;
                    }
                    if (o.english < this.english) {
                        return -1;
                    }
                    if (o.english == this.english) {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }
    @Override
    public String toString() {
        return this.name + " " + this.chinese + " " + this.math + " " + this.english;
    }
}
