package com.lee.collection.util;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class MyFileUpload
{

	public static String myUpload(MultipartFile file)
	{
		String path = MyPropertiesUtil.loadProperties("myUpload.properties", "windows");
		String name = "";
		String imgName = "";
		if (!file.isEmpty())
		{
			name = file.getOriginalFilename();
			if (!"".equals(name) && name != null)
			{
				imgName = MyDateUtil.getMyDateString() + "_" + name;
				try
				{
					file.transferTo(new File(path + "/" + imgName));
				} catch (IllegalStateException | IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		return imgName;
	}

}
