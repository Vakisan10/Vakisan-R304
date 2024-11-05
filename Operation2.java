/**
 * Classe abstraite Operation.
 * <p>
 * Cette classe représente une opération binaire entre deux nombres, appelés opérandes gauche et droite.
 * Elle fournit une structure commune pour les opérations arithmétiques (addition, soustraction, multiplication, division),
 * en définissant les attributs et méthodes de base nécessaires pour ces opérations.
 * <p>
 * Les sous-classes doivent implémenter les méthodes abstraites {@link #executer()} et {@link #valeur()}.
 */
public abstract class Operation {
    protected Nombre operandeGauche;
    protected Nombre operandeDroite;

    /**
     * Constructeur pour l'opération.
     *
     * @param operandeGauche l'opérande gauche de l'opération (ne doit pas être null)
     * @param operandeDroite l'opérande droite de l'opération (ne doit pas être null)
     * @throws NullPointerException si l'un des opérandes est null
     */
    public Operation(Nombre operandeGauche, Nombre operandeDroite) {
        // Vérification des opérandes null
        if (operandeGauche == null || operandeDroite == null) {
            throw new NullPointerException("Les opérandes ne doivent pas être null");
        }
        
        this.operandeGauche = operandeGauche;
        this.operandeDroite = operandeDroite;
    }

    /**
     * Exécute l'opération et retourne le résultat sous forme d'entier.
     * <p>
     * Cette méthode doit être implémentée par chaque sous-classe pour définir le comportement spécifique de l'opération.
     *
     * @return le résultat de l'opération
     */
    public abstract int executer();

    /**
     * Retourne la valeur du résultat de l'opération.
     * <p>
     * Cette méthode doit être implémentée par chaque sous-classe pour retourner le résultat de l'opération.
     *
     * @return la valeur de l'opération
     */
    public abstract int valeur();

    /**
     * Retourne l'opérande gauche.
     *
     * @return l'opérande gauche de l'opération
     */
    public Nombre getOperande1() {
        return operandeGauche;
    }

    /**
     * Retourne l'opérande droite.
     *
     * @return l'opérande droite de l'opération
     */
    public Nombre getOperande2() {
        return operandeDroite;
    }
}
