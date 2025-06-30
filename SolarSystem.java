class SolarSystem {
    static int numberOfPlanets;
    static String star;
    static String asteroidBelt;
    static int numberOfDwarfPlanets;
    static String largestPlanet;

    public static void main(String args[]) {
        numberOfPlanets = 8;
        star = "Sun";
        asteroidBelt = "Present";
        numberOfDwarfPlanets = 5;
        largestPlanet = "Jupiter";

        String smallestPlanet = "Mercury";
        String lifeOnEarth = "Yes";
        String farthestPlanet = "Neptune";
        String kuiperBelt = "Present";
        int numberOfMoons = 200;
        String closestPlanetToSun = "Mercury";
        String hottestPlanet = "Venus";
        String coldestPlanet = "Neptune";
        String mostEarthLike = "Earth";
        String cometsPresent = "Yes";

        int galaxyAge = 13000000000;
        System.out.println("Age of Milky Way Galaxy: " + galaxyAge + " years");

        String meteoroidsPresent = "Yes";
        int solarWindSpeed = 400;
        String milkyWayPosition = "Orion Arm";
        String heliospherePresent = "Yes";
        String discoveryYear = "From Very Long time";

        System.out.println("main started");
        System.out.println("Solar System Details:");
        System.out.println("Number of Planets: " + numberOfPlanets);
        System.out.println("Star: " + star);
        System.out.println("Asteroid Belt: " + asteroidBelt);
        System.out.println("Number of Dwarf Planets: " + numberOfDwarfPlanets);
        System.out.println("Largest Planet: " + largestPlanet);
        System.out.println("Smallest Planet: " + smallestPlanet);
        System.out.println("Life on Earth: " + lifeOnEarth);
        System.out.println("Farthest Planet: " + farthestPlanet);
        System.out.println("Kuiper Belt: " + kuiperBelt);
        System.out.println("Number of Moons: " + numberOfMoons);
        System.out.println("Closest Planet to Sun: " + closestPlanetToSun);
        System.out.println("Hottest Planet: " + hottestPlanet);
        System.out.println("Coldest Planet: " + coldestPlanet);
        System.out.println("Most Earth-like Planet: " + mostEarthLike);
        System.out.println("Comets Present: " + cometsPresent);
        System.out.println("Meteoroids Present: " + meteoroidsPresent);
        System.out.println("Solar Wind Speed: " + solarWindSpeed + " km/s");
        System.out.println("Milky Way Position: " + milkyWayPosition);
        System.out.println("Heliosphere: " + heliospherePresent);
        System.out.println("Discovery Year: " + discoveryYear);
        System.out.println("main ended");
    }
}
