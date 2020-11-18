import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
private List<Component> components=new ArrayList<>();

    public Folder(String name,int size) {
        super(name,size);
    }

    @Override
    public void afficher() {

            String tab =indentation();
            System.out.println(tab+"Folder:" +name );
        for (Component c:components){
            c.afficher();

        }

    }

    @Override
    int getSize() {
        int sum = 0;
        for(int i = 0; i <components.size(); i++)
            sum = sum + components.get(i).getSize();

        return sum;
    }

    public Component addComponent(Component component){
        component.level=this.level+1;
        this.components.add(component);
        return component;
    }
}


