package structural.adapter.phoneimpl;

import structural.adapter.phoneifaces.MicroUsbPhone;

public class Android implements MicroUsbPhone{
public boolean connector;
	@Override
	public void useMicroUsb() {
		// TODO Auto-generated method stub
		connector=true;
		System.out.println("microUsb connected");
	}

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		if(connector) {
			System.out.println("recharge started");
			System.out.println("recharge finished");
		}else {
			System.out.println("connect microusb first");
		}
	}

}
