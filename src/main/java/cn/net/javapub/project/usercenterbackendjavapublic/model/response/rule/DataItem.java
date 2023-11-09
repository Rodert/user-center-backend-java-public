package cn.net.javapub.project.usercenterbackendjavapublic.model.response.rule;

public class DataItem{
	private String owner;
	private String createdAt;
	private int callNo;
	private String name;
	private int progress;
	private boolean disabled;
	private String href;
	private String avatar;
	private int key;
	private String desc;
	private int status;
	private String updatedAt;

	public void setOwner(String owner){
		this.owner = owner;
	}

	public String getOwner(){
		return owner;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setCallNo(int callNo){
		this.callNo = callNo;
	}

	public int getCallNo(){
		return callNo;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setProgress(int progress){
		this.progress = progress;
	}

	public int getProgress(){
		return progress;
	}

	public void setDisabled(boolean disabled){
		this.disabled = disabled;
	}

	public boolean isDisabled(){
		return disabled;
	}

	public void setHref(String href){
		this.href = href;
	}

	public String getHref(){
		return href;
	}

	public void setAvatar(String avatar){
		this.avatar = avatar;
	}

	public String getAvatar(){
		return avatar;
	}

	public void setKey(int key){
		this.key = key;
	}

	public int getKey(){
		return key;
	}

	public void setDesc(String desc){
		this.desc = desc;
	}

	public String getDesc(){
		return desc;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"owner = '" + owner + '\'' + 
			",createdAt = '" + createdAt + '\'' + 
			",callNo = '" + callNo + '\'' + 
			",name = '" + name + '\'' + 
			",progress = '" + progress + '\'' + 
			",disabled = '" + disabled + '\'' + 
			",href = '" + href + '\'' + 
			",avatar = '" + avatar + '\'' + 
			",key = '" + key + '\'' + 
			",desc = '" + desc + '\'' + 
			",status = '" + status + '\'' + 
			",updatedAt = '" + updatedAt + '\'' + 
			"}";
		}
}
