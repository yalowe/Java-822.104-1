package Package;

import java.util.ArrayList;



// DAO = Data access object
public interface CompaniesDAO {
	

    void addCompany(Company company) throws Exception;
    
    void updateCompany(Company company) throws Exception;   
        
	ArrayList<Company> getAllCompanies() throws Exception;
    Company getOneCompany(int companyID) throws Exception;
    boolean isCompanyExists(String email, String password) throws Exception;

    void deleteCompany(int companyID) throws Exception;

}
