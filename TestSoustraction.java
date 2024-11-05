public void testSoustraction() {
    Nombre quinze = new Nombre(15);
    Nombre cinq = new Nombre(5);
    Operation soustraction = new Soustraction(quinze, cinq);
    assertEquals(10, soustraction.valeur());
}


public void testSoustractionNégatifs() {
    Nombre moinsCinq = new Nombre(-5);
    Nombre moinsDix = new Nombre(-10);
    Operation soustraction = new Soustraction(moinsCinq, moinsDix);
    assertEquals(5, soustraction.valeur());
}
