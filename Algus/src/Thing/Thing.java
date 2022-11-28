package Thing;

import java.util.Objects;

public class Thing {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return i == thing.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }

    @Override
    public String toString() {
        return "Thing{" +
                "i=" + i +
                '}';
    }

    private int i;

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public Thing(int i) {

        this.i = i;
    }
}
