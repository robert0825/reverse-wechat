package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bm.b;
import com.tencent.mm.e.b.g.a;
import com.tencent.mm.e.c.d;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.j;
import com.tencent.mm.protocal.c.btd;
import com.tencent.mm.protocal.c.bte;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.at;
import com.tencent.qqpinyin.voicerecoapi.c.a;
import java.util.LinkedList;

public final class p
  implements e
{
  public static final String rAB;
  public boolean eYr;
  public com.tencent.mm.plugin.wear.model.d.c rAC;
  public com.tencent.qqpinyin.voicerecoapi.c rAD;
  public d rAE;
  private int rAF;
  public int rAG;
  public int rAH;
  public LinkedList<Integer> rAI;
  
  static
  {
    GMTrace.i(9199417294848L, 68541);
    rAB = com.tencent.mm.storage.w.ghv + "tmp_wearvoicetotext.spx";
    GMTrace.o(9199417294848L, 68541);
  }
  
  public p()
  {
    GMTrace.i(9198477770752L, 68534);
    this.eYr = false;
    this.rAF = 0;
    this.rAI = new LinkedList();
    GMTrace.o(9198477770752L, 68534);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9198746206208L, 68536);
    if ((paramk instanceof com.tencent.mm.plugin.wear.model.d.c))
    {
      paramString = (com.tencent.mm.plugin.wear.model.d.c)paramk;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        at.wS().b(349, this);
        paramk = new bte();
        paramk.vbv = paramString.eDs;
        paramk.ulE = "";
        paramk.tNf = -1;
        paramk.vbZ = false;
        a.bBm().rzz.a(new a(paramString.otj, paramk));
        GMTrace.o(9198746206208L, 68536);
        return;
      }
      if (paramString.rAs)
      {
        at.wS().b(349, this);
        paramk = new bte();
        paramk.vbv = paramString.eDs;
        if (bg.nm(paramString.rAr)) {
          break label225;
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.VoiceToTextServer", "receive text: %s", new Object[] { paramString.rAr });
        paramk.ulE = paramString.rAr;
        paramk.tNf = 0;
      }
    }
    for (paramk.vbZ = true;; paramk.vbZ = false)
    {
      a.bBm().rzz.a(new a(paramString.otj, paramk));
      GMTrace.o(9198746206208L, 68536);
      return;
      label225:
      paramk.ulE = "";
      paramk.tNf = -1;
    }
  }
  
  public final void a(int paramInt, btd parambtd)
  {
    GMTrace.i(9198880423936L, 68537);
    if (parambtd.tRB == null)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.VoiceToTextServer", "voice data is null");
      GMTrace.o(9198880423936L, 68537);
      return;
    }
    Object localObject = parambtd.tRB.toByteArray();
    this.rAF += this.rAE.a(new g.a((byte[])localObject, parambtd.ugl), 0, false);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.VoiceToTextServer", "write bytes: %d", new Object[] { Integer.valueOf(this.rAF) });
    short[] arrayOfShort = new short[parambtd.ugl / 2];
    int i = 0;
    while (i < parambtd.ugl / 2)
    {
      arrayOfShort[i] = ((short)(localObject[(i * 2)] & 0xFF | localObject[(i * 2 + 1)] << 8));
      i += 1;
    }
    localObject = new c.a();
    this.rAD.a(arrayOfShort, parambtd.ugl / 2, (c.a)localObject);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.VoiceToTextServer", "state.vad_flag: " + ((c.a)localObject).xOY);
    if (((c.a)localObject).xOY == 2) {
      this.rAH = 1;
    }
    for (;;)
    {
      if (this.rAH != 0)
      {
        if (this.rAH < 0)
        {
          if (this.rAI.size() > 10) {
            this.rAI.removeLast();
          }
          this.rAI.addFirst(Integer.valueOf(paramInt));
        }
        if (this.rAH == 1)
        {
          parambtd = new bte();
          parambtd.vbv = this.rAC.eDs;
          parambtd.ulE = "";
          parambtd.tNf = this.rAH;
          parambtd.vbZ = true;
          a.bBm().rzz.a(new a(this.rAC.otj, parambtd));
          this.rAH = 0;
        }
      }
      if ((!this.eYr) && (this.rAF > 3300))
      {
        this.eYr = true;
        at.wS().a(this.rAC, 0);
      }
      GMTrace.o(9198880423936L, 68537);
      return;
      if (((c.a)localObject).xOY == 3) {
        this.rAH = 2;
      }
    }
  }
  
  public final void reset()
  {
    GMTrace.i(9198611988480L, 68535);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.VoiceToTextServer", "reset: sessionId=%s", new Object[] { Integer.valueOf(this.rAG) });
    if (this.rAE != null)
    {
      this.rAE.qI();
      this.rAE = null;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.VoiceToTextServer", "reset speexWriter");
    }
    if (this.rAD != null)
    {
      this.rAD.stop();
      this.rAD = null;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.VoiceToTextServer", "reset voiceDetectAPI");
    }
    if (this.rAC != null)
    {
      this.rAC.hdn = true;
      at.wS().b(349, this);
      at.wS().c(this.rAC);
      this.rAC = null;
    }
    this.rAH = 0;
    this.eYr = false;
    this.rAF = 0;
    this.rAG = -1;
    this.rAI.clear();
    GMTrace.o(9198611988480L, 68535);
  }
  
  final class a
    extends com.tencent.mm.plugin.wear.model.f.c
  {
    public int otj;
    public bte rAK;
    public int rzX;
    public int rzY;
    
    public a(int paramInt, bte parambte)
    {
      GMTrace.i(9197672464384L, 68528);
      this.rzX = 2;
      this.otj = paramInt;
      this.rzY = 30001;
      this.rAK = parambte;
      GMTrace.o(9197672464384L, 68528);
    }
    
    public final String getName()
    {
      GMTrace.i(9197940899840L, 68530);
      GMTrace.o(9197940899840L, 68530);
      return "WearVoiceToTextTask";
    }
    
    /* Error */
    protected final void send()
    {
      // Byte code:
      //   0: ldc2_w 54
      //   3: ldc 56
      //   5: invokestatic 31	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: aload_0
      //   9: getfield 39	com/tencent/mm/plugin/wear/model/e/p$a:rAK	Lcom/tencent/mm/protocal/c/bte;
      //   12: invokevirtual 62	com/tencent/mm/protocal/c/bte:toByteArray	()[B
      //   15: astore_1
      //   16: invokestatic 68	com/tencent/mm/plugin/wear/model/a:bBm	()Lcom/tencent/mm/plugin/wear/model/a;
      //   19: getfield 72	com/tencent/mm/plugin/wear/model/a:rzt	Lcom/tencent/mm/plugin/wear/model/d;
      //   22: aload_1
      //   23: invokevirtual 78	com/tencent/mm/plugin/wear/model/d:aS	([B)[B
      //   26: astore_2
      //   27: new 80	java/io/ByteArrayOutputStream
      //   30: dup
      //   31: invokespecial 81	java/io/ByteArrayOutputStream:<init>	()V
      //   34: astore_1
      //   35: new 83	java/io/DataOutputStream
      //   38: dup
      //   39: aload_1
      //   40: invokespecial 86	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
      //   43: astore_3
      //   44: aload_3
      //   45: aload_0
      //   46: getfield 33	com/tencent/mm/plugin/wear/model/e/p$a:rzX	I
      //   49: invokevirtual 90	java/io/DataOutputStream:writeInt	(I)V
      //   52: aload_3
      //   53: aload_0
      //   54: getfield 35	com/tencent/mm/plugin/wear/model/e/p$a:otj	I
      //   57: invokevirtual 90	java/io/DataOutputStream:writeInt	(I)V
      //   60: aload_3
      //   61: aload_0
      //   62: getfield 37	com/tencent/mm/plugin/wear/model/e/p$a:rzY	I
      //   65: invokevirtual 90	java/io/DataOutputStream:writeInt	(I)V
      //   68: aload_2
      //   69: ifnull +98 -> 167
      //   72: aload_2
      //   73: arraylength
      //   74: ifle +93 -> 167
      //   77: aload_3
      //   78: aload_2
      //   79: arraylength
      //   80: invokevirtual 90	java/io/DataOutputStream:writeInt	(I)V
      //   83: aload_3
      //   84: aload_2
      //   85: invokevirtual 94	java/io/DataOutputStream:write	([B)V
      //   88: aload_1
      //   89: invokevirtual 95	java/io/ByteArrayOutputStream:toByteArray	()[B
      //   92: astore_2
      //   93: ldc 97
      //   95: ldc 99
      //   97: iconst_2
      //   98: anewarray 101	java/lang/Object
      //   101: dup
      //   102: iconst_0
      //   103: aload_0
      //   104: getfield 37	com/tencent/mm/plugin/wear/model/e/p$a:rzY	I
      //   107: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   110: aastore
      //   111: dup
      //   112: iconst_1
      //   113: aload_2
      //   114: arraylength
      //   115: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   118: aastore
      //   119: invokestatic 112	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   122: invokestatic 68	com/tencent/mm/plugin/wear/model/a:bBm	()Lcom/tencent/mm/plugin/wear/model/a;
      //   125: getfield 72	com/tencent/mm/plugin/wear/model/a:rzt	Lcom/tencent/mm/plugin/wear/model/d;
      //   128: aload_1
      //   129: invokevirtual 95	java/io/ByteArrayOutputStream:toByteArray	()[B
      //   132: invokevirtual 116	com/tencent/mm/plugin/wear/model/d:aQ	([B)Z
      //   135: pop
      //   136: ldc2_w 54
      //   139: ldc 56
      //   141: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   144: return
      //   145: astore_1
      //   146: ldc 97
      //   148: aload_1
      //   149: ldc 118
      //   151: iconst_0
      //   152: anewarray 101	java/lang/Object
      //   155: invokestatic 122	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   158: ldc2_w 54
      //   161: ldc 56
      //   163: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   166: return
      //   167: aload_3
      //   168: iconst_0
      //   169: invokevirtual 90	java/io/DataOutputStream:writeInt	(I)V
      //   172: goto -84 -> 88
      //   175: astore_1
      //   176: ldc 97
      //   178: aload_1
      //   179: ldc 124
      //   181: iconst_3
      //   182: anewarray 101	java/lang/Object
      //   185: dup
      //   186: iconst_0
      //   187: aload_0
      //   188: getfield 33	com/tencent/mm/plugin/wear/model/e/p$a:rzX	I
      //   191: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   194: aastore
      //   195: dup
      //   196: iconst_1
      //   197: aload_0
      //   198: getfield 35	com/tencent/mm/plugin/wear/model/e/p$a:otj	I
      //   201: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   204: aastore
      //   205: dup
      //   206: iconst_2
      //   207: aload_0
      //   208: getfield 37	com/tencent/mm/plugin/wear/model/e/p$a:rzY	I
      //   211: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   214: aastore
      //   215: invokestatic 122	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   218: ldc2_w 54
      //   221: ldc 56
      //   223: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   226: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	227	0	this	a
      //   15	114	1	localObject	Object
      //   145	4	1	localIOException1	java.io.IOException
      //   175	4	1	localIOException2	java.io.IOException
      //   26	88	2	arrayOfByte	byte[]
      //   43	125	3	localDataOutputStream	java.io.DataOutputStream
      // Exception table:
      //   from	to	target	type
      //   8	27	145	java/io/IOException
      //   44	68	175	java/io/IOException
      //   72	88	175	java/io/IOException
      //   88	136	175	java/io/IOException
      //   167	172	175	java/io/IOException
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\e\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */