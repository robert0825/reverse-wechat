package com.tencent.mm.ba;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  implements com.tencent.map.a.a.a, e
{
  private float eMl;
  private float eNR;
  private int eNS;
  private int eNT;
  private String eNU;
  private String eNV;
  public a gSR;
  public byte[] gSS;
  private aj gST;
  private int gSU;
  public Object lock;
  private int scene;
  
  public c(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, String paramString1, String paramString2, int paramInt3, int paramInt4)
  {
    GMTrace.i(4402878349312L, 32804);
    this.lock = new Object();
    h.xz();
    this.gST = new aj(h.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(4402475696128L, 32801);
        w.w("MicroMsg.SenseWhereHttpUtil", "it is time up, has no sense where response.");
        if (c.this.gSR != null) {
          h.xx().fYr.c(c.this.gSR);
        }
        c.this.gSR = null;
        c.this.gSS = null;
        synchronized (c.this.lock)
        {
          c.this.lock.notifyAll();
          GMTrace.o(4402475696128L, 32801);
          return false;
        }
      }
    }, false);
    this.eNR = paramFloat1;
    this.eMl = paramFloat2;
    this.eNS = paramInt1;
    this.eNT = paramInt2;
    this.eNU = paramString1;
    this.eNV = paramString2;
    this.gSU = paramInt3;
    this.scene = paramInt4;
    h.xx().fYr.a(752, this);
    GMTrace.o(4402878349312L, 32804);
  }
  
  /* Error */
  public final void a(int paramInt1, int paramInt2, String arg3, com.tencent.mm.ad.k paramk)
  {
    // Byte code:
    //   0: ldc2_w 117
    //   3: ldc 119
    //   5: invokestatic 43	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: getfield 77	com/tencent/mm/ba/c:gST	Lcom/tencent/mm/sdk/platformtools/aj;
    //   12: invokevirtual 122	com/tencent/mm/sdk/platformtools/aj:stopTimer	()V
    //   15: iload_1
    //   16: ifne +145 -> 161
    //   19: iload_2
    //   20: ifne +141 -> 161
    //   23: aload 4
    //   25: instanceof 124
    //   28: ifeq +118 -> 146
    //   31: aload 4
    //   33: checkcast 124	com/tencent/mm/ba/a
    //   36: getfield 127	com/tencent/mm/ba/a:gSr	Ljava/lang/String;
    //   39: ldc -127
    //   41: invokestatic 135	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   44: astore_3
    //   45: ldc -119
    //   47: new 139	java/lang/StringBuilder
    //   50: dup
    //   51: ldc -115
    //   53: invokespecial 144	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   56: aload_3
    //   57: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: invokestatic 158	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   66: aload_0
    //   67: aload_3
    //   68: ldc -96
    //   70: invokevirtual 166	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   73: putfield 168	com/tencent/mm/ba/c:gSS	[B
    //   76: aload_0
    //   77: getfield 45	com/tencent/mm/ba/c:lock	Ljava/lang/Object;
    //   80: astore_3
    //   81: aload_3
    //   82: monitorenter
    //   83: aload_0
    //   84: getfield 45	com/tencent/mm/ba/c:lock	Ljava/lang/Object;
    //   87: invokevirtual 171	java/lang/Object:notifyAll	()V
    //   90: aload_3
    //   91: monitorexit
    //   92: aload_0
    //   93: aconst_null
    //   94: putfield 173	com/tencent/mm/ba/c:gSR	Lcom/tencent/mm/ba/a;
    //   97: ldc2_w 117
    //   100: ldc 119
    //   102: invokestatic 112	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   105: return
    //   106: astore_3
    //   107: ldc -119
    //   109: aload_3
    //   110: ldc -127
    //   112: iconst_0
    //   113: anewarray 4	java/lang/Object
    //   116: invokestatic 177	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: ldc -119
    //   121: new 139	java/lang/StringBuilder
    //   124: dup
    //   125: ldc -77
    //   127: invokespecial 144	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   130: aload_3
    //   131: invokevirtual 180	java/lang/Exception:toString	()Ljava/lang/String;
    //   134: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   140: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   143: goto -67 -> 76
    //   146: aload_0
    //   147: aconst_null
    //   148: putfield 168	com/tencent/mm/ba/c:gSS	[B
    //   151: goto -75 -> 76
    //   154: astore 4
    //   156: aload_3
    //   157: monitorexit
    //   158: aload 4
    //   160: athrow
    //   161: ldc -119
    //   163: ldc -71
    //   165: iconst_3
    //   166: anewarray 4	java/lang/Object
    //   169: dup
    //   170: iconst_0
    //   171: iload_1
    //   172: invokestatic 191	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   175: aastore
    //   176: dup
    //   177: iconst_1
    //   178: iload_2
    //   179: invokestatic 191	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   182: aastore
    //   183: dup
    //   184: iconst_2
    //   185: aload_3
    //   186: aastore
    //   187: invokestatic 195	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: aload_0
    //   191: aconst_null
    //   192: putfield 168	com/tencent/mm/ba/c:gSS	[B
    //   195: aload_0
    //   196: getfield 45	com/tencent/mm/ba/c:lock	Ljava/lang/Object;
    //   199: astore_3
    //   200: aload_3
    //   201: monitorenter
    //   202: aload_0
    //   203: getfield 45	com/tencent/mm/ba/c:lock	Ljava/lang/Object;
    //   206: invokevirtual 171	java/lang/Object:notifyAll	()V
    //   209: aload_3
    //   210: monitorexit
    //   211: invokestatic 201	com/tencent/mm/ba/b:KM	()Lcom/tencent/mm/ba/b;
    //   214: invokevirtual 204	com/tencent/mm/ba/b:KO	()V
    //   217: getstatic 210	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   220: ldc2_w 211
    //   223: ldc2_w 213
    //   226: lconst_1
    //   227: iconst_0
    //   228: invokevirtual 217	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   231: goto -139 -> 92
    //   234: astore 4
    //   236: aload_3
    //   237: monitorexit
    //   238: aload 4
    //   240: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	241	0	this	c
    //   0	241	1	paramInt1	int
    //   0	241	2	paramInt2	int
    //   0	241	4	paramk	com.tencent.mm.ad.k
    // Exception table:
    //   from	to	target	type
    //   66	76	106	java/lang/Exception
    //   83	92	154	finally
    //   156	158	154	finally
    //   202	211	234	finally
    //   236	238	234	finally
  }
  
  public final void finish()
  {
    GMTrace.i(4403012567040L, 32805);
    this.gST.stopTimer();
    if (this.gSR != null) {
      h.xx().fYr.c(this.gSR);
    }
    this.gSR = null;
    this.gSS = null;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      h.xx().fYr.b(752, this);
      GMTrace.o(4403012567040L, 32805);
      return;
    }
  }
  
  public final byte[] m(byte[] arg1)
  {
    GMTrace.i(4403146784768L, 32806);
    for (;;)
    {
      try
      {
        ??? = new String(???, "UTF-8");
        w.d("MicroMsg.SenseWhereHttpUtil", "sense where http request content : " + ???);
        this.gSS = null;
        this.gSR = new a(this.eNR, this.eMl, this.eNS, this.eNT, this.eNU, this.eNV, this.gSU, this.scene, ???);
        h.xx().fYr.a(this.gSR, 0);
        this.gST.z(60000L, 60000L);
      }
      catch (Exception ???)
      {
        w.printErrStackTrace("MicroMsg.SenseWhereHttpUtil", ???, "", new Object[0]);
        w.e("MicroMsg.SenseWhereHttpUtil", "sense where http request error: " + ???.toString());
        continue;
      }
      synchronized (this.lock)
      {
        this.lock.wait();
        w.i("MicroMsg.SenseWhereHttpUtil", "upload sense where info finish. it is response is null? %b", new Object[] { Boolean.valueOf(bg.bq(this.gSS)) });
        ??? = this.gSS;
        GMTrace.o(4403146784768L, 32806);
        return (byte[])???;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ba\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */