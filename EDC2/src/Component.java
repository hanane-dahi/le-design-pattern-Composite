public abstract class Component {

	   protected  String name;
	    protected int level;
	    protected int size;
	    public Component(String name) {

	        this.name = name;

	    }

	    public Component(String name, int size) {
	        this.size=size;
	    }

	    public abstract void afficher();
	    abstract int getSize();

	    public String indentation(){
	        String str = "";
	        for (int i = 0; i < level; i++) {
	            str+=" \t";
	            
	        }
	     return str;
	}


	}

