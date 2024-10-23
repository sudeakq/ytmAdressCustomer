public class Adres {
 
    private String city;
    private String postalCode;
    private String street;

    public Adres(String city, String postalCode, String street) {
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void printAddress() {
        System.out.println("Adres Bilgileri:");
        System.out.println("Şehir: " + city);
        System.out.println("Posta Kodu: " + postalCode);
        System.out.println("Sokak: " + street);
    }
}
