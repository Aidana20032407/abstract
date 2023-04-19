public class Sheep extends Animal{


    public Sheep(String name, String gender, int age, int weight) {
        super(name, gender, age, weight);
    }
    @Override
    public String toString() {
        return "\n Sheep=' " + getName() + '\'' +
                ", gender =' " + getGender() + '\'' +
                ", age = " + getAge() +
                ", weight = " + getWeight() +
                '}';
    }
}
