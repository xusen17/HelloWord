package main.test.entity;


/**
 * 〈一句话功能简述〉
 *
 * @author Xusen
 * @create 2019/4/23 0023
 * @since 1.0.0
 */
public class Student implements Runnable{
    private int age;
    private int score;

    public Student(int age, int score) {
        this.age = age;
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int i=1;
    @Override
    public void run() {
        this.i = 10;
    }
}
