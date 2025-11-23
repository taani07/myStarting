package Educative;

public class SourceAndDestination implements Comparable<SourceAndDestination> {
    String source;
    String destination;
    String airline;
    int cost;

    public SourceAndDestination(String source, String destination, String airline, int cost) {
          this.cost= cost;
          this.source=source;
          this.destination =destination;
          this.airline = airline;
    }


    @Override
    public int compareTo(SourceAndDestination o) {
        return Integer.compare(this.cost, o.cost);
    }

    @Override
    public String toString() {
        return "'route':"+source+"->"+destination+"->"+"method :"+airline+"cost:"+cost;
    }

}
