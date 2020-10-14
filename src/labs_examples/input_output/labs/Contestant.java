package labs_examples.input_output.labs;

public class Contestant {

    private String name;
    private int score;
    private String state;


    public Contestant() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setScore(int score) {
        this.score = score;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Contestant{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", state='" + state + '\'' +
                '}';
    }
}
