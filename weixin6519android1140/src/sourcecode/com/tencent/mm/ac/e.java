package com.tencent.mm.ac;

import android.annotation.SuppressLint;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.e;
import junit.framework.Assert;

public final class e
  implements com.tencent.mm.ad.e
{
  b gsA;
  k gsB;
  boolean gsC;
  private ar gsD;
  h gsr;
  
  public e()
  {
    GMTrace.i(373662154752L, 2784);
    this.gsr = null;
    this.gsA = null;
    this.gsB = null;
    this.gsC = false;
    this.gsD = null;
    com.tencent.mm.kernel.h.wS().a(158, this);
    GMTrace.o(373662154752L, 2784);
  }
  
  public final void Dl()
  {
    GMTrace.i(373796372480L, 2785);
    com.tencent.mm.kernel.h.wS().b(158, this);
    GMTrace.o(373796372480L, 2785);
  }
  
  public final int a(String paramString, b paramb)
  {
    GMTrace.i(373930590208L, 2786);
    Assert.assertTrue("GetHDHeadImg must set callback", true);
    if (bg.nm(paramString))
    {
      paramb.aN(3, -101);
      GMTrace.o(373930590208L, 2786);
      return -101;
    }
    this.gsA = paramb;
    if (x.fw(paramString)) {}
    for (String str = x.Tt(paramString);; str = paramString)
    {
      this.gsr = n.Di().ig(str);
      w.d("MicroMsg.GetHDHeadImgHelper", "GetHDHeadImg: %s", new Object[] { str });
      if ((this.gsr == null) || (!this.gsr.getUsername().equals(str)))
      {
        this.gsr = new h();
        this.gsr.username = str;
      }
      if (bg.nm(this.gsr.Do()))
      {
        w.w("MicroMsg.GetHDHeadImgHelper", "dkhurl [%s] has NO URL flag:%d !", new Object[] { paramString, Integer.valueOf(this.gsr.fiZ) });
        this.gsB = new k(str);
        if (!com.tencent.mm.kernel.h.wS().a(this.gsB, 0))
        {
          paramb.aN(3, -102);
          GMTrace.o(373930590208L, 2786);
          return -102;
        }
        GMTrace.o(373930590208L, 2786);
        return 0;
      }
      paramString = this.gsr;
      if ((this.gsD == null) || (this.gsD.Yi())) {
        this.gsD = new ar(1, "get-hd-headimg", 1);
      }
      if (this.gsD.c(new a(paramString)) == 0)
      {
        GMTrace.o(373930590208L, 2786);
        return 0;
      }
      paramb.aN(3, -103);
      GMTrace.o(373930590208L, 2786);
      return -103;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(374064807936L, 2787);
    this.gsA.aN(paramInt1, paramInt2);
    GMTrace.o(374064807936L, 2787);
  }
  
  @SuppressLint({"DefaultLocale"})
  final class a
    implements ar.a
  {
    public String gsE;
    public boolean gsF;
    private g.a gsG;
    public h gsn;
    
    public a(h paramh)
    {
      GMTrace.i(387083927552L, 2884);
      this.gsn = null;
      this.gsE = null;
      this.gsF = true;
      this.gsn = paramh;
      n.Dh();
      this.gsE = d.t(paramh.getUsername(), true);
      this.gsG = new g.a();
      GMTrace.o(387083927552L, 2884);
    }
    
    /* Error */
    public final boolean Dj()
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 4
      //   3: aconst_null
      //   4: astore 5
      //   6: ldc2_w 75
      //   9: sipush 2885
      //   12: invokestatic 37	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   15: aload_0
      //   16: getfield 39	com/tencent/mm/ac/e$a:gsn	Lcom/tencent/mm/ac/h;
      //   19: ifnonnull +14 -> 33
      //   22: ldc2_w 75
      //   25: sipush 2885
      //   28: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   31: iconst_0
      //   32: ireturn
      //   33: aload_0
      //   34: getfield 39	com/tencent/mm/ac/e$a:gsn	Lcom/tencent/mm/ac/h;
      //   37: invokevirtual 79	com/tencent/mm/ac/h:Do	()Ljava/lang/String;
      //   40: astore 6
      //   42: ldc 81
      //   44: astore_3
      //   45: invokestatic 87	com/tencent/mm/kernel/h:xw	()Lcom/tencent/mm/kernel/a;
      //   48: invokevirtual 92	com/tencent/mm/kernel/a:wL	()Z
      //   51: ifeq +61 -> 112
      //   54: getstatic 98	com/tencent/mm/protocal/d:tJC	I
      //   57: istore_1
      //   58: invokestatic 87	com/tencent/mm/kernel/h:xw	()Lcom/tencent/mm/kernel/a;
      //   61: pop
      //   62: ldc 100
      //   64: iconst_4
      //   65: anewarray 4	java/lang/Object
      //   68: dup
      //   69: iconst_0
      //   70: iload_1
      //   71: invokestatic 106	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   74: aastore
      //   75: dup
      //   76: iconst_1
      //   77: invokestatic 110	com/tencent/mm/kernel/a:ww	()I
      //   80: invokestatic 116	com/tencent/mm/a/o:getString	(I)Ljava/lang/String;
      //   83: aastore
      //   84: dup
      //   85: iconst_2
      //   86: invokestatic 122	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
      //   89: invokestatic 128	com/tencent/mm/sdk/platformtools/am:getNetTypeForStat	(Landroid/content/Context;)I
      //   92: invokestatic 106	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   95: aastore
      //   96: dup
      //   97: iconst_3
      //   98: invokestatic 122	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
      //   101: invokestatic 131	com/tencent/mm/sdk/platformtools/am:getStrength	(Landroid/content/Context;)I
      //   104: invokestatic 106	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   107: aastore
      //   108: invokestatic 137	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   111: astore_3
      //   112: ldc -117
      //   114: ldc -115
      //   116: iconst_3
      //   117: anewarray 4	java/lang/Object
      //   120: dup
      //   121: iconst_0
      //   122: aload_0
      //   123: getfield 39	com/tencent/mm/ac/e$a:gsn	Lcom/tencent/mm/ac/h;
      //   126: invokevirtual 55	com/tencent/mm/ac/h:getUsername	()Ljava/lang/String;
      //   129: aastore
      //   130: dup
      //   131: iconst_1
      //   132: aload_3
      //   133: aastore
      //   134: dup
      //   135: iconst_2
      //   136: aload 6
      //   138: aastore
      //   139: invokestatic 147	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   142: aload_0
      //   143: iconst_1
      //   144: putfield 43	com/tencent/mm/ac/e$a:gsF	Z
      //   147: aload 6
      //   149: aconst_null
      //   150: invokestatic 152	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
      //   153: astore_2
      //   154: aload_2
      //   155: ldc -102
      //   157: invokevirtual 160	com/tencent/mm/network/u:setRequestMethod	(Ljava/lang/String;)V
      //   160: aload_2
      //   161: ldc -94
      //   163: aload_3
      //   164: invokevirtual 166	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   167: aload_2
      //   168: sipush 5000
      //   171: invokevirtual 170	com/tencent/mm/network/u:setConnectTimeout	(I)V
      //   174: aload_2
      //   175: sipush 5000
      //   178: invokevirtual 173	com/tencent/mm/network/u:setReadTimeout	(I)V
      //   181: aload_2
      //   182: invokestatic 176	com/tencent/mm/network/b:a	(Lcom/tencent/mm/network/u;)I
      //   185: ifeq +30 -> 215
      //   188: ldc -117
      //   190: ldc -78
      //   192: iconst_1
      //   193: anewarray 4	java/lang/Object
      //   196: dup
      //   197: iconst_0
      //   198: aload 6
      //   200: aastore
      //   201: invokestatic 181	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   204: ldc2_w 75
      //   207: sipush 2885
      //   210: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   213: iconst_1
      //   214: ireturn
      //   215: aload_2
      //   216: invokevirtual 185	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
      //   219: astore_3
      //   220: aload_3
      //   221: ifnonnull +30 -> 251
      //   224: ldc -117
      //   226: ldc -69
      //   228: iconst_1
      //   229: anewarray 4	java/lang/Object
      //   232: dup
      //   233: iconst_0
      //   234: aload 6
      //   236: aastore
      //   237: invokestatic 147	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   240: ldc2_w 75
      //   243: sipush 2885
      //   246: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   249: iconst_1
      //   250: ireturn
      //   251: sipush 1024
      //   254: newarray <illegal type>
      //   256: astore 5
      //   258: new 189	java/lang/StringBuilder
      //   261: dup
      //   262: invokespecial 190	java/lang/StringBuilder:<init>	()V
      //   265: aload_0
      //   266: getfield 41	com/tencent/mm/ac/e$a:gsE	Ljava/lang/String;
      //   269: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   272: ldc -60
      //   274: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   277: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   280: invokestatic 205	com/tencent/mm/modelsfs/FileOp:hA	(Ljava/lang/String;)Ljava/io/OutputStream;
      //   283: astore 7
      //   285: aload_3
      //   286: aload 5
      //   288: invokevirtual 211	java/io/InputStream:read	([B)I
      //   291: istore_1
      //   292: iload_1
      //   293: iconst_m1
      //   294: if_icmpeq +97 -> 391
      //   297: aload 7
      //   299: aload 5
      //   301: iconst_0
      //   302: iload_1
      //   303: invokevirtual 217	java/io/OutputStream:write	([BII)V
      //   306: goto -21 -> 285
      //   309: astore 6
      //   311: aload_3
      //   312: astore 5
      //   314: aload 7
      //   316: astore 4
      //   318: aload_2
      //   319: astore_3
      //   320: aload 4
      //   322: astore_2
      //   323: aload 6
      //   325: astore 4
      //   327: ldc -117
      //   329: ldc -37
      //   331: iconst_1
      //   332: anewarray 4	java/lang/Object
      //   335: dup
      //   336: iconst_0
      //   337: aload 4
      //   339: invokestatic 225	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   342: aastore
      //   343: invokestatic 181	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   346: aload_0
      //   347: iconst_1
      //   348: putfield 43	com/tencent/mm/ac/e$a:gsF	Z
      //   351: aload_3
      //   352: ifnull +10 -> 362
      //   355: aload_3
      //   356: getfield 229	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
      //   359: invokevirtual 234	java/net/HttpURLConnection:disconnect	()V
      //   362: aload 5
      //   364: ifnull +8 -> 372
      //   367: aload 5
      //   369: invokevirtual 237	java/io/InputStream:close	()V
      //   372: aload_2
      //   373: ifnull +7 -> 380
      //   376: aload_2
      //   377: invokevirtual 238	java/io/OutputStream:close	()V
      //   380: ldc2_w 75
      //   383: sipush 2885
      //   386: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   389: iconst_1
      //   390: ireturn
      //   391: aload_0
      //   392: iconst_0
      //   393: putfield 43	com/tencent/mm/ac/e$a:gsF	Z
      //   396: aload 7
      //   398: invokevirtual 238	java/io/OutputStream:close	()V
      //   401: aload_2
      //   402: getfield 229	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
      //   405: invokevirtual 234	java/net/HttpURLConnection:disconnect	()V
      //   408: aload_3
      //   409: invokevirtual 237	java/io/InputStream:close	()V
      //   412: aconst_null
      //   413: astore_2
      //   414: aconst_null
      //   415: astore_3
      //   416: aload 4
      //   418: astore 5
      //   420: goto -69 -> 351
      //   423: astore_2
      //   424: ldc -117
      //   426: ldc -37
      //   428: iconst_1
      //   429: anewarray 4	java/lang/Object
      //   432: dup
      //   433: iconst_0
      //   434: aload_2
      //   435: invokestatic 225	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   438: aastore
      //   439: invokestatic 181	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   442: ldc -117
      //   444: ldc -16
      //   446: iconst_1
      //   447: anewarray 4	java/lang/Object
      //   450: dup
      //   451: iconst_0
      //   452: aload_2
      //   453: invokevirtual 243	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   456: aastore
      //   457: invokestatic 181	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   460: goto -80 -> 380
      //   463: astore 4
      //   465: aconst_null
      //   466: astore_2
      //   467: aconst_null
      //   468: astore_3
      //   469: goto -142 -> 327
      //   472: astore 4
      //   474: aconst_null
      //   475: astore 6
      //   477: aload_2
      //   478: astore_3
      //   479: aload 6
      //   481: astore_2
      //   482: goto -155 -> 327
      //   485: astore 4
      //   487: aload_2
      //   488: astore 6
      //   490: aconst_null
      //   491: astore_2
      //   492: aload_3
      //   493: astore 5
      //   495: aload 6
      //   497: astore_3
      //   498: goto -171 -> 327
      //   501: astore 4
      //   503: aconst_null
      //   504: astore 6
      //   506: aconst_null
      //   507: astore_2
      //   508: aload_3
      //   509: astore 5
      //   511: aload 6
      //   513: astore_3
      //   514: goto -187 -> 327
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	517	0	this	a
      //   57	246	1	i	int
      //   153	261	2	localObject1	Object
      //   423	30	2	localException1	Exception
      //   466	42	2	localObject2	Object
      //   44	470	3	localObject3	Object
      //   1	416	4	localObject4	Object
      //   463	1	4	localException2	Exception
      //   472	1	4	localException3	Exception
      //   485	1	4	localException4	Exception
      //   501	1	4	localException5	Exception
      //   4	506	5	localObject5	Object
      //   40	195	6	str	String
      //   309	15	6	localException6	Exception
      //   475	37	6	localObject6	Object
      //   283	114	7	localOutputStream	java.io.OutputStream
      // Exception table:
      //   from	to	target	type
      //   285	292	309	java/lang/Exception
      //   297	306	309	java/lang/Exception
      //   391	401	309	java/lang/Exception
      //   355	362	423	java/lang/Exception
      //   367	372	423	java/lang/Exception
      //   376	380	423	java/lang/Exception
      //   147	154	463	java/lang/Exception
      //   154	204	472	java/lang/Exception
      //   215	220	472	java/lang/Exception
      //   224	240	485	java/lang/Exception
      //   251	285	485	java/lang/Exception
      //   401	408	485	java/lang/Exception
      //   408	412	501	java/lang/Exception
    }
    
    public final boolean Dk()
    {
      GMTrace.i(387352363008L, 2886);
      if (e.this.gsC)
      {
        GMTrace.o(387352363008L, 2886);
        return false;
      }
      if ((this.gsF) || (bg.nm(this.gsE)))
      {
        e.this.gsA.aN(4, -1);
        GMTrace.o(387352363008L, 2886);
        return false;
      }
      w.d("MicroMsg.GetHDHeadImgHelper", "dkavatar user:" + this.gsn.getUsername() + " urltime:" + this.gsG.tD());
      if (ak.a.gmY != null) {
        ak.a.gmY.aI((int)FileOp.kX(this.gsE + ".tmp"), 0);
      }
      FileOp.deleteFile(this.gsE);
      FileOp.al(this.gsE + ".tmp", this.gsE);
      k.U(this.gsE, e.this.gsr.getUsername());
      e.this.gsA.aN(0, 0);
      GMTrace.o(387352363008L, 2886);
      return true;
    }
  }
  
  public static abstract interface b
  {
    public abstract int aN(int paramInt1, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ac\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */