package com.lungcare.dicomfile.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.lungcare.dicomfile.entity.BmpPathEntity;
import com.sun.jersey.multipart.FormDataMultiPart;

public interface IRemoteFileService {
	public void uploadFile(FormDataMultiPart formParams,HttpServletRequest request, String cid);
	public void uploadSingleFile(FormDataMultiPart formParams,HttpServletRequest request, String cid);
	public void uploadLeakingData(FormDataMultiPart formParams,HttpServletRequest request, String cid);
	


	public void test();
		
	public List<BmpPathEntity> getAllBmpPath(String path);
	
	public void deleteCompleteData(String id);
	
	public void reHandlerSeg(String id);
	
	public String downloadDCM(String id);
	public String downloadSeg(String id);
	public String downloadCTmhd(String id);
	public String downloadLeakingData(String id);
}
