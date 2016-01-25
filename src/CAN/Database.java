package CAN;

import java.util.ArrayList;
import java.util.List;

public class Database 
{
	List <Informazione> associazione;
	List<Long> indirizzo1; 
	List<Long> indirizzo2;
	List<Long> indirizzo3;
	List<Long> indirizzo4;
	List<Long> indirizzo5;
	List<Long> indirizzo6;
	final long id_centralina1 = 00000000;
	final long id_centralina2 = 00000001;
	final long id_centralina3 = 00000010;
	final String nome_centralina1 = "A";
	final String nome_centralina2 = "B";
	final String nome_centralina3 = "C";
	final String nome_dato1 = "speed";
	final String nome_dato2 = "brake";
	final String nome_dato3 = "acceleration";
	final String nome_dato4 = "position";
	final String nome_dato5 = "temperature_oil";
	final String nome_dato6 = "fuel_message";
	final String nome_dato7 ="Engine_oil_temperature";
	final int num_byte_payload1 = 1;
	final int num_byte_payload2 = 2;
	final int num_byte_payload3 = 3;
	final int num_byte_payload4 = 4;
	final int num_byte_payload5 = 5;
	final int num_byte_payload6 = 6;
	final int num_byte_payload7 = 7;
	final int num_byte_payload8 = 8;
	
	public Database()
	{
		associazione = new ArrayList<Informazione>();
		indirizzo1 = new ArrayList<Long>();
		indirizzo2 = new ArrayList<Long>();
		indirizzo3 = new ArrayList<Long>();
		indirizzo4 = new ArrayList<Long>();
		indirizzo5 = new ArrayList<Long>();
		indirizzo6 = new ArrayList<Long>();
	}
	public void insert_data()
	{
		indirizzo1.add((long) 000);
		indirizzo1.add((long) 0000000000);
		indirizzo1.add((long) 00000001);
		indirizzo1.add((long) 00000000);
		indirizzo2.add((long) 001);
		indirizzo2.add((long) 000000000);
		indirizzo2.add((long) 00000010);
		indirizzo2.add((long) 00000000);
		indirizzo3.add((long) 010);
		indirizzo3.add((long) 00000000000);
		indirizzo3.add((long) 000000000);
		indirizzo3.add((long) 000000001);
		indirizzo4.add((long) 011);
		indirizzo4.add((long) 0000000000);
		indirizzo4.add((long) 00000010);
		indirizzo4.add((long) 00000001);
		indirizzo5.add((long) 100);
		indirizzo5.add((long) 0000000000);
		indirizzo6.add((long) 00000000);
		indirizzo5.add((long) 00000010);
		indirizzo6.add((long) 101);
		indirizzo6.add((long) 0000000000);
		indirizzo6.add((long) 00000001);
		indirizzo6.add((long) 00000010);
		
	}
	public List<Informazione> Insert()
	{
		Centralina centralina1 = new Centralina(id_centralina1,nome_centralina1);
		centralina1.insert(indirizzo1);
		centralina1.insert(indirizzo4);
		Informazione informazione1 = new Informazione(nome_dato1,num_byte_payload1,centralina1.getId_centralina(),indirizzo1,indirizzo1.get(2));
		Informazione informazione7 = new Informazione(nome_dato7,num_byte_payload2,centralina1.getId_centralina(),indirizzo1,indirizzo1.get(2));
		Informazione informazione2 = new Informazione(nome_dato2,num_byte_payload2,centralina1.getId_centralina(),indirizzo4,indirizzo4.get(2));
		Centralina centralina2 = new Centralina(id_centralina2,nome_centralina2);
		centralina2.insert(indirizzo2);
		centralina2.insert(indirizzo5);
		Informazione informazione3 = new Informazione(nome_dato3,num_byte_payload3,centralina2.getId_centralina(),indirizzo2,indirizzo2.get(2));
		Informazione informazione4 = new Informazione(nome_dato4,num_byte_payload4,centralina2.getId_centralina(),indirizzo5,indirizzo5.get(2));
		Centralina centralina3 = new Centralina(id_centralina3,nome_centralina3);
		centralina3.insert(indirizzo3);
		centralina3.insert(indirizzo6);
		Informazione informazione5 = new Informazione(nome_dato5,num_byte_payload5,centralina3.getId_centralina(),indirizzo3,indirizzo3.get(2));
		Informazione informazione6 = new Informazione(nome_dato6,num_byte_payload6,centralina3.getId_centralina(),indirizzo6,indirizzo6.get(2));
		associazione.add(informazione1);
		associazione.add(informazione2);
		associazione.add(informazione3);
		associazione.add(informazione4);
		associazione.add(informazione5);
		associazione.add(informazione6);
		associazione.add(informazione7);
		return associazione;
	}
}
