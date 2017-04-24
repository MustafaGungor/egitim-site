package com.mebitech.samples.quickstart.web.cli;

import com.mebitech.robe.security.api.domain.PermissionType;
import com.mebitech.robe.security.db.domain.Menu;
import com.mebitech.robe.security.db.domain.Permission;
import com.mebitech.robe.security.db.domain.RoleGroup;
import com.mebitech.robe.security.db.domain.User;
import com.mebitech.robe.security.db.repository.RobeMenuRepository;
import com.mebitech.robe.security.db.repository.RobePermissionRepository;
import com.mebitech.robe.security.db.repository.RobeRoleGroupRepository;
import com.mebitech.robe.security.db.repository.RobeUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitialCommand {

    @Autowired
    private RobeUserRepository robeUserRepository;

    @Autowired
    private RobeRoleGroupRepository robeRoleGroupRepository;

    @Autowired
    private RobeMenuRepository robeMenuRepository;

    @Autowired
    private RobePermissionRepository permissionRepository;

    public void run() {

        RoleGroup roleGroup = new RoleGroup();
        roleGroup.setName("Admin");
        roleGroup.setCode("ADMIN");
        robeRoleGroupRepository.save(roleGroup);
        User user = new User();
        user.setUsername("admin");
        user.setPassword("96cae35ce8a9b0244178bf28e4966c2ce1b8385723a96a6b838858cdd6ca0a1e");
        user.setActive(true);
        user.setRoleGroup(roleGroup);
        robeUserRepository.save(user);

        Menu managerMenu = new Menu();
        managerMenu.setText("Manager");
        managerMenu.setPath("Manager");
        managerMenu.setModule("Manager");
        managerMenu.setIcon("fa-cogs");

        robeMenuRepository.save(managerMenu);

        Menu userMenu = new Menu();
        userMenu.setText("Users");
        userMenu.setPath("manager/user/User");
        userMenu.setModule("User");
        userMenu.setIcon("fa-users");
        userMenu.setParent(managerMenu);

        robeMenuRepository.save(userMenu);

        Menu documentMenu = new Menu();
        documentMenu.setText("Role");
        documentMenu.setPath("manager/role/Role");
        documentMenu.setModule("Roles");
        documentMenu.setIcon("fa-file-text-o");
        documentMenu.setParent(managerMenu);

        robeMenuRepository.save(documentMenu);

        Menu taskMenu = new Menu();
        taskMenu.setText("Menu");
        taskMenu.setPath("manager/menu/Menu");
        taskMenu.setModule("Menu");
        taskMenu.setIcon("fa-tasks");
        taskMenu.setParent(managerMenu);

        robeMenuRepository.save(taskMenu);

        Menu siteMenu = new Menu();
        siteMenu.setText("Site");
        siteMenu.setPath("Site");
        siteMenu.setModule("Site");
        siteMenu.setIcon("fa-cogs");

        robeMenuRepository.save(siteMenu);

        Menu todoMenu = new Menu();
        todoMenu.setText("Todo");
        todoMenu.setPath("app/Application");
        todoMenu.setModule("Todo");
        todoMenu.setIcon("fa-list-alt");
        todoMenu.setParent(siteMenu);

        robeMenuRepository.save(todoMenu);

        /**
         * add manager module permission to admin role
         */
        Permission permissionManager = new Permission();
        permissionManager.setPermissionType(PermissionType.MENU);
        permissionManager.setMenu(managerMenu);
        permissionManager.setRoleGroup(roleGroup);

        permissionRepository.save(permissionManager);

        Permission permissionSite = new Permission();
        permissionSite.setPermissionType(PermissionType.MENU);
        permissionSite.setMenu(siteMenu);
        permissionSite.setRoleGroup(roleGroup);

        permissionRepository.save(permissionSite);

        Permission rolePermission = new Permission();
        rolePermission.setPath("rolePermission");
        rolePermission.setRoleGroup(roleGroup);
        rolePermission.setPermissionType(PermissionType.REST);

        permissionRepository.save(rolePermission);

        Permission menuPermission = new Permission();
        menuPermission.setPath("menuPermission");
        menuPermission.setRoleGroup(roleGroup);
        menuPermission.setPermissionType(PermissionType.REST);

        permissionRepository.save(menuPermission);

        Permission userPermission = new Permission();
        userPermission.setPath("userPermission");
        userPermission.setRoleGroup(roleGroup);
        userPermission.setPermissionType(PermissionType.REST);

        permissionRepository.save(userPermission);

        Permission permissionController = new Permission();
        permissionController.setPath("permissionController");
        permissionController.setRoleGroup(roleGroup);
        permissionController.setPermissionType(PermissionType.REST);

        permissionRepository.save(permissionController);

    }
}
