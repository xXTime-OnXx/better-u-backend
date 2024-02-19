package ch.better.u.domain.aggregate;

public class Improvement {
    private String id;
    private String name;
    private int points;
    private boolean done;

    public Improvement(String id, String name, int points, boolean done) {
        this.id = id;
        this.name = name;
        this.points = points;
        this.done = done;
    }

    public Improvement() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public boolean isDone() {
        return done;
    }

    // to make object printing readable (not used in this example)
    @Override
    public String toString() {
        return "Improvement{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", points=" + points +
                ", done=" + done +
                '}';
    }


}
