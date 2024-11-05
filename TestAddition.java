public void testAddition() {
    Nombre cinq = new Nombre(5);
    Nombre dix = new Nombre(10);
    Operation addition = new Addition(cinq, dix);
    assertEquals(15, addition.valeur());
}



public void testAdditionNégatifs() {
    Nombre moinsCinq = new Nombre(-5);
    Nombre moinsDix = new Nombre(-10);
    Operation addition = new Addition(moinsCinq, moinsDix);
    assertEquals(-15, addition.valeur());
}