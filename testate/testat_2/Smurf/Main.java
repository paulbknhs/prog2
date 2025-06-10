public class Main {
    public static void main(String[] args) {
        Human[] hannover = new Human[2];
        Smurf[] schlumpfhausen = new Smurf[2];
        TwoLegged[] bicycleClub = new TwoLegged[4];

        Human erwin = new Human("Erwin");
        Human sabine = new Human("Sabine");
        Smurf schlaubi = new Smurf("SchlaubiSchlumpf");
        Smurf schlumpfine = new Smurf("Schlumpfine");

        hannover[0] = erwin;
        hannover[1] = sabine;
        schlumpfhausen[0] = schlaubi;
        schlumpfhausen[1] = schlumpfine;

    }
}
