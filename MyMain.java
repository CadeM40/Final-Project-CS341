public class MyMain {

	public static void main(String[] args) {

		// TASK 1: CREATE A CANVAS FOR ANIMATION
		Canvas canvas = new Canvas();
		canvas.requestFocus();
		
		//TASK 2:  ADD A USER GAME OBJECT OF TYPE D
		Type_D_GameObject user = new Type_D_GameObject(200, 200);
		user.setVelocity(10);
		canvas.addKeyListener(user);
		canvas.addGameObject(user);

		Type_A_GameObject typeA = new Type_A_GameObject(500, 100); 
        typeA.setVelocity(8);
		canvas.addGameObject(typeA);
		
		Type_C_GameObject typeC = new Type_C_GameObject(500, 400); 
		canvas.addGameObject(typeC);
        typeC.setVelocity(8);
		canvas.addGameObject(typeC);
		
		
		 Type_B_GameObject typeBGameObject = new Type_B_GameObject(300, 100);
		 	canvas.addGameObject(typeBGameObject);
	        typeBGameObject.setVelocity(8);
			canvas.addGameObject(typeBGameObject);

	}
	

}
