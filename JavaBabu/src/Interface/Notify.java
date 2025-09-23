package Interface;
interface Phone{
	void showMsg();
	void IncomingCall();
}

class Nokia implements Phone{
	public void showMsg() {
		System.out.println("The Message of Nokia Mobile");
	}
	
	public void IncomingCall() {
		System.out.println("The Incoming Call of Nokia Mobile");
	}
}

class Samsung implements Phone{
	public void showMsg() {
		System.out.println("The Message of Samsung Mobile");
	}
	
	public void IncomingCall() {
		System.out.println("The Incoming Call of Samsung Mobile");
	}
}