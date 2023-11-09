package cn.net.javapub.project.usercenterbackendjavapublic.model.response.user;

public class OutLoginResponse{
	private Data data;
	private boolean success;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setSuccess(boolean success){
		this.success = success;
	}

	public boolean isSuccess(){
		return success;
	}

	@Override
 	public String toString(){
		return 
			"OutLoginResponse{" + 
			"data = '" + data + '\'' + 
			",success = '" + success + '\'' + 
			"}";
		}
}
