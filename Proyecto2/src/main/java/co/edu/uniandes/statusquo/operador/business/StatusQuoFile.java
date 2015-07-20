package co.edu.uniandes.statusquo.operador.business;

public class StatusQuoFile {
	
	private String id;
	
	private String simpleName;
	
	private String fullName;
	
	private String path;
	
	private int size;
	
	private String type;
	
	private int version;
	
	public StatusQuoFile(){
		super();
	}

	public StatusQuoFile(String id, String simpleName, String fullName,
			String path, int size, String type, int version) {
		super();
		this.id = id;
		this.simpleName = simpleName;
		this.fullName = fullName;
		this.path = path;
		this.size = size;
		this.type = type;
		this.version = version;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSimpleName() {
		return simpleName;
	}

	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		StatusQuoFile other = (StatusQuoFile) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StatusQuoFile [id=" + id + ", fullName=" + fullName + "]";
	}

	
}
