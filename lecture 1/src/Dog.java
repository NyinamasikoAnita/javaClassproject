public class Dog {
    private String name;
    private String breed;

    public Dog(String name,String breed){
        this.name = name;
        this. breed = breed;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }
    public static void main(String[] args){
        Dog dog1 = new Dog("simba", "Germany sherpherd");
        Dog  dog2 = new Dog("whisky" , "local");
        System.out.println(dog1.name + " " + dog1.breed);
        System.out.println(dog2.name + " " + dog2.breed);

        dog1.setName("spot");
        dog1.setBreed("local");
        dog2.setName("sco-by");
        dog2.setBreed("local");

        System.out.println(dog1.getName() + " " + dog1.getBreed());
        System.out.println(dog2.getName() + " " + dog2.getBreed());

    }
}