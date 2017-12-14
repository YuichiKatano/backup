
public class ClassTest {
public static void main(String[] args){

	Employee yamamoto=new Employee("山本太郎",2,20);
	Employee matsuda=new Employee("松田次郎",4,25);
	Employee yasuda=new Employee("安田三郎",28);
	Employee nanasi=new Employee();

	yamamoto.setName("山本小太郎");
	yasuda.setYear(-1);

	yamamoto.display();

	matsuda.display();

	yasuda.display();

	nanasi.display();

	System.out.println( yamamoto.getName() );
	yamamoto.name
}

}