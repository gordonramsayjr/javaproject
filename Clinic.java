import java.util.*;

public class Clinic 
{
  private Doctor doctor1, doctor2;
  private Pet pet1, pet2, pet3 ,pet4;
  private void run() 
  {
      Scanner console = new Scanner(System.in);
      int option;

  
      do{
          System.out.println("Please select an option: ");
          System.out.println("(1) Add New Doctor (2) Remove Doctor (3) Add New Pet (4) Remove Pet (5) List Doctors (6) List Pets (9) Exit Menu");
          option = console.nextInt();
          switch(option){
          case 1: 
            addDoctor();
            break;
          case 2: 
            removeDoctor();
            break;
          case 3:
            addPet();
            break;
          case 5:
            listDoctors();
            break;
          case 6:
            listPets();
            break;
             
            }
        }
      while(option!=9);
  }
  public static void main(String[] args)
  {
        Clinic clinic = new Clinic();
        clinic.run();
  }
  public void addDoctor(){
      String specialisation,name;
      Doctor doctor = new Doctor();
      Scanner console = new Scanner(System.in);

      if(doctor1==null || doctor2==null){

         doctor = new Doctor();

         System.out.println("Enter Doctor's Name: ");
         name = console.nextLine();
         name = name.toLowerCase();
         doctor.setName(name);

         System.out.println("Enter Doctor's Specialisation (Dog Or Cat): ");
         specialisation = console.nextLine(); specialisation = specialisation.toLowerCase();
         doctor.setSpecial(specialisation);

         if (doctor1==null) doctor1=doctor;
         else doctor2=doctor;
         }
         else
         System.out.println("No space availiable for new doctor.");
  }

  public void addPet(){
      String type,size,name,doctor; 
      int age;
      double weight;
      Pet pet = new Pet();
      Scanner console = new Scanner(System.in);

      if (pet1 == null || pet2 == null || pet3 == null || pet4 == null)
      {
        pet = new Pet();

        System.out.println("Please enter pet's name");
        name = console.nextLine(); name = name.toLowerCase();
        pet.setName(name); 

        System.out.println("Please enter pet's type (Cat or Dog)");
        type = console.nextLine(); type = type.toLowerCase();
        pet.setType(type);

        System.out.println("Please enter pet's size (Small, Medium or Large): ");
        size = console.nextLine(); size = size.toLowerCase();
        pet.setSize(size);

        System.out.println("Please enter pet's weight (kgs): ");
        weight = console.nextDouble();
        pet.setWeight(weight);

        System.out.println("Please enter pet's age: ");
        age = console.nextInt();
        pet.setAge(age);

        if (pet1 == null) pet1 = pet;
        else if (pet2 == null) pet2 = pet;
        else if (pet3 == null) pet3 = pet;
        else pet4 = pet;
      }
      else System.out.println("No space availiable for new pet");
  }

  public void removeDoctor(){
      Scanner console = new Scanner(System.in);
      String removal;
      System.out.println("Please enter the name of the doctor you would like to remove: ");
      removal = console.nextLine();

      if (doctor1 != null && doctor1.getName() == removal){
        doctor1.removeDoc();
        System.out.println("asdasdasdasd");
        if (doctor2 != null && doctor2.getName() == removal){
        doctor2 = null;
      }
      }
      else System.out.println("There are no doctors to remove");

      }
  

  public void listDoctors(){
    Scanner console = new Scanner(System.in);
    System.out.println("List of Doctors: ");
    if (doctor1 != null){
      System.out.println(doctor1.getName() + " " + doctor1.getSpecial());
      if (doctor2 != null){
        System.out.println(doctor2.getName() + " " + doctor2.getSpecial());
    }
    }
    else System.out.println("No doctors."); 
  }
  public void listPets(){
    Scanner console = new Scanner(System.in);

  }
}
