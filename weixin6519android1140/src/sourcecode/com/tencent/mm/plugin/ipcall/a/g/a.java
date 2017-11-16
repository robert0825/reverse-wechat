package com.tencent.mm.plugin.ipcall.a.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;

public final class a
{
  private static String TAG;
  public String eBt;
  public int jib;
  public String lPj;
  public String mmM;
  public String mmN;
  
  static
  {
    GMTrace.i(11579902918656L, 86277);
    TAG = "MicroMsg.IPCallActivityMsgInfo";
    GMTrace.o(11579902918656L, 86277);
  }
  
  public a()
  {
    GMTrace.i(11579634483200L, 86275);
    this.eBt = "";
    this.lPj = "";
    this.mmM = "";
    this.mmN = "";
    this.jib = 0;
    GMTrace.o(11579634483200L, 86275);
  }
  
  public static a Ai(String paramString)
  {
    GMTrace.i(11579768700928L, 86276);
    w.d(TAG, "getIPCallActivityMsgInfoFromXML:" + paramString);
    a locala = new a();
    int i = paramString.indexOf("<ActivityInfo");
    if (i == -1)
    {
      w.e(TAG, "msgContent not start with <ActivityInfo");
      GMTrace.o(11579768700928L, 86276);
      return locala;
    }
    Map localMap = bh.q(paramString.substring(i), "ActivityInfo");
    if (localMap == null)
    {
      w.e(TAG, "XmlParser values is null, xml %s", new Object[] { paramString });
      GMTrace.o(11579768700928L, 86276);
      return null;
    }
    if (localMap.containsKey(".ActivityInfo.Title")) {
      locala.eBt = ((String)localMap.get(".ActivityInfo.Title"));
    }
    if (localMap.containsKey(".ActivityInfo.Desc")) {
      locala.lPj = ((String)localMap.get(".ActivityInfo.Desc"));
    }
    if (localMap.containsKey(".ActivityInfo.ImgUrl")) {
      locala.mmM = ((String)localMap.get(".ActivityInfo.ImgUrl"));
    }
    if (localMap.containsKey(".ActivityInfo.StartBtnText")) {
      locala.mmN = ((String)localMap.get(".ActivityInfo.StartBtnText"));
    }
    if (localMap.containsKey(".ActivityInfo.ActivityType")) {
      locala.jib = bg.getInt((String)localMap.get(".ActivityInfo.ActivityType"), 0);
    }
    w.d(TAG, "msgInfo:", new Object[] { locala.toString() });
    GMTrace.o(11579768700928L, 86276);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\g\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */