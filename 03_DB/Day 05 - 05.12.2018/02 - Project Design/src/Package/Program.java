
package Package;

import java.sql.SQLException;

public class Program {

    public static void buildDB() throws SQLException {
        CreateDB.buildCompaniesDB();
    }

    public static void resetDB() throws SQLException {

        ResetDB.resetCompaniesTable();
        ResetDB.resetCustomersTable();
        ResetDB.resetCouponsTable();
        ResetDB.resetJoinTable();
    }

    public static void main(String[] args) {

        try {

            //buildDB();

            CompaniesDBDAO companiesDBDAO = new CompaniesDBDAO();

            Company company = new Company();
            company.setName("JohnBryce");
            company.setEmail("johnBryce@gmail.com");
            company.setPassword("abcd");

            companiesDBDAO.addCompany(company);

            System.out.println("Company ID: " + company.getId());

        } catch (Exception ex) {

            System.out.println("Error: " + ex.getMessage());
        }

    }

}
