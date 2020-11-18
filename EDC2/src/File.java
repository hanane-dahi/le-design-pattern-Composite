
public class File  extends Component  {

	public File(String name) {
        super(name);


    }
    public File(String name, int size) {
        super(name,size);

    }


    @Override
    public void afficher() {

        String tab =indentation();
        System.out.println(tab+ "File:" +name );
    }

    @Override
    int getSize() {
        return size;
    }


}

