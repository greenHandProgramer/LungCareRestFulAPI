package com.lungcare.dicomfile.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.lungcare.dicomfile.entity.BmpPathEntity;
import com.lungcare.dicomfile.entity.ReceiveEntity;
import com.lungcare.dicomfile.entity.SendEntity;
import com.sun.jersey.multipart.FormDataMultiPart;

public interface IRemoteFileService {
	public void uploadFile(FormDataMultiPart formParams,HttpServletRequest request, String cid);

	public byte[] downloadFile(HttpServletRequest req);

	public ReceiveEntity getReceiveEntity(String id);

	public void test();

	public List<ReceiveEntity> getAllReceiveEntity();
		
	public List<SendEntity> getAllSendEntity();
	
	public List<BmpPathEntity> getAllBmpPath(String id);
}
