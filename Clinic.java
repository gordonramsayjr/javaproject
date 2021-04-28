// Zackary Jeans and Blake Eveleigh Java Project 1 //


// TO DO LIST //
//  Assignging pets to doctors and vise versa 
//  Documenting code
//  Analyse pet method
//  Decide whether to switch output style (TIO or GUI)
//  Format code to be neater
//  Once doctors can be assigned add to listPets() info
//  Change the remove pets to include if pet1 != null before comparing to the remove variable
// TO DO LIST //


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
          case 4:
            removePets();
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

         System.out.println("Enter Doctor's Name: ");
         name = console.nextLine(); name = name.toLowerCase();

         if (doctor1 != null){
           if (name.equals(doctor1.getName()) ){
              System.out.println("A doctor with this name arleady exists");
              run();
            }    
         }
         if (doctor2 != null){
            if(name.equals(doctor2.getName())){
            System.out.println("A doctor with this name arleady exists");
            run();
          }
         }
         doctor = new Doctor();
         doctor.setName(name);
         
         System.out.println("Enter Doctor's Specialisation (Dog Or Cat): ");
         specialisation = console.nextLine(); specialisation = specialisation.toLowerCase();

         if (specialisation.equals("dog") || specialisation.equals("cat")){
           doctor.setSpecial(specialisation);
         }
         else {
          System.out.println("The specialisation must be a dog or cat.");
          run();
         }

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
        System.out.println("Please enter pet's name");
        name = console.nextLine(); name = name.toLowerCase();
        if (pet1 != null){
          if (name.equals(pet1.getName())){
            System.out.println("A pet with this name already exists.");
            run();
          }
        }
        if (pet2 != null){
          if (name.equals(pet2.getName())){
            
            run();
          }
        }
        if (pet3 != null){
          if (name.equals(pet3.getName())){
            System.out.println("A pet with this name already exists.");
            run();
          }
          
        }
        if (pet4 != null){
          if (name.equals(pet4.getName())){
            
            run();
          }
          
        } 
        pet = new Pet();
        pet.setName(name); 

        System.out.println("Please enter pet's type (Cat or Dog)");
        type = console.nextLine(); type = type.toLowerCase();
        if (type.equals("cat") || type.equals("dog")){
           pet.setType(type);
        }
        else {
          System.out.println("The pet's type must be cat or dog");
          run();
        }

        System.out.println("Please enter pet's size (Small, Medium or Large): ");
        size = console.nextLine(); size = size.toLowerCase();
        if (size.equals("small") || size.equals("medium") || size.equals("large")){
          pet.setSize(size);
        }
        else{
          System.out.println("The pet must be small, medium or large.");
          run();
        } 

        System.out.println("Please enter pet's weight (kgs): ");
        weight = console.nextDouble();
        if (weight > 0){
         pet.setWeight(weight); 
        }
        else{
          System.out.println("The weight must be a positive number");
          run();
        } 
        

        System.out.println("Please enter pet's age: ");
        age = console.nextInt();
        if (age > 0){
          pet.setAge(age);
        }
        else {
          System.out.println("The age must be a positive number"); 
          run();
        }

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

      if (doctor1 != null){
        if (doctor1.getName().equals(removal)){
            doctor1 = null;
        }
      }
      if(doctor2 != null){
        if (doctor2.getName().equals(removal)){
        doctor2 = null;
        }
      }
  
      else if (doctor1 == null && doctor2 == null){
        System.out.println("No doctors to remove");
      }

      }
  
  public void listDoctors(){
    Scanner console = new Scanner(System.in);
    System.out.println("List of Doctors: ");
    if (doctor1 != null){
      System.out.println(doctor1.getName() + ": " + doctor1.getSpecial() + " specialist.");
    }
    if (doctor2 != null){
      System.out.println(doctor2.getName() + ": " + doctor2.getSpecial()+ " specialist.");
    }
    
    else if (doctor2 == null && doctor1 == null){
      System.out.println("There are no doctors.");
    }

  }
  public void listPets(){
    Scanner console = new Scanner(System.in);

    if (pet1 != null){
      System.out.println("Pet " + pet1.getName() + ": " + pet1.getSize() + " " + pet1.getType() + " weighing " + pet1.getWeight() + " in kgs, at " + pet1.getAge());
    }
    if (pet2 != null){
      System.out.println("Pet " + pet2.getName() + ": " + pet2.getSize() + " " + pet2.getType() + " weighing " + pet2.getWeight() + " in kgs, at " + pet2.getAge());
    }
    if (pet3 != null){
      System.out.println("Pet " + pet3.getName() + ": " + pet3.getSize() + " " + pet3.getType() + " weighing " + pet3.getWeight() + " in kgs, at " + pet3.getAge());
    }
    if (pet4 != null){
      System.out.println("Pet " + pet4.getName() + ": " + pet4.getSize() + " " + pet4.getType() + " weighing " + pet4.getWeight() + " in kgs, at " + pet4.getAge());
    }
    else if (pet1 == null && pet2 == null && pet3 == null && pet4 == null){
      System.out.println("There are no pets.");
    }

  }
  public void assignDoctor(){
    Scanner console = new Scanner(System.in);
    String s1, s2;
    System.out.println("Please select a pet: ");
    s1 = console.nextLine();
    System.out.println("Please select a doctor to assign to this pet: ");
    s2 = console.nextLine();

  }
  public void removePets(){
    Scanner console = new Scanner(System.in);
    String removal;
    System.out.println("Please enter the name of the pet you would like to remove: ");
    removal = console.nextLine();
        if (pet1.getName().equals(removal) ){
            pet1 = null;
        }
        if (pet2.getName().equals(removal) ){
            pet2 = null;
        }
        if (pet3.getName().equals(removal) ){
            pet3 = null;
        }
        if (pet4.getName().equals(removal) ){
            pet4 = null;
        }
        else if(pet1 == null && pet2 == null && pet3 == null && pet4 == null) System.out.println("There are no pets to remove");

  }
}
