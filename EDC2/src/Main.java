 
public class Main {
    public static void main(String[] args) {
        Folder root =new Folder("Root",9);
        Folder f1 =new Folder("Java",4);
        Folder f2= new Folder("design pattern",3);
        root.addComponent(f1);
        root.addComponent(f2);

        f1.addComponent(new File("constucteur",5));
        f1.addComponent(new File("Methode",3));
        f2.addComponent(new File("composite"));
        f2.addComponent(new File("singleton"));
        Folder ff1=(Folder)f1.addComponent(new Folder("java2",3));
        ff1.addComponent(new File("Loop"));
;
        root.afficher();
        System.out.println("root size: " +root.getSize());
        System.out.println("f1 size: "  +f1.getSize());
        System.out.println("f2 size: "  +f2.getSize());

    }
}

