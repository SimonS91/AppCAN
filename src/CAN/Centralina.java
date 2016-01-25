package CAN;

import java.util.ArrayList;
import java.util.List;

public class Centralina 
{
	long id_centralina;
	List<List<Long>> indirizzi;
	String name;
	
	public Centralina(long id_centralina,String name)
	{
		this.id_centralina = id_centralina;
		indirizzi = new ArrayList<List<Long>>();
		this.name = name;
	}

	public long getId_centralina() {
		return id_centralina;
	}

	public void setId_centralina(long id_centralina) {
		this.id_centralina = id_centralina;
	}

	public List<List<Long>> getIndirizzi() {
		return indirizzi;
	}

	public void setIndirizzi(List<List<Long>> indirizzi) {
		this.indirizzi = indirizzi;
	}
	
	public void insert(List<Long> indirizzo)
	{
		indirizzi.add(indirizzo);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
