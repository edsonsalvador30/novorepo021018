package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Novo {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// novo
	public static Var faz() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("teste").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

}
