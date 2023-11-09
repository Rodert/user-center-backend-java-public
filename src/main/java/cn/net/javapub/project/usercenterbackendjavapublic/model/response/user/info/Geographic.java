package cn.net.javapub.project.usercenterbackendjavapublic.model.response.user.info;

public class Geographic{
	private Province province;
	private City city;

	public void setProvince(Province province){
		this.province = province;
	}

	public Province getProvince(){
		return province;
	}

	public void setCity(City city){
		this.city = city;
	}

	public City getCity(){
		return city;
	}

	@Override
 	public String toString(){
		return 
			"Geographic{" + 
			"province = '" + province + '\'' + 
			",city = '" + city + '\'' + 
			"}";
		}
}
