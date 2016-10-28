package main;

import managedbean.CustomerDestinationMB;
import managedbean.CustomerMB;
import managedbean.DelivererMB;
import managedbean.LoginMB;
import model.Customer;
import model.CustomerDestination;
import model.Deliverer;
import model.Login;
import model.LoginType;

public class MainTeste {
/*
 * https://github.com/pehls/Cursos-Target/blob/master/ExercicioHandsOn09/
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login lg = new Login("joao", "123");
		LoginType lgnTp = new LoginType("customer");
		Deliverer dlv = new Deliverer("mario", "85837471728", "5191888888", "mario@bol.com",
				true, true, false,false,
				false);
		Customer cstm = new Customer("Pedro", "91987438900", "5592999999", "pedro@bol.com");
		CustomerDestination cstmDstn = new CustomerDestination("91760389", "rua cavalhada, 271", "RS", "poa",
				"BR","brasil");
		lg.setLoginType(lgnTp);
		LoginMB lgMB = new LoginMB();
		lgMB.setLogin(lg);
		
		dlv.setLogin(lg);
		DelivererMB dlvMB = new DelivererMB();
		dlvMB.setDeliverer(dlv);
		dlvMB.adicionarDeliverers();
		
		cstm.setLogin(lg);
		CustomerMB cstmMB = new CustomerMB();
		cstmMB.setCustomer(cstm);
		cstmMB.adicionarCustomer();
		
		cstmDstn.setCustomer(cstm);
		CustomerDestinationMB cstmDstnMB = new CustomerDestinationMB();
		cstmDstnMB.setCustomer(cstmDstn);
		cstmDstnMB.adicionarCustomerDestination();
		
		System.out.println(lgMB.adicionarLogins());
	}

}
