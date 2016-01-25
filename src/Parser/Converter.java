package Parser;

import java.util.List;

import CAN.CAN_Frame;
import CAN.Database;
import CAN.Informazione;

public class Converter 
{
	Costruzione_Frame costruct;
	CAN_Frame frame;
	Database db;
	List<Informazione> informazione;
	List<Estrazione> est;
	long id_Centralina;
	public Converter()
	{
		costruct = new Costruzione_Frame();
		frame = costruct.Costruzione();
		db = new Database();
		db.insert_data();
		informazione = db.Insert();
	}
	public List<Estrazione> information_data()
	{
		List<Long> id;
		int byte_payload;
		Byte dato;
		id = frame.getId();
		if(id_Centralina == id.get(3))
		{
			for(int i=0; i<informazione.size();i++)
			{
				if(informazione.get(i).getIndirizzo()==id)
				{
				
					Estrazione e;
					byte_payload = informazione.get(i).getNum_byte_payload();
					dato = frame.getData()[byte_payload];
					e = new Estrazione(informazione.get(i).getId_centralina_source(),informazione.get(i).getNome(),dato,informazione.get(i).getNome());
					est.add(e);
				}
			}
		}
		return est;
	}
}