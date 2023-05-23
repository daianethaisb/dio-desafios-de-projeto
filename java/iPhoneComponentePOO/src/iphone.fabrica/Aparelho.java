public class Aparelho {
	public static void main(String[] args) {
		Componente aparelho = new Componente();
		
		aparelho.tocar();
		aparelho.pausar();
		aparelho.selecionarMusica();
		
		aparelho.ligar();
		aparelho.atender();
		aparelho.iniciarCorreioDeVoz();
		
		aparelho.exibirPagina();
		aparelho.adicionarNovaAba();
		aparelho.atualizarPagina();
	}
}
