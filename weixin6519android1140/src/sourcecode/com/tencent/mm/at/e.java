package com.tencent.mm.at;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.at.a.a;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.x.f.a;
import java.util.LinkedList;

public final class e
  implements a
{
  public e()
  {
    GMTrace.i(18642573983744L, 138898);
    GMTrace.o(18642573983744L, 138898);
  }
  
  public final apv a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11)
  {
    GMTrace.i(18642708201472L, 138899);
    apv localapv = new apv();
    localapv.uFq = paramInt;
    localapv.uFv = paramString1;
    localapv.uFs = paramString2;
    localapv.uFt = paramString3;
    localapv.uFy = paramString4;
    localapv.uFx = paramString5;
    localapv.uFw = paramString6;
    localapv.uFB = paramString8;
    localapv.lQa = paramString11;
    localapv.uFA = paramString9;
    localapv.ucY = paramString7;
    localapv.uFr = 0.0F;
    localapv.uFu = paramString10;
    localapv.tTL = 1;
    localapv.uFz = null;
    localapv.ugf = paramString7;
    GMTrace.o(18642708201472L, 138899);
    return localapv;
  }
  
  public final apv a(f.a parama, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(18643110854656L, 138902);
    if (parama == null)
    {
      GMTrace.o(18643110854656L, 138902);
      return null;
    }
    apv localapv = new apv();
    localapv.uFq = 0;
    localapv.ucY = paramString1;
    localapv.uFr = 0.0F;
    localapv.uFu = "";
    localapv.uFv = paramString2;
    localapv.uFA = paramString4;
    localapv.tTL = 1;
    localapv.uFz = null;
    localapv.uFs = parama.title;
    localapv.uFt = parama.description;
    localapv.uFy = parama.url;
    localapv.uFx = parama.giu;
    localapv.uFw = parama.giM;
    localapv.lQa = parama.appId;
    localapv.uFB = paramString3;
    GMTrace.o(18643110854656L, 138902);
    return localapv;
  }
  
  public final apv a(String paramString, biz parambiz, int paramInt)
  {
    String str = null;
    GMTrace.i(18642976636928L, 138901);
    if ((parambiz == null) || (parambiz.uUc == null) || (parambiz.uUc.ueW == null) || (parambiz.uUc.ueW.size() <= 0))
    {
      GMTrace.o(18642976636928L, 138901);
      return null;
    }
    anu localanu = (anu)parambiz.uUc.ueW.get(0);
    if (localanu == null)
    {
      GMTrace.o(18642976636928L, 138901);
      return null;
    }
    apv localapv = new apv();
    localapv.uFq = paramInt;
    localapv.ucY = parambiz.mmR;
    localapv.uFr = 0.0F;
    localapv.uFu = "";
    localapv.uFv = localanu.uCO;
    localapv.uFA = null;
    localapv.tTL = 1;
    localapv.uFz = null;
    localapv.uFs = localanu.eBt;
    localapv.uFt = localanu.lPj;
    if (parambiz.uUc != null) {
      str = parambiz.uUc.lPM;
    }
    localapv.uFy = str;
    localapv.uFx = localanu.uCS;
    localapv.uFw = localanu.lPM;
    localapv.uFC = localanu.uCP;
    localapv.ugf = localanu.mmR;
    localapv.uFB = paramString;
    localapv.lQa = parambiz.uUb.mmR;
    localapv.uFH = parambiz.jhi;
    GMTrace.o(18642976636928L, 138901);
    return localapv;
  }
  
  public final apv a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12)
  {
    GMTrace.i(18642842419200L, 138900);
    apv localapv = new apv();
    localapv.uFq = 7;
    localapv.uFv = paramString1;
    localapv.uFD = paramString2;
    localapv.uFs = paramString3;
    localapv.uFt = paramString4;
    localapv.uFy = paramString5;
    localapv.uFx = paramString6;
    localapv.uFw = paramString7;
    localapv.uFB = paramString9;
    localapv.lQa = paramString12;
    localapv.uFA = paramString10;
    localapv.ucY = paramString8;
    localapv.uFr = 0.0F;
    localapv.uFu = paramString11;
    localapv.tTL = 1;
    localapv.uFz = null;
    localapv.ugf = paramString8;
    GMTrace.o(18642842419200L, 138900);
    return localapv;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\at\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */