package Entities;
public class Rent {
private String nome;
private String email;
public Rent(String email, String nome) {
this.nome = nome;
this.email = email;
}
public String getName() {
return nome;
}
public void setNome(String nome) {
this.nome = nome;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public String toString() {
return nome + ", " + email;
}
}