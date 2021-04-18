package com.elena.FinalProject;

import java.util.Scanner;

public class Main {

    Employee employee = new Employee(1, Location.CBC, "ssss", "sasa", "sasa", new Address("sdaads", "sad", "asd", "asd", "asd"));
    Employee employee2 = new Employee(2, Location.CBC, "ssss", "sasa", "sasa", new Address("sdaads", "sad", "asd", "asd", "asd"));


    public static void printMenu(){
        System.out.println("Please Enter The Command Number");
        System.out.println("1 - Add a new employee");
        System.out.println("2 - Add a new employee trainer");
        System.out.println("3 - Add an external trainer");
        System.out.println("4 - Show employees");
        System.out.println("5 - Show employee trainers");
        System.out.println("6 - Show external trainers");
        System.out.println("7 - Add a new training IN PROGRESS");
        System.out.println("8 - Add a new course IN PROGRESS");
        System.out.println("9 - Add a new training group IN PROGRESS");
        System.out.println("10 - Add a new participant at training IN PROGRESS");
        System.out.println("11 - Modify an employee IN PROGRESS");
        System.out.println("12 - Search an employee, trainer, training, or training group IN PROGRESS");
        System.out.println("13 - Delete an employee, trainer, training, or training group IN PROGRESS");
        System.out.println("x - Exit program");
    }
    public static String getUserInput(){
        Scanner scanner = new Scanner(System.in);
        String commandNumber = scanner.nextLine();
        return commandNumber;

    }

    public static void createNewEmployee(Repository repository){
        System.out.println("Enter employee id: ");
        int personId = Integer.parseInt(getUserInput());
        System.out.println("Enter work location from list: UBC, UBC1, PBC, CBC, IBC ");
        Location workLocation = Location.valueOf(getUserInput());
        System.out.println("Enter first name: ");
        String firstName = getUserInput();
        System.out.println("Enter last name: ");
        String lastName = getUserInput();
        System.out.println("Enter CNP: ");
        String cnp = getUserInput();
        System.out.println("Enter street name: ");
        String streetName = getUserInput();
        System.out.println("Enter street number: ");
        String streetNr = getUserInput();
        System.out.println("Enter city: ");
        String city = getUserInput();
        System.out.println("Enter country: ");
        String country = getUserInput();
        System.out.println("Enter postal code: ");
        String postalCode = getUserInput();

        Address address = new Address(streetName, streetNr, city, country, postalCode);
        Employee employee = new Employee(personId, workLocation, cnp, firstName, lastName, address);
        repository.addEmployee(employee);

    }

    public static void addEmployeeTrainer(Repository repository){

        System.out.println("Enter employee trainer id: ");
        int employeeTrainerId = Integer.parseInt(getUserInput());
        System.out.println("Enter first name: ");
        String firstName = getUserInput();
        System.out.println("Enter last name: ");
        String lastName = getUserInput();
        System.out.println("Enter CNP: ");
        String cnp = getUserInput();
        System.out.println("Enter street name: ");
        String streetName = getUserInput();
        System.out.println("Enter street number: ");
        String streetNr = getUserInput();
        System.out.println("Enter city: ");
        String city = getUserInput();
        System.out.println("Enter country: ");
        String country = getUserInput();
        System.out.println("Enter postal code: ");
        String postalCode = getUserInput();

        Address address = new Address(streetName, streetNr, city, country, postalCode);
        EmployeeTrainer employeeTrainer = new EmployeeTrainer(employeeTrainerId, cnp, firstName, lastName, address);
        repository.addEmployeeTrainer(employeeTrainer);

    }

    public static void addExternTrainer(Repository repository){
        System.out.println("Enter external trainer id: ");
        int externalTrainerId = Integer.parseInt(getUserInput());
        System.out.println("Enter first name: ");
        String firstName = getUserInput();
        System.out.println("Enter last name: ");
        String lastName = getUserInput();
        System.out.println("Enter CNP: ");
        String cnp = getUserInput();
        System.out.println("Enter street name: ");
        String streetName = getUserInput();
        System.out.println("Enter street number: ");
        String streetNr = getUserInput();
        System.out.println("Enter city: ");
        String city = getUserInput();
        System.out.println("Enter country: ");
        String country = getUserInput();
        System.out.println("Enter postal code: ");
        String postalCode = getUserInput();
        System.out.println("Enter professional description: ");
        String professionalDescription = getUserInput();
        System.out.println("Enter link: ");
        String link = getUserInput();
        System.out.println("Enter amount per hour: ");
        Double amountPerHour = Double.parseDouble(getUserInput());

        Address address = new Address(streetName, streetNr, city, country, postalCode);
        ExternalTrainer externalTrainer = new ExternalTrainer(externalTrainerId, firstName, lastName, cnp, address, professionalDescription, link, amountPerHour);
        repository.addExternalTrainer(externalTrainer);
    }

    public static void showUserOutput(String userInput, Repository repository){
        switch (userInput){
            case "1" :
                createNewEmployee(repository);
                break;
            case "2" :
                addEmployeeTrainer(repository);
                break;
            case "3" :
                addExternTrainer(repository);
                break;
            case "4":
                displayEmployees(repository);
                break;
            case "5":
                displayEmployeeTrainers(repository);
                break;
            case "6":
                displayExternalTrainers(repository);
                break;
            default:
                System.out.println("Invalid option. Please try again !");
        }

    }

    private static void displayEmployees(Repository repository) {
        for (Employee employee : repository.getEmployeeList()) {
            System.out.println(employee.toString());
        }
    }
    private static void displayEmployeeTrainers(Repository repository) {
        for (EmployeeTrainer employee : repository.getEmployeeTrainerList()) {
            System.out.println(employee.toString());
        }
    }
    private static void displayExternalTrainers(Repository repository) {
        for (ExternalTrainer externalTrainer : repository.getExternalTrainerList()) {
            System.out.println(externalTrainer.toString());
        }
    }

    public static void main(String[] args) {
        Repository repository = new Repository();
        while(true) {
            printMenu();
            String userInput = getUserInput();
            if(userInput.equals("x")) {
                System.out.println("Exited successfully !");
                break;
            }
            showUserOutput(userInput, repository);
        }
    }
}
