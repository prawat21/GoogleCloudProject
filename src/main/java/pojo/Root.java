package pojo;

public class Root {
	private String _activityId;
	private String _id;
	private String _version;
	private int _timestamp;
	public Resource resource;
	public Origin _origin;

	public String get_activityId() {
		return _activityId;
	}

	public void set_activityId(String _activityId) {
		this._activityId = _activityId;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String get_version() {
		return _version;
	}

	public void set_version(String _version) {
		this._version = _version;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public Origin get_origin() {
		return _origin;
	}

	public void set_origin(Origin _origin) {
		this._origin = _origin;
	}

	public int get_timestamp() {
		return _timestamp;
	}

	public void set_timestamp(int _timestamp) {
		this._timestamp = _timestamp;
	}

	@Override
	public String toString() {
		return "Root [_activityId=" + _activityId + ", _id=" + _id + ", _version=" + _version + ", _timestamp="
				+ _timestamp + ", resource=" + resource + ", _origin=" + _origin + "]";
	}

}
