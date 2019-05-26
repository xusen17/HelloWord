package main.test;

import main.test.entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Xusen
 * @create 2019/4/23 0023
 * @since 1.0.0
 */
public class TestController {
        public static void main(String[] args) {
            /**
             * 1.在需要排序的bean内实现Comparable接口，根据排序需求重写compareTo方法
             * 2.直接在需要排序的地方使用sort方法，定义匿名内部类，也相当于重写了compare方法
             */
            List<Student> students = new ArrayList<Student>();
            students.add(new Student(23, 100));
            students.add(new Student(27, 98));
            students.add(new Student(29, 99));
            students.add(new Student(29, 98));
            students.add(new Student(22, 89));
            Collections.sort(students, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {

                    int i = o1.getScore() - o2.getScore();
                    if (i == 0) {
                        return o1.getAge() - o2.getAge();
                    }
                    return i;
                }
            });
        }
}
