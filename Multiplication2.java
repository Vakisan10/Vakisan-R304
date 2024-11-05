
public class Multiplication extends Operation {

    public Multiplication(Nombre operandeGauche, Nombre operandeDroite) {
        super(operandeGauche, operandeDroite);


        if (operandeGauche == null || operandeDroite == null) {
            throw new NullPointerException("Les opérandes ne doivent pas être null");
        }
    }


    public int executer() {
        int valeurGauche = operandeGauche.getValeur();
        int valeurDroite = operandeDroite.getValeur();

        if (valeurDroite != 0 && Math.abs(valeurGauche) > Integer.MAX_VALUE / Math.abs(valeurDroite)) {
            throw new ArithmeticException("Dépassement de capacité lors de la multiplication");
        }

        return valeurGauche * valeurDroite;
    }


    public int valeur() {
        return executer();
    }


    public String toString() {
        return operandeGauche + " * " + operandeDroite;
    }
}
