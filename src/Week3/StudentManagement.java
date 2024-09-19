package Week3;

public class StudentManagement {

  /**
   * Multiple lines of Javadoc text are written here, wrapped normally...
   */
  private Student[] students = new Student[100];
  private int studentCount = 0;

  /**
   * Multiple lines of Javadoc text are written here, wrapped normally...
   */
  public static boolean sameGroup(Student s1, Student s2) {
    return s1.getGroup().equals(s2.getGroup());
  }

  /**
   * Multiple lines of Javadoc text are written here, wrapped normally...
   */
  public void addStudent(Student newStudent) {
    if (studentCount < 100) {
      students[studentCount] = newStudent;
      studentCount++;
    }
  }

  /**
   * Multiple lines of Javadoc text are written here, wrapped normally...
   */
  public String studentsByGroup() {
    StringBuilder result = new StringBuilder();
    String lastGroup = "";

    for (int i = 0; i < studentCount; i++) {
      Student student = students[i];
      String group = student.getGroup();

      if (!group.equals(lastGroup)) {
        if (!lastGroup.isEmpty()) {
          //result.append("\n");
        }
        result.append(group).append("\n");
        lastGroup = group;
      }

      result.append(student.getInfo()).append("\n");
    }

    return result.toString().trim();
  }


  /**
   * Multiple lines of Javadoc text are written here, wrapped normally...
   */
  public void removeStudent(String id) {
    int indexToRemove = -1;

    for (int i = 0; i < studentCount; i++) {
      if (students[i].getId().equals(id)) {
        indexToRemove = i;
        break;
      }
    }

    if (indexToRemove != -1) {
      for (int i = indexToRemove; i < studentCount - 1; i++) {
        students[i] = students[i + 1];
      }
      students[studentCount - 1] = null;
      studentCount--;
    }
  }

  public static void main(String[] args) {
    // Tạo đối tượng StudentManagement
    StudentManagement sm = new StudentManagement();

    // Tạo các đối tượng Student với các nhóm lớp khác nhau
    Student s1 = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
    Student s2 = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
    Student s3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
    Student s4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");

    // Thay đổi nhóm lớp cho từng sinh viên
    s1.setGroup("K62CC");
    s2.setGroup("K62CC");
    s3.setGroup("K62CB");
    s4.setGroup("K62CB");

    // Thêm sinh viên vào StudentManagement
    sm.addStudent(s1);
    sm.addStudent(s2);
    sm.addStudent(s3);
    sm.addStudent(s4);

    // Hiển thị danh sách sinh viên theo nhóm lớp
    System.out.println("Danh sách sinh viên theo nhóm lớp:");
    System.out.println(sm.studentsByGroup());



  }



}
