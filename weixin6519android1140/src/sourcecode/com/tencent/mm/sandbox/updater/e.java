package com.tencent.mm.sandbox.updater;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.c.i;
import com.tencent.mm.c.i.a;
import com.tencent.mm.protocal.c.aps;
import com.tencent.mm.protocal.c.azd;
import com.tencent.mm.protocal.c.bjd;
import com.tencent.mm.protocal.c.bje;
import com.tencent.mm.protocal.c.bjf;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
{
  public final int fileSize;
  public final Integer mhE;
  public HashMap<Integer, LinkedList<aps>> mhF;
  public final Integer mhG;
  public final Integer mhH;
  public final String mhI;
  public final String mhJ;
  public final String mhK;
  public String mhL;
  public String mhM;
  public int versionCode;
  
  public e(bjf parambjf)
  {
    GMTrace.i(18997714092032L, 141544);
    this.mhF = new HashMap();
    if (parambjf == null)
    {
      this.mhE = Integer.valueOf(1);
      this.mhI = "";
      this.mhJ = "";
      this.mhG = Integer.valueOf(-1);
      this.mhH = Integer.valueOf(-1);
      this.mhK = "";
      this.fileSize = 0;
      this.mhL = "";
      this.mhM = "";
      this.versionCode = 0;
      GMTrace.o(18997714092032L, 141544);
      return;
    }
    if (parambjf.uUv != null)
    {
      this.mhJ = parambjf.uUv.ugH;
      this.mhI = parambjf.uUv.lPM;
    }
    Object localObject;
    for (this.fileSize = parambjf.uUv.ufa;; this.fileSize = 0)
    {
      this.mhE = Integer.valueOf(parambjf.state);
      this.mhH = Integer.valueOf(parambjf.uUu);
      if ((parambjf.uUs == null) || (parambjf.uUs.isEmpty())) {
        break;
      }
      int j = parambjf.uUs.size();
      int i = 0;
      while (i < j)
      {
        localObject = (bje)parambjf.uUs.get(i);
        if ((((bje)localObject).uUr != null) && (!((bje)localObject).uUr.isEmpty())) {
          this.mhF.put(Integer.valueOf(((bje)localObject).type), ((bje)localObject).uUr);
        }
        i += 1;
      }
      this.mhJ = "";
      this.mhI = "";
    }
    this.mhG = Integer.valueOf(parambjf.uUt);
    this.mhK = parambjf.udq;
    if ((parambjf.uUx != null) && (!parambjf.uUx.isEmpty()))
    {
      parambjf = parambjf.uUx.iterator();
      while (parambjf.hasNext())
      {
        localObject = (bjd)parambjf.next();
        if ((localObject != null) && (!bg.nm(((bjd)localObject).amf))) {
          if (((bjd)localObject).amf.equalsIgnoreCase("newApkMd5")) {
            this.mhL = ((bjd)localObject).value;
          } else if (((bjd)localObject).amf.equalsIgnoreCase("oldApkMd5")) {
            this.mhM = ((bjd)localObject).value;
          } else if (((bjd)localObject).amf.equalsIgnoreCase("versionCode")) {
            this.versionCode = bg.Sy(((bjd)localObject).value);
          }
        }
      }
      GMTrace.o(18997714092032L, 141544);
      return;
    }
    this.mhL = "";
    this.mhM = "";
    this.versionCode = 0;
    GMTrace.o(18997714092032L, 141544);
  }
  
  public final String bOU()
  {
    GMTrace.i(18997848309760L, 141545);
    Object localObject = this.mhI.substring(0, this.mhI.lastIndexOf('/') + 1);
    String str = this.mhI.substring(this.mhI.lastIndexOf('/') + 1);
    localObject = new i((String)localObject, Integer.valueOf(this.versionCode).intValue());
    ((i)localObject).a(new i.a(this.mhM, this.mhL, this.mhJ, str, this.fileSize));
    str = ((i)localObject).oP();
    GMTrace.o(18997848309760L, 141545);
    return str;
  }
  
  public final String toString()
  {
    GMTrace.i(18997982527488L, 141546);
    String str = "responseState:" + this.mhE + "\ncdnUrl:" + this.mhI + "\nfileMd5:" + this.mhJ + "\npackageType:" + this.mhG + "\nnetworkType:" + this.mhH + "\npatchId:" + this.mhK;
    GMTrace.o(18997982527488L, 141546);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sandbox\updater\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */