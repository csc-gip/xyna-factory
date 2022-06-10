/*----------------------------------------------------
* Xyna 5.1 (Black Edition)
* Utils
*----------------------------------------------------
* Copyright GIP AG 2013
* (http://www.gip.com)
* Hechtsheimer Str. 35-37
* 55131 Mainz
*----------------------------------------------------
* $Revision:$
* $Date:$
*----------------------------------------------------
*/
package xact.templates.templateprovider.exceptions;

import org.apache.log4j.Logger;
import java.util.Enumeration;
import java.net.URLConnection;
import java.net.URL;
import com.gip.xyna.utils.exceptions.ExceptionStorage;
import java.io.InputStream;

//DO NOT CHANGE
//GENERATED BY com.gip.xyna.utils.exceptions.utils.codegen.JavaClass 2022-05-30T09:59:44Z;
public class Codes {

  public static Logger logger = Logger.getLogger(Codes.class.getName());
  public static final String CODE_VELOCITY_TEMPLATE_PROVIDER_DATA_SOURCE_CONNECTION_FAILED = "XYNA-11000";
  public static final String CODE_VELOCITY_TEMPLATE_PROVIDER_INITIALIZATION_FAILURE = "XYNA-11001";
  public static final String CODE_VELOCITY_TEMPLATE_PROVIDER_GENERATION_FAIL = "XYNA-11003";
  static {
    {
      try {
        Enumeration<URL> urls = Codes.class.getClassLoader().getResources("Exceptions.xml");
        while (urls.hasMoreElements()) {
          URL url = urls.nextElement();
          if (url != null) {
            if (logger.isTraceEnabled()) {
              logger.trace("trying to parse url " + url + ", path= " + url.getPath());
            }
            URLConnection urlcon = url.openConnection();
            //deactivate cache to not get an old version
            boolean b = urlcon.getUseCaches();
            urlcon.setUseCaches(false);
            try {
              InputStream is = urlcon.getInputStream();
              try {
                if (is == null) {
                  throw new Exception("Resource Exceptions.xml not found.");
                }
                ExceptionStorage.loadFromStream(is, "Exceptions.xml");
              } finally {
                is.close();
              }
            } finally {
              //reset caching!
              try {
                urlcon.setUseCaches(b);
              } catch (Exception e) {
                if (logger.isTraceEnabled()) {
                  logger.trace("could not reset urlConnection.useCaches after parsing resource. this is usually okay.", e);
                }
              }
            }
          } else {
            throw new Exception(" Resource Exceptions.xml not found.");
          }
        }
      } catch (Exception e) {
        logger.error("Error loading Errormessages.", e);
        e.printStackTrace();
      }
    }
  }


  public static final String[] CODE_VELOCITY_TEMPLATE_PROVIDER_UNKNOWN_TEMPLATE_TYPE(java.lang.String templateType) {
    return new String[]{"XYNA-11002", "" + templateType};
  }


}
