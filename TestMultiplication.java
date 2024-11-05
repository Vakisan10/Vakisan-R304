public void testMultiplication() {
    Nombre deux = new Nombre(2);
    Nombre trois = new Nombre(3);
    Operation multiplication = new Multiplication(deux, trois);
    assertEquals(6, multiplication.valeur());
}


public void testMultiplicationNégatifs() {
    Nombre moinsDeux = new Nombre(-2);
    Nombre trois = new Nombre(3);
    Operation multiplication = new Multiplication(moinsDeux, trois);
    assertEquals(-6, multiplication.valeur());
}
