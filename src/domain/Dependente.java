package domain;

public class Dependente {
    private long cartaoDependente;
    private String nomeDependente;
    private String emailDependente;

    public Dependente()
    {

    }
    public Dependente(long cartaoDependente, String nomeDependente, String emailDependente)
    {
        this.cartaoDependente = cartaoDependente;
        this.nomeDependente = nomeDependente;
        this.emailDependente = emailDependente;
    }

    public long getCartaoDependente() {
        return cartaoDependente;
    }

    public void setCartaoDependente(long cartaoDependente) {
        this.cartaoDependente = cartaoDependente;
    }

    public String getNomeDependente() {
        return nomeDependente;
    }

    public void setNomeDependente(String nomeDependente) {
        this.nomeDependente = nomeDependente;
    }

    public String getEmailDependente() {
        return emailDependente;
    }

    public void setEmailDependente(String emailDependente) {
        this.emailDependente = emailDependente;
    }

    @Override
    public String toString() {
        return "\nDados dos dependentes" +
                "\nNúmero de cartão do dependente: " + cartaoDependente +
                "\nnome do dependente='" + nomeDependente +
                "\nemail do dependente='" + emailDependente;
    }
}
