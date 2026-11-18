package Animal.java;

abstract class Animal implements AnimalMove {
    private String name;
    private int age;
    private int weight;

    public Animal() {
        this("Unknown", 0, 0);
    }

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name) {
        this(name, 0, 0);
    }

    public abstract void eat(String food);

    public abstract void getVoice();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age
                + ", weight=" + weight + "}";
    }
}

class Mammal extends Animal {
    private String order;

    public Mammal() {
        this("Unknown", 0, 0, "Unknown");
    }

    public Mammal(String name, int age, int weight, String order) {
        super(name, age, weight);
        this.order = order;
    }

    public Mammal(String name) {
        this(name, 0, 0, "Unknown");
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void drinkMilk() {
        System.out.println(getName() + " drinks milk.");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " the mammal eats " + food);
    }

    @Override
    public void getVoice() {
        System.out.println("Mammal makes a sound.");
    }

    @Override
    public String toString() {
        return super.toString() + ", order=" + order;
    }
}

class Dog extends Mammal implements AnimalBehavior {
    @Override
    public void sleep() {
        System.out.println(getName() + " curls up to sleep.");
    }

    @Override
    public void move() {
        System.out.println("Dog runs.");
    }

    private String breed;

    public Dog() {
        this("Unknown", 0, 0, "Carnivora", "Unknown");
    }

    public Dog(String name, int age, int weight,
               String order, String breed) {
        super(name, age, weight, order);
        this.breed = breed;
    }

    public Dog(String name) {
        this(name, 0, 0, "Carnivora", "Unknown");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void aport() {
        System.out.println(getName() + " fetches an object.");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " the dog eats " + food);
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " says: Woof!");
    }

    @Override
    public String toString() {
        return super.toString() + ", breed=" + breed;
    }
}

class Bird extends Animal {
    private String featherColor;

    public Bird() {
        this("Unknown", 0, 0, "Unknown");
    }

    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name) {
        this(name, 0, 0, "Unknown");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public void layEggs() {
        System.out.println(getName() + " lays eggs.");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " the bird eats " + food);
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " chirps.");
    }

    @Override
    public String toString() {
        return super.toString() + ", featherColor=" + featherColor;
    }
}

class Pigeon extends Bird implements AnimalBehavior {
    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps on a perch.");
    }

    @Override
    public void move() {
        System.out.println("Pigeon flies.");
    }

    private String species;

    public Pigeon() {
        this("Unknown", 0, 0, "Grey", "Unknown");
    }

    public Pigeon(String name, int age, int weight,
                  String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name) {
        this(name, 0, 0, "Grey", "Unknown");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void transportMail() {
        System.out.println(getName() + " transports mail.");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " the pigeon eats " + food);
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " coos.");
    }

    @Override
    public String toString() {
        return super.toString() + ", species=" + species;
    }
}

class Fish extends Animal {
    private String scaleColor;

    public Fish() {
        this("Unknown", 0, 0, "Unknown");
    }

    public Fish(String name, int age, int weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    public Fish(String name) {
        this(name, 0, 0, "Unknown");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public void swim() {
        System.out.println(getName() + " swims.");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " the fish eats " + food);
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " makes bubbling sounds.");
    }

    @Override
    public String toString() {
        return super.toString() + ", scaleColor=" + scaleColor;
    }
}

class Blowfish extends Fish implements AnimalBehavior {
    @Override
    public void sleep() {
        System.out.println(getName() + " rests near the seabed.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swims.");
    }

    private int diameter;

    public Blowfish() {
        this("Unknown", 0, 0, "Unknown", 0);
    }

    public Blowfish(String name, int age, int weight,
                    String scaleColor, int diameter) {
        super(name, age, weight, scaleColor);
        this.diameter = diameter;
    }

    public Blowfish(String name) {
        this(name, 0, 0, "Unknown", 0);
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void blows() {
        System.out.println(getName() + " inflates itself.");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " the blowfish eats " + food);
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " makes bubbling sounds.");
    }

    @Override
    public String toString() {
        return super.toString() + ", diameter=" + diameter;
    }
}

class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[6];

        animals[0] = new Mammal();

        animals[1] = new Dog(
                "Buddy", 5, 20, "Carnivora", "Labrador");

        animals[2] = new Bird(
                "Tweety", 2, 1, "Yellow");

        animals[3] = new Pigeon(
                "Pablo", 3, 2, "Grey", "Rock Pigeon");

        animals[4] = new Fish(
                "Nemo", 1, 1, "Orange");

        animals[5] = new Blowfish(
                "Puffy", 4, 5, "Yellow", 30);

        AnimalBehavior[] sleepers = {
                (Dog) animals[1], (Pigeon) animals[3], (Blowfish) animals[5]
        };
        sleepers[0].sleep();
        sleepers[1].sleep();
        sleepers[2].sleep();

        for (Animal animal : animals) {
            animal.move();
            AnimalName.name(animal.getName());
            System.out.println(animal);
            animal.eat("food");
            animal.getVoice();
            System.out.println("----------------");
        }

        ((Mammal) animals[0]).drinkMilk();
        ((Dog) animals[1]).aport();
        ((Bird) animals[2]).layEggs();
        ((Pigeon) animals[3]).transportMail();
        ((Fish) animals[4]).swim();
        ((Blowfish) animals[5]).blows();

        animals[1].setName("Max");

        System.out.println("New name: " + animals[1].getName());
    }
}

