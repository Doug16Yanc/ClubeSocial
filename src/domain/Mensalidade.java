package domain;

public class Mensalidade {

    private String dataMensalidade;
    private String valorMensalidade;
    private String dataPagamento;
    private double jurosMensalidade;
    private double valorPago;
    private boolean mensalidadeQuitada;

    public Mensalidade(String dataMensalidade, String valorMensalidade, String dataPagamento, double jurosMensalidade, double valorPago, boolean mensalidadeQuitada)
    {
        this.dataMensalidade = dataMensalidade;
        this.valorMensalidade = valorMensalidade;
        this.dataPagamento = dataPagamento;
        this.jurosMensalidade = jurosMensalidade;
        this.valorPago = valorPago;
        this.mensalidadeQuitada = mensalidadeQuitada;
    }

    public String getDataMensalidade() {
        return dataMensalidade;
    }

    public void setDataMensalidade(String dataMensalidade) {
        this.dataMensalidade = dataMensalidade;
    }

    public String getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(String valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getJurosMensalidade() {
        return jurosMensalidade;
    }

    public void setJurosMensalidade(double jurosMensalidade) {
        this.jurosMensalidade = jurosMensalidade;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public boolean isMensalidadeQuitada() {
        return mensalidadeQuitada;
    }

    public void setMensalidadeQuitada(boolean mensalidadeQuitada) {
        this.mensalidadeQuitada = mensalidadeQuitada;
    }

    @Override
    public String toString() {
        return "Geração de boleto de mensalidade autorizada!" +
                "\ndata da mensalidade: " + dataMensalidade +
                "\nvalor da mensalidade: (R$) " + valorMensalidade +
                "\ndata do pagamento: " + dataPagamento +
                "\njuros de mensalidade: " + jurosMensalidade +
                "\nvalorPago=" + valorPago +
                "\nmensalidadeQuitada=" + mensalidadeQuitada;
    }
}
