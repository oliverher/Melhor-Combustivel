
public class Calculo {
	private double alcool, gasolina, resultado;
	
	public Calculo(double alcool, double gasolina) {
		this.alcool = alcool;
		this.gasolina = gasolina;
	}

	public double getAlcool() {
		return alcool;
	}

	public void setAlcool(double alcool) {
		this.alcool = alcool;
	}

	public double getGasolina() {
		return gasolina;
	}

	public void setGasolina(double gasolina) {
		this.gasolina = gasolina;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
    public void calcular(){
    	resultado = (alcool / gasolina) * 100;
    }

    public String performace(){
    	if (resultado > 70){
    		return "Melhor abastecer com Gasolina";
    	}else {
    		return "Melhor abastecer com alcool";
    	}
    }

}
