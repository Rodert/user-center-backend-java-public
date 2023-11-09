package cn.net.javapub.project.usercenterbackendjavapublic.model.response.user.info;

public class City{
	private String label;
	private String key;

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}

	@Override
 	public String toString(){
		return 
			"City{" + 
			"label = '" + label + '\'' + 
			",key = '" + key + '\'' + 
			"}";
		}
}
