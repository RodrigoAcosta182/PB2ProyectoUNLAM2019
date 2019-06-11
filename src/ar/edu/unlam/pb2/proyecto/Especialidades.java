package ar.edu.unlam.pb2.proyecto;

public class Especialidades {
	/*Armar lista con especialidades*/
	
	private String Esp;
	private Integer nro_esp;
	
	public Especialidades (String Esp, Integer nro_esp) {
		this.Esp = Esp;
		this.nro_esp = nro_esp;
	}

	

	public String getEspecilidad() {
		return Esp;
	}

	public void setEspecilidad(String especilidad) {
		Esp = especilidad;
	}

	public Integer getNro_esp() {
		return nro_esp;
	}

	public void setNro_esp(Integer nro_esp) {
		this.nro_esp = nro_esp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nro_esp == null) ? 0 : nro_esp.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Especialidades other = (Especialidades) obj;
		if (nro_esp == null) {
			if (other.nro_esp != null)
				return false;
		} else if (!nro_esp.equals(other.nro_esp))
			return false;
		return true;
	}
}
