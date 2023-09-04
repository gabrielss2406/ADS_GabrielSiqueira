package contabilidade;

/**
 * A classe EmpresaMEI implementa a interface Tributavel para cálculo de impostos de uma empresa no regime MEI (Microempreendedor Individual).
 */
public class EmpresaMEI implements Tributavel {
    
    Double faturamentoMensal;

    /**
     * Construtor para criar uma nova instância de EmpresaMEI com um faturamento mensal.
     *
     * @param faturamentoMensal O faturamento mensal da empresa.
     */
    public EmpresaMEI(Double faturamentoMensal) {
        super();
        this.faturamentoMensal = faturamentoMensal;
    }

    @Override
    public Double getValorIR() {
        // TODO Auto-generated method stub
        return faturamentoMensal * 0.275;
    }

    @Override
    public Double getValorISS() {
        // TODO Auto-generated method stub
        return 0.0;
    }
}
