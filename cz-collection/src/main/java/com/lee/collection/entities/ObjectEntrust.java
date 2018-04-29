package com.lee.collection.entities;

import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: ObjectEntrust
* @Description: TODO(封装Entrust用户state和id)
* @author Lee
* @date 2018年4月23日 下午10:04:21
*
*/
public class ObjectEntrust
{
	List<Entrust> listEntrust = new ArrayList<>();

	public List<Entrust> getListEntrust()
	{
		return listEntrust;
	}

	public void setListEntrust(List<Entrust> listEntrust)
	{
		this.listEntrust = listEntrust;
	}

}
