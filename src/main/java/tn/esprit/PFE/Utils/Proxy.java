/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.PFE.Utils;

import iservice.AdminFacadeRemote;
import iservice.AutheticatorInterfaceRemote;
import iservice.EmployeeFacadeRemote;
import iservice.SchoolFacadeRemote;
import tn.esprit.PFE.Utils.Cache.ContextCache;

/**
 *
 * @author Tryvl
 */
public class Proxy {
    String jndiAdmin ="PFE-ejb/AdminFacade!iservice.AdminFacadeRemote";
    String  jndiSchool="PFE-ejb/SchoolFacade!iservice.SchoolFacadeRemote";
    String jndiEmploye ="PFE-ear/PFE-ejb/SchoolFacade!iservice.SchoolFacadeRemote";
    String jndiAuthent ="PFE-ear/PFE-ejb/AutheticatorService!iservice.AutheticatorInterfaceRemote";

    public Proxy() {
    }
    
    
    
    public AdminFacadeRemote getAdminProxy()
    {
        return (AdminFacadeRemote) ContextCache
                .getInstance()
                .getProxy(jndiAdmin);
    }
    
    public SchoolFacadeRemote getSchoolProxy()
    {
        return (SchoolFacadeRemote) ContextCache
                .getInstance()
                .getProxy(jndiSchool);
    }
    
    public EmployeeFacadeRemote getEmployeeProxy()
    {
        return (EmployeeFacadeRemote) ContextCache
                .getInstance()
                .getProxy(jndiEmploye);
    }
    
   public AutheticatorInterfaceRemote getAuthenticated()
   {
       return (AutheticatorInterfaceRemote) ContextCache
                .getInstance()
                .getProxy(jndiAuthent);
   }
    
}
