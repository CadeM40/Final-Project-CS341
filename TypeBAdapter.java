import javax.swing.Icon;

public class TypeBAdapter implements GameObject {

    private Type_B_GameObject typeBGameObject;

    public TypeBAdapter(Type_B_GameObject typeBGameObject) {
        this.typeBGameObject = typeBGameObject;
    }

    
    public void move(Canvas c) {
        typeBGameObject.move(c);
    }

    
    public void setImage() {
        typeBGameObject.setImage();
    }


    
    public Icon getCurrentImage() {
        return typeBGameObject.getCurrentImage();
    }

    
    public int getX() {
        return typeBGameObject.getX();
    }

    
    public int getY() {
        return typeBGameObject.getY();
    }


    
    public boolean isSelected() {
        return typeBGameObject.isSelected();
    }

    
    public void setSelected(boolean selected) {
        typeBGameObject.setSelected(selected);
    }
}
