package contabilidade;

public class EmpresaMEI implements Tributavel{
	
	Double faturamentoMensal;

	public EmpresaMEI(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public Double getValorIR() {
		// TODO Auto-generated method stub
		return faturamentoMensal*0.275;
	}

	@Override
	public Double getValorISS() {
		// TODO Auto-generated method stub
		return 0.0;
	}
}
