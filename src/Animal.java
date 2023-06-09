public abstract class Animal {
    private String name;
    private String gender;
    private int age;
    private int weight;

    public Animal(String name, String gender, int age, int weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name =' " + name + '\'' +
                ", gender =' " + gender + '\'' +
                ", age = " + age +
                ", weight = " + weight +
                '}';
    }
}
