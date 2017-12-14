
public class Goods {
	String name;
	int cost;
	double rate;

	public Goods(String n){
		this.name=n;
	}

	public Goods(String n,int c){
		this.name=n;
		this.cost=c;

	}

	public void setRate(double d){
		if (d<0){
			rate=0;
		}else{
			rate=d;
		}
	}

	public void show(){
		System.out.println("商品名:"+name);
		System.out.println("税抜き価格:"+cost);
		System.out.println("消費税率:"+rate);
		System.out.println("税込価格:"+(int)(cost*(1+rate)));
	}
}
