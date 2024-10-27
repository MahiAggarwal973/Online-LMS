public class Course {
    private int id;
    private String title;
    private String description;
    private String syllabus;

    public Course(String title, String description, String syllabus) {
        this.title = title;
        this.description = description;
        this.syllabus = syllabus;
    }

    // Getters and setters

    public String getTitle() { return title; }
    public String getDescription() { return description; }
}