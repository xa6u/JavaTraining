
public class Pet {
	
	private byte age;
	private float heigth, weight;
	private String color;
	
	public void sleep(){
		System.out.println("Спокойной ночи! До завтра");
	}
	
	public void eat(){
		System.out.println("Я очень голоден, давайте перекусим чипсами!");
	}
	
	public String say(String phrase){
		
		String petResponse = "Ну ладно!!" + phrase;
		
		return petResponse; 
	}

}
