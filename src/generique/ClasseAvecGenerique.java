package generique;

public class ClasseAvecGenerique<T> {
    private T varUserGeneric;

    public void ajoute(T el) {
        varUserGeneric = el;
    }

    public T renvoieGeneric() {
        return varUserGeneric;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ClasseAvecGenerique{");
        sb.append("varUserGeneric=").append(varUserGeneric);
        sb.append('}');
        return sb.toString();
    }
}
