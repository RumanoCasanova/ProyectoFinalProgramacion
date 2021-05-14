package com.Ferrari.dao.Circuito;

import com.ferrari.dao.DAOFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class DAOCircuitoTest {

    @BeforeAll
    @AfterAll
    static void clearDatabase(){
        DAOFactory.getInstance().getDaoCircuito().clear();
    }

}
