class AnimeCharacter {
    String name;
    String power;
    int age;

    AnimeCharacter() {
        name = "Unknown";
        power = "None";
        age = 0;
    }

    AnimeCharacter(String n) {
        name = n;
        power = "Unknown";
        age = 0;
    }

    AnimeCharacter(String n, String p) {
        name = n;
        power = p;
        age = 0;
    }

    AnimeCharacter(String n, String p, int a) {
        name = n;
        power = p;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Power: " + power);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class constructor_overloading1 {
    public static void main(String[] args) {
        AnimeCharacter c1 = new AnimeCharacter();
        AnimeCharacter c2 = new AnimeCharacter("luffy");
        AnimeCharacter c3 = new AnimeCharacter("shiryu", "invisible");
        AnimeCharacter c4 = new AnimeCharacter("shanks", "haki", 40);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
    }
}
