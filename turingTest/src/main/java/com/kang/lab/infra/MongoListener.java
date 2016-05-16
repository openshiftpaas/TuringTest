package com.kang.lab.infra;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class MongoListener
 *
 */
public class MongoListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MongoListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
	@Override
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
	@Override
    public void contextInitialized(ServletContextEvent sce)  { 
    	ClassLoader cl = Thread.currentThread().getContextClassLoader();
    	URL config = cl.getResource("jetty-env.xml");
    	
    	try {
    		Enumeration<URL>  configs = cl.getResources("etc/jetty-env.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//    	 MongodStarter starter = MongodStarter.getDefaultInstance();
//
//    	    int port = 8080;
//    	    IMongodConfig mongodConfig = new MongodConfigBuilder()
//    	        .version(Version.Main.PRODUCTION)
//    	        .net(new Net(port, Network.localhostIsIPv6()))
//    	        .build();
//
//    	    MongodExecutable mongodExecutable = null;
//    	    try {
//    	        mongodExecutable = starter.prepare(mongodConfig);
//    	        MongodProcess mongod = mongodExecutable.start();
//
//    	        MongoClient mongo = new MongoClient("localhost", port);
//    	        DB db = mongo.getDB("test");
//    	        DBCollection col = db.createCollection("testCol", new BasicDBObject());
//    	        col.save(new BasicDBObject("testDoc", new Date()));
//
//    	    } finally {
//    	        if (mongodExecutable != null)
//    	            mongodExecutable.stop();
//    	    }
    }

	
}
