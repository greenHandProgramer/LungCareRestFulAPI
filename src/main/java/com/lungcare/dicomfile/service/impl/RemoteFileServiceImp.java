package com.lungcare.dicomfile.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.lungcare.dicomfile.dao.IRemoteFileTransferDAO;
import com.lungcare.dicomfile.entity.ReceiveEntity;
import com.lungcare.dicomfile.service.IRemoteFileService;
import com.sun.jersey.multipart.FormDataMultiPart;

public class RemoteFileServiceImp implements IRemoteFileService {

	@Autowired
	private IRemoteFileTransferDAO remoteFileTransferDAO;

	public void uploadFile(FormDataMultiPart formParams,ReceiveEntity receiveEntity) {
		remoteFileTransferDAO.uploadFile(formParams, receiveEntity);
	}

	public byte[] downloadFile(HttpServletRequest req) {
		return remoteFileTransferDAO.downloadFile(req);
	}

	public ReceiveEntity getReceiveEntity(String id) {
		return remoteFileTransferDAO.getReceiveEntity(id);
	}

	public void test() {
		System.out.println("RemoteFileServiceImp test()");
		remoteFileTransferDAO.test();
	}

	public List<ReceiveEntity> GetAllReceiveEntity() {
		return remoteFileTransferDAO.GetAllReceiveEntity();
	}
}