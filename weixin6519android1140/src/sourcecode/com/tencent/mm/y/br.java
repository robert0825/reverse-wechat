package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

@Deprecated
public final class br
{
  public static ar gpk;
  private Map<String, aq> gpi;
  private Map<aq, Boolean> gpj;
  private String gpl;
  
  public br()
  {
    GMTrace.i(668672720896L, 4982);
    this.gpi = new HashMap();
    this.gpj = new HashMap();
    this.gpl = "";
    GMTrace.o(668672720896L, 4982);
  }
  
  /* Error */
  public final void BJ()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 43
    //   5: sipush 4983
    //   8: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 37	com/tencent/mm/y/br:gpl	Ljava/lang/String;
    //   15: invokestatic 50	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   18: ifne +33 -> 51
    //   21: ldc 52
    //   23: ldc 54
    //   25: iconst_1
    //   26: anewarray 4	java/lang/Object
    //   29: dup
    //   30: iconst_0
    //   31: aload_0
    //   32: getfield 37	com/tencent/mm/y/br:gpl	Ljava/lang/String;
    //   35: aastore
    //   36: invokestatic 60	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   39: ldc2_w 43
    //   42: sipush 4983
    //   45: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   48: aload_0
    //   49: monitorexit
    //   50: return
    //   51: aload_0
    //   52: getfield 31	com/tencent/mm/y/br:gpi	Ljava/util/Map;
    //   55: invokeinterface 65 1 0
    //   60: aload_0
    //   61: getfield 33	com/tencent/mm/y/br:gpj	Ljava/util/Map;
    //   64: invokeinterface 65 1 0
    //   69: getstatic 67	com/tencent/mm/y/br:gpk	Lcom/tencent/mm/y/ar;
    //   72: ifnull +41 -> 113
    //   75: aload_0
    //   76: getstatic 67	com/tencent/mm/y/br:gpk	Lcom/tencent/mm/y/ar;
    //   79: invokeinterface 73 1 0
    //   84: putfield 31	com/tencent/mm/y/br:gpi	Ljava/util/Map;
    //   87: ldc 52
    //   89: ldc 75
    //   91: iconst_1
    //   92: anewarray 4	java/lang/Object
    //   95: dup
    //   96: iconst_0
    //   97: aload_0
    //   98: getfield 31	com/tencent/mm/y/br:gpi	Ljava/util/Map;
    //   101: invokeinterface 79 1 0
    //   106: invokestatic 85	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   109: aastore
    //   110: invokestatic 87	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   113: ldc2_w 43
    //   116: sipush 4983
    //   119: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   122: goto -74 -> 48
    //   125: astore_1
    //   126: aload_0
    //   127: monitorexit
    //   128: aload_1
    //   129: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	br
    //   125	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	48	125	finally
    //   51	113	125	finally
    //   113	122	125	finally
  }
  
  public final void BK()
  {
    long l1;
    try
    {
      GMTrace.i(669209591808L, 4986);
      l1 = bg.Pv();
      this.gpl = "releaseSubCore";
      Iterator localIterator = this.gpi.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (bg.a((Boolean)this.gpj.get(localEntry.getValue()), false))
        {
          long l2 = bg.Pv();
          w.i("MicroMsg.MMCore.SubCoreMap", "releaseSubCore release:%s begin...", new Object[] { localEntry.getKey() });
          ((aq)localEntry.getValue()).onAccountRelease();
          w.i("MicroMsg.MMCore.SubCoreMap", "releaseSubCore release:%s %d", new Object[] { localEntry.getKey(), Long.valueOf(bg.aH(l2)) });
        }
      }
      this.gpl = "";
    }
    finally {}
    w.i("MicroMsg.MMCore.SubCoreMap", "releaseSubCore finish Count:%d time:%d", new Object[] { Integer.valueOf(this.gpi.size()), Long.valueOf(bg.aH(l1)) });
    GMTrace.o(669209591808L, 4986);
  }
  
  public final Map<Integer, g.d> BL()
  {
    try
    {
      GMTrace.i(669343809536L, 4987);
      this.gpl = "getSubCoreBaseDBFacotries";
      HashMap localHashMap = new HashMap();
      Iterator localIterator = this.gpi.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (((aq)localEntry.getValue()).vH() != null) {
          localHashMap.putAll(((aq)localEntry.getValue()).vH());
        }
      }
      this.gpl = "";
    }
    finally {}
    GMTrace.o(669343809536L, 4987);
    return localMap;
  }
  
  public final boolean a(String paramString, aq paramaq)
  {
    try
    {
      GMTrace.i(669612244992L, 4989);
      if (!bg.nm(this.gpl)) {
        Assert.assertTrue("REFUSE to addSubCore doing:" + this.gpl, false);
      }
      this.gpi.put(paramString, paramaq);
      GMTrace.o(669612244992L, 4989);
      return true;
    }
    finally {}
  }
  
  public final void aX(boolean paramBoolean)
  {
    long l1;
    try
    {
      GMTrace.i(669075374080L, 4985);
      l1 = bg.Pv();
      this.gpl = "onAccountPostReset";
      Iterator localIterator = this.gpi.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        long l2 = bg.Pv();
        ((aq)localEntry.getValue()).aX(paramBoolean);
        this.gpj.put(localEntry.getValue(), Boolean.valueOf(true));
        w.i("MicroMsg.MMCore.SubCoreMap", "onSubCoreAccountPostReset post:%s %d", new Object[] { localEntry.getKey(), Long.valueOf(bg.aH(l2)) });
      }
      this.gpl = "";
    }
    finally {}
    w.i("MicroMsg.MMCore.SubCoreMap", "onSubCoreAccountPostReset finish Count:%d time:%d", new Object[] { Integer.valueOf(this.gpi.size()), Long.valueOf(bg.aH(l1)) });
    GMTrace.o(669075374080L, 4985);
  }
  
  public final void aY(boolean paramBoolean)
  {
    long l1;
    try
    {
      GMTrace.i(668941156352L, 4984);
      l1 = bg.Pv();
      this.gpl = "onSdcardMount";
      Iterator localIterator = this.gpi.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (bg.a((Boolean)this.gpj.get(localEntry.getValue()), false))
        {
          long l2 = bg.Pv();
          ((aq)localEntry.getValue()).aY(paramBoolean);
          w.i("MicroMsg.MMCore.SubCoreMap", "onSdcardMount %s time:%d", new Object[] { localEntry.getKey(), Long.valueOf(bg.aH(l2)) });
        }
      }
      this.gpl = "";
    }
    finally {}
    w.i("MicroMsg.MMCore.SubCoreMap", "onSubCoreSdcardMount finish Count:%d time:%d", new Object[] { Integer.valueOf(this.gpi.size()), Long.valueOf(bg.aH(l1)) });
    GMTrace.o(668941156352L, 4984);
  }
  
  public final void fE(int paramInt)
  {
    try
    {
      GMTrace.i(669478027264L, 4988);
      this.gpl = "clearSubCorePluginData";
      Iterator localIterator = this.gpi.entrySet().iterator();
      while (localIterator.hasNext()) {
        ((aq)((Map.Entry)localIterator.next()).getValue()).eI(paramInt);
      }
      this.gpl = "";
    }
    finally {}
    GMTrace.o(669478027264L, 4988);
  }
  
  public final aq gZ(String paramString)
  {
    GMTrace.i(669746462720L, 4990);
    paramString = (aq)this.gpi.get(paramString);
    GMTrace.o(669746462720L, 4990);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */