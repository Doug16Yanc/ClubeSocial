package domain;

public class Candidato
{
    private String nomeCandidato;
    private String enderecoCandidato;
    private String naturalCandidato;
    private long cepCandidato;
    private String telefoneCandidato;
    private String emailCandidato;

    public Candidato()
    {

    }
    public Candidato(String nomeCandidato, String enderecoCandidato, String naturalCandidato, long cepCandidato, String telefoneCandidato,String emailCandidato)
    {
        this.nomeCandidato = nomeCandidato;
        this.enderecoCandidato = enderecoCandidato;
        this.naturalCandidato =  naturalCandidato;
        this.cepCandidato = cepCandidato;
        this.telefoneCandidato = telefoneCandidato;
        this.emailCandidato = emailCandidato;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public String getEnderecoCandidato() {
        return enderecoCandidato;
    }

    public void setEnderecoCandidato(String enderecoCandidato) {
        this.enderecoCandidato = enderecoCandidato;
    }

    public String getNaturalCandidato() {
        return naturalCandidato;
    }

    public void setNaturalCandidato(String naturalCandidato) {
        this.naturalCandidato = naturalCandidato;
    }

    public long getCepCandidato() {
        return cepCandidato;
    }

    public void setCepCandidato(long cepCandidato) {
        this.cepCandidato = cepCandidato;
    }

    public String getTelefoneCandidato() {
        return telefoneCandidato;
    }

    public void setTelefoneCandidato(String telefoneCandidato) {
        this.telefoneCandidato = telefoneCandidato;
    }

    public String getEmailCandidato() {
        return emailCandidato;
    }

    public void setEmailCandidato(String emailCandidato) {
        this.emailCandidato = emailCandidato;
    }

    @Override
    public String toString() {
        return "\nDados do candidato: " +
                "\nnome do candidato: " + nomeCandidato +
                "\nendereço do candidato: " + enderecoCandidato +
                "\nnaturalidade do candidato: " + naturalCandidato +
                "\ncep de endereço do candidato: " + cepCandidato +
                "\ntelefoneCandidato: " + telefoneCandidato +
                "\nemail do candidato='" + emailCandidato;
    }
}
