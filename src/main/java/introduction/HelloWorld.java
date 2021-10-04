package introduction;

import org.apache.log4j.Logger;

public class HelloWorld {

    final static private Logger log = Logger.getLogger( "name" );

    public static void main( String [ ] args )
    {
        System.out.println( "Hello! Witaj!" );
        log.info( "Jan Pawel II ");
    }}