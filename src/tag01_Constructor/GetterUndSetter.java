package tag01_Constructor;

public class GetterUndSetter {

    private String name;
    private int alter;

    //Getter --------->private olan variable'ye disardan erisiriz return döndürür parametre almaz
    //Lesezugriffsmethode------------->	Veriyi okur
    public String getName() {
        return name;

    }

    //Setter---->Variable deger degistrimeye yarar. geri dönüs void dir, genede bir parametre alir

    public void setName(String name){
        this.name = name;

    }

    public int getAlter(){
        return alter;
    }
    public void setAlter(int alter){
        if(alter>0){
            this.alter = alter;

        }else{
            System.out.println("Ungültiges Alter!!!");
        }
    }

    public static void main(String[] args) {
        GetterUndSetter p1 = new GetterUndSetter();
        GetterUndSetter p2 = new GetterUndSetter();

        p1.setName("Ali");
        p1.setAlter(28);


        p2.setName("Ahmet");
        p2.setAlter(38);

        System.out.println(p1.getName());
        System.out.println(p1.getAlter());

        System.out.println(p2.getName());
        System.out.println(p2.getAlter());
    }
}


