package com.schinkenbrot.Interfaces;

import com.schinkenbrot.Datasets.Dataset;

/**
 * Created by David on 16.03.2016.
 */
public interface SQLExecutable
{
    void insert(Dataset dataset);
    void delete(Dataset dataset);

    //Speichere den Rückgabewert in eine globale Variable, da der Rückgabetyp variabel sein muss
    //Überlade diese Methode für zusätliche Parameter wie (WHERE)
    void select();
}
