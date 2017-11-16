package com.tencent.mm.pluginsdk.j.a.d;

import com.tencent.gmtrace.GMTrace;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class k
  implements f.b
{
  private final String filePath;
  private final String groupId;
  protected volatile int iHM;
  private final String method;
  final int networkType;
  final int priority;
  protected final Map<String, String> requestHeaders;
  public final String tpD;
  final int tpN;
  private final String tqW;
  protected volatile int trm;
  protected volatile int trn;
  public final String url;
  
  public k(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(865704345600L, 6450);
    this.requestHeaders = new HashMap();
    this.iHM = 15000;
    this.trm = 20000;
    this.trn = 15000;
    this.tpD = paramString1;
    this.filePath = paramString2;
    this.tqW = paramString3;
    this.groupId = paramString4;
    this.url = paramString5;
    this.method = paramString6;
    this.tpN = paramInt1;
    this.networkType = paramInt2;
    this.priority = Math.max(paramInt3, 0);
    GMTrace.o(865704345600L, 6450);
  }
  
  public String SM()
  {
    GMTrace.i(865972781056L, 6452);
    String str = this.groupId;
    GMTrace.o(865972781056L, 6452);
    return str;
  }
  
  public final String bJY()
  {
    GMTrace.i(866241216512L, 6454);
    String str = this.tpD;
    GMTrace.o(866241216512L, 6454);
    return str;
  }
  
  public boolean bKb()
  {
    GMTrace.i(865838563328L, 6451);
    GMTrace.o(865838563328L, 6451);
    return false;
  }
  
  public final int bKm()
  {
    GMTrace.i(866778087424L, 6458);
    int i = this.trn;
    GMTrace.o(866778087424L, 6458);
    return i;
  }
  
  public final int getConnectTimeout()
  {
    GMTrace.i(866509651968L, 6456);
    int i = this.iHM;
    GMTrace.o(866509651968L, 6456);
    return i;
  }
  
  public String getFilePath()
  {
    GMTrace.i(866106998784L, 6453);
    String str = this.filePath;
    GMTrace.o(866106998784L, 6453);
    return str;
  }
  
  public final int getReadTimeout()
  {
    GMTrace.i(866643869696L, 6457);
    int i = this.trm;
    GMTrace.o(866643869696L, 6457);
    return i;
  }
  
  public final Map<String, String> getRequestHeaders()
  {
    GMTrace.i(866375434240L, 6455);
    if (this.requestHeaders.size() == 0)
    {
      GMTrace.o(866375434240L, 6455);
      return null;
    }
    Map localMap = Collections.unmodifiableMap(this.requestHeaders);
    GMTrace.o(866375434240L, 6455);
    return localMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\d\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */