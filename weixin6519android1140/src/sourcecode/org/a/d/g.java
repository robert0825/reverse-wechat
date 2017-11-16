package org.a.d;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.a.b.b;
import org.a.g.e;

public final class g
{
  public int code;
  private Map<String, String> iHJ;
  private InputStream stream;
  private String ytU;
  
  g(HttpURLConnection paramHttpURLConnection)
  {
    for (;;)
    {
      try
      {
        paramHttpURLConnection.connect();
        this.code = paramHttpURLConnection.getResponseCode();
        this.iHJ = g(paramHttpURLConnection);
        if ((this.code >= 200) && (this.code < 400))
        {
          i = 1;
          if (i != 0)
          {
            paramHttpURLConnection = paramHttpURLConnection.getInputStream();
            this.stream = paramHttpURLConnection;
            return;
          }
          paramHttpURLConnection = paramHttpURLConnection.getErrorStream();
          continue;
        }
        int i = 0;
      }
      catch (UnknownHostException paramHttpURLConnection)
      {
        throw new b("The IP address of a host could not be determined.", paramHttpURLConnection);
      }
    }
  }
  
  private static Map<String, String> g(HttpURLConnection paramHttpURLConnection)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramHttpURLConnection.getHeaderFields().keySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return localHashMap;
      }
      String str = (String)localIterator.next();
      localHashMap.put(str, (String)((List)paramHttpURLConnection.getHeaderFields().get(str)).get(0));
    }
  }
  
  public final String getBody()
  {
    if (this.ytU != null) {
      return this.ytU;
    }
    this.ytU = e.v(this.stream);
    return this.ytU;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\org\a\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */