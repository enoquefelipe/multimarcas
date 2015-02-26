package com.multimarca.controller;

//import com.multimarcas.dao.EmpresaDAO;
//import com.multimarcas.model.Empresa;
//import com.multimarcas.model.Matriz;
//import java.util.ArrayList;
////import javax.annotation.ManagedBean;
//import java.util.List;
//
//import org.apache.log4j.Logger;

//@ManagedBean
public class EmpresaManagedBean {
//
//    private static Logger log = Logger.getLogger(EmpresaManagedBean.class);
//    private static final long serialVersionUID = 1L;
//    private String selectedCNPJ;
//    private Empresa empresa;
//    private List<Empresa> empresas;
//    private List<Matriz> matrizes;
//
//    public Empresa getEmpresa() {
//        return empresa;
//    }
//
//    public void setEmpresa(Empresa empresa) {
//        this.empresa = empresa;
//    }
//
//    public List<Empresa> getEmpresas() {
//        return empresas;
//    }
//
//    public void setEmpresas(List<Empresa> empresas) {
//        this.empresas = empresas;
//    }
//
//    public List<Matriz> getMatrizes() {
//        return matrizes;
//    }
//
//    public void setMatrizes(List<Matriz> matrizes) {
//        this.matrizes = matrizes;
//    }
//
//    private String getSelectedCNPJ() {
//        return selectedCNPJ;
//    }
//
//    private void setMsg(String message) { // TODO Auto-generated method stub
//    }
//
//    public void limparEmpresa() {
//        log.info("Limpando empresa");
//        this.empresa.setRazaoSocial("");
//        this.empresa.setCNPJ("");
//        this.empresa.setComplemento("");
//        this.empresa.setLogradouro("");
//        this.empresa.setMunicipio("");
//        this.empresa.setUf("");
//        this.empresa.setNumero(null);
//    }
//
//    public String editEmpresa() {
//        log.info("Editando empresa " + this.getSelectedCNPJ());
//        EmpresaDAO empresaDAO = new EmpresaDAO();
//        Empresa empresa = empresaDAO.getEmpresa(this.getSelectedCNPJ());
//        if (empresa != null) {
//            this.empresa.setCNPJ(empresa.getCNPJ());
//            this.empresa.setRazaoSocial(empresa.getRazaoSocial());
//            this.empresa.setMunicipio(empresa.getMunicipio());
//            this.empresa.setUf(empresa.getUf());
//            this.empresa.setLogradouro(empresa.getLogradouro());
//            this.empresa.setComplemento(empresa.getComplemento());
//            this.empresa.setNumero(empresa.getNumero());
//        } else {
//            this.setMsg("Empresa nao encontrada!");
//            log.error("Empresa nao encontrada!");
//        }
//        return "update";
//    }
//
//    public String createEmpresa() {
//        String str = "index";
//        try {
//            EmpresaDAO empresaDAO = new EmpresaDAO();
//            empresaDAO.createEmpresa(this.empresa);
//            limparEmpresa();
//            this.setMsg("Empresa cadastrada!");
//        } catch (Exception e) {
//            this.setMsg(e.getMessage());
//            str = "insert";
//            log.error(e);
//        }
//        return str;
//    }
//
//    public String deleteEmpresa() {
//        log.info("Excluindo empresa " + this.getSelectedCNPJ());
//        String str = "index";
//        try {
//            EmpresaDAO empresaDAO = new EmpresaDAO();
//            empresaDAO.deleteEmpresa(this.getSelectedCNPJ());
//            limparEmpresa();
//            this.setMsg("Excluído com sucesso!");
//        } catch (Exception e) {
//            this.setMsg(e.getMessage());
//            log.error(e);
//        }
//        return str;
//    }
//
//    public List<EmpresaManagedBean> getListaMatrizes() {
//        log.info("Listando matrizes");
//        List<EmpresaManagedBean> empresas = new ArrayList<EmpresaManagedBean>();
//        try {
//            EmpresaDAO empresaDAO = new EmpresaDAO();
//            for (Matriz matriz : empresaDAO.listMatrizes()) {
//                EmpresaManagedBean bean = new EmpresaManagedBean();
//                bean.setEmpresa(matriz);
//                empresas.add(bean);
//            }
//        } catch (Exception e) {
//            this.setMsg(e.getMessage());
//            log.error(e);
//        }
//        return empresas;
//    }
//
//    public List<EmpresaManagedBean> getListaEmpresas() {
//        limparEmpresa();
//        log.info("Listando empresa");
//        List<EmpresaManagedBean> empresas = new ArrayList<EmpresaManagedBean>();
//        try {
//            EmpresaDAO empresaDAO = new EmpresaDAO();
//            for (Empresa empresa : empresaDAO.listEmpresas()) {
//                EmpresaManagedBean bean = new EmpresaManagedBean();
//                bean.setEmpresa(empresa);
//                empresas.add(bean);
//            }
//        } catch (Exception e) {
//            this.setMsg(e.getMessage());
//            log.error(e);
//        }
//        return empresas;
//    }
//
//    public String updateEmpresa() {
//        String str = "index";
//        try {
//            EmpresaDAO empresaDAO = new EmpresaDAO();
//            empresaDAO.updateEmpresa(this.empresa);
//            limparEmpresa();
//            this.setMsg("Atualizado com sucesso!");
//        } catch (Exception e) {
//            this.setMsg(e.getMessage());
//            str = "deleteUpdate";
//            log.error(e);
//        }
//        return str;
//    }

}
