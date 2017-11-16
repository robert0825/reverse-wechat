package com.tencent.mm.compatible.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public int eDB;
  public String fRL;
  public long fRM;
  public int fRN;
  
  public a()
  {
    GMTrace.i(13824023330816L, 102997);
    this.fRL = null;
    this.fRM = -1L;
    this.fRN = -1;
    this.eDB = -1;
    this.fRL = null;
    this.fRM = -1L;
    this.fRN = -1;
    this.eDB = -1;
    GMTrace.o(13824023330816L, 102997);
  }
  
  public final String tv()
  {
    GMTrace.i(13824157548544L, 102998);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.fRL);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.fRM);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.fRN);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.eDB);
    w.d("MicroMsg.AudioRecorderInfo", " getStatInfo " + ((StringBuffer)localObject).toString());
    localObject = ((StringBuffer)localObject).toString();
    GMTrace.o(13824157548544L, 102998);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\g\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */