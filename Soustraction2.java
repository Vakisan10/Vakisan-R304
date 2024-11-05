
public class Soustraction extends Operation {


    public Soustraction(Nombre operandeGauche, Nombre operandeDroite) {
        super(operandeGauche, operandeDroite);
    }

    public int executer() {
        int valeurGauche = operandeGauche.getValeur();
        int valeurDroite = operandeDroite.getValeur();

        // Vérification de dépassement de capacité
        if ((valeurGauche < 0 && valeurDroite > 0 && valeurGauche < Integer.MIN_VALUE + valeurDroite) ||
            (valeurGauche > 0 && valeurDroite < 0 && valeurGauche > Integer.MAX_VALUE + valeurDroite)) {
            throw new ArithmeticException("Dépassement de capacité lors de la soustraction");
        }

        return valeurGauche - valeurDroite;
    }

 
    public int valeur() {
        return executer();
    }


    public String toString() {
        return operandeGauche + " - " + operandeDroite;
    }
}
