package domain;

public class Socio extends Candidato
{
    private long cartaoSocio;
    private Categoria categoria;

    public Socio()
    {

    }
    public Socio(String nomeCandidato, String enderecoCandidato, String naturalCandidato, long cepCandidato, String telefoneCandidato,String emailCandidato, long cartaoSocio, Categoria categoria)
    {
        super(nomeCandidato, enderecoCandidato, naturalCandidato, cepCandidato, telefoneCandidato, emailCandidato);
        this.cartaoSocio = cartaoSocio;
        this.categoria = categoria;
    }

    public long getCartaoSocio() {
        return cartaoSocio;
    }

    public void setCartaoSocio(long cartaoSocio) {
        this.cartaoSocio = cartaoSocio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "\nDados do sócio" +
                "\nNúmero do cartão de sócio: " + cartaoSocio +
                "\nCategoria: " + getCategoria();
    }
}
