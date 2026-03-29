package collage.faculty;

public class faculty {
    String name;
    String subject;

    public faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void displayFaculty() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

