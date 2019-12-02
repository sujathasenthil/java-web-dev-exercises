package src.org.launchcode.java.demos.lsn3classes1;

import exercises.ArrayPractice;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<org.launchcode.java.demos.lsn3classes1.Student> enrolledStudents;
    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
      //  if (o == null || getClass() != o.getClass()) return false;

        if (!(o instanceof Course)) return false;Course course = (Course) o;
        return topic.equals(course.topic) &&
                instructor.equals(course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor);
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.


}