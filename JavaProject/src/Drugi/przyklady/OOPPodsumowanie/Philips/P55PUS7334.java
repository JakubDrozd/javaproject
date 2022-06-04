package Drugi.przyklady.OOPPodsumowanie.Philips;

public class P55PUS7334 extends Ambilight {

	private String hdmiString; 
	private String hdmiString2;
	private String hdmiString3;
	private String optyczne;
	private String usb1;
	private String usb2;
	private String bluetooth;
	private String wifi;

	public void setHdmiString(String hdmiString) {
		this.hdmiString = hdmiString;
	}

	public void setHdmiString2(String hdmiString2) {
		this.hdmiString2 = hdmiString2;
	}

	public void setHdmiString3(String hdmiString3) {
		this.hdmiString3 = hdmiString3;
	}

	public void setOptyczne(String optyczne) {
		this.optyczne = optyczne;
	}

	public void setUsb1(String usb1) {
		this.usb1 = usb1;
	}

	public void setUsb2(String usb2) {
		this.usb2 = usb2;
	}

	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	public P55PUS7334(String string) {
		super(55);
	}

}
