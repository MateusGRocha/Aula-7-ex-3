
public class Aplicacao {
	public static void main(String[] args) throws CloneNotSupportedException {
	
		//Instanciando uma nova Porta
		Porta porta1 = new Porta(3, 2, true);
		
		//Pegando os valores de Altura e Largura
		System.out.println("Altura da porta: " + porta1.getAltura());
		System.out.println("Largura da porta: " + porta1.getLargura());
		
		//Alterando o Estado da Porta
		porta1.abrir();
		
		//Criando um Clone da Porta
		Porta porta2 = (Porta) porta1.clone();
		
		//Pegando os valores de Altura e largura da Porta Clone
		System.out.println("Altura da porta: " + porta2.getAltura());
		System.out.println("Largura da porta: " + porta2.getLargura());
		
		//Alterando o Estado da Porta Clone
		porta2.fechar();
		
		
		
}
}
