package JoustData;

public class Card {
	
	private String name;
	private int cost;
	private int count;
	
	
	
	public Card() {
	}
	
	public Card(String name, int cost, int count) {
		this.name = name;
		this.cost = cost;
		this.count = count;
	}
	
	
	public void setName(String name){this.name = name;}
	public void setCost(int cost){this.cost = cost;}
	public void setCount(int count){this.count = count;}
	
	
	public String getName(){return name;}
	public int getCost(){return cost;}
	public int  getCount(){return count;}
	
	@Override
	public String toString() {
		return "Card [name=" + name + ", cost=" + cost + ", count=" + count
				+ "]";
	}
	
	
}
