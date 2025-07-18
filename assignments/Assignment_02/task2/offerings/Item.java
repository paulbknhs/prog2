package offerings;

import auth.User;

public class Item {

  String Name;
  float Verkaufspreis;
  User Verkaeufer;
  String Beschreibung;

  public Item(String Name, float Verkaufspreis, User Verkaeufer, String Beschreibung) {
    this.Name = Name;
    this.Verkaufspreis = Verkaufspreis;
    this.Verkaeufer = Verkaeufer;
    this.Beschreibung = Beschreibung;
  }

  public String getName() {
    return this.Name;
  }

  public float getVerkaufspreis() {
    return this.Verkaufspreis;
  }

  public User getVerkaeufer() {
    return this.Verkaeufer;
  }

  public String getBeschreibung() {
    return this.Beschreibung;
  }

  public void setName(String newName) {
    this.Name = newName;
  }

  public void setVerkaufspreis(float newVerkaufspreis) {
    this.Verkaufspreis = newVerkaufspreis;
  }

  public void setVerkaeufer(User newVerkaeufer) {
    this.Verkaeufer = newVerkaeufer;
  }

  public void setBeschreibung(String newBeschreibung) {
    this.Beschreibung = newBeschreibung;
  }
}
