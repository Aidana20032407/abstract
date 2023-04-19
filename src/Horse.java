public class Horse extends Animal{

    private String color;
    public Horse(String name, String gender, int age, int weight, String color) {
        super(name, gender, age, weight);
        this.color = color;
    }
    @Override
    public String toString() {
        return "\n Horse =' " + getName() + '\'' +
                ", gender =' " + getGender() + '\'' +
                ", age = " + getAge() +
                ", weight = " + getWeight() +
                '}';
    }
}
