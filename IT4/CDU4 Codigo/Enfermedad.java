public class Enfermedad {

	private int temporalidad;
	private boolean confinamiento;
	private Medicina[] medicinas;
	private Vacuna[] vacunas;
	private Sintoma[] sintomas;
	private String nombre;

	/**
	 * 
	 * @param datos
	 */
	public int crearEnfermedad(ArrayList<String> datos) {
		// TODO - implement Enfermedad.crearEnfermedad
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param s
	 * @param v
	 * @param m
	 */
	public Enfermedades[] cargarEnfermedades(Sintoma[] s, Vacuna[] v, Medicina[] m) {
		// TODO - implement Enfermedad.cargarEnfermedades
		throw new UnsupportedOperationException();
	}

	public int actualizarEnfermedad() {
		// TODO - implement Enfermedad.actualizarEnfermedad
		throw new UnsupportedOperationException();
	}

	public int borrarEnfermedad() {
		// TODO - implement Enfermedad.borrarEnfermedad
		throw new UnsupportedOperationException();
	}

	public int[][] consultarEnfermedadesYPersonas() {
		// TODO - implement Enfermedad.consultarEnfermedadesYPersonas
		throw new UnsupportedOperationException();
	}

	public int consultarNEnfermedades() {
		// TODO - implement Enfermedad.consultarNEnfermedades
		throw new UnsupportedOperationException();
	}

	public Enfermedad[] consultarEnfermedades() {
		// TODO - implement Enfermedad.consultarEnfermedades
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param e
	 */
	public Contagiado[] consultarEvolucion(Enfermedad e) {
		// TODO - implement Enfermedad.consultarEvolucion
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param e
	 */
	public Contagiado[] consultarEstimacion(Enfermedad e) {
		// TODO - implement Enfermedad.consultarEstimacion
		throw new UnsupportedOperationException();
	}

}