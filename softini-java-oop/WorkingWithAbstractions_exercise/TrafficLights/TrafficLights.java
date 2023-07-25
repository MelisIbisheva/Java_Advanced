package WorkingWithAbstractions_exercise.TrafficLights;

public class TrafficLights {

    private Color currentColor;

    public TrafficLights(Color currentColor){
        this.currentColor = currentColor;
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public void changeColor(){
        switch (currentColor){
            case RED:
                this.currentColor = Color.GREEN;
                break;
            case GREEN:
                this.currentColor = Color.YELLOW;
                break;
            case YELLOW:
                this.currentColor = Color.RED;
        }
    }
}
