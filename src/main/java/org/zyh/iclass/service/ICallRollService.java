package org.zyh.iclass.service;

import java.util.List;

import org.zyh.iclass.model.CallRoll;
import org.zyh.iclass.model.Pager;

public interface ICallRollService {

	public void addCallRoll(CallRoll callRoll);
	public void deleteCallRoll(int id);
	public void updateCallRoll(CallRoll callRoll);
	public CallRoll loadCallRoll(int id);
	public CallRoll loadByStudentId(int studentId);
	public List<CallRoll> listCallRoll();
	public List<CallRoll> listByCourseIdAndSectionId(int courseId,int section);
	public Pager<CallRoll> findByCourseIdAndSectionId(int courseId,int sectionId,int curPage,int pageSize);
}
