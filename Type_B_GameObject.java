import java.util.LinkedList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
public class Type_B_GameObject extends GameObject{

    private int movementState;

	public Type_B_GameObject(int x, int y) {
		super(x, y);
	    setDirection(Direction.NONE);
        movementState = 0;

	    
	    	imageList = new LinkedList<Icon>();
	    	imageList.add(new ImageIcon("images/Type_B_Left.png"));
	    	imageList.add(new ImageIcon("images/Type_B_Right.png"));
	    	imageList.add(new ImageIcon("images/Type_B_Up.png"));
	    	imageList.add(new ImageIcon("images/Type_B_Down.png"));
	    }
	
	
	public void move(Canvas c) {
	    int canvasWidth = (int) c.getSize().getWidth();
	    int canvasHeight = (int) c.getSize().getHeight();
	    int iconWidth = getCurrentImage().getIconWidth();
	    int iconHeight = getCurrentImage().getIconHeight();

	    switch (movementState) {
	        case 0: // Move right
	            setX((getX() + getVelocity()) % canvasWidth);
	            if (getX() + iconWidth >= canvasWidth) {
	                setDirection(Direction.DOWN);
	            }
	            break;
	        case 1: // Move down
	            setY((getY() + getVelocity()) % canvasHeight);
	            if (getY() + iconHeight >= canvasHeight) {
	                setDirection(Direction.LEFT);
	            }
	            break;
	        case 2: // Move left
	            setX((getX() - getVelocity() + canvasWidth) % canvasWidth);
	            if (getX() <= 0) {
	                setDirection(Direction.UP);
	            }
	            break;
	        case 3: // Move up
	            setY((getY() - getVelocity() + canvasHeight) % canvasHeight);
	            if (getY() <= 0) {
	                setDirection(Direction.RIGHT);
	            }
	            break;
	    }

	    setImage();
	}


	public void setImage() {
		  // Implement logic to set the appropriate image for Type A

        // Example: Change image based on direction
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
