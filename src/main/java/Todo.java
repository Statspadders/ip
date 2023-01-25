public class Todo extends Task {

    public Todo(String value,boolean mark) {
        super(value,mark);
    }

    public String toFile() {
        return "todo," + super.isMark() + "," + super.getValue();
    }
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
