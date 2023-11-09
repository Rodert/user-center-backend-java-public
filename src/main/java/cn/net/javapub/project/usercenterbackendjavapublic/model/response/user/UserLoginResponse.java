package cn.net.javapub.project.usercenterbackendjavapublic.model.response.user;

public class UserLoginResponse{
	private String type;
	private String status;
	private String currentAuthority;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setCurrentAuthority(String currentAuthority){
		this.currentAuthority = currentAuthority;
	}

	public String getCurrentAuthority(){
		return currentAuthority;
	}

	@Override
 	public String toString(){
		return 
			"UserLoginResponse{" + 
			"type = '" + type + '\'' + 
			",status = '" + status + '\'' + 
			",currentAuthority = '" + currentAuthority + '\'' + 
			"}";
		}
}
