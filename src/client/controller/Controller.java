package client.controller;

import server.remote.IServer;
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

  public String descarga(ArrayList <String> arrayParams) throws RemoteException {

    return serviceLocator.getService().descarga(arrayParams);
  }

  public static void main (String [] args) {

    Controller controller = new Controller(args);
  }
}
