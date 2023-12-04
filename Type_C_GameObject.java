import java.util.LinkedList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
public class Type_C_GameObject extends GameObject{

	public Type_C_GameObject(int x, int y) {
		super(x, y);
	    setDirection(Direction.NONE);
	    
	    	imageList = new LinkedList<Icon>();
	    	imageList.add(new ImageIcon("images/Type_C_Left.png"));
	    	imageList.add(new ImageIcon("images/Type_C_Right.png"));
	    }
	
	
	public void move(Canvas c) {
		  int canvasWidth = (int) c.getSize().getWidth();
	        int iconWidth = getCurrentImage().getIconWidth();

	        if (getDirection() == Direction.LEFT) {
	            setX(getX() - getVelocity());
	            if (getX() < 0) {
	                setX(0);
	                setDirection(Direction.RIGHT);
	            }
	        } else {
	            setX(getX() + getVelocity());
	            if (getX() + iconWidth > canvasWidth) {
	                setX((int) (canvasWidth - iconWidth));
	                setDirection(Direction.LEFT);
	            }
	        }


 	    setImage();
 	    }

	
	public void setImage() {
		 if (getDirection() == Direction.RIGHT) {
		        currentImage = 0;
		    } else if (getDirection() == Direction.LEFT) {
		        currentImage = 1;
		    }

		    // Ensure currentImage is within the bounds of the imageList
		    currentImage = Math.max(0, Math.min(currentImage, imageList.size() - 1));
		}
}
