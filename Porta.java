
public class Porta implements Cloneable {

	protected double altura, largura;
	protected boolean aberta;
	/**
	 * Construtor passando novos parametros
	 * @param altura
	 * @param largura
	 * @param aberta
	 */
	public Porta(double altura, double largura, boolean aberta) {
		this.altura = altura;
		this.largura = largura;
		this.aberta = aberta;
		
	}
	
	/**
	 * Metodos Para abrir e fechar a Porta
	 * @return
	 */
	public boolean abrir() {
		System.out.println("Porta aberta!");
		return aberta = true;
	}	
	public boolean fechar() {
		System.out.println("Porta Fechada!");
		return aberta = false;
	}
	/**
	 * Criando uma Nova Porta Automaticamente
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Porta p = new Porta(this.altura, this.largura,this.aberta);
		
		return p;
	}
	/**
	 * Metodos Getters
	 * @return
	 */
	
	public double getAltura() {
		return altura;
	}
	public double getLargura() {
		return largura;
	}
	public boolean isAberta() {
		return aberta;
	}
	
	
}
