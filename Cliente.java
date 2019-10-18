package revisaoProva;

public class Cliente {
	private String codigo;
	private String nome;
	private int quantloc;
	
	public Cliente (){
	}

	Cliente (String codigo, String nome, int quantloc){
		this.codigo=codigo;
		this.nome=nome;
		this.quantloc =quantloc;
		
	}
	
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantloc() {
		return quantloc;
	}

	public void setQuantloc(int quantloc) {
		this.quantloc = quantloc;
	
	}

	@Override
public String toString (){
		return "Cliente [Codigo="+  codigo+ ", Nome =" + nome+ ", Quantidade de carros alugados =" + quantloc+"]";
	}
}

