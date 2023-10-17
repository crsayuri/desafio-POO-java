
public class Usuario {
  public static void main(String[] args) {
    Iphone iph = new Iphone();

    NavegadorInternet navegador = iph;
    ReprodutorMusical reprodutorMusical = iph;
    AparelhoTelefonico aparelhoTelefonico = iph;

    navegador.adicionarNovaAba();
    navegador.atualizarPagina();
    navegador.exibirPagina();
    reprodutorMusical.selecionarMusica();
    reprodutorMusical.tocar();
    reprodutorMusical.pausar();
    aparelhoTelefonico.atender();
    aparelhoTelefonico.ligar();
    aparelhoTelefonico.iniciarCorreioVoz();
  }
}
