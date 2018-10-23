class Chick implements Animal {     
	private String myType;
	private String mySound;
	public Chick(String type, String sounda, String soundb){
		myType = type;
		if(Math.random() > .5){
			mySound = sounda;
		}else {
			mySound = soundb;
		}
	}
	public Chick(){
		myType = "unknown";
		mySound = "unknown";
	}
	public String getSound(){
		return mySound;
	}
	public String getType(){
		return myType;
	}
}