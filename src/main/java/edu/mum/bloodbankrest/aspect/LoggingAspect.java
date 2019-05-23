package edu.mum.bloodbankrest.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

@Aspect
@Component
public class LoggingAspect {

	private static final String filepath="C:\\Users\\eshe30\\Desktop\\EA_Project\\errormessage.txt";

	@Pointcut("execution(* edu.mum.bloodbankrest.service..findAll(..))")
 	    public void applicationMethod() {}

	@Pointcut("execution(* edu.mum.bloodbankrest.service..save(..))")
	public void applicationMethodSave() {}

	@AfterThrowing(pointcut = "applicationMethod() || applicationMethodSave()", throwing = "theExc")
		  public void logErrors(JoinPoint joinPoint, Throwable theExc ) {
String st = "";
                    System.out.println("Errors ********************  " + theExc.getMessage());
                    StringBuilder sb = new StringBuilder();
                    sb.append("***********");
                    sb.append("\n");
                    sb.append("Error Position :    " + joinPoint.getSignature().getDeclaringTypeName() +"."+joinPoint.getSignature().getName());
                    sb.append("\n");
                    sb.append("Date Time :   " + new Date());
		            sb.append("\n");
                    sb.append("Error Message :    " + theExc.getMessage());
                    sb.append("\n");
                    sb.append("************");
		            sb.append("\n");
		  try {
			//  System.out.println(sb.toString());
			FileOutputStream fileOut = new FileOutputStream(filepath);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			  System.out.println(sb.toString());
			  objectOut.writeObject(sb.toString());

			objectOut.close();
			System.out.println("The Exception  was successfully written to a file");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	  }

}

