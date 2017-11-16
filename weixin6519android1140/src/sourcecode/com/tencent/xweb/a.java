package com.tencent.xweb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.xwalk.core.XWalkEnvironment;

public final class a
{
  static boolean ymJ = false;
  static WebView.c ymK = WebView.c.ynE;
  static f.a ymL = f.a.ync;
  static String ymM = "";
  
  public static void a(a[] paramArrayOfa, String paramString)
  {
    int k = 0;
    init();
    if ((paramString == null) || (paramString.equals(ymM))) {
      return;
    }
    Object localObject1 = "";
    Object localObject2 = "";
    if ((paramArrayOfa == null) || (paramArrayOfa.length == 0))
    {
      an("", "", paramString);
      return;
    }
    int i1 = XWalkEnvironment.getAvailableVersion();
    int i = 0;
    int j = 0;
    if (i < paramArrayOfa.length)
    {
      int m = k;
      int n = j;
      Object localObject3 = localObject2;
      Object localObject4 = localObject1;
      if (paramArrayOfa[i] != null)
      {
        m = k;
        n = j;
        localObject3 = localObject2;
        localObject4 = localObject1;
        if (af(i1, paramArrayOfa[i].ymP, paramArrayOfa[i].ymQ))
        {
          m = k;
          n = j;
          localObject3 = localObject2;
          localObject4 = localObject1;
          if (af(10, paramArrayOfa[i].ymN, paramArrayOfa[i].ymO))
          {
            m = k;
            n = j;
            localObject3 = localObject2;
            localObject4 = localObject1;
            if (XWalkEnvironment.isMatchGrey(paramArrayOfa[i].ymR, i1))
            {
              if (!paramArrayOfa[i].ymS.equals("setwebtype")) {
                break label256;
              }
              m = k;
              n = j;
              localObject3 = localObject2;
              localObject4 = localObject1;
              if (j == 0)
              {
                localObject4 = paramArrayOfa[i].ymT;
                n = 1;
                localObject3 = localObject2;
                m = k;
              }
            }
          }
        }
      }
      for (;;)
      {
        i += 1;
        k = m;
        j = n;
        localObject2 = localObject3;
        localObject1 = localObject4;
        break;
        label256:
        m = k;
        n = j;
        localObject3 = localObject2;
        localObject4 = localObject1;
        if (paramArrayOfa[i].ymS.equals("setjscore"))
        {
          m = k;
          n = j;
          localObject3 = localObject2;
          localObject4 = localObject1;
          if (k == 0)
          {
            localObject3 = paramArrayOfa[i].ymT;
            m = 1;
            n = j;
            localObject4 = localObject1;
          }
        }
      }
    }
    an((String)localObject1, (String)localObject2, paramString);
  }
  
  private static boolean af(int paramInt1, int paramInt2, int paramInt3)
  {
    return ((paramInt3 <= 0) || (paramInt3 >= paramInt1)) && (paramInt2 <= paramInt1);
  }
  
  private static void am(String paramString1, String paramString2, String paramString3)
  {
    String str;
    if (paramString1 != null)
    {
      str = paramString1;
      if (!paramString1.isEmpty()) {}
    }
    else
    {
      str = WebView.c.ynE.toString();
    }
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (!paramString2.isEmpty()) {}
    }
    else
    {
      paramString1 = f.a.ync.toString();
    }
    ymM = paramString3;
    try
    {
      ymK = WebView.c.valueOf(str);
      try
      {
        ymL = f.a.valueOf(paramString1);
        return;
      }
      catch (Exception paramString1) {}
    }
    catch (Exception paramString2)
    {
      for (;;) {}
    }
  }
  
  private static void an(String paramString1, String paramString2, String paramString3)
  {
    am(paramString1, paramString2, paramString3);
    XWalkEnvironment.addXWalkInitializeLog("CommandCfg", "save cmds to : webtype = " + ymK.toString() + "jstype = " + ymL.toString() + "configver = " + ymM);
    paramString1 = crR().edit();
    paramString1.putString("setwebtype", ymK.toString());
    paramString1.putString("setjscore", ymL.toString());
    paramString1.putString("cStrTAGConfigVer", ymM);
    paramString1.commit();
  }
  
  public static WebView.c crP()
  {
    init();
    return ymK;
  }
  
  public static f.a crQ()
  {
    init();
    return ymL;
  }
  
  private static SharedPreferences crR()
  {
    return XWalkEnvironment.getApplicationContext().getSharedPreferences("XWEB.CMDCFG", 0);
  }
  
  private static void init()
  {
    if (ymJ) {
      return;
    }
    ymJ = true;
    SharedPreferences localSharedPreferences = crR();
    am(localSharedPreferences.getString("setwebtype", WebView.c.ynE.toString()), localSharedPreferences.getString("setjscore", f.a.ync.toString()), localSharedPreferences.getString("cStrTAGConfigVer", ""));
  }
  
  public static final class a
  {
    public int ymN;
    public int ymO;
    public int ymP;
    public int ymQ;
    public int ymR;
    public String ymS;
    public String ymT;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */