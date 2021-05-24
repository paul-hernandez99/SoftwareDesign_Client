package client.controller;

import server.remote.IFacade;
import client.gui.PanelPrincipal;
import client.remote.RMIServiceLocator;
import java.util.HashMap;
import java.rmi.RemoteException;

public class Controller {

  private RMIServiceLocator serviceLocator;

  public Controller(String [] args) {

    this.serviceLocator = new RMIServiceLocator();
    this.serviceLocator.setService(args);
    PanelPrincipal frame = new PanelPrincipal(this);
  }

  public String descargarUsuarios(HashMap <String, String> datos) throws RemoteException {
    return serviceLocator.getService().descargarUsuarios(datos);
  }

  public String descargarOrganizaciones(HashMap <String, String> datos) throws RemoteException {
    return serviceLocator.getService().descargarOrganizaciones(datos);
  }

  public String descargarRepositorios(HashMap <String, String> datos) throws RemoteException {
    return serviceLocator.getService().descargarRepositorios(datos);
  }

  public static void main (String [] args) {

    Controller controller = new Controller(args);
  }
}
