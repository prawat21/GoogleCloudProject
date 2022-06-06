package pojo;

public class Origin {
	private String name;
	private String version;
	private String namespace;
	private String node;
	private String pod;
	private String container;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public String getPod() {
		return pod;
	}

	public void setPod(String pod) {
		this.pod = pod;
	}

	public String getContainer() {
		return container;
	}

	public void setContainer(String container) {
		this.container = container;
	}

	@Override
	public String toString() {
		return "Origin [name=" + name + ", version=" + version + ", namespace=" + namespace + ", node=" + node
				+ ", pod=" + pod + ", container=" + container + "]";
	}
}
