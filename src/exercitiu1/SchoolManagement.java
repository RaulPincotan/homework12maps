package exercitiu1;

import java.util.*;

public class SchoolManagement {

    private final List<Student> students =new ArrayList<>();

    public SchoolManagement(Collection<Student>students) {
        if(students!=null){
            this.students.addAll(students);
        }
    }


    public Map<String, Integer> mapStudentToGrade() {
        Map<String, Integer> result = new HashMap<>();

        for (Student student : students) {
            result.put(student.getName(), student.getGrade());

        }
        return result;
    }


  public Student getWorstGrade(){
        int min=minGrade();

        for(Student student:students){
            if (student.getGrade()==min){
                return student;
            }
        }
        return null;

  }
  private int minGrade(){
      int min=Integer.MAX_VALUE;

      for(Student student:students){
          if (student.getGrade()<min){
              min=student.getGrade();
          }
      }
      return min;

  }

  public Student getMaxGrade(){
        int max=findMaxGrade();
        for(Student student:students){
            if(student.getGrade()==max){
                return student;
            }
        }
        return null;
  }

  private int findMaxGrade(){
        int max=Integer.MIN_VALUE;

        for(Student student:students){
            if (student.getGrade()>max){
                max=student.getGrade();
            }
        }
        return max;
    }
}
