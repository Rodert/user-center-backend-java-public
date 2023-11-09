package cn.net.javapub.project.usercenterbackendjavapublic.model.response.user.info;

import java.util.List;

public class Data{
	private String country;
	private String access;
	private String address;
	private String signature;
	private int unreadCount;
	private String avatar;
	private String title;
	private String userid;
	private List<TagsItem> tags;
	private int notifyCount;
	private Geographic geographic;
	private String phone;
	private String name;
	private String email;
	private String group;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setAccess(String access){
		this.access = access;
	}

	public String getAccess(){
		return access;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setSignature(String signature){
		this.signature = signature;
	}

	public String getSignature(){
		return signature;
	}

	public void setUnreadCount(int unreadCount){
		this.unreadCount = unreadCount;
	}

	public int getUnreadCount(){
		return unreadCount;
	}

	public void setAvatar(String avatar){
		this.avatar = avatar;
	}

	public String getAvatar(){
		return avatar;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUserid(String userid){
		this.userid = userid;
	}

	public String getUserid(){
		return userid;
	}

	public void setTags(List<TagsItem> tags){
		this.tags = tags;
	}

	public List<TagsItem> getTags(){
		return tags;
	}

	public void setNotifyCount(int notifyCount){
		this.notifyCount = notifyCount;
	}

	public int getNotifyCount(){
		return notifyCount;
	}

	public void setGeographic(Geographic geographic){
		this.geographic = geographic;
	}

	public Geographic getGeographic(){
		return geographic;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setGroup(String group){
		this.group = group;
	}

	public String getGroup(){
		return group;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"country = '" + country + '\'' + 
			",access = '" + access + '\'' + 
			",address = '" + address + '\'' + 
			",signature = '" + signature + '\'' + 
			",unreadCount = '" + unreadCount + '\'' + 
			",avatar = '" + avatar + '\'' + 
			",title = '" + title + '\'' + 
			",userid = '" + userid + '\'' + 
			",tags = '" + tags + '\'' + 
			",notifyCount = '" + notifyCount + '\'' + 
			",geographic = '" + geographic + '\'' + 
			",phone = '" + phone + '\'' + 
			",name = '" + name + '\'' + 
			",email = '" + email + '\'' + 
			",group = '" + group + '\'' + 
			"}";
		}
}