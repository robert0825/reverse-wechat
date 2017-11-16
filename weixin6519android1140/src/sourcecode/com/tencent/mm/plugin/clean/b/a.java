package com.tencent.mm.plugin.clean.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class a
  implements Runnable
{
  private static final Long jSH;
  private static final Long jSI;
  private boolean isStop;
  private long jSJ;
  private long jSK;
  private long jSL;
  private long jSM;
  private HashMap<String, Long> jSN;
  private HashSet<String> jSO;
  private c jSP;
  
  static
  {
    GMTrace.i(20558666268672L, 153174);
    jSH = Long.valueOf(604800000L);
    jSI = Long.valueOf(7776000000L);
    GMTrace.o(20558666268672L, 153174);
  }
  
  public a(c paramc)
  {
    GMTrace.i(20557592526848L, 153166);
    this.isStop = false;
    this.isStop = false;
    this.jSP = paramc;
    this.jSN = new HashMap();
    this.jSO = new HashSet();
    GMTrace.o(20557592526848L, 153166);
  }
  
  private int a(List<String> paramList, HashSet<String> paramHashSet)
  {
    GMTrace.i(20558263615488L, 153171);
    String str1 = h.xy().fYT;
    String str2 = h.xy().fYU;
    w.i("MicroMsg.CleanCalcLogic", "%s get MicroMsg path root[%s] acc[%s]", new Object[] { aiH(), str1, str2 });
    int j = 0;
    int i = 0;
    Object localObject = new File(str1);
    int k = j;
    if (((File)localObject).isDirectory())
    {
      String[] arrayOfString = ((File)localObject).list();
      k = j;
      if (arrayOfString != null)
      {
        int m = arrayOfString.length;
        j = 0;
        k = i;
        if (j < m)
        {
          localObject = arrayOfString[j];
          String str3 = str1 + (String)localObject + "/";
          w.d("MicroMsg.CleanCalcLogic", "%s sub file path[%s] sub[%s]", new Object[] { aiH(), str3, localObject });
          if (new File(str3).isDirectory()) {
            if (((String)localObject).length() >= 32) {
              if (!bg.eW(str2, str3))
              {
                paramHashSet.add(str3);
                paramList.add(str3);
                i += 1;
                this.jSO.add(localObject);
              }
            }
          }
          for (;;)
          {
            j += 1;
            break;
            if (str2.endsWith("/")) {}
            for (localObject = str2 + "music";; localObject = str2 + File.separator + "music")
            {
              paramList.add(localObject);
              at.AR();
              paramList.add(com.tencent.mm.y.c.zb());
              at.AR();
              paramList.add(com.tencent.mm.y.c.getAccSnsPath());
              at.AR();
              paramList.add(com.tencent.mm.y.c.zi());
              break;
            }
            paramList.add(str3);
            i += 1;
            continue;
            paramList.add(str3);
            i += 1;
          }
        }
      }
    }
    GMTrace.o(20558263615488L, 153171);
    return k;
  }
  
  private String aiH()
  {
    GMTrace.i(20557860962304L, 153168);
    String str = hashCode();
    GMTrace.o(20557860962304L, 153168);
    return str;
  }
  
  private long uY(String paramString)
  {
    GMTrace.i(20558129397760L, 153170);
    Object localObject = new File(paramString);
    if (((File)localObject).isDirectory())
    {
      String[] arrayOfString = ((File)localObject).list();
      if (arrayOfString != null)
      {
        l1 = 0L;
        int j = arrayOfString.length;
        int i = 0;
        while (i < j)
        {
          localObject = arrayOfString[i];
          StringBuilder localStringBuilder = new StringBuilder().append(paramString);
          if (paramString.endsWith("/")) {}
          long l2;
          for (;;)
          {
            l2 = uY((String)localObject);
            if (l2 != -1L) {
              break;
            }
            GMTrace.o(20558129397760L, 153170);
            return -1L;
            localObject = "/" + (String)localObject;
          }
          l1 += l2;
          i += 1;
        }
        GMTrace.o(20558129397760L, 153170);
        return l1;
      }
    }
    long l1 = ((File)localObject).length();
    GMTrace.o(20558129397760L, 153170);
    return l1;
  }
  
  private long uZ(String paramString)
  {
    long l1 = 0L;
    int i = 0;
    GMTrace.i(20558397833216L, 153172);
    Object localObject = new File(paramString);
    if (((File)localObject).isDirectory())
    {
      localObject = ((File)localObject).list();
      if (localObject != null)
      {
        int j = localObject.length;
        while (i < j)
        {
          String str = localObject[i];
          long l2 = uZ(paramString + "/" + str);
          i += 1;
          l1 = l2 + l1;
        }
        GMTrace.o(20558397833216L, 153172);
        return l1;
      }
    }
    else if (System.currentTimeMillis() - ((File)localObject).lastModified() > jSH.longValue())
    {
      w.i("MicroMsg.CleanCalcLogic", "Clean 7 days file in sns rootPath=%s", new Object[] { paramString });
      l1 = com.tencent.mm.a.e.aY(paramString);
      if (((File)localObject).delete()) {
        this.jSM += l1;
      }
      GMTrace.o(20558397833216L, 153172);
      return 0L;
    }
    l1 = com.tencent.mm.a.e.aY(paramString);
    GMTrace.o(20558397833216L, 153172);
    return l1;
  }
  
  private long va(String paramString)
  {
    long l1 = 0L;
    int i = 0;
    GMTrace.i(20558532050944L, 153173);
    Object localObject = new File(paramString);
    if (((File)localObject).isDirectory())
    {
      localObject = ((File)localObject).list();
      if (localObject != null)
      {
        int j = localObject.length;
        while (i < j)
        {
          String str = localObject[i];
          long l2 = va(paramString + "/" + str);
          i += 1;
          l1 = l2 + l1;
        }
        GMTrace.o(20558532050944L, 153173);
        return l1;
      }
    }
    else if (System.currentTimeMillis() - ((File)localObject).lastModified() > jSI.longValue())
    {
      w.i("MicroMsg.CleanCalcLogic", "Clean 90 days file in music rootPath=%s", new Object[] { paramString });
      l1 = com.tencent.mm.a.e.aY(paramString);
      if (((File)localObject).delete()) {
        this.jSM += l1;
      }
      GMTrace.o(20558532050944L, 153173);
      return 0L;
    }
    l1 = com.tencent.mm.a.e.aY(paramString);
    GMTrace.o(20558532050944L, 153173);
    return l1;
  }
  
  public final void run()
  {
    GMTrace.i(20557995180032L, 153169);
    long l2 = bg.Pw();
    if (this.isStop)
    {
      w.i("MicroMsg.CleanCalcLogic", "%s start run but stop", new Object[] { aiH() });
      GMTrace.o(20557995180032L, 153169);
      return;
    }
    Object localObject = new ArrayList();
    HashSet localHashSet = new HashSet();
    a((List)localObject, localHashSet);
    int j = ((List)localObject).size();
    int i = 0;
    while ((!this.isStop) && (i < j))
    {
      String str = (String)((List)localObject).get(i);
      if (!bg.nm(str))
      {
        if (str.endsWith(File.separator + "sns" + File.separator)) {
          l1 = uZ(str);
        }
        for (;;)
        {
          this.jSN.put(str, Long.valueOf(l1));
          w.d("MicroMsg.CleanCalcLogic", "%s path[%s] size[%d]", new Object[] { aiH(), str, Long.valueOf(l1) });
          this.jSJ += l1;
          if (localHashSet.contains(str)) {
            this.jSL = (l1 + this.jSL);
          }
          i += 1;
          if (this.jSP != null) {
            this.jSP.bP(i, j);
          }
          break;
          if (str.endsWith(File.separator + "music")) {
            l1 = va(str);
          } else {
            l1 = uY(str);
          }
        }
      }
    }
    this.jSK = com.tencent.mm.plugin.i.b.aiA().aiB().aiK();
    this.jSJ += this.jSK;
    if (this.jSJ <= 0L)
    {
      this.jSJ = 1L;
      g.ork.a(714L, 60L, 1L, false);
    }
    w.i("MicroMsg.CleanCalcLogic", "%s scan finish cost[%d] micromsg[%d] acc[%d] otherAcc[%d]", new Object[] { aiH(), Long.valueOf(bg.aI(l2)), Long.valueOf(this.jSJ), Long.valueOf(this.jSK), Long.valueOf(this.jSL) });
    localObject = this.jSO;
    if (this.jSP != null) {
      this.jSP.a(this.jSJ, this.jSK, this.jSL, (HashSet)localObject, this.jSN);
    }
    j.aoj();
    long l1 = j.anU();
    j.aoj();
    l2 = j.anV();
    i = (int)(this.jSJ * 100L / l1);
    j = (int)(this.jSK * 100L / this.jSJ);
    int k = (int)(this.jSL * 100L / this.jSJ);
    long l3 = this.jSJ - this.jSK - this.jSL;
    int m = (int)(100L * l3 / this.jSJ);
    localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.jSM).append(",");
    ((StringBuffer)localObject).append(this.jSJ).append(",");
    ((StringBuffer)localObject).append(i).append(",");
    ((StringBuffer)localObject).append(l1 - l2).append(",");
    ((StringBuffer)localObject).append(l2).append(",");
    ((StringBuffer)localObject).append(l1).append(",");
    ((StringBuffer)localObject).append(this.jSK).append(",");
    ((StringBuffer)localObject).append(j).append(",");
    ((StringBuffer)localObject).append(this.jSL).append(",");
    ((StringBuffer)localObject).append(k).append(",");
    ((StringBuffer)localObject).append(l3).append(",");
    ((StringBuffer)localObject).append(m);
    localObject = ((StringBuffer)localObject).toString();
    w.i("MicroMsg.CleanCalcLogic", "rpt content %s", new Object[] { localObject });
    g.ork.A(14762, (String)localObject);
    stop();
    GMTrace.o(20557995180032L, 153169);
  }
  
  public final void stop()
  {
    GMTrace.i(20557726744576L, 153167);
    this.isStop = true;
    this.jSP = null;
    GMTrace.o(20557726744576L, 153167);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\clean\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */