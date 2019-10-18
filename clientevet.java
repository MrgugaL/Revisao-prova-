package revisaoProva;

public class clientevet {

	private Cliente[] cliente;
	private int Ncliente;

	clientevet() {
		this.Ncliente = 0;
		this.cliente = new Cliente[300];
	}

	public int getNClinte() {
		return this.Ncliente;
	}

	public Cliente getCliente(int posicao) {
		return this.cliente[posicao];
	}

	public Cliente[] getCliete() {
		return this.cliente;
	}

	public void getCliente(Cliente cliente) {

		if (Ncliente + 1 >= this.cliente.length) {
			System.out.println("LImite Atingido de Clintes ");

		} else {
			this.cliente[Ncliente] = cliente;
			Ncliente++;

		}
	}
public void removerCliente (int posicao){
	if (this.cliente[posicao]!= null);
	  this.cliente[posicao] = null;
	  Ncliente--;
	 for (int i = posicao; i < this.cliente.length; i++) {
		 if (this.cliente[i+1]!=null)
			 this.cliente[i] = this.cliente[i+1];
		
	}
	  
}




public Cliente pesquisaCliente (String Codigo){
	if (Ncliente !=0){
		 for (int i = 0; i < Ncliente; i++) {
				if (this.cliente[i].getCodigo().equals(Codigo)){
					return this.cliente[i];
				}
		 }	
	}else {
		System.out.println("Não existe esse Cliente");
		
	}



	return null;
}

}
