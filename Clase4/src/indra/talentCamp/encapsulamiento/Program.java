package indra.talentCamp.encapsulamiento;
import indra.talentCamp.encapsulamiento.models.*;
import indra.talentCamp.utils.Consola;

public class Program {

	public static void main(String[] args) {

		//try (Scanner in = new Scanner(System.in)) {
		
		
			System.out.println("Bienvenidos al TalentCamp de Java!");
			
			System.out.println("Quien va a impartir el curso?");
			Teacher jedi = new Teacher(
				Consola.readString("Cual es su nombre?"), 
				Consola.readString("Cual es su documento?"), 
				Consola.readString("Cual es su direccion?"));
			
			System.out.println("Quien va a asistir al curso?");
			Student s1 = new Student(
					Consola.readString("Cual es su nombre?"), 
					Consola.readString("Cual es su documento?"), 
					Consola.readString("Cual es su direccion?"));
			
			String answer = Consola.readString("Te gusta el front? (S/N)");
			s1.setPrefFront(answer.equalsIgnoreCase("S"));
			
			
			/*
			//System.out.println("Cual es su nombre?");
			//s1.setName(in.nextLine());
			s1.setName(Consola.readString("Cual es su nombre?"));
			
			System.out.println("Cual es su documento?");
			s1.setDoc(in.nextLine());
			
			System.out.println("Cual es su direccion?");
			s1.setAddress(in.nextLine());
			
			System.out.println("Te gusta el front? (S/N)");
			String answer = in.nextLine();
			s1.setPrefFront(answer.equalsIgnoreCase("S"));
			
			
			System.out.println("Bienvenido " + s1.getName() + " al talent camp.\n"
					+ "Su documento es " + s1.getDoc() + " y vive en " + s1.getAddress());
			if (s1.getPrefFront()) System.out.println("Perfecto que te guste el front.\n");
			else System.out.println("Bueno, a ver si le asignan un proyecto que le guste.\n");
			*/
			System.out.println("--------------------------");
			System.out.println(s1.toString());
			System.out.println(jedi.toString());
			
		//}
	}

}
