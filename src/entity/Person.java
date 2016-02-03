package entity;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable{
    private String name;
    private transient int age; // т.к. указано transient, то при сериализации это поле записываться не будет
    private Sex[] sex;

    public Person(String name, int age, Sex[] sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public Sex[] getSex() {
        return sex;
    }

    public void setSex(Sex[] sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "entity.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + Arrays.toString(sex) +
                '}';
    }
}
