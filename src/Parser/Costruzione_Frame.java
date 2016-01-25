package Parser;

import java.util.List;

import CAN.CAN_Frame;

public class Costruzione_Frame 
{
	byte Som;
	List<Long> id;
	byte RTR;
	byte DLC;
	Byte[] data = new Byte[8];
	CAN_Frame frame;
	
	public Costruzione_Frame()
	{
		
	}
	
	public CAN_Frame Costruzione()
	{
		Som = 0;
		id.add((long) 000);
		id.add((long) 0000000000);		
		id.add((long) 00000001);
		id.add((long) 00000000);
		RTR = 0;
		DLC = 1;
		this.data[0] = 00000000;
		frame = new CAN_Frame(Som,id,RTR,DLC,data);
		return frame;
	}
}
