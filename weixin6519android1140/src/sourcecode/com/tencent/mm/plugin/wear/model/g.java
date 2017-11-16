package com.tencent.mm.plugin.wear.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class g
{
  private static int rAi;
  private HashMap<String, f> rAj;
  
  static
  {
    GMTrace.i(9178210893824L, 68383);
    rAi = 0;
    GMTrace.o(9178210893824L, 68383);
  }
  
  public g()
  {
    GMTrace.i(9177271369728L, 68376);
    this.rAj = new HashMap();
    GMTrace.o(9177271369728L, 68376);
  }
  
  /* Error */
  public final f KS(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 40
    //   5: ldc 42
    //   7: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 37	com/tencent/mm/plugin/wear/model/g:rAj	Ljava/util/HashMap;
    //   14: aload_1
    //   15: invokevirtual 46	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   18: ifeq +33 -> 51
    //   21: aload_0
    //   22: getfield 37	com/tencent/mm/plugin/wear/model/g:rAj	Ljava/util/HashMap;
    //   25: aload_1
    //   26: invokevirtual 50	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   29: checkcast 52	com/tencent/mm/plugin/wear/model/f
    //   32: invokevirtual 56	com/tencent/mm/plugin/wear/model/f:clone	()Ljava/lang/Object;
    //   35: checkcast 52	com/tencent/mm/plugin/wear/model/f
    //   38: astore_1
    //   39: ldc2_w 40
    //   42: ldc 42
    //   44: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_1
    //   50: areturn
    //   51: getstatic 22	com/tencent/mm/plugin/wear/model/g:rAi	I
    //   54: iconst_1
    //   55: iadd
    //   56: putstatic 22	com/tencent/mm/plugin/wear/model/g:rAi	I
    //   59: new 52	com/tencent/mm/plugin/wear/model/f
    //   62: dup
    //   63: invokespecial 57	com/tencent/mm/plugin/wear/model/f:<init>	()V
    //   66: astore_2
    //   67: aload_2
    //   68: aload_1
    //   69: putfield 61	com/tencent/mm/plugin/wear/model/f:eDs	Ljava/lang/String;
    //   72: aload_2
    //   73: getstatic 22	com/tencent/mm/plugin/wear/model/g:rAi	I
    //   76: putfield 64	com/tencent/mm/plugin/wear/model/f:id	I
    //   79: aload_2
    //   80: getstatic 70	com/tencent/mm/plugin/wear/model/f$a:rAd	Lcom/tencent/mm/plugin/wear/model/f$a;
    //   83: putfield 73	com/tencent/mm/plugin/wear/model/f:rAc	Lcom/tencent/mm/plugin/wear/model/f$a;
    //   86: aload_0
    //   87: getfield 37	com/tencent/mm/plugin/wear/model/g:rAj	Ljava/util/HashMap;
    //   90: aload_1
    //   91: aload_2
    //   92: invokevirtual 77	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   95: pop
    //   96: aload_2
    //   97: invokevirtual 56	com/tencent/mm/plugin/wear/model/f:clone	()Ljava/lang/Object;
    //   100: checkcast 52	com/tencent/mm/plugin/wear/model/f
    //   103: astore_1
    //   104: ldc2_w 40
    //   107: ldc 42
    //   109: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   112: goto -65 -> 47
    //   115: astore_1
    //   116: aload_0
    //   117: monitorexit
    //   118: aload_1
    //   119: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	this	g
    //   0	120	1	paramString	String
    //   66	31	2	localf	f
    // Exception table:
    //   from	to	target	type
    //   2	47	115	finally
    //   51	112	115	finally
  }
  
  public final void KT(String paramString)
  {
    try
    {
      GMTrace.i(9177539805184L, 68378);
      w.i("MicroMsg.Wear.WearNotificationMap", "reset notification talker=%s", new Object[] { paramString });
      if (this.rAj.containsKey(paramString))
      {
        ((f)this.rAj.get(paramString)).rAc = f.a.rAd;
        ((f)this.rAj.get(paramString)).rAb = 0;
      }
      GMTrace.o(9177539805184L, 68378);
      return;
    }
    finally {}
  }
  
  public final void KU(String paramString)
  {
    try
    {
      GMTrace.i(9177808240640L, 68380);
      if (this.rAj.containsKey(paramString))
      {
        paramString = (f)this.rAj.get(paramString);
        paramString.rAc = f.a.rAg;
        paramString.rAb = 0;
        w.i("MicroMsg.Wear.WearNotificationMap", "Update reply success, notification=%s", new Object[] { paramString });
      }
      GMTrace.o(9177808240640L, 68380);
      return;
    }
    finally {}
  }
  
  public final void KV(String paramString)
  {
    try
    {
      GMTrace.i(9178076676096L, 68382);
      if (this.rAj.containsKey(paramString))
      {
        paramString = (f)this.rAj.get(paramString);
        paramString.rAc = f.a.rAe;
        w.i("MicroMsg.Wear.WearNotificationMap", "Update showing success, notification=%s", new Object[] { paramString });
      }
      GMTrace.o(9178076676096L, 68382);
      return;
    }
    finally {}
  }
  
  public final void a(f paramf)
  {
    try
    {
      GMTrace.i(9177674022912L, 68379);
      w.i("MicroMsg.Wear.WearNotificationMap", "update notification=%s", new Object[] { paramf });
      this.rAj.put(paramf.eDs, paramf);
      GMTrace.o(9177674022912L, 68379);
      return;
    }
    finally
    {
      paramf = finally;
      throw paramf;
    }
  }
  
  public final void cf(String paramString, int paramInt)
  {
    try
    {
      GMTrace.i(9177942458368L, 68381);
      if (this.rAj.containsKey(paramString))
      {
        paramString = (f)this.rAj.get(paramString);
        paramString.rAc = f.a.rAf;
        paramString.rAb = paramInt;
        w.i("MicroMsg.Wear.WearNotificationMap", "Update ignore success, notification=%s", new Object[] { paramString });
      }
      GMTrace.o(9177942458368L, 68381);
      return;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */