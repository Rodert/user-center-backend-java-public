package cn.net.javapub.project.usercenterbackendjavapublic.model.request.user;

public class UserLoginRequest{
	private String password;
	private String type;
	private boolean autoLogin;
	private String username;

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setAutoLogin(boolean autoLogin){
		this.autoLogin = autoLogin;
	}

	public boolean isAutoLogin(){
		return autoLogin;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"UserLoginRequest{" + 
			"password = '" + password + '\'' + 
			",type = '" + type + '\'' + 
			",autoLogin = '" + autoLogin + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}
