package oop_mostenire;

public class Student extends Persoana implements StudentInterface{

    private String facultate;
    private String domeniu;
    private int an;
    private boolean bursa;
    private boolean restante;

    public Student(String nume, String prenume, int varsta, String sex, String adresa,
                   String facultate, String domeniu, int an, boolean bursa, boolean restante) {
        super(nume, prenume, varsta, sex, adresa);
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.an = an;
        this.bursa = bursa;
        this.restante = restante;
    }

    public void infoStudent(){
        infoPersoana();
        System.out.println("Facultatea la care studeaza este "+ facultate);
        System.out.println("Domeniul pe care il studeaza este "+ domeniu);
        System.out.println("Este bursier? " + bursa);
        System.out.println("In ce an este studentul? "+ an);
        System.out.println("Are restante? "+ restante);
    }

    public void mananca(){
        System.out.println("Studentul mananca in pauza sau dupa cursuri ");
    }

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public boolean isBursa() {
        return bursa;
    }

    public void setBursa(boolean bursa) {
        this.bursa = bursa;
    }

    public boolean isRestante() {
        return restante;
    }

    public void setRestante(boolean restante) {
        this.restante = restante;
    }

    @Override
    public void mergeLaCursuri() {
        System.out.println("Studentul merge la cursuri ");
    }

    @Override
    public void trebuieSaStudeze() {
        System.out.println("Studentul trebuie sa studieze ");

    }

    @Override
    public void saNuAibeRestante() {
        System.out.println("Studentul sa nu aiba restante ");
    }

    @Override
    public void saStieSaCopieze() {
        System.out.println("Studentul sa stie sa copieze ");
    }
}

