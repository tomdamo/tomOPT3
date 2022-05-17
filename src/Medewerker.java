public class Medewerker {
    private String naam; //voor en achternaam van de medewerker

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public boolean isIngelogd() {
        return isIngelogd;
    }

    public void setIngelogd(boolean ingelogd) {
        isIngelogd = ingelogd;
    }

    private String gebruikersnaam; //om in te loggen
    private String wachtwoord; //om in te loggen
    private boolean isIngelogd; //of de medewerker is ingelogd
    private String klantNaam; //verhuurd product aan klant

    public Medewerker() {
    }

    // een medewerker verhuurd een product aan een klant

}
