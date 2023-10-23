package stategy.frete;

import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;


public class CalculadoraFreteTest {

	@Test
	public void deveCalcularFreteParaDHL() {
		CalculadoraFrete calc = new CalculadoraFrete();
		Fretavel frete = new ServicoFreteDHL();
		
		double value1 = calc.calcularValor(frete,0);
		assert(value1==100.00);
		
		double value2 = calc.calcularValor(frete, 30);
		assert(value2==190.00);
	}
	
	@Test
	public void deveCalcularFreteParaSedex() {
		CalculadoraFrete calc = new CalculadoraFrete();
		Fretavel frete = new ServicoFreteSedex();
		
		double value1 = calc.calcularValor(frete, 0);
		assert(value1==50.00);
		
		double value2 = calc.calcularValor(frete, 15);
		assert(value2==70.00);

		double value3 = calc.calcularValor(frete, 30);
		assert(value3==90.00);
	}
	
	@Test
	public void deveCalcularFreteParaJadLog() {
		CalculadoraFrete calc = new CalculadoraFrete();
		Fretavel frete = new ServicoFreteJadLog();
		
		double value1 = calc.calcularValor(frete, 0);
		assert(value1==0.00);
		
		double value2 = calc.calcularValor(frete, 40);
		assert(value2==150.00);
	}
	
	@Test
	public void deveCalcularFreteParaFedEx() {
		CalculadoraFrete calc = new CalculadoraFrete();
		Fretavel frete = new ServicoFreteFedEx();
		
		double value1 = calc.calcularValor(frete, 0);
		assert(value1==0.00);
		
		double value2 = calc.calcularValor(frete, 40);
		assert(value2==75.00);
	}
}
