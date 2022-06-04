package Drugi.przyklady.OOPPodsumowanie.Samsung;

public class EU43RU7172 extends TelewizorSamsung {

	public EU43RU7172(String idString) {
		super(43);
	}

	private String idString;
	private String HDMIString;
	private String HDMIString2;
	private String optyczneString;
	private String usb1String;
	private String usb2String;

	public void setIdString(String idString) {
		this.idString = idString;
	}

	public void setHDMIString(String hDMIString) {
		HDMIString = hDMIString;
	}

	public void setHDMIString2(String hDMIString2) {
		HDMIString2 = hDMIString2;
	}

	public void setOptyczneString(String optyczneString) {
		this.optyczneString = optyczneString;
	}

	public void setUsb1String(String usb1String) {
		this.usb1String = usb1String;
	}

	public void setUsb2String(String usb2String) {
		this.usb2String = usb2String;
	}

}
