package com.training;

import com.training.services.StudentService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentService service = new StudentService();
		
		int key=4;
		 switch (key) {
		case 1:
			service.simpleExceptionHandling();
			break;
		case 2:
			service.handlingWithMultipleCatch(args[0]);
			break;
		case 3:
			 service.multiCatchFromJavaSevenOnwards(args[0], args[1]);
			 break;
		case 4:
			 try {
				service.usingThrowsClause(null);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			 break;
		default:
			break;
		}
	}
	

}
