package com.board.mij.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.board.mij.domain.FileVO;
import com.board.mij.mapper.FileMapper;

@Service("com.board.mij.service.FileService")
public class FileService {

	@Resource(name = "com.board.mij.mapper.FileMapper")
	FileMapper mFileMapper;
	
	public List<FileVO> fileList(int boardId) throws Exception {
		return mFileMapper.fileList(boardId);
	}
	
	public int fileRegister(List<FileVO> fileList) throws Exception {
		return mFileMapper.fileRegister(fileList);
	}
	
	public FileVO fileDetail(int fileId) throws Exception {
		return mFileMapper.fileDetail(fileId);
	}

	public void fileDelete(List<FileVO> fileList) throws Exception {
		mFileMapper.fileDelete(fileList);
	}

	public List<String> imgFileList() throws Exception{
		return mFileMapper.imgFileList();
	}
	
}
