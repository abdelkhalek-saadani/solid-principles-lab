package com.directi.training.dip.solution;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        Database database = new MyDatabase();
        EncodingModule encodingModule = new EncodingModule(database);
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}
