/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp.ImpSV_Huy;

import java.util.ArrayList;
import java.util.List;
import models.model_Huy.Users;
import repositorys.imp.Imp_Huy.UsersReposytory;
import viewmodel.ViewModel_Huy.UsersViewmodel;
import repositorys.IRepo_Huy.IUsersReposytory;
import services.ISV_Huy.IUsersService;

/**
 *
 * @author hungh
 */
public class UsersService implements IUsersService {

    List<UsersViewmodel> lstuser;
    private IUsersReposytory usersReposytory;

    public UsersService() {
        lstuser = new ArrayList<>();
        usersReposytory = new UsersReposytory();
    }

    @Override
    public List<UsersViewmodel> getAllNhanVien() {
        lstuser = new ArrayList<>();
        for (Users us : usersReposytory.getAllNhanVien()) {
            lstuser.add(new UsersViewmodel(us.getTen(), us.getNgaysinh(), us.getGioitinh(), us.getSdt(), us.getChucVu(), us.getTT()));
        }
        return lstuser;
    }

    @Override
    public boolean add(UsersViewmodel nv) {
        boolean isAdd = usersReposytory.add(new Users(nv.getTen(), nv.getNgaysinh(), nv.getGioitinh(), nv.getSdt(), nv.getChucVu(), nv.getTT()));
        return isAdd;
    }

    @Override
    public boolean update(UsersViewmodel us, String id) {
        return usersReposytory.update(new Users(us.getTen(), us.getNgaysinh(), us.getGioitinh(), us.getSdt(), us.getChucVu(), us.getTT()), id);
    }

    @Override
    public boolean delete(String id) {
        return usersReposytory.delete(id);
    }

    @Override
    public List<UsersViewmodel> SearchNVV(String Ten) {
        lstuser = new ArrayList<>();
        for (Users us : usersReposytory.SearchNVV(Ten)) {
            lstuser.add(new UsersViewmodel(us.getTen(), us.getNgaysinh(), us.getGioitinh(), us.getSdt(), us.getChucVu(), us.getTT()));
        }
        return lstuser;
    }

}
