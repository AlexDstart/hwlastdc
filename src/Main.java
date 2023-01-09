public class Main {
    public static void main(String[] args) {
        Author rayBredberry = new Author("Ray", "Bredberry");
        Author georgeOrwell = new Author("George", "Orwell");
        Book animalFarm = new Book (1945, "Animal Farm", georgeOrwell);
        Book theMartianChronicles = new Book(1950, "The Martian Chronicles", rayBredberry);
        animalFarm.setYear(1945);
        System.out.println(georgeOrwell);
        System.out.println(animalFarm);
    }
}