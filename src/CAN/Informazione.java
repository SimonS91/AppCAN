package CAN;

import java.util.List;

public class Informazione 
{
    String nome;
	int num_byte_payload;
    long id_centralina_source;
    List<Long> indirizzo;
    long id_centralina_destination;
	
	public Informazione(String nome, int num_byte_payload,long id_centralina_source,List<Long> indirizzo,long id_centralina_destination) 
	{
		this.nome = nome;
		this.num_byte_payload = num_byte_payload;
		this.id_centralina_source = id_centralina_source;
		this.indirizzo = indirizzo;
		this.id_centralina_destination = id_centralina_destination;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNum_byte_payload() {
		return num_byte_payload;
	}

	public void setNum_byte_payload(int num_byte_payload) {
		this.num_byte_payload = num_byte_payload;
	}

	public long getId_centralina_source() {
		return id_centralina_source;
	}

	public void setId_centralina(long id_centralina) {
		this.id_centralina_source = id_centralina;
	}

	public List<Long> getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(List<Long> indirizzo) {
		this.indirizzo = indirizzo;
	}

	public long getId_centralina_destination() {
		return id_centralina_destination;
	}

	public void setId_centralina_destination(long id_centralina_destination) {
		this.id_centralina_destination = id_centralina_destination;
	}
	
}