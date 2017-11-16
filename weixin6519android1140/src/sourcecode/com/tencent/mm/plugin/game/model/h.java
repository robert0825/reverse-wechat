package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;

public class h
  implements com.tencent.mm.ad.e
{
  private static h lMk;
  private boolean gqR;
  
  public h()
  {
    GMTrace.i(16560051716096L, 123382);
    this.gqR = false;
    GMTrace.o(16560051716096L, 123382);
  }
  
  public static h aFl()
  {
    GMTrace.i(16560185933824L, 123383);
    if (lMk == null) {}
    try
    {
      if (lMk == null) {
        lMk = new h();
      }
      h localh = lMk;
      GMTrace.o(16560185933824L, 123383);
      return localh;
    }
    finally {}
  }
  
  private void release()
  {
    GMTrace.i(16560454369280L, 123385);
    this.gqR = false;
    at.wS().b(1311, this);
    GMTrace.o(16560454369280L, 123385);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(16560588587008L, 123386);
    if (paramk.getType() == 1311)
    {
      w.i("MicroMsg.GameConfigUpdater", "getGameCenterGlobalSetting sceneEnd, %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vpX, Long.valueOf(bg.Pu()));
      release();
    }
    GMTrace.o(16560588587008L, 123386);
  }
  
  /* Error */
  public final void eX(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 118
    //   5: ldc 120
    //   7: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: iload_1
    //   11: ifeq +83 -> 94
    //   14: iconst_1
    //   15: istore_2
    //   16: iload_2
    //   17: ifeq +66 -> 83
    //   20: aload_0
    //   21: getfield 25	com/tencent/mm/plugin/game/model/h:gqR	Z
    //   24: ifne +59 -> 83
    //   27: ldc 66
    //   29: ldc 122
    //   31: iconst_1
    //   32: anewarray 4	java/lang/Object
    //   35: dup
    //   36: iconst_0
    //   37: iload_1
    //   38: invokestatic 127	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   41: aastore
    //   42: invokestatic 79	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   45: aload_0
    //   46: invokespecial 115	com/tencent/mm/plugin/game/model/h:release	()V
    //   49: aload_0
    //   50: iconst_1
    //   51: putfield 25	com/tencent/mm/plugin/game/model/h:gqR	Z
    //   54: invokestatic 47	com/tencent/mm/y/at:wS	()Lcom/tencent/mm/ad/n;
    //   57: sipush 1311
    //   60: aload_0
    //   61: invokevirtual 129	com/tencent/mm/ad/n:a	(ILcom/tencent/mm/ad/e;)V
    //   64: new 131	com/tencent/mm/plugin/game/model/aq
    //   67: dup
    //   68: invokespecial 132	com/tencent/mm/plugin/game/model/aq:<init>	()V
    //   71: astore 5
    //   73: invokestatic 47	com/tencent/mm/y/at:wS	()Lcom/tencent/mm/ad/n;
    //   76: aload 5
    //   78: iconst_0
    //   79: invokevirtual 135	com/tencent/mm/ad/n:a	(Lcom/tencent/mm/ad/k;I)Z
    //   82: pop
    //   83: ldc2_w 118
    //   86: ldc 120
    //   88: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   91: aload_0
    //   92: monitorexit
    //   93: return
    //   94: invokestatic 85	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
    //   97: invokevirtual 91	com/tencent/mm/kernel/e:xh	()Lcom/tencent/mm/storage/t;
    //   100: getstatic 97	com/tencent/mm/storage/w$a:vpX	Lcom/tencent/mm/storage/w$a;
    //   103: lconst_0
    //   104: invokestatic 108	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   107: invokevirtual 139	com/tencent/mm/storage/t:get	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)Ljava/lang/Object;
    //   110: checkcast 105	java/lang/Long
    //   113: invokestatic 143	com/tencent/mm/sdk/platformtools/bg:c	(Ljava/lang/Long;)J
    //   116: invokestatic 108	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   119: invokevirtual 146	java/lang/Long:longValue	()J
    //   122: invokestatic 150	com/tencent/mm/sdk/platformtools/bg:aG	(J)J
    //   125: lstore_3
    //   126: lload_3
    //   127: ldc2_w 151
    //   130: lcmp
    //   131: ifle +8 -> 139
    //   134: iconst_1
    //   135: istore_2
    //   136: goto -120 -> 16
    //   139: iconst_0
    //   140: istore_2
    //   141: goto -125 -> 16
    //   144: astore 5
    //   146: aload_0
    //   147: monitorexit
    //   148: aload 5
    //   150: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	151	0	this	h
    //   0	151	1	paramBoolean	boolean
    //   15	126	2	i	int
    //   125	2	3	l	long
    //   71	6	5	localaq	aq
    //   144	5	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	10	144	finally
    //   20	83	144	finally
    //   83	91	144	finally
    //   94	126	144	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */