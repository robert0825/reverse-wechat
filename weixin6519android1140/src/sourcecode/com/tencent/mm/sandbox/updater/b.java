package com.tencent.mm.sandbox.updater;

import android.os.AsyncTask;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.network.u;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.aej;
import com.tencent.mm.protocal.c.aek;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.er;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sandbox.monitor.c;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.net.HttpURLConnection;

public final class b
  extends c
{
  public String[] eCR;
  public byte[] gvf;
  public byte[] hge;
  public byte[] hgg;
  public int uin;
  private int vfo;
  private final int vfp;
  public int vfq;
  public com.tencent.mm.sandbox.b.a vfr;
  private a vfs;
  private com.tencent.mm.sandbox.b.a vft;
  
  public b(int paramInt1, String paramString, int paramInt2, int paramInt3, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String[] paramArrayOfString, boolean paramBoolean)
  {
    super(paramInt1, paramString, paramInt2, paramBoolean);
    GMTrace.i(3586968780800L, 26725);
    this.vfo = 0;
    this.vfp = 5;
    this.vfq = 0;
    this.vfs = null;
    this.vft = new com.tencent.mm.sandbox.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, azh paramAnonymousazh)
      {
        GMTrace.i(3585626603520L, 26715);
        if ((paramAnonymousInt1 != 200) || (paramAnonymousInt2 != 0) || ((paramAnonymousazh != null) && (paramAnonymousazh.uND.tST != 0)))
        {
          if (!b.this.bOK())
          {
            localObject = b.this;
            int i = ((b)localObject).vfq + 1;
            ((b)localObject).vfq = i;
            if (i < b.this.eCR.length * 5)
            {
              b.this.a(b.this.vfr);
              GMTrace.o(3585626603520L, 26715);
              return;
            }
          }
          b.this.vfr.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousazh);
          GMTrace.o(3585626603520L, 26715);
          return;
        }
        Object localObject = (aek)paramAnonymousazh;
        w.d("MicroMsg.NetSceneGetUpdatePack", "onGYNetEnd : file dir = " + com.tencent.mm.compatible.util.e.ghx);
        w.d("MicroMsg.NetSceneGetUpdatePack", "onGYNetEnd : total len = " + ((aek)localObject).tRC);
        w.d("MicroMsg.NetSceneGetUpdatePack", "onGYNetEnd : start pos = " + ((aek)localObject).tRD);
        w.d("MicroMsg.NetSceneGetUpdatePack", "onGYNetEnd : data len = " + ((aek)localObject).tRE);
        if ((((aek)localObject).tRE <= 0) || (((aek)localObject).ues == null))
        {
          w.e("MicroMsg.NetSceneGetUpdatePack", "data is null");
          b.this.vfr.a(paramAnonymousInt1, -1, null);
          GMTrace.o(3585626603520L, 26715);
          return;
        }
        if (((aek)localObject).ues.uNN != ((aek)localObject).tRE)
        {
          w.e("MicroMsg.NetSceneGetUpdatePack", "data len not match with data buf, dataLen = " + ((aek)localObject).tRE + " data buf len = " + ((aek)localObject).ues.uNN);
          b.this.vfr.a(4, -1, null);
          GMTrace.o(3585626603520L, 26715);
          return;
        }
        if ((((aek)localObject).tRD < 0) || (((aek)localObject).tRD + ((aek)localObject).tRE > ((aek)localObject).tRC))
        {
          w.e("MicroMsg.NetSceneGetUpdatePack", "startPos = " + ((aek)localObject).tRD + " dataLen = " + ((aek)localObject).tRE + " totalLen = " + ((aek)localObject).tRC);
          b.this.vfr.a(4, -1, null);
          GMTrace.o(3585626603520L, 26715);
          return;
        }
        if (((aek)localObject).tRC <= 0)
        {
          w.e("MicroMsg.NetSceneGetUpdatePack", "totalLen is invalid: totalLen = " + ((aek)localObject).tRC);
          b.this.vfr.a(4, -1, null);
          GMTrace.o(3585626603520L, 26715);
          return;
        }
        paramAnonymousInt1 = com.tencent.mm.a.e.a(c.veU, b.a(b.this), ".temp", ((aek)localObject).ues.uNP.toByteArray());
        if (paramAnonymousInt1 != 0)
        {
          w.e("MicroMsg.NetSceneGetUpdatePack", "appendBuf failed : " + paramAnonymousInt1);
          b.this.vfr.a(4, -1, null);
          GMTrace.o(3585626603520L, 26715);
          return;
        }
        b.a(b.this, ((aek)localObject).tRE + ((aek)localObject).tRD);
        b.b(b.this, ((aek)localObject).tRC);
        b.this.vfr.bP(((aek)localObject).tRC, ((aek)localObject).tRD);
        if (((aek)localObject).tRD + ((aek)localObject).tRE >= ((aek)localObject).tRC)
        {
          try
          {
            if (b.c(b.this).equalsIgnoreCase(g.bg(b.b(b.this))))
            {
              com.tencent.mm.a.e.g(c.veU, b.d(b.this) + ".temp", b.e(b.this) + ".apk");
              b.this.vfr.a(200, 0, paramAnonymousazh);
              GMTrace.o(3585626603520L, 26715);
              return;
            }
          }
          catch (Exception paramAnonymousazh)
          {
            w.printErrStackTrace("MicroMsg.NetSceneGetUpdatePack", paramAnonymousazh, "", new Object[0]);
            GMTrace.o(3585626603520L, 26715);
            return;
          }
          w.e("MicroMsg.NetSceneGetUpdatePack", "update pack check error");
          new File(b.f(b.this)).delete();
          b.this.vfr.a(-1, -1, paramAnonymousazh);
          GMTrace.o(3585626603520L, 26715);
          return;
        }
        b.this.a(b.this.vfr);
        GMTrace.o(3585626603520L, 26715);
      }
      
      public final void bP(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(3586029256704L, 26718);
        GMTrace.o(3586029256704L, 26718);
      }
      
      public final void eF(long paramAnonymousLong)
      {
        GMTrace.i(3585760821248L, 26716);
        b.this.vfr.eF(paramAnonymousLong);
        GMTrace.o(3585760821248L, 26716);
      }
      
      public final void eG(long paramAnonymousLong)
      {
        GMTrace.i(3585895038976L, 26717);
        b.this.vfr.eG(paramAnonymousLong);
        GMTrace.o(3585895038976L, 26717);
      }
    };
    this.eCR = paramArrayOfString;
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      this.eCR = new String[] { "short.weixin.qq.com" };
    }
    this.uin = paramInt3;
    this.hge = paramArrayOfByte1;
    this.gvf = paramArrayOfByte2;
    GMTrace.o(3586968780800L, 26725);
  }
  
  public final void a(com.tencent.mm.sandbox.b.a parama)
  {
    GMTrace.i(3587102998528L, 26726);
    this.vfr = parama;
    int i = this.vfo + 1;
    this.vfo = i;
    if (i > 1000)
    {
      w.d("MicroMsg.NetSceneGetUpdatePack", "doSceneCnt > DOSCENE_LIMIT, return");
      this.vfr.a(-1, -1, null);
      GMTrace.o(3587102998528L, 26726);
      return;
    }
    if (!f.L(this.veW))
    {
      w.e("MicroMsg.NetSceneGetUpdatePack", "SDCard full, packSize=[%s]", new Object[] { Integer.valueOf(this.veW) });
      parama.a(-1, -1, null);
      GMTrace.o(3587102998528L, 26726);
      return;
    }
    parama = new aej();
    Object localObject = new er();
    ((er)localObject).tTC = d.tJC;
    ((er)localObject).tOG = 0;
    ((er)localObject).kAW = this.uin;
    ((er)localObject).tTB = com.tencent.mm.bm.b.aX(p.ta().getBytes());
    if (((er)localObject).tTB.tJp.length >= 16) {
      ((er)localObject).tTB = ((er)localObject).tTB.zL(16);
    }
    ((er)localObject).tTD = com.tencent.mm.bm.b.aX(d.DEVICE_TYPE.getBytes());
    if (((er)localObject).tTD.tJp.length >= 132) {
      ((er)localObject).tTD = ((er)localObject).tTD.zL(132);
    }
    ((er)localObject).tTA = com.tencent.mm.bm.b.aX(this.hge);
    if (((er)localObject).tTA.tJp.length >= 36) {
      ((er)localObject).tTA = ((er)localObject).tTA.zL(36);
    }
    parama.uNh = ((er)localObject);
    parama.utV = this.veV;
    parama.tRD = this.veX;
    parama.tRC = this.veW;
    localObject = new a(this.eCR[(this.vfq / 5)], this.vft);
    this.vfs = ((a)localObject);
    ((a)localObject).execute(new aej[] { parama });
    GMTrace.o(3587102998528L, 26726);
  }
  
  public final void cancel()
  {
    GMTrace.i(3587237216256L, 26727);
    w.i("MicroMsg.NetSceneGetUpdatePack", "do cancel, updateType = " + this.veV);
    if ((this.vfs != null) && (!this.vfs.isCancelled())) {
      this.vfs.cancel(true);
    }
    GMTrace.o(3587237216256L, 26727);
  }
  
  private final class a
    extends AsyncTask<aej, Integer, aek>
  {
    private String host;
    private u nTQ;
    private com.tencent.mm.sandbox.b.a vfr;
    private int vfv;
    private PInt vfw;
    
    public a(String paramString, com.tencent.mm.sandbox.b.a parama)
    {
      GMTrace.i(3578781499392L, 26664);
      this.nTQ = null;
      this.vfv = 200;
      this.vfw = new PInt();
      this.host = null;
      this.vfr = null;
      this.host = paramString;
      this.vfr = parama;
      GMTrace.o(3578781499392L, 26664);
    }
    
    /* Error */
    private aek a(aej... paramVarArgs)
    {
      // Byte code:
      //   0: ldc2_w 58
      //   3: sipush 26665
      //   6: invokestatic 35	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   9: aload_1
      //   10: arraylength
      //   11: ifeq +9 -> 20
      //   14: aload_1
      //   15: iconst_0
      //   16: aaload
      //   17: ifnonnull +19 -> 36
      //   20: aload_0
      //   21: iconst_m1
      //   22: putfield 39	com/tencent/mm/sandbox/updater/b$a:vfv	I
      //   25: ldc2_w 58
      //   28: sipush 26665
      //   31: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   34: aconst_null
      //   35: areturn
      //   36: ldc 61
      //   38: new 63	java/lang/StringBuilder
      //   41: dup
      //   42: ldc 65
      //   44: invokespecial 68	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   47: aload_1
      //   48: iconst_0
      //   49: aaload
      //   50: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   53: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   56: invokestatic 82	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
      //   59: aload_1
      //   60: iconst_0
      //   61: aaload
      //   62: astore_1
      //   63: new 84	com/tencent/mm/pointers/PByteArray
      //   66: dup
      //   67: invokespecial 85	com/tencent/mm/pointers/PByteArray:<init>	()V
      //   70: astore 6
      //   72: bipush 6
      //   74: istore_2
      //   75: getstatic 91	com/tencent/mm/sdk/a/b:foreground	Z
      //   78: ifeq +6 -> 84
      //   81: bipush 7
      //   83: istore_2
      //   84: aload_1
      //   85: invokevirtual 97	com/tencent/mm/protocal/c/aej:toByteArray	()[B
      //   88: astore_1
      //   89: aload_0
      //   90: getfield 24	com/tencent/mm/sandbox/updater/b$a:vfu	Lcom/tencent/mm/sandbox/updater/b;
      //   93: getfield 101	com/tencent/mm/sandbox/updater/b:hge	[B
      //   96: astore 7
      //   98: aload_0
      //   99: getfield 24	com/tencent/mm/sandbox/updater/b$a:vfu	Lcom/tencent/mm/sandbox/updater/b;
      //   102: getfield 104	com/tencent/mm/sandbox/updater/b:gvf	[B
      //   105: astore 8
      //   107: invokestatic 109	com/tencent/mm/compatible/d/p:ta	()Ljava/lang/String;
      //   110: astore 9
      //   112: aload_0
      //   113: getfield 24	com/tencent/mm/sandbox/updater/b$a:vfu	Lcom/tencent/mm/sandbox/updater/b;
      //   116: getfield 112	com/tencent/mm/sandbox/updater/b:uin	I
      //   119: istore_3
      //   120: aload_0
      //   121: getfield 24	com/tencent/mm/sandbox/updater/b$a:vfu	Lcom/tencent/mm/sandbox/updater/b;
      //   124: getfield 115	com/tencent/mm/sandbox/updater/b:hgg	[B
      //   127: astore 10
      //   129: aload_1
      //   130: aload 6
      //   132: aload 7
      //   134: aload 8
      //   136: aload 9
      //   138: iload_3
      //   139: bipush 113
      //   141: iconst_0
      //   142: iconst_0
      //   143: newarray <illegal type>
      //   145: iconst_0
      //   146: newarray <illegal type>
      //   148: aload 10
      //   150: iload_2
      //   151: invokestatic 121	com/tencent/mm/protocal/MMProtocalJni:pack	([BLcom/tencent/mm/pointers/PByteArray;[B[BLjava/lang/String;III[B[B[BI)Z
      //   154: pop
      //   155: aconst_null
      //   156: astore 7
      //   158: aload_0
      //   159: new 63	java/lang/StringBuilder
      //   162: dup
      //   163: ldc 123
      //   165: invokespecial 68	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   168: aload_0
      //   169: getfield 46	com/tencent/mm/sandbox/updater/b$a:host	Ljava/lang/String;
      //   172: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   175: ldc -128
      //   177: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   180: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   183: aconst_null
      //   184: invokestatic 133	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
      //   187: putfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   190: aload_0
      //   191: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   194: ldc -121
      //   196: invokevirtual 140	com/tencent/mm/network/u:setRequestMethod	(Ljava/lang/String;)V
      //   199: aload_0
      //   200: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   203: invokevirtual 143	com/tencent/mm/network/u:OK	()V
      //   206: aload_0
      //   207: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   210: invokevirtual 146	com/tencent/mm/network/u:OL	()V
      //   213: aload_0
      //   214: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   217: iconst_0
      //   218: invokevirtual 150	com/tencent/mm/network/u:setUseCaches	(Z)V
      //   221: aload_0
      //   222: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   225: ldc -104
      //   227: ldc -102
      //   229: invokevirtual 157	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   232: aload_0
      //   233: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   236: ldc -97
      //   238: ldc -95
      //   240: invokevirtual 157	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   243: aload_0
      //   244: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   247: ldc -93
      //   249: ldc -91
      //   251: invokevirtual 157	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   254: aload_0
      //   255: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   258: ldc -89
      //   260: ldc -87
      //   262: invokevirtual 157	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   265: aload_0
      //   266: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   269: ldc -85
      //   271: ldc -83
      //   273: invokevirtual 157	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   276: aload_0
      //   277: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   280: ldc -81
      //   282: ldc -79
      //   284: invokevirtual 157	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   287: aload_0
      //   288: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   291: sipush 15000
      //   294: invokevirtual 181	com/tencent/mm/network/u:setConnectTimeout	(I)V
      //   297: aload_0
      //   298: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   301: invokevirtual 184	com/tencent/mm/network/u:connect	()V
      //   304: aload_0
      //   305: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   308: invokevirtual 188	com/tencent/mm/network/u:getOutputStream	()Ljava/io/OutputStream;
      //   311: astore_1
      //   312: aload_1
      //   313: aload 6
      //   315: getfield 191	com/tencent/mm/pointers/PByteArray:value	[B
      //   318: invokevirtual 197	java/io/OutputStream:write	([B)V
      //   321: aload_1
      //   322: invokevirtual 200	java/io/OutputStream:flush	()V
      //   325: aload_0
      //   326: getfield 48	com/tencent/mm/sandbox/updater/b$a:vfr	Lcom/tencent/mm/sandbox/b$a;
      //   329: ldc2_w 201
      //   332: aload 6
      //   334: getfield 191	com/tencent/mm/pointers/PByteArray:value	[B
      //   337: arraylength
      //   338: i2l
      //   339: ladd
      //   340: invokeinterface 208 3 0
      //   345: aload_0
      //   346: aload_0
      //   347: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   350: invokevirtual 212	com/tencent/mm/network/u:getResponseCode	()I
      //   353: putfield 39	com/tencent/mm/sandbox/updater/b$a:vfv	I
      //   356: aload_0
      //   357: getfield 39	com/tencent/mm/sandbox/updater/b$a:vfv	I
      //   360: istore_2
      //   361: iload_2
      //   362: sipush 200
      //   365: if_icmpeq +102 -> 467
      //   368: aload_1
      //   369: ifnull +7 -> 376
      //   372: aload_1
      //   373: invokevirtual 215	java/io/OutputStream:close	()V
      //   376: aload_0
      //   377: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   380: ifnull +18 -> 398
      //   383: aload_0
      //   384: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   387: getfield 219	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
      //   390: invokevirtual 224	java/net/HttpURLConnection:disconnect	()V
      //   393: aload_0
      //   394: aconst_null
      //   395: putfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   398: ldc2_w 58
      //   401: sipush 26665
      //   404: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   407: aconst_null
      //   408: areturn
      //   409: astore_1
      //   410: ldc 61
      //   412: ldc -30
      //   414: iconst_1
      //   415: anewarray 228	java/lang/Object
      //   418: dup
      //   419: iconst_0
      //   420: aload_1
      //   421: invokevirtual 231	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   424: aastore
      //   425: invokestatic 235	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   428: ldc 61
      //   430: aload_1
      //   431: ldc -19
      //   433: iconst_0
      //   434: anewarray 228	java/lang/Object
      //   437: invokestatic 241	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   440: ldc2_w 58
      //   443: sipush 26665
      //   446: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   449: aconst_null
      //   450: areturn
      //   451: astore_1
      //   452: ldc 61
      //   454: aload_1
      //   455: ldc -19
      //   457: iconst_0
      //   458: anewarray 228	java/lang/Object
      //   461: invokestatic 241	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   464: goto -88 -> 376
      //   467: aload_0
      //   468: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   471: ldc -13
      //   473: invokevirtual 247	com/tencent/mm/network/u:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
      //   476: astore 6
      //   478: aload_0
      //   479: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   482: invokevirtual 251	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
      //   485: astore 8
      //   487: ldc2_w 201
      //   490: lstore 4
      //   492: aload 6
      //   494: ifnull +605 -> 1099
      //   497: aload 6
      //   499: ldc -3
      //   501: invokevirtual 259	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
      //   504: ifeq +595 -> 1099
      //   507: new 261	java/util/zip/GZIPInputStream
      //   510: dup
      //   511: aload 8
      //   513: invokespecial 264	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
      //   516: astore 6
      //   518: iconst_1
      //   519: istore_2
      //   520: new 266	java/io/ByteArrayOutputStream
      //   523: dup
      //   524: invokespecial 267	java/io/ByteArrayOutputStream:<init>	()V
      //   527: astore 7
      //   529: sipush 1024
      //   532: newarray <illegal type>
      //   534: astore 9
      //   536: aload 6
      //   538: aload 9
      //   540: invokevirtual 273	java/io/InputStream:read	([B)I
      //   543: istore_3
      //   544: iload_3
      //   545: ifle +22 -> 567
      //   548: aload 7
      //   550: aload 9
      //   552: iconst_0
      //   553: iload_3
      //   554: invokevirtual 276	java/io/ByteArrayOutputStream:write	([BII)V
      //   557: lload 4
      //   559: iload_3
      //   560: i2l
      //   561: ladd
      //   562: lstore 4
      //   564: goto -28 -> 536
      //   567: iload_2
      //   568: ifeq +206 -> 774
      //   571: aload 8
      //   573: invokevirtual 280	java/io/InputStream:markSupported	()Z
      //   576: ifeq +198 -> 774
      //   579: aload 8
      //   581: iconst_1
      //   582: invokevirtual 283	java/io/InputStream:mark	(I)V
      //   585: ldc2_w 201
      //   588: lstore 4
      //   590: aload 8
      //   592: aload 9
      //   594: invokevirtual 273	java/io/InputStream:read	([B)I
      //   597: istore_2
      //   598: iload_2
      //   599: ifle +13 -> 612
      //   602: lload 4
      //   604: iload_2
      //   605: i2l
      //   606: ladd
      //   607: lstore 4
      //   609: goto -19 -> 590
      //   612: aload_0
      //   613: getfield 48	com/tencent/mm/sandbox/updater/b$a:vfr	Lcom/tencent/mm/sandbox/b$a;
      //   616: lload 4
      //   618: invokeinterface 286 3 0
      //   623: new 84	com/tencent/mm/pointers/PByteArray
      //   626: dup
      //   627: invokespecial 85	com/tencent/mm/pointers/PByteArray:<init>	()V
      //   630: astore 8
      //   632: new 84	com/tencent/mm/pointers/PByteArray
      //   635: dup
      //   636: invokespecial 85	com/tencent/mm/pointers/PByteArray:<init>	()V
      //   639: astore 9
      //   641: new 41	com/tencent/mm/pointers/PInt
      //   644: dup
      //   645: invokespecial 42	com/tencent/mm/pointers/PInt:<init>	()V
      //   648: astore 10
      //   650: new 41	com/tencent/mm/pointers/PInt
      //   653: dup
      //   654: iconst_0
      //   655: invokespecial 288	com/tencent/mm/pointers/PInt:<init>	(I)V
      //   658: astore 11
      //   660: new 41	com/tencent/mm/pointers/PInt
      //   663: dup
      //   664: sipush 255
      //   667: invokespecial 288	com/tencent/mm/pointers/PInt:<init>	(I)V
      //   670: astore 12
      //   672: aload 8
      //   674: aload 7
      //   676: invokevirtual 289	java/io/ByteArrayOutputStream:toByteArray	()[B
      //   679: aload_0
      //   680: getfield 24	com/tencent/mm/sandbox/updater/b$a:vfu	Lcom/tencent/mm/sandbox/updater/b;
      //   683: getfield 101	com/tencent/mm/sandbox/updater/b:hge	[B
      //   686: aload 9
      //   688: aload_0
      //   689: getfield 44	com/tencent/mm/sandbox/updater/b$a:vfw	Lcom/tencent/mm/pointers/PInt;
      //   692: aload 10
      //   694: aload 11
      //   696: aload 12
      //   698: invokestatic 293	com/tencent/mm/protocal/MMProtocalJni:unpack	(Lcom/tencent/mm/pointers/PByteArray;[B[BLcom/tencent/mm/pointers/PByteArray;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)Z
      //   701: pop
      //   702: new 295	com/tencent/mm/protocal/c/aek
      //   705: dup
      //   706: invokespecial 296	com/tencent/mm/protocal/c/aek:<init>	()V
      //   709: aload 8
      //   711: getfield 191	com/tencent/mm/pointers/PByteArray:value	[B
      //   714: invokevirtual 300	com/tencent/mm/protocal/c/aek:aD	([B)Lcom/tencent/mm/bm/a;
      //   717: checkcast 295	com/tencent/mm/protocal/c/aek
      //   720: astore 7
      //   722: aload_1
      //   723: ifnull +7 -> 730
      //   726: aload_1
      //   727: invokevirtual 215	java/io/OutputStream:close	()V
      //   730: aload 6
      //   732: ifnull +8 -> 740
      //   735: aload 6
      //   737: invokevirtual 301	java/io/InputStream:close	()V
      //   740: aload_0
      //   741: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   744: ifnull +18 -> 762
      //   747: aload_0
      //   748: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   751: getfield 219	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
      //   754: invokevirtual 224	java/net/HttpURLConnection:disconnect	()V
      //   757: aload_0
      //   758: aconst_null
      //   759: putfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   762: ldc2_w 58
      //   765: sipush 26665
      //   768: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   771: aload 7
      //   773: areturn
      //   774: aload_0
      //   775: getfield 48	com/tencent/mm/sandbox/updater/b$a:vfr	Lcom/tencent/mm/sandbox/b$a;
      //   778: lload 4
      //   780: invokeinterface 286 3 0
      //   785: goto -162 -> 623
      //   788: astore 8
      //   790: aload 6
      //   792: astore 7
      //   794: aload_1
      //   795: astore 6
      //   797: aload 7
      //   799: astore_1
      //   800: aload 8
      //   802: astore 7
      //   804: ldc 61
      //   806: ldc_w 303
      //   809: iconst_1
      //   810: anewarray 228	java/lang/Object
      //   813: dup
      //   814: iconst_0
      //   815: aload 7
      //   817: invokevirtual 231	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   820: aastore
      //   821: invokestatic 235	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   824: ldc 61
      //   826: aload 7
      //   828: ldc -19
      //   830: iconst_0
      //   831: anewarray 228	java/lang/Object
      //   834: invokestatic 241	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   837: aload_0
      //   838: iconst_m1
      //   839: putfield 39	com/tencent/mm/sandbox/updater/b$a:vfv	I
      //   842: aload 6
      //   844: ifnull +8 -> 852
      //   847: aload 6
      //   849: invokevirtual 215	java/io/OutputStream:close	()V
      //   852: aload_1
      //   853: ifnull +7 -> 860
      //   856: aload_1
      //   857: invokevirtual 301	java/io/InputStream:close	()V
      //   860: aload_0
      //   861: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   864: ifnull +18 -> 882
      //   867: aload_0
      //   868: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   871: getfield 219	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
      //   874: invokevirtual 224	java/net/HttpURLConnection:disconnect	()V
      //   877: aload_0
      //   878: aconst_null
      //   879: putfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   882: ldc2_w 58
      //   885: sipush 26665
      //   888: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   891: aconst_null
      //   892: areturn
      //   893: astore_1
      //   894: ldc 61
      //   896: aload_1
      //   897: ldc -19
      //   899: iconst_0
      //   900: anewarray 228	java/lang/Object
      //   903: invokestatic 241	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   906: goto -176 -> 730
      //   909: astore_1
      //   910: ldc 61
      //   912: aload_1
      //   913: ldc -19
      //   915: iconst_0
      //   916: anewarray 228	java/lang/Object
      //   919: invokestatic 241	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   922: goto -182 -> 740
      //   925: astore 6
      //   927: ldc 61
      //   929: aload 6
      //   931: ldc -19
      //   933: iconst_0
      //   934: anewarray 228	java/lang/Object
      //   937: invokestatic 241	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   940: goto -88 -> 852
      //   943: astore_1
      //   944: ldc 61
      //   946: aload_1
      //   947: ldc -19
      //   949: iconst_0
      //   950: anewarray 228	java/lang/Object
      //   953: invokestatic 241	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   956: goto -96 -> 860
      //   959: astore 6
      //   961: aconst_null
      //   962: astore_1
      //   963: aload_1
      //   964: ifnull +7 -> 971
      //   967: aload_1
      //   968: invokevirtual 215	java/io/OutputStream:close	()V
      //   971: aload 7
      //   973: ifnull +8 -> 981
      //   976: aload 7
      //   978: invokevirtual 301	java/io/InputStream:close	()V
      //   981: aload_0
      //   982: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   985: ifnull +18 -> 1003
      //   988: aload_0
      //   989: getfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   992: getfield 219	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
      //   995: invokevirtual 224	java/net/HttpURLConnection:disconnect	()V
      //   998: aload_0
      //   999: aconst_null
      //   1000: putfield 37	com/tencent/mm/sandbox/updater/b$a:nTQ	Lcom/tencent/mm/network/u;
      //   1003: aload 6
      //   1005: athrow
      //   1006: astore_1
      //   1007: ldc 61
      //   1009: aload_1
      //   1010: ldc -19
      //   1012: iconst_0
      //   1013: anewarray 228	java/lang/Object
      //   1016: invokestatic 241	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   1019: goto -48 -> 971
      //   1022: astore_1
      //   1023: ldc 61
      //   1025: aload_1
      //   1026: ldc -19
      //   1028: iconst_0
      //   1029: anewarray 228	java/lang/Object
      //   1032: invokestatic 241	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   1035: goto -54 -> 981
      //   1038: astore 6
      //   1040: goto -77 -> 963
      //   1043: astore 8
      //   1045: aload 6
      //   1047: astore 7
      //   1049: aload 8
      //   1051: astore 6
      //   1053: goto -90 -> 963
      //   1056: astore 7
      //   1058: aload 6
      //   1060: astore 8
      //   1062: aload 7
      //   1064: astore 6
      //   1066: aload_1
      //   1067: astore 7
      //   1069: aload 8
      //   1071: astore_1
      //   1072: goto -109 -> 963
      //   1075: astore 7
      //   1077: aconst_null
      //   1078: astore_1
      //   1079: aconst_null
      //   1080: astore 6
      //   1082: goto -278 -> 804
      //   1085: astore 7
      //   1087: aconst_null
      //   1088: astore 8
      //   1090: aload_1
      //   1091: astore 6
      //   1093: aload 8
      //   1095: astore_1
      //   1096: goto -292 -> 804
      //   1099: iconst_0
      //   1100: istore_2
      //   1101: aload 8
      //   1103: astore 6
      //   1105: goto -585 -> 520
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	1108	0	this	a
      //   0	1108	1	paramVarArgs	aej[]
      //   74	1027	2	i	int
      //   119	441	3	j	int
      //   490	289	4	l	long
      //   70	778	6	localObject1	Object
      //   925	5	6	localIOException	java.io.IOException
      //   959	45	6	localObject2	Object
      //   1038	8	6	localObject3	Object
      //   1051	53	6	localObject4	Object
      //   96	952	7	localObject5	Object
      //   1056	7	7	localObject6	Object
      //   1067	1	7	arrayOfaej	aej[]
      //   1075	1	7	localException1	Exception
      //   1085	1	7	localException2	Exception
      //   105	605	8	localObject7	Object
      //   788	13	8	localException3	Exception
      //   1043	7	8	localObject8	Object
      //   1060	42	8	localObject9	Object
      //   110	577	9	localObject10	Object
      //   127	566	10	localObject11	Object
      //   658	37	11	localPInt1	PInt
      //   670	27	12	localPInt2	PInt
      // Exception table:
      //   from	to	target	type
      //   84	155	409	java/lang/Exception
      //   372	376	451	java/io/IOException
      //   520	536	788	java/lang/Exception
      //   536	544	788	java/lang/Exception
      //   548	557	788	java/lang/Exception
      //   571	585	788	java/lang/Exception
      //   590	598	788	java/lang/Exception
      //   612	623	788	java/lang/Exception
      //   623	722	788	java/lang/Exception
      //   774	785	788	java/lang/Exception
      //   726	730	893	java/io/IOException
      //   735	740	909	java/io/IOException
      //   847	852	925	java/io/IOException
      //   856	860	943	java/io/IOException
      //   158	312	959	finally
      //   967	971	1006	java/io/IOException
      //   976	981	1022	java/io/IOException
      //   312	361	1038	finally
      //   467	487	1038	finally
      //   497	518	1038	finally
      //   520	536	1043	finally
      //   536	544	1043	finally
      //   548	557	1043	finally
      //   571	585	1043	finally
      //   590	598	1043	finally
      //   612	623	1043	finally
      //   623	722	1043	finally
      //   774	785	1043	finally
      //   804	842	1056	finally
      //   158	312	1075	java/lang/Exception
      //   312	361	1085	java/lang/Exception
      //   467	487	1085	java/lang/Exception
      //   497	518	1085	java/lang/Exception
    }
    
    protected final void onCancelled()
    {
      GMTrace.i(3579049934848L, 26666);
      w.d("MicroMsg.NetSceneGetUpdatePack", "task had been cancelled.");
      if (this.nTQ != null) {
        this.nTQ.hhh.disconnect();
      }
      GMTrace.o(3579049934848L, 26666);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sandbox\updater\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */