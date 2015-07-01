package com.lungcare.dicomfile.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.lungcare.dicomfile.entity.ReceiveEntity;
import com.sun.jersey.multipart.FormDataMultiPart;

public interface IRemoteFileTransferDAO {
	public void uploadFile(FormDataMultiPart formParams,
			ReceiveEntity receiveEntity);

	public byte[] downloadFile(HttpServletRequest req);

	public ReceiveEntity getReceiveEntity(String id);

	public boolean addReceiveEntity(ReceiveEntity receiveEntity);

	public boolean updateReceiveEntity(ReceiveEntity receiveEntity,
			int receivedNum);

	public void test();

	public List<ReceiveEntity> GetAllReceiveEntity();
}