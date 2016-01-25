package CoAP;

import java.util.List;

import Parser.Converter;
import Parser.Estrazione;
import ch.ethz.inf.vs.californium.coap.Request;
import ch.ethz.inf.vs.californium.coap.Response;

public class Client 
{
	public static void main (String args[])
	{
	   final int MAX_DIM=24;	
	   Converter conv = new Converter();
	   List <Estrazione> est = conv.information_data();
	   byte[] payload = new byte[MAX_DIM];
		try
		{
			
			Request request = Request.newGet();
			for(int i=0;i<est.size();i++)
			{
				payload [i] = Byte.valueOf((byte) est.get(i).id_centralina());
				payload[i+1] = Byte.valueOf(est.get(i).getInformazione());
				payload[i+2] = est.get(i).getDato(); //Byte.valueOf(est.dato);
			}
			request.setPayload(payload);
			request.setURI("localhost:5683/helloWorld");
			request.send();
			Response res = request.waitForResponse(1000);
			if (res != null) {
				// response received, output a pretty-print
				System.out.println(res);
			} else {
				System.out.println("No response received.");
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
