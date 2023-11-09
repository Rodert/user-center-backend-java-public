package cn.net.javapub.project.usercenterbackendjavapublic.model.response.rule;

import java.util.List;

public class RuleListResponse{
	private int total;
	private int current;
	private List<DataItem> data;
	private boolean success;
	private String pageSize;

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setCurrent(int current){
		this.current = current;
	}

	public int getCurrent(){
		return current;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setSuccess(boolean success){
		this.success = success;
	}

	public boolean isSuccess(){
		return success;
	}

	public void setPageSize(String pageSize){
		this.pageSize = pageSize;
	}

	public String getPageSize(){
		return pageSize;
	}

	@Override
 	public String toString(){
		return 
			"RuleListResponse{" + 
			"total = '" + total + '\'' + 
			",current = '" + current + '\'' + 
			",data = '" + data + '\'' + 
			",success = '" + success + '\'' + 
			",pageSize = '" + pageSize + '\'' + 
			"}";
		}
}