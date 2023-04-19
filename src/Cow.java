public  class Cow extends Animal {
    public Cow(String name, String gender, int age, int weight) {
        super(name, gender, age, weight);
    }
    @Override
    public String toString() {
        return "\n Cow =' " + getName() + '\'' +
                ", gender =' " + getGender() + '\'' +
                ", age = " + getAge() +
                ", weight = " + getWeight() +
                '}';
    }
}
