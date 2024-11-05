public class CalculatriceSimple {

    public static void main(String[] args) {
        try {
            Nombre six = new Nombre(6);
            Nombre dix = new Nombre(10);

            Operation addition = new Addition(dix, six);
            System.out.println(addition + " = " + addition.valeur());

            Operation soustraction = new Soustraction(dix, six);
            System.out.println(soustraction + " = " + soustraction.valeur());

            Operation multiplication = new Multiplication(dix, six);
            System.out.println(multiplication + " = " + multiplication.valeur());

            Operation division = new Division(dix, six);
            System.out.println(division + " = " + division.valeur());

        } catch (ArithmeticException e) {
            System.out.println("Erreur arithmétique : " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Erreur de valeur nulle : " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur de paramètre invalide : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erreur inattendue : " + e.getMessage());
        }
    }
}
