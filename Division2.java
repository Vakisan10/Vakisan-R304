
public class Division extends Operation {

    public Division(Nombre operandeGauche, Nombre operandeDroite) {
        super(operandeGauche, operandeDroite);
        

        if (operandeGauche == null || operandeDroite == null) {
            throw new NullPointerException("Les opérandes ne doivent pas être null");
        }

        if (operandeDroite.getValeur() == 0) {
            throw new ArithmeticException("Division par zéro interdite dans le constructeur !");
        }
    }


    public int executer() {
        // Vérification de dépassement de capacité en division
        int valeurGauche = operandeGauche.getValeur();
        int valeurDroite = operandeDroite.getValeur();
        
        if (valeurGauche == Integer.MIN_VALUE && valeurDroite == -1) {
            throw new ArithmeticException("Dépassement de capacité : résultat trop grand pour un entier");
        }
        
        return valeurGauche / valeurDroite;
    }


    public int valeur() {
        return executer();
    }


    public String toString() {
        return operandeGauche + " / " + operandeDroite;
    }
}
