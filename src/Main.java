import java.sql.SQLOutput;

public class Main {
    // main method
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FirstClass myObjet = new FirstClass();
        System.out.println(myObjet.x);
        FirstClass myObjet2 = new FirstClass();
        System.out.println((myObjet2.x) * 2);
        SecondClass mySObjet = new SecondClass();
        System.out.println(mySObjet.x);

        Etudiants Daryl = new Etudiants();
        System.out.println("je m'appelle : " + Daryl.nom + "," + Daryl.prenom + " de matricule " + Daryl.matricule + "." + " J'ai " + Daryl.age + " ans " + " et je suis de sexe " + Daryl.sexe + " mon numéro de téléphone est " + Daryl.numero_tel + " je vis à " + Daryl.ville);

        Enseignants Babana = new Enseignants();
        System.out.println("je m'appelle : " + Daryl.nom + "," + Daryl.prenom + " de matricule " + Daryl.matricule + "." + " J'ai " + Daryl.age + " ans " + " et je suis de sexe " + Daryl.sexe + " mon numéro de téléphone est " + Daryl.numero_tel + " je vis à " + Daryl.ville);

        myMethod();
        myStaticMethod(); // call the static method
        // myPublicMethod(); on peut pas l'appeler dans une methode statique parcequ'elle est publique

        Main Ngassa = new Main();
        Ngassa.myPublicMethod();

        Main myCar = new Main ();  // Create a my car object
        myCar.fullThrottle();      // call the fullThrotte method()
        myCar.speed(200); //call the speed method

    }
    static void myMethod() {
        System.out.println("Hello world");

    }
    // public method
    static void myStaticMethod() {
        System.out.println("static methods can be call without creating objets");
    }
    // public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");

    }

    // create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // create a speed() method and add a parameter
    public void speed(int maxspeed) {
        System.out.println("Max speed is: " + maxspeed);

    }

}