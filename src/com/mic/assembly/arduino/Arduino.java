package com.mic.assembly.arduino;

import java.awt.Dimension;
import java.io.PrintWriter;
import java.util.Scanner;

import com.fazecast.jSerialComm.*;

import arduino.AlertBox;


public class Arduino {
	private SerialPort comPort;
	private String portDescription;
	private int baud_rate;
	
	public Arduino() {
		//empty constructor if port undecided
	}
	
	
	
	public Arduino(String portDescription) {
		//make sure to set baud rate after
		this.portDescription = portDescription;
		comPort = SerialPort.getCommPort(this.portDescription);
	}
	
	public Arduino(String portDescription, int baud_rate) {
		//preferred constructor
		this.portDescription = portDescription;
		comPort = SerialPort.getCommPort(this.portDescription);
		this.baud_rate = baud_rate;
		comPort.setBaudRate(this.baud_rate);
	}
	
	
	
	public boolean openConnection(){
		if(comPort.openPort()){
			try {Thread.sleep(100);} catch(Exception e){}
			int timeout = 0;
			while (!(getSerialPort().bytesAvailable() > 0)) {
				timeout++;
				if(timeout > 2000) {
					return false;
				}
//				System.out.println("Waiting...");
			}
//			System.out.println(serialRead());
			try {Thread.sleep(100);} catch(Exception e){}
			String response = serialRead();
//			System.out.println("Connection: " + response);
			
			return true;
		}
		else {
//			AlertBox alert = new AlertBox(new Dimension(400,100),"Error Connecting", "Try Another port");
//			alert.display();
			return false;
		}
	}
	
	public void closeConnection() {
		comPort.closePort();
	}
	
	public void setPortDescription(String portDescription){
		this.portDescription = portDescription;
		comPort = SerialPort.getCommPort(this.portDescription);
	}
	
	public void setBaudRate(int baud_rate){
		this.baud_rate = baud_rate;
		comPort.setBaudRate(this.baud_rate);
	}
	
	public String getPortDescription(){
		return portDescription;
	}
	
	public SerialPort getSerialPort(){
		return comPort;
	}
	
	
	public boolean readBoolean() {
		String response = serialRead();
		char res = response.charAt(response.length() - 1);
		if(res == '0') {
			return false;
		}else if(res == '1') {
			return true;
		}
		return false;
	}
	
	public String serialRead(){
		//will be an infinite loop if incoming data is not bound
		comPort.setComPortTimeouts(SerialPort.TIMEOUT_NONBLOCKING, 0, 0);
		String out="";
		Scanner in = new Scanner(comPort.getInputStream());
		try
		{
		   while(in.hasNext())
		      out += (in.next());
		   	in.close();
		} catch (Exception e) { e.printStackTrace(); }
		
		System.out.println(out);
		while(comPort.bytesAvailable() > 0) {
			comPort.readBytes(new byte[1], 1);
		}
		return out;
	}
	
	public String serialRead(int limit){
		//in case of unlimited incoming data, set a limit for number of readings
		comPort.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 0, 0);
		String out="";
		int count=0;
		Scanner in = new Scanner(comPort.getInputStream());
		try
		{
		   while(in.hasNext()&&count<=limit){
		      out += (in.next()+"\n");
		      count++;
		   }
		   	in.close();
		} catch (Exception e) { e.printStackTrace(); }
		return out;
	}
	
	public void serialWrite(String s){
		//writes the entire string at once.
		comPort.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 0, 0);
		try{Thread.sleep(5);} catch(Exception e){}
		PrintWriter pout = new PrintWriter(comPort.getOutputStream());
		pout.print(s);
		pout.flush();
		
	}
	
	public void serialWrite(String s,int noOfChars, int delay){
		//writes the entire string, 'noOfChars' characters at a time, with a delay of 'delay' between each send.
		comPort.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 0, 0);
		try{Thread.sleep(5);} catch(Exception e){}
		PrintWriter pout = new PrintWriter(comPort.getOutputStream());
		for(int i = 0; i < s.length() - noOfChars; i += noOfChars){
			pout.write(s.substring(i,i+noOfChars));
			pout.flush();
			try{Thread.sleep(delay);}catch(Exception e){}
		}
//		pout.write(s.substring(i));
		pout.flush();
		
	}
	
	public void serialWrite(char c){
		//writes the character to output stream.
		comPort.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 0, 0);
		try{Thread.sleep(5);} catch(Exception e){}
		PrintWriter pout = new PrintWriter(comPort.getOutputStream());pout.write(c);
		pout.flush();
	}
	
	public void serialWrite(char c, int delay){
		//writes the character followed by a delay of 'delay' milliseconds.
		comPort.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 0, 0);
		try{Thread.sleep(5);} catch(Exception e){}
		PrintWriter pout = new PrintWriter(comPort.getOutputStream());pout.write(c);
		pout.flush();
		try{Thread.sleep(delay);}catch(Exception e){}
	}

	public SerialPort[] getPorts() {
		return SerialPort.getCommPorts();
	}
}