package client.remote;

import server.remote.IServer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServiceLocator {

  private IServer server;

  public RMIServiceLocator() {
    this.server = null;
  }

  public void setService(String [] args) {

		try {

			Registry registry = LocateRegistry.getRegistry(((Integer.valueOf(args[1]))));
			String name = "//" + args[0] + ":" + args[1] + "/" + args[2];
			this.server = (IServer) registry.lookup(name);
			System.out.println("* Message coming from the server: '" + this.server.sayHello() + "'");

		} catch (Exception e) {

			System.err.println("- Exception running the client: " + e.getMessage());
			e.printStackTrace();
		}
  }

  public IServer getService() {
    return this.server;
  }
}
