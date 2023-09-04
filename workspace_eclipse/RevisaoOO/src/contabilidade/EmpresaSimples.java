package contabilidade;

/**
 * A classe EmpresaSimples implementa a interface Tributavel para cálculo de impostos de uma empresa no regime Simples.
 */
public class EmpresaSimples implements Tributavel {
    
    Double faturamentoMensal;

    /**
     * Construtor para criar uma nova instância de EmpresaSimples com um faturamento mensal.
     *
     * @param faturamentoMensal O faturamento mensal da empresa.
     */
    public EmpresaSimples(Double faturamentoMensal) {
        super();
        this.faturamentoMensal = faturamentoMensal;
    }

    @Override
    public Double getValorIR() {
        // TODO Auto-generated method stub
        return faturamentoMensal * 0.15;
    }

    @Override
    public Double getValorISS() {
        // TODO Auto-generated method stub
        return faturamentoMensal * 0.08;
    }
}
