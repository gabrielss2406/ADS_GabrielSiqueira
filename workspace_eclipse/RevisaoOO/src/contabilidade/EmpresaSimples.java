package contabilidade;

public class EmpresaSimples implements Tributavel{
	
	Double faturamentoMensal;

	public EmpresaSimples(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public Double getValorIR() {
		// TODO Auto-generated method stub
		return faturamentoMensal*0.15;
	}

	@Override
	public Double getValorISS() {
		// TODO Auto-generated method stub
		return faturamentoMensal*0.08;
	}
}
