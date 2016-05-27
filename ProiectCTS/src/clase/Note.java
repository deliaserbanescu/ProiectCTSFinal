package clase;

public enum Note {
	Materia1(5),Materia2(5),Materia3(5);
    private final int nota;

    private Note(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }
}
