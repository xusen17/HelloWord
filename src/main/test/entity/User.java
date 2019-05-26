package main.test.entity;

/**
 * 〈一句话功能简述〉
 *
 * @author Xusen
 * @create 2019/4/23 0023
 * @since 1.0.0
 */
public class User implements Comparable<User>{
    private int score;
    private int age;

    public User(int score, int age) {
        this.score = score;
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        //先按照年龄排序
        int i = this.getAge() - o.getAge();
        //如果年龄相等，则按照分数排序
        if(i == 0){
            return this.getScore() - o.getScore();
        }
        return i;
    }
}
