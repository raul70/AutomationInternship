package com.elena.FinalProject;

import java.util.*;

//List
public class Manager {
    public int getNumberOfTrainings(List<Training> trainingList, int minimumNumberOfParticipants){
        int numberOfTrainings = 0;
        for(Training training : trainingList){
            if(training.getNrOfParticipants() >= minimumNumberOfParticipants){

                numberOfTrainings++;
            }
        }   return  numberOfTrainings;
    }

    public List<Training> getTrainingWithMaxDuration(List<Training> trainingList){
        int max = 0;
        List<Training> trainingsWhitMaxNrOfHours = new ArrayList<>();
        for(Training training : trainingList){
            List<Course> courseList = training.getCourses();
            int totalNumberOfHours = 0;
            for(Course course :  courseList){
                int numberOfHours = course.getHoursDuration();
                totalNumberOfHours+=numberOfHours;

            }

            if(totalNumberOfHours > max){
                max = totalNumberOfHours;
                trainingsWhitMaxNrOfHours =  new ArrayList<>();
                trainingsWhitMaxNrOfHours.add(training);
            }
            else if (totalNumberOfHours == max){
                trainingsWhitMaxNrOfHours.add(training);
            }

        }
        return trainingsWhitMaxNrOfHours;

    }


    //Map exercises
    public Map<Employee, Integer>  getNumberOfTrainingGroup(List<TrainingGroup> trainingGroupList, List<Employee> employeeList){
        Map<Employee, Integer> employeeIntegerMap = new HashMap<>();
        for(TrainingGroup trainingGroup : trainingGroupList){
            List<Employee> employeeList1 = trainingGroup.getEmployeeList();
            for(Employee employee : employeeList1){
                employeeIntegerMap.put(employee, 1);

            }
        }

        for(Employee employee : employeeList){
            if(!employeeIntegerMap.containsKey(employee)){
                employeeIntegerMap.put(employee, 0);
            }
        }
        return employeeIntegerMap;
    }


    public List<Training> getTrainings(List<Training> trainingList, int minCourseList){
        List<Training> trainings = new ArrayList<>();
        for(Training training : trainingList){
            List<Course> courseList = training.getCourses();
            if(courseList.size() > minCourseList) {
                trainings.add(training);
            }
        } return trainings;
    }

    //Map Exercises

    public Map<Location, Integer> getNrOfEmployee(List<Employee> employeeList){
        Map<Location, Integer> resultMap = new HashMap<>();
        for(Employee employee : employeeList){
            Location location = employee.getWorkLocation();
            if(resultMap.containsKey(location)){
                int employeeNumber = resultMap.get(location);
                 resultMap.get(location);
                 employeeNumber++;
                 resultMap.put(location, employeeNumber);
            }else{
                resultMap.put(location, 1);
            }
        }
        return resultMap;
    }



  //Map exercises
      public Set<Trainer> getTrainersList(List<TrainingGroup> trainingGroupList, String code) {
      Set<Trainer> trainerSet = new HashSet<>();
      for(TrainingGroup trainingGroup : trainingGroupList){
          Training training = trainingGroup.getTraining();
          if(training.getCode().equals(code)){
             Trainer trainer = trainingGroup.getTrainer();

              trainerSet.add(trainer);
          }
      }
      return trainerSet;

}


    //Map exercises
    public Map<Training, Integer> getTrainingDuration(List<Training> trainingList){
        Map<Training, Integer> trainingIntegerMap = new HashMap<>();
        for(Training training : trainingList){
            List<Course> courses = training.getCourses();
            int numberOfHours = 0;
            for(Course course : courses){
                numberOfHours += course.getHoursDuration();

            }
            trainingIntegerMap.put(training, numberOfHours);

        }
        return trainingIntegerMap;
    }


    public List<Training> getTrainingListForAnEmployee(List<TrainingGroup> trainingGroupList, int employeeId){
        List<Training> trainingList = new ArrayList<>();
        for(TrainingGroup trainingGroup : trainingGroupList){
            List<Employee> employess =  trainingGroup.getEmployeeList();
            for(Employee employee : employess){
                if(employee.getId() == employeeId){
                    Training training = trainingGroup.getTraining();
                    trainingList.add(training);

                }
            }
        }
        return trainingList;
    }

    public Set<Trainer> getTrainingListForTrainer(List<TrainingGroup> trainingGroupList, Training training){
        Set<Trainer> trainerSet = new HashSet<>();
        for(TrainingGroup trainingGroup : trainingGroupList){
            Training training1 = trainingGroup.getTraining();
            if(training.equals(training1)){
                Trainer trainer = trainingGroup.getTrainer();
                trainerSet.add(trainer);
            }
        }
     return trainerSet;
    }


    public int getEmployees(List<TrainingGroup> trainingGroupList, List<Employee> employeeList){
        int employeeNumber = 0;

        for(Employee employee : employeeList){
            boolean hasTrainings = false;
            for(TrainingGroup trainingGroup : trainingGroupList){
                List<Employee> employeeList1 = trainingGroup.getEmployeeList();
                if(employeeList1.contains(employee)){
                    hasTrainings = true;
                }

            }
          if(hasTrainings==false){
              employeeNumber++;
          }
        }
        return employeeNumber;
    }


  }

