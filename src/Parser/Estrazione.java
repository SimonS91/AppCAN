package Parser;

public class Estrazione 
{
    long id_centralina;
	String informazione;
	byte dato;
	String nome_centralina;
	
	public Estrazione(long id_centralina,String informazione,byte dato,String nome_centralina)
	{
		this.id_centralina = id_centralina;
		this.informazione = informazione;
		this.dato = dato;
		this.nome_centralina = nome_centralina;
	}

	public long id_centralina() {
		return id_centralina;
	}

	public void setId_centralina(long id_centralina) {
		this.id_centralina = id_centralina;
	}

	public String getInformazione() {
		return informazione;
	}

	public void setInformazione(String informazione) {
		this.informazione = informazione;
	}

	public byte getDato() {
		return dato;
	}

	public void setDato(byte dato) {
		this.dato = dato;
	}

	public void setNome_centralina(String nome_centralina) {
		this.nome_centralina = nome_centralina;
	}	
	
}