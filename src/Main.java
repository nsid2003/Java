public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FirstClass myObjet = new FirstClass();
        System.out.println(myObjet.x);
        FirstClass myObjet2 = new FirstClass();
        System.out.println((myObjet2.x)*2);
        SecondClass mySObjet = new SecondClass();
        System.out.println(mySObjet.x);

        Etudiants Daryl = new Etudiants();
        System.out.println( "je m'appelle : " + Daryl.nom + "," + Daryl.prenom + " de matricule " + Daryl.matricule + "."  + " J'ai " + Daryl.age + " ans "  + " et je suis de sexe " + Daryl.sexe + " mon numéro de téléphone est " + Daryl.numero_tel + " je vis à " + Daryl.ville);

    }
}