package com.ferrari.dao;

import com.ferrari.dao.Circuito.DAOCircuito;
import com.ferrari.dao.Circuito.DAOCircuitoSQL;
import com.ferrari.dao.Piloto.DAOpiloto;
import com.ferrari.dao.Vehiculo.DAOVehiculo;
import com.ferrari.dao.Vuelta.DAOVuelta;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOCircuito daoCircuito;
    private DAOpiloto daOpiloto;
    private DAOVehiculo daoVehiculo;
    private DAOVuelta daoVuelta;

    private DAOFactory(){}


    public DAOCircuito getDaoCircuito(){
        if (daoCircuito == null){
            daoCircuito = new DAOCircuitoSQL();
        }
        return daoCircuito;}
    }

