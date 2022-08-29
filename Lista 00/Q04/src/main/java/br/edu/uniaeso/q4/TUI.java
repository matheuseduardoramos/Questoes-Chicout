package br.edu.uniaeso.q4;
import java.util.Scanner;
public class TUI {
    private String txtNome;
    private int txtIdade;
    private Scanner leitor;
    private Pessoa pessoa;
    private CalculadorDeDias cd;
    public TUI() {
        this.leitor = new Scanner(System.in);
        this.cd = new CalculadorDeDias();
        this.pessoa = new Pessoa();

    }


    public void printTUI(){
        System.out.println("NOME:");
        this.txtNome = leitor.nextLine();
        System.out.println("IDADE:");
        this.txtIdade = leitor.nextInt();
    }
    public void solve(){
        pessoa.setIdade(txtIdade);
        pessoa.setNome(txtNome);
        cd.setPessoa(pessoa);

    }
    public void printResults(){
        System.out.println(cd.totalDias());
    }
    public void tui(){
        printTUI();
        solve();
        printResults();
    }
}
