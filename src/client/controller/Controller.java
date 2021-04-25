package client.controller;

import client.SL.ServiceLocator;
import client.LP.PanelPrincipal;

import java.rmi.RemoteException;

public class Controller {

  private ServiceLocator serviceLocator;

  public Controller(String [] args) {
    PanelPrincipal frame = new PanelPrincipal(this);
    this.serviceLocator = new ServiceLocator();
    this.serviceLocator.setService(args);
  }

  public String operacionEjemplo() throws RemoteException {
    return serviceLocator.getService().operacionEjemplo();
  }

  public static void main (String [] args) {
    Controller controller = new Controller(args);
  }
}
