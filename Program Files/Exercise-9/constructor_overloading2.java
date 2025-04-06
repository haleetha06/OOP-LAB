class SpaceMission {
    String missionName;
    int crewCount;
    double duration;

    SpaceMission() {
        missionName = "Unknown";
        crewCount = 0;
        duration = 0.0;
    }

    SpaceMission(String name) {
        missionName = name;
        crewCount = 0;
        duration = 0.0;
    }

    SpaceMission(String name, int crew) {
        missionName = name;
        crewCount = crew;
        duration = 0.0;
    }

    SpaceMission(String name, int crew, double time) {
        missionName = name;
        crewCount = crew;
        duration = time;
    }

    void display() {
        System.out.println("Mission: " + missionName);
        System.out.println("Crew Count: " + crewCount);
        System.out.println("Duration: " + duration + " days");
        System.out.println();
    }
}

public class constructor_overloading2 {
    public static void main(String[] args) {
        SpaceMission m1 = new SpaceMission();
        SpaceMission m2 = new SpaceMission("Apollo 11");
        SpaceMission m3 = new SpaceMission("ISS Expedition", 6);
        SpaceMission m4 = new SpaceMission("Mars One", 4, 180.5);

        m1.display();
        m2.display();
        m3.display();
        m4.display();
    }
}
