package com.google.android.gms.tagmanager;

import com.google.android.gms.c.b.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class ak
{
  private static v<b.a> a(v<b.a> paramv)
  {
    try
    {
      v localv = new v(ai.ah(URLEncoder.encode(ai.b((b.a)paramv.ayJ), "UTF-8").replaceAll("\\+", "%20")), paramv.ayK);
      return localv;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      m.mp();
    }
    return paramv;
  }
  
  static v<b.a> a(v<b.a> paramv, int... paramVarArgs)
  {
    int j = paramVarArgs.length;
    int i = 0;
    if (i < j)
    {
      int k = paramVarArgs[i];
      if (!(ai.d((b.a)paramv.ayJ) instanceof String)) {
        m.mo();
      }
      for (;;)
      {
        i += 1;
        break;
        switch (k)
        {
        default: 
          new StringBuilder("Unsupported Value Escaping: ").append(k);
          m.mo();
          break;
        case 12: 
          paramv = a(paramv);
        }
      }
    }
    return paramv;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\tagmanager\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */