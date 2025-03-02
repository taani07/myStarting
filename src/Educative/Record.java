package Educative;

public class Record implements Comparable<Record>{
    int inputId;
    String category ;
    double value;

    public Record(int inputId, String category , double value)
    {
        this.inputId = inputId;
        this.category = category;
        this.value = value;
    }


    @Override
    public int compareTo(Record o) {
        return Integer.compare(this.inputId, o.inputId);
    }

    @Override
    public String toString()
    {
        return inputId + " " +category + " "+value+" "+"APPROVED";  
    }
}
