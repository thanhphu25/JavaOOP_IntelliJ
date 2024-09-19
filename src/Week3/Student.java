package Week3;

public class Student {
  /**
   * Multiple lines of Javadoc text are written here, wrapped normally...
   */

  private String name;
  private String id;
  private String group;
  private String email;

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public String getGroup() {
    return group;
  }

  public String getEmail() {
    return email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Multiple lines of Javadoc text are written here, wrapped normally...
   */
  String getInfo() {
    return name + " - " + id + " - " + group + " - " + email;
  }

  /**
   * Multiple lines of Javadoc text are written here, wrapped normally...
   */
  public Student() {
    this.name = "Student";
    this.id = "000";
    this.group = "K62CB";
    this.email = "uet@vnu.edu.vn";
  }

  /**
   * Multiple lines of Javadoc text are written here, wrapped normally...
   */
  public Student(String name, String id, String email) {
    this.name = name;
    this.id = id;
    this.email = email;
    this.group = "K62CB";
  }

  /**
   * Multiple lines of Javadoc text are written here, wrapped normally...
   */
  public Student(Student s) {
    this.name = s.getName();
    this.id = s.getId();
    this.group = s.getGroup();
    this.email = s.getEmail();
  }
}