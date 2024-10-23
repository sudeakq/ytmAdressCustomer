public class Musteri {
    private String name;
    private Adres adres;
    private String email;

    public Musteri(String name, Adres adres, String email) {
        this.name = name;
        this.adres = adres;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adres getAdres() {
        return adres;
    }

    public void AdresGuncelle(Adres adres) {
        this.adres = adres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "İsim: " + getName() + ", Email: " + getEmail() + " ";
    }

    public void printMusteriInfo() {
        System.out.println(this.toString()); 
        adres.printAddress();
    }
}
