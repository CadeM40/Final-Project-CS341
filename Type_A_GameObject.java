import java.util.LinkedList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
public class Type_A_GameObject extends GameObject {

    public Type_A_GameObject(int x, int y) {
        super(x, y);
        setDirection(Direction.NONE);

        	imageList = new LinkedList<Icon>();
        	imageList.add(new ImageIcon("images/Type_A_Up.png"));
        	imageList.add(new ImageIcon("images/Type_A_Down.png"));
        
    }

    @Override
    public void move(Canvas c) {
    	 if (getDirection() == Direction.UP) {
    	        setY(getY() - getVelocity());
    	        if (getY() < 0) {
    	            setY(0);
    	            setDirection(Direction.DOWN);
    	        }
    	    } else {
    	        setY(getY() + getVelocity());
    	        if (getY() + getCurrentImage().getIconHeight() > c.getSize().getHeight()) {
    	            setY((int) (c.getSize().getHeight() - getCurrentImage().getIconHeight()));
    	            setDirection(Direction.UP);
    	        }
    	    }

    	    setImage();
    	    }

    @Override
    public void setImage() {
     
        if (getDirection() == Direction.UP) {
            currentImage = 0;
        } else if (getDirection() == Direction.DOWN) {
            currentImage = 1;
        } else if (getDirection() == Direction.LEFT) {
            currentImage = 2;
        } else if (getDirection() == Direction.RIGHT) {
            currentImage = 3;
        }
    }
}
