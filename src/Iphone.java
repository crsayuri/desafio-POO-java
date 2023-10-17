
public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

  // Navegador internet
  public void exibirPagina() {
    System.out.println("Abrindo pagina no iPhone");
  }

  public void adicionarNovaAba() {
    System.out.println("Abrindo nova aba no iPhone");
  }

  public void atualizarPagina() {
    System.out.println("Pagina atualizada no iPhone");
  }

  // Aparelho telefonico
  public void ligar() {
    System.out.println("Fazendo ligação pelo iPhone");
  }

  public void atender() {
    System.out.println("Atendendo ligação no iPhone");
  }

  public void iniciarCorreioVoz() {
    System.out.println("Abrindo correio de voz do iPhone");

  }

  // Reprodutor musical
  public void tocar() {
    System.out.println("Tocando musica no iPhone");

  }

  public void pausar() {
    System.out.println("Musica pausada no iPhone");

  }

  public void selecionarMusica() {
    System.out.println("Selecionando musica no iPhone");

  }

}
