package CAN;

import java.util.List;

public class CAN_Frame 
{
	final int MAX_DIM_MESS = 8;
	final int DIM_ID = 2;
	byte Som;
	List<Long> id;
	byte RTR;
	int DLC;
	Byte[] data = new Byte[MAX_DIM_MESS];
	
	public CAN_Frame(byte som,List<Long> id, byte rTR, int dLC, Byte[] data) {
		Som = som;
		this.id = id;
		RTR = rTR;
		DLC = dLC;
		this.data = data;
	}
	
	public byte getSom() {
		return Som;
	}
	public void setSom(byte som) {
		Som = som;
	}
	public List<Long> getId() {
		return id;
	}
	public void setId(List<Long> id) {
		this.id = id;
	}
	public byte getRTR() {
		return RTR;
	}
	public void setRTR(byte rTR) {
		RTR = rTR;
	}
	public int getDLC() {
		return DLC;
	}
	public void setDLC(int dLC) {
		DLC = dLC;
	}
	public Byte[] getData() {
		return data;
	}
	public void setData(Byte[] data) {
		this.data = data;
	}
}
