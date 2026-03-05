
public class Animal implements Comparable<Animal> {

    int age;
    String name;
    int weight;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal = " + "Age=" + age + " " + "Name=" + name + " ";
    }

    @Override
    public int compareTo(Animal a1) {
        if (this.age == a1.age) {
            return this.name.compareTo(a1.name);
        }
        return this.age - a1.age;
    }

}
