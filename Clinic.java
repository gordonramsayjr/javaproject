// Zackary Jeans and Blake Eveleigh Java Project 1 //


// TO DO LIST //
//  Assignging pets to doctors and vise versa 
//  Documenting code
//  Format code to be neater
//  Once doctors can be assigned add to listPets() info
// TO DO LIST //


import java.util.*;

import org.graalvm.compiler.asm.aarch64.AArch64Assembler.SystemHint;

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
          System.out.println("(1) Add New Doctor (2) Remove Doctor (3) Add New Pet (4) Remove Pet (5) List Doctors (6) List Pets (7) Assign Pet to Doctor (8) Analyse Pet (9) List Doctor's Pets (0) Exit Menu");
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
          case 7:
            assignDoctor();
            break;
          case 8:
            analysePet();
            break;
          case 9:
            doctorsPets();
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
      int option=0;
      System.out.println("Please enter the name of the doctor you would like to remove: ");
      removal = console.nextLine();

      if (doctor1 != null){
        if (doctor1.getName().equals(removal)){
          option = 1;
          if (pet1 != null){
            if (pet1.getDoctor().equals(doctor1.getName())){
              pet1.setDoctor(null);
            }
          }
          if (pet2 != null){
            if (pet2.getDoctor().equals(doctor1.getName())){
              pet2.setDoctor(null);
            }
          }
          if (pet3 != null){
            if (pet3.getDoctor().equals(doctor1.getName())){
              pet3.setDoctor(null);
            }
          }
          if (pet4 != null){
            if (pet4.getDoctor().equals(doctor1.getName())){
              pet4.setDoctor(null);
            }
          }
            doctor1 = null;
            System.out.println("Doctor " + doctor1.getName() + " removed.");
        }
      }
      if(doctor2 != null){
        if (doctor2.getName().equals(removal)){
          option = 1;
          if (pet1 != null){
            if (pet1.getDoctor().equals(doctor2.getName())){
              pet1.setDoctor(null);
            }
          }
          if (pet2 != null){
            if (pet2.getDoctor().equals(doctor2.getName())){
              pet2.setDoctor(null);
            }
          }
          if (pet3 != null){
            if (pet3.getDoctor().equals(doctor2.getName())){
              pet3.setDoctor(null);
            }
          }
          if (pet4 != null){
            if (pet4.getDoctor().equals(doctor2.getName())){
              pet4.setDoctor(null);
            }
          }
        doctor2 = null;
        System.out.println("Doctor " + doctor2.getName() + " removed.");
        }
      }
  
      if(option == 0){
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
      System.out.println("Pet " + pet1.getName() + ": " + pet1.getSize() + " " + pet1.getType() + " weighing " + pet1.getWeight() + " in kgs, at " + pet1.getAge() + ". Doctor: " + pet1.getDoctor());
    }
    if (pet2 != null){
      System.out.println("Pet " + pet2.getName() + ": " + pet2.getSize() + " " + pet2.getType() + " weighing " + pet2.getWeight() + " in kgs, at " + pet2.getAge()+ ". Doctor: " + pet2.getDoctor());
    }
    if (pet3 != null){
      System.out.println("Pet " + pet3.getName() + ": " + pet3.getSize() + " " + pet3.getType() + " weighing " + pet3.getWeight() + " in kgs, at " + pet3.getAge()+ ". Doctor: " + pet3.getDoctor());
    }
    if (pet4 != null){
      System.out.println("Pet " + pet4.getName() + ": " + pet4.getSize() + " " + pet4.getType() + " weighing " + pet4.getWeight() + " in kgs, at " + pet4.getAge()+ ". Doctor: " + pet4.getDoctor());
    }
    else if (pet1 == null && pet2 == null && pet3 == null && pet4 == null){
      System.out.println("There are no pets.");
    }

  }
  public void assignDoctor(){
    Scanner console = new Scanner(System.in);
    String doctor, pet;
    int swap, option=0, option1=0;

    System.out.println("Name of pet you would like to assign a doctor to: ");
    pet = console.nextLine();

    if (pet1 != null){
      if (pet1.getName().equals(pet)){
        option1 = 1;
        System.out.println("What doctor would you like to assign to this pet?");
        doctor = console.nextLine();
        
        if (doctor1 != null){
          if(doctor1.getName().equals(doctor)){
            option = 1;
            if(doctor1.getName().equals(pet1.getDoctor())){
              System.out.println("Doctor already assigned");
              run();
            }
            if (doctor1.getSpecial().equals(pet1.getType())){
              if (pet1.getDoctor() == null){
                pet1.setDoctor(doctor);
                System.out.println("Doctor assigned");
                run();
              }
              else if (doctor2 != null){
                if (doctor2.getName().equals(pet1.getDoctor())){
                  System.out.println("A doctor is already assigned to this pet would you like to change that?");
                  System.out.println("1. Yes 2. No");
                  swap = console.nextInt();
                  if (swap == 1){
                    pet1.setDoctor(doctor);
                    System.out.println("Doctor assigned");
                    run();
                  }
                  else if (swap == 2){
                    run();
                  }
                }
              }
            }
            else{
              System.out.println("Doctor does not have the required specialisation");
              run();
            }
          }
        }
        if (doctor2 != null){
          if(doctor2.getName().equals(doctor)){
            option = 1;
            if(doctor2.getName().equals(pet1.getDoctor())){
              System.out.println("Doctor already assigned");
              run();
            }
            if (doctor2.getSpecial().equals(pet1.getType())){
              if (pet1.getDoctor() == null){
                pet1.setDoctor(doctor);
                System.out.println("Doctor assigned");
                run();
              }
              else if (doctor1 != null){
                if (doctor1.getName().equals(pet1.getDoctor())){
                  System.out.println("A doctor is already assigned to this pet would you like to change that?");
                  System.out.println("1. Yes 2. No");
                  swap = console.nextInt();
                  if (swap == 1){
                    pet1.setDoctor(doctor);
                    System.out.println("Doctor assigned");
                    run();
                  }
                  else if (swap == 2){
                    run();
                  }
                }
              }
            }
            else{
              System.out.println("Doctor does not have the required specialisation");
              run();
            }
          }
        }


      }
    }
    if (pet2 != null){
      if (pet2.getName().equals(pet)){
        option1 = 1;
        System.out.println("What doctor would you like to assign to this pet?");
        doctor = console.nextLine();
        
        if (doctor1 != null){
          if(doctor1.getName().equals(doctor)){
            option = 1;
            if(doctor1.getName().equals(pet2.getDoctor())){
              System.out.println("Doctor already assigned");
              run();
            }
            if (doctor1.getSpecial().equals(pet2.getType())){
              if (pet2.getDoctor() == null){
                pet2.setDoctor(doctor);
                System.out.println("Doctor assigned");
                run();
              }
              else if (doctor2 != null){
                if (doctor2.getName().equals(pet2.getDoctor())){
                  System.out.println("A doctor is already assigned to this pet would you like to change that?");
                  System.out.println("1. Yes 2. No");
                  swap = console.nextInt();
                  if (swap == 1){
                    pet2.setDoctor(doctor);
                    System.out.println("Doctor assigned");
                    run();
                  }
                  else if (swap == 2){
                    run();
                  }
                }
              }
            }
            else{
              System.out.println("Doctor does not have the required specialisation");
              run();
            }
          }
        }
        if (doctor2 != null){
          if(doctor2.getName().equals(doctor)){
            option = 1;
            if(doctor2.getName().equals(pet2.getDoctor())){
              System.out.println("Doctor already assigned");
              run();
            }
            if (doctor2.getSpecial().equals(pet2.getType())){
              if (pet2.getDoctor() == null){
                pet2.setDoctor(doctor);
                System.out.println("Doctor assigned");
                run();
              }
              else if (doctor1 != null){
                if (doctor1.getName().equals(pet2.getDoctor())){
                  System.out.println("A doctor is already assigned to this pet would you like to change that?");
                  System.out.println("1. Yes 2. No");
                  swap = console.nextInt();
                  if (swap == 1){
                    pet2.setDoctor(doctor);
                    System.out.println("Doctor assigned");
                    run();
                  }
                  else if (swap == 2){
                    run();
                  }
                }
              }
            }
            else{
              System.out.println("Doctor does not have the required specialisation");
              run();
            }
          }
        }


      }
    }
    if (pet3 != null){
      option1 = 1;
      if (pet3.getName().equals(pet)){
        System.out.println("What doctor would you like to assign to this pet?");
        doctor = console.nextLine();
        
        if (doctor1 != null){
          if(doctor1.getName().equals(doctor)){
            option = 1;
            if(doctor1.getName().equals(pet3.getDoctor())){
              System.out.println("Doctor already assigned");
              run();
            }
            if (doctor1.getSpecial().equals(pet3.getType())){
              if (pet3.getDoctor() == null){
                pet3.setDoctor(doctor);
                System.out.println("Doctor assigned");
                run();
              }
              else if (doctor2 != null){
                if (doctor2.getName().equals(pet3.getDoctor())){
                  System.out.println("A doctor is already assigned to this pet would you like to change that?");
                  System.out.println("1. Yes 2. No");
                  swap = console.nextInt();
                  if (swap == 1){
                    pet3.setDoctor(doctor);
                    System.out.println("Doctor assigned");
                    run();
                  }
                  else if (swap == 2){
                    run();
                  }
                }
              }
            }
            else{
              System.out.println("Doctor does not have the required specialisation");
              run();
            }
          }
        }
        if (doctor2 != null){
          if(doctor2.getName().equals(doctor)){
            option = 1;
            if(doctor2.getName().equals(pet3.getDoctor())){
              System.out.println("Doctor already assigned");
              run();
            }
            if (doctor2.getSpecial().equals(pet3.getType())){
              if (pet3.getDoctor() == null){
                pet3.setDoctor(doctor);
                System.out.println("Doctor assigned");
                run();
              }
              else if (doctor1 != null){
                if (doctor1.getName().equals(pet3.getDoctor())){
                  System.out.println("A doctor is already assigned to this pet would you like to change that?");
                  System.out.println("1. Yes 2. No");
                  swap = console.nextInt();
                  if (swap == 1){
                    pet3.setDoctor(doctor);
                    System.out.println("Doctor assigned");
                    run();
                  }
                  else if (swap == 2){
                    run();
                  }
                }
              }
            }
            else{
              System.out.println("Doctor does not have the required specialisation");
              run();
            }
          }
        }


      }
    }
    if (pet4 != null){
      if (pet4.getName().equals(pet)){
        option1 = 1;
        System.out.println("What doctor would you like to assign to this pet?");
        doctor = console.nextLine();
        
        if (doctor1 != null){
          if(doctor1.getName().equals(doctor)){
            option = 1;
            if(doctor1.getName().equals(pet4.getDoctor())){
              System.out.println("Doctor already assigned");
              run();
            }
            if (doctor1.getSpecial().equals(pet4.getType())){
              if (pet4.getDoctor() == null){
                pet4.setDoctor(doctor);
                System.out.println("Doctor assigned");
                run();
              }
              else if (doctor2 != null){
                if (doctor2.getName().equals(pet4.getDoctor())){
                  System.out.println("A doctor is already assigned to this pet would you like to change that?");
                  System.out.println("1. Yes 2. No");
                  swap = console.nextInt();
                  if (swap == 1){
                    pet4.setDoctor(doctor);
                    System.out.println("Doctor assigned");
                    run();
                  }
                  else if (swap == 2){
                    run();
                  }
                }
              }
            }
            else{
              System.out.println("Doctor does not have the required specialisation");
              run();
            }
          }
        }
        if (doctor2 != null){
          if(doctor2.getName().equals(doctor)){
            option = 1;
            if(doctor2.getName().equals(pet4.getDoctor())){
              System.out.println("Doctor already assigned");
              run();
            }
            if (doctor2.getSpecial().equals(pet4.getType())){
              if (pet4.getDoctor() == null){
                pet4.setDoctor(doctor);
                System.out.println("Doctor assigned");
                run();
              }
              else if (doctor1 != null){
                if (doctor1.getName().equals(pet4.getDoctor())){
                  System.out.println("A doctor is already assigned to this pet would you like to change that?");
                  System.out.println("1. Yes 2. No");
                  swap = console.nextInt();
                  if (swap == 1){
                    pet4.setDoctor(doctor);
                    System.out.println("Doctor assigned");
                    run();
                  }
                  else if (swap == 2){
                    run();
                  }
                }
              }
            }
            else{
              System.out.println("Doctor does not have the required specialisation");
              run();
            }
          }
        }


      }
    }

    if(option1 == 0){
      System.out.println("This pet does not exist");
    }
    else if(option == 0){
      System.out.println("This doctor does not exist");
    }

  }
  public void removePets(){
    Scanner console = new Scanner(System.in);
    String removal;
    System.out.println("Please enter the name of the pet you would like to remove: ");
    removal = console.nextLine();
    
    if (pet1 != null){
      if (pet1.getName().equals(removal) ){
            pet1 = null;
        }
    }
    if (pet2 != null){
      if (pet2.getName().equals(removal) ){
            pet2 = null;
        }
    }   
    if(pet3 != null){
      if (pet3.getName().equals(removal) ){
            pet3 = null;
        }
    }
    if(pet4 != null){
      if (pet4.getName().equals(removal) ){
            pet4 = null;
        }
    }
    else if(pet1 == null && pet2 == null && pet3 == null && pet4 == null) System.out.println("There are no pets to remove");

  }
  
  public void analysePet(){
    Scanner console = new Scanner(System.in);
    String name;
    int option=0;

    System.out.println("Which pet would you like to analyse?");
    name = console.nextLine(); name = name.toLowerCase();

    if (pet1 != null){
      if (name.equals(pet1.getName())){
        option = 0;
        if(pet1.getType().equals("cat")){
          if(pet1.getSize().equals("small")){
            if (pet1.getWeight() > 4){
              System.out.println("This cat is overweight");
            }
            else System.out.println("This cat is not overweight");
          }
          if(pet1.getSize().equals("medium")){
            if (pet1.getWeight() > 6){
              System.out.println("This cat is overweight");
            }
            else System.out.println("This cat is not overweight");
          }
          if(pet1.getSize().equals("large")){
            if (pet1.getWeight() > 8){
              System.out.println("This cat is overweight");
            }
            else System.out.println("This cat is not overweight");
          }
        }
        if(pet1.getType().equals("dog")){
          if(pet1.getSize().equals("small")){
            if (pet1.getWeight() > 6){
              System.out.println("This dog is overweight");
            }
            else System.out.println("This dog is not overweight");
          }
          if(pet1.getSize().equals("medium")){
            if (pet1.getWeight() > 9){
              System.out.println("This dog is overweight");
            }
            else System.out.println("This dog is not overweight");
          }
          if(pet1.getSize().equals("large")){
            if (pet1.getWeight() > 12){
              System.out.println("This dog is overweight");
            }
            else System.out.println("This dog is not overweight");
          }
        }
      }
      else option = 1;
    }
    if (pet2 != null){
      if (name.equals(pet2.getName())){
        option = 0;
        if(pet2.getType().equals("cat")){
          if(pet2.getSize().equals("small")){
            if (pet2.getWeight() > 4){
              System.out.println("This cat is overweight");
            }
            else System.out.println("This cat is not overweight");
          }
          if(pet2.getSize().equals("medium")){
            if (pet2.getWeight() > 6){
              System.out.println("This cat is overweight");
            }
            else System.out.println("This cat is not overweight");
          }
          if(pet2.getSize().equals("large")){
            if (pet2.getWeight() > 8){
              System.out.println("This cat is overweight");
            }
            else System.out.println("This cat is not overweight");
          }
        }
        if(pet2.getType().equals("dog")){
          if(pet2.getSize().equals("small")){
            if (pet2.getWeight() > 6){
              System.out.println("This dog is overweight");
            }
            else System.out.println("This dog is not overweight");
          }
          if(pet2.getSize().equals("medium")){
            if (pet2.getWeight() > 9){
              System.out.println("This dog is overweight");
            }
            else System.out.println("This dog is not overweight");
          }
          if(pet2.getSize().equals("large")){
            if (pet2.getWeight() > 12){
              System.out.println("This dog is overweight");
            }
            else System.out.println("This dog is not overweight");
          }
        }  
      }
      else option = 1;
    }

    if (pet3 != null){
      if (name.equals(pet3.getName())){
        option = 0;
        if(pet3.getType().equals("cat")){
          if(pet3.getSize().equals("small")){
            if (pet3.getWeight() > 4){
              System.out.println("This cat is overweight");
            }
            else System.out.println("This cat is not overweight");
          }
          if(pet3.getSize().equals("medium")){
            if (pet3.getWeight() > 6){
              System.out.println("This cat is overweight");
            }
            else System.out.println("This cat is not overweight");
          }
          if(pet3.getSize().equals("large")){
            if (pet3.getWeight() > 8){
              System.out.println("This cat is overweight");
            }
            else System.out.println("This cat is not overweight");
          }
        }
        if(pet3.getType().equals("dog")){
          if(pet3.getSize().equals("small")){
            if (pet3.getWeight() > 6){
              System.out.println("This dog is overweight");
            }
            else System.out.println("This dog is not overweight");
          }
          if(pet3.getSize().equals("medium")){
            if (pet3.getWeight() > 9){
              System.out.println("This dog is overweight");
            }
            else System.out.println("This dog is not overweight");
          }
          if(pet3.getSize().equals("large")){
            if (pet3.getWeight() > 12){
              System.out.println("This dog is overweight");
            }
            else System.out.println("This dog is not overweight");
          }
        } 
      }
      else option = 1;
    }
    if (pet4 != null){
      if (name.equals(pet4.getName())){
        option = 0;
        if(pet4.getType().equals("cat")){
          if(pet4.getSize().equals("small")){
            if (pet4.getWeight() > 4){
              System.out.println("This cat is overweight");
            }
            else System.out.println("This cat is not overweight");
          }
          if(pet4.getSize().equals("medium")){
            if (pet4.getWeight() > 6){
              System.out.println("This cat is overweight");
            }
            else System.out.println("This cat is not overweight");
          }
          if(pet4.getSize().equals("large")){
            if (pet4.getWeight() > 8){
              System.out.println("This cat is overweight");
            }
            else System.out.println("This cat is not overweight");
          }
        }
        if(pet4.getType().equals("dog")){
          if(pet4.getSize().equals("small")){
            if (pet4.getWeight() > 6){
              System.out.println("This dog is overweight");
            }
            else System.out.println("This dog is not overweight");
          }
          if(pet4.getSize().equals("medium")){
            if (pet4.getWeight() > 9){
              System.out.println("This dog is overweight");
            }
            else System.out.println("This dog is not overweight");
          }
          if(pet4.getSize().equals("large")){
            if (pet4.getWeight() > 12){
              System.out.println("This dog is overweight");
            }
            else System.out.println("This dog is not overweight");
          }
        }
       
      }
      else option = 1;
    }
    if (option == 1) System.out.println("Pet does not exist");
  }

  public void doctorsPets(){
    Scanner console = new Scanner(System.in);
    String doctor;
    int option = 0, option1=0;

    System.out.println("Which doctor's pets would you like to view?");
    doctor = console.nextLine();

    if(doctor1 == null && doctor2 == null){
      System.out.println("There are no doctors.");
      run();
    }
    if (doctor1 != null){
      if (doctor1.getName().equals(doctor)){
        option = 1;
        System.out.println(doctor1.getName() + "'s Pets:");
        if (pet1 != null){
          if (pet1.getDoctor().equals(doctor1.getName())){
            option1 = 1;
            System.out.println(pet1.getName());
          }
        }
        if (pet2 != null){
          if (pet2.getDoctor().equals(doctor1.getName())){
            option1 = 1;
            System.out.println(pet2.getName());
          }
        }
        if (pet3 != null){
          if (pet3.getDoctor().equals(doctor1.getName())){
            option1 = 1;
            System.out.println(pet3.getName());
          }
        }
        if (pet4 != null){
          if (pet4.getDoctor().equals(doctor1.getName())){
            option1 = 1;
            System.out.println(pet4.getName());
          }
        }
      }
    }
    if (doctor2 != null){
      if (doctor2.getName().equals(doctor)){
        option = 1;
        System.out.println(doctor2.getName() + "'s Pets:");
        if (pet1 != null){
          if (pet1.getDoctor().equals(doctor2.getName())){
            option1 = 1;
            System.out.println(pet1.getName());
          }
        }
        if (pet2 != null){
          if (pet2.getDoctor().equals(doctor2.getName())){
            option1 = 1;
            System.out.println(pet2.getName());
          }
        }
        if (pet3 != null){
          if (pet3.getDoctor().equals(doctor2.getName())){
            option1 = 1;
            System.out.println(pet3.getName());
          }
        }
        if (pet4 != null){
          if (pet4.getDoctor().equals(doctor2.getName())){
            option1 = 1;
            System.out.println(pet4.getName());
          }
        }
      }
    }
    if(option1 == 0){
      System.out.println("This doctor has no pets assigned to them");
    }
    if (option == 0){
      System.out.println("There are no doctors with that name");
    }
  }
}
