package org.zyh.iclass.service;

import java.util.List;

import org.zyh.iclass.model.Role;

public interface IRoleService {
	public void add(Role role);
	public void delete(int id);
	public void update(Role role);
	public Role load(int id);
	public List<Role> listRole();
	public void deleteRoleUsers(int rid);
}
