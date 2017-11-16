package org.a.g;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;
import org.a.b.b;

public final class c
{
  private static String CHARSET = "UTF-8";
  private static final Map<String, String> yuo;
  
  static
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("*", "%2A");
    localHashMap.put("+", "%20");
    localHashMap.put("%7E", "~");
    yuo = Collections.unmodifiableMap(localHashMap);
  }
  
  public static String decode(String paramString)
  {
    d.e(paramString, "Cannot decode null object");
    try
    {
      paramString = URLDecoder.decode(paramString, CHARSET);
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new b("Charset not found while decoding string: " + CHARSET, paramString);
    }
  }
  
  public static String encode(String paramString)
  {
    d.e(paramString, "Cannot encode null object");
    for (;;)
    {
      Iterator localIterator;
      try
      {
        paramString = URLEncoder.encode(paramString, CHARSET);
        localIterator = yuo.entrySet().iterator();
        if (!localIterator.hasNext()) {
          return paramString;
        }
      }
      catch (UnsupportedEncodingException paramString)
      {
        throw new b("Charset not found while encoding string: " + CHARSET, paramString);
      }
      Object localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      paramString = paramString.replaceAll(Pattern.quote(str), (String)localObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\org\a\g\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */