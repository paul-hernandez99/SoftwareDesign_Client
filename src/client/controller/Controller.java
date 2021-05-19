package client.controller;

import server.remote.IFacade;
import client.gui.PanelPrincipal;
import client.remote.RMIServiceLocator;
import java.util.ArrayList;
import java.rmi.RemoteException;

public class Controller {

  private RMIServiceLocator serviceLocator;

  public Controller(String [] args) {

    this.serviceLocator = new RMIServiceLocator();
    this.serviceLocator.setService(args);
    PanelPrincipal frame = new PanelPrincipal(this);
  }

  public String descargarUsuarios() throws RemoteException {
    return serviceLocator.getService().descargarUsuarios();
  }

  public String descargarOrganizaciones() throws RemoteException {
    return serviceLocator.getService().descargarOrganizaciones();
  }

  public static void main (String [] args) {

    Controller controller = new Controller(args);
  }
}
