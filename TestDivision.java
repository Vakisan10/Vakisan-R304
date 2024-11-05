
public void testDivision() {
    Nombre dix = new Nombre(10);
    Nombre deux = new Nombre(2);
    Operation division = new Division(dix, deux);
    assertEquals(5, division.valeur());
}


public void testDivisionParUn() {
    Nombre dix = new Nombre(10);
    Nombre un = new Nombre(1);
    Operation division = new Division(dix, un);
    assertEquals(10, division.valeur());
}


public void testDivisionParZero() {
    Nombre dix = new Nombre(10);
    Nombre zero = new Nombre(0);
    Operation division = new Division(dix, zero);
    division.valeur(); // doit lever une exception
}
