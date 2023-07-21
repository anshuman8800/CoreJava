import java.util.List;

public interface ISaveable {
    abstract List<String> write();

    abstract void read(List<String> list);
}
