package com.tencent.mm.ac;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.ad.k;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.protocal.c.aih;
import com.tencent.mm.protocal.c.aos;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.e;
import com.tencent.mm.y.q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public final class c
  implements com.tencent.mm.ad.e
{
  public boolean gsb;
  public Set<String> gsc;
  f<String, c> gsd;
  public Stack<h> gse;
  private com.tencent.mm.sdk.platformtools.ar gsf;
  private com.tencent.mm.sdk.platformtools.ar gsg;
  public String gsh;
  f<String, String> gsi;
  public aj gsj;
  
  public c()
  {
    GMTrace.i(372185759744L, 2773);
    this.gsb = false;
    this.gsc = new HashSet();
    this.gsd = new f(400);
    this.gse = new Stack();
    this.gsf = null;
    this.gsg = null;
    this.gsh = null;
    this.gsi = new f(200);
    this.gsj = new aj(Looper.getMainLooper(), new aj.a()
    {
      private long gsm;
      
      public final boolean pM()
      {
        GMTrace.i(379030863872L, 2824);
        long l = System.currentTimeMillis();
        if ((c.this.gsb) && (l - this.gsm > 60000L))
        {
          w.w("MicroMsg.AvatarService", "do scene TIMEOUT: %d", new Object[] { Long.valueOf(l - this.gsm) });
          c.this.gsb = false;
        }
        if (c.this.gsb)
        {
          c.this.gsj.z(1000L, 1000L);
          GMTrace.o(379030863872L, 2824);
          return false;
        }
        this.gsm = l;
        c.this.gsb = true;
        LinkedList localLinkedList = new LinkedList();
        int i = 0;
        while ((i < 5) && (c.this.gse.size() > 0))
        {
          com.tencent.mm.plugin.report.service.g.ork.a(138L, 42L, 1L, true);
          localLinkedList.add(new azq().Rq(((h)c.this.gse.pop()).getUsername()));
          i += 1;
        }
        com.tencent.mm.kernel.h.wS().a(new j(localLinkedList), 0);
        com.tencent.mm.plugin.report.service.g.ork.a(138L, 44L, 1L, true);
        GMTrace.o(379030863872L, 2824);
        return false;
      }
    }, false);
    com.tencent.mm.kernel.h.wS().a(123, this);
    this.gsb = false;
    this.gsh = q.zE();
    GMTrace.o(372185759744L, 2773);
  }
  
  public static d Dh()
  {
    GMTrace.i(373259501568L, 2781);
    if (com.tencent.mm.kernel.h.xw().wL())
    {
      d locald = n.Dh();
      GMTrace.o(373259501568L, 2781);
      return locald;
    }
    GMTrace.o(373259501568L, 2781);
    return null;
  }
  
  public static i Di()
  {
    GMTrace.i(16085994700800L, 119850);
    if (com.tencent.mm.kernel.h.xw().wL())
    {
      i locali = n.Di();
      GMTrace.o(16085994700800L, 119850);
      return locali;
    }
    GMTrace.o(16085994700800L, 119850);
    return null;
  }
  
  static h hU(String paramString)
  {
    GMTrace.i(372722630656L, 2777);
    Object localObject = n.Di().ig(paramString);
    if ((localObject != null) && (((h)localObject).getUsername().equals(paramString)))
    {
      GMTrace.o(372722630656L, 2777);
      return (h)localObject;
    }
    localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString);
    if ((localObject == null) || (!((com.tencent.mm.g.b.af)localObject).field_username.equals(paramString)))
    {
      if (localObject == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.d("MicroMsg.AvatarService", "ct == null? :%s", new Object[] { Boolean.valueOf(bool), paramString });
        GMTrace.o(372722630656L, 2777);
        return null;
      }
    }
    if (((com.tencent.mm.g.b.af)localObject).fiZ == 4)
    {
      b.y(paramString, ((com.tencent.mm.g.b.af)localObject).fiZ);
      w.d("MicroMsg.AvatarService", "ct imgFlag :%s", new Object[] { Integer.valueOf(((com.tencent.mm.g.b.af)localObject).fiZ) });
      GMTrace.o(372722630656L, 2777);
      return null;
    }
    localObject = new h();
    ((h)localObject).username = paramString;
    ((h)localObject).fiZ = 3;
    byte[] arrayOfByte = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TI(paramString);
    if (bg.bq(arrayOfByte))
    {
      GMTrace.o(372722630656L, 2777);
      return (h)localObject;
    }
    try
    {
      paramString = b.a(paramString, (aos)new aos().aD(arrayOfByte));
      GMTrace.o(372722630656L, 2777);
      return paramString;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.AvatarService", "exception:%s", new Object[] { bg.f(paramString) });
        paramString = (String)localObject;
      }
    }
  }
  
  public final int a(ar.a parama)
  {
    GMTrace.i(372991066112L, 2779);
    if ((parama instanceof a))
    {
      if (this.gsf == null) {
        this.gsf = new com.tencent.mm.sdk.platformtools.ar(1, "getavatar", 2, com.tencent.mm.kernel.h.xB().ngv.getLooper());
      }
      i = this.gsf.c(parama);
      GMTrace.o(372991066112L, 2779);
      return i;
    }
    if (this.gsg == null) {
      this.gsg = new com.tencent.mm.sdk.platformtools.ar(1, "readsave", 1, com.tencent.mm.kernel.h.xB().ngv.getLooper());
    }
    int i = this.gsg.c(parama);
    GMTrace.o(372991066112L, 2779);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(373125283840L, 2780);
    if (paramk.getType() != 123)
    {
      GMTrace.o(373125283840L, 2780);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      com.tencent.mm.plugin.report.service.g.ork.a(138L, 12L, 1L, true);
    }
    com.tencent.mm.plugin.report.service.g.ork.a(138L, 45L, 1L, true);
    paramk = (j)paramk;
    paramString = new HashSet();
    Object localObject;
    if (paramk.gsZ != null)
    {
      localObject = paramk.gsZ.iterator();
      while (((Iterator)localObject).hasNext())
      {
        aih localaih = (aih)((Iterator)localObject).next();
        String str = localaih.uxJ.uNR;
        if ((localaih.tQa == null) || (localaih.tQa.uNP == null) || (localaih.tQa.uNP.tJp == null))
        {
          com.tencent.mm.plugin.report.service.g.ork.a(138L, 11L, 1L, true);
        }
        else
        {
          paramString.add(str);
          h localh = new h();
          localh.username = str;
          localh.fiZ = 3;
          com.tencent.mm.plugin.report.service.g.ork.a(138L, 43L, 1L, true);
          a(new d(localh, localaih.tQa.uNP.tJp));
        }
      }
    }
    if (paramk.gsY != null)
    {
      paramk = paramk.gsY.iterator();
      while (paramk.hasNext())
      {
        localObject = ((azq)paramk.next()).uNR;
        if (!paramString.contains(localObject)) {
          this.gsc.remove(localObject);
        }
      }
    }
    this.gsb = false;
    if (this.gse.size() > 0) {
      this.gsj.z(0L, 0L);
    }
    GMTrace.o(373125283840L, 2780);
  }
  
  public final Bitmap b(String paramString, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(372319977472L, 2774);
    d locald = Dh();
    Object localObject2;
    if (locald != null) {
      if ((paramInt >= 0) && (paramInt > 5))
      {
        localObject2 = d.hW(String.format("%s$$%d", new Object[] { paramString, Integer.valueOf(paramInt) }));
        if (localObject2 != null)
        {
          w.i("MicroMsg.AvatarService", "find custom corner avatar, custom corner %d", new Object[] { Integer.valueOf(paramInt) });
          GMTrace.o(372319977472L, 2774);
          return (Bitmap)localObject2;
        }
        w.i("MicroMsg.AvatarService", "can not find custom corner avatar, custom corner %d", new Object[] { Integer.valueOf(paramInt) });
        localObject1 = localObject2;
        if (localObject2 != null) {}
      }
    }
    for (Object localObject1 = d.hW(paramString);; localObject1 = null)
    {
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (paramInt >= 0)
        {
          localObject2 = localObject1;
          if (paramInt > 5)
          {
            w.i("MicroMsg.AvatarService", "create custom corner avatar, custom corner %d", new Object[] { Integer.valueOf(paramInt) });
            localObject2 = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject1, false, paramInt);
            locald.c(String.format("%s$$%d", new Object[] { paramString, Integer.valueOf(paramInt) }), (Bitmap)localObject2);
          }
        }
        GMTrace.o(372319977472L, 2774);
        return (Bitmap)localObject2;
      }
      if (paramBoolean)
      {
        GMTrace.o(372319977472L, 2774);
        return null;
      }
      w.v("MicroMsg.AvatarService", "get bitmap from cache failed, try to load :%s", new Object[] { paramString });
      if (this.gsc.contains(paramString))
      {
        GMTrace.o(372319977472L, 2774);
        return null;
      }
      this.gsc.add(paramString);
      a(new b(paramString));
      GMTrace.o(372319977472L, 2774);
      return null;
      localObject2 = null;
      break;
    }
  }
  
  public final void cancel()
  {
    GMTrace.i(372856848384L, 2778);
    while (this.gse.size() > 0) {
      this.gsc.remove(this.gse.pop());
    }
    GMTrace.o(372856848384L, 2778);
  }
  
  public final void hS(String paramString)
  {
    GMTrace.i(372454195200L, 2775);
    a(new b(paramString));
    GMTrace.o(372454195200L, 2775);
  }
  
  public final void hT(final String paramString)
  {
    GMTrace.i(372588412928L, 2776);
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(384265355264L, 2863);
        if (bg.nm(paramString))
        {
          GMTrace.o(384265355264L, 2863);
          return;
        }
        if (paramString.equals(c.this.gsh))
        {
          GMTrace.o(384265355264L, 2863);
          return;
        }
        Object localObject = c.Di();
        if (localObject == null)
        {
          GMTrace.o(384265355264L, 2863);
          return;
        }
        localObject = ((i)localObject).ig(paramString);
        if ((localObject == null) || (!((h)localObject).getUsername().equals(paramString)))
        {
          GMTrace.o(384265355264L, 2863);
          return;
        }
        if (bg.Pu() - ((h)localObject).gsW * 60L > 86400L) {}
        for (int i = 1; i == 0; i = 0)
        {
          GMTrace.o(384265355264L, 2863);
          return;
        }
        if (bg.nm(((h)localObject).Dp()))
        {
          w.w("MicroMsg.AvatarService", "dkhurl user has no url [%s]", new Object[] { paramString });
          GMTrace.o(384265355264L, 2863);
          return;
        }
        if (c.Dh() == null)
        {
          GMTrace.o(384265355264L, 2863);
          return;
        }
        d.u(paramString, false);
        d.u(paramString, true);
        c.this.hS(paramString);
        GMTrace.o(384265355264L, 2863);
      }
      
      public final String toString()
      {
        GMTrace.i(384399572992L, 2864);
        String str = super.toString() + "|checkAvatarExpire";
        GMTrace.o(384399572992L, 2864);
        return str;
      }
    });
    GMTrace.o(372588412928L, 2776);
  }
  
  public final String hV(String paramString)
  {
    GMTrace.i(373393719296L, 2782);
    if (bg.nm(paramString))
    {
      GMTrace.o(373393719296L, 2782);
      return "";
    }
    try
    {
      String str1 = String.format("%s%x_%s", new Object[] { "ammURL_", Integer.valueOf(paramString.hashCode()), paramString.substring(paramString.length() - 24, paramString.length() - 4) });
      this.gsi.put(str1, paramString);
      GMTrace.o(373393719296L, 2782);
      return str1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str2 = String.format("%s%x_", new Object[] { "ammURL_", Integer.valueOf(paramString.hashCode()) });
      }
    }
  }
  
  private final class a
    implements ar.a
  {
    public h gsn;
    public byte[] gso;
    
    public a(h paramh)
    {
      GMTrace.i(383728484352L, 2859);
      this.gsn = null;
      this.gso = null;
      this.gsn = paramh;
      GMTrace.o(383728484352L, 2859);
    }
    
    /* Error */
    public final boolean Dj()
    {
      // Byte code:
      //   0: ldc2_w 49
      //   3: sipush 2860
      //   6: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   9: aload_0
      //   10: getfield 32	com/tencent/mm/ac/c$a:gsn	Lcom/tencent/mm/ac/h;
      //   13: ifnonnull +14 -> 27
      //   16: ldc2_w 49
      //   19: sipush 2860
      //   22: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   25: iconst_0
      //   26: ireturn
      //   27: invokestatic 56	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
      //   30: invokestatic 62	com/tencent/mm/sdk/platformtools/am:isNetworkConnected	(Landroid/content/Context;)Z
      //   33: ifne +13 -> 46
      //   36: ldc 64
      //   38: ldc 66
      //   40: invokestatic 72	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
      //   43: invokestatic 75	com/tencent/mm/sdk/platformtools/w:bPM	()V
      //   46: aload_0
      //   47: getfield 32	com/tencent/mm/ac/c$a:gsn	Lcom/tencent/mm/ac/h;
      //   50: invokevirtual 81	com/tencent/mm/ac/h:Dp	()Ljava/lang/String;
      //   53: astore 10
      //   55: ldc 83
      //   57: astore_3
      //   58: invokestatic 89	com/tencent/mm/kernel/h:xw	()Lcom/tencent/mm/kernel/a;
      //   61: invokevirtual 94	com/tencent/mm/kernel/a:wL	()Z
      //   64: ifeq +61 -> 125
      //   67: getstatic 100	com/tencent/mm/protocal/d:tJC	I
      //   70: istore_1
      //   71: invokestatic 89	com/tencent/mm/kernel/h:xw	()Lcom/tencent/mm/kernel/a;
      //   74: pop
      //   75: ldc 102
      //   77: iconst_4
      //   78: anewarray 4	java/lang/Object
      //   81: dup
      //   82: iconst_0
      //   83: iload_1
      //   84: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   87: aastore
      //   88: dup
      //   89: iconst_1
      //   90: invokestatic 112	com/tencent/mm/kernel/a:ww	()I
      //   93: invokestatic 118	com/tencent/mm/a/o:getString	(I)Ljava/lang/String;
      //   96: aastore
      //   97: dup
      //   98: iconst_2
      //   99: invokestatic 56	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
      //   102: invokestatic 122	com/tencent/mm/sdk/platformtools/am:getNetTypeForStat	(Landroid/content/Context;)I
      //   105: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   108: aastore
      //   109: dup
      //   110: iconst_3
      //   111: invokestatic 56	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
      //   114: invokestatic 125	com/tencent/mm/sdk/platformtools/am:getStrength	(Landroid/content/Context;)I
      //   117: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   120: aastore
      //   121: invokestatic 131	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   124: astore_3
      //   125: ldc 64
      //   127: ldc -123
      //   129: iconst_2
      //   130: anewarray 4	java/lang/Object
      //   133: dup
      //   134: iconst_0
      //   135: aload_0
      //   136: getfield 32	com/tencent/mm/ac/c$a:gsn	Lcom/tencent/mm/ac/h;
      //   139: invokevirtual 136	com/tencent/mm/ac/h:getUsername	()Ljava/lang/String;
      //   142: aastore
      //   143: dup
      //   144: iconst_1
      //   145: aload_3
      //   146: aastore
      //   147: invokestatic 140	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   150: aload_0
      //   151: aconst_null
      //   152: putfield 34	com/tencent/mm/ac/c$a:gso	[B
      //   155: new 142	java/io/ByteArrayOutputStream
      //   158: dup
      //   159: invokespecial 143	java/io/ByteArrayOutputStream:<init>	()V
      //   162: astore 4
      //   164: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   167: ldc2_w 150
      //   170: ldc2_w 152
      //   173: lconst_1
      //   174: iconst_1
      //   175: invokevirtual 156	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   178: aload 10
      //   180: aconst_null
      //   181: invokestatic 161	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
      //   184: astore 5
      //   186: aload 5
      //   188: ldc -93
      //   190: invokevirtual 169	com/tencent/mm/network/u:setRequestMethod	(Ljava/lang/String;)V
      //   193: aload 5
      //   195: ldc -85
      //   197: aload_3
      //   198: invokevirtual 174	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   201: aload 5
      //   203: sipush 5000
      //   206: invokevirtual 178	com/tencent/mm/network/u:setConnectTimeout	(I)V
      //   209: aload 5
      //   211: sipush 5000
      //   214: invokevirtual 181	com/tencent/mm/network/u:setReadTimeout	(I)V
      //   217: aload 5
      //   219: invokestatic 184	com/tencent/mm/network/b:a	(Lcom/tencent/mm/network/u;)I
      //   222: ifeq +1455 -> 1677
      //   225: aload 5
      //   227: invokevirtual 187	com/tencent/mm/network/u:getResponseCode	()I
      //   230: istore_1
      //   231: aload 5
      //   233: invokevirtual 191	com/tencent/mm/network/u:getHeaderFields	()Ljava/util/Map;
      //   236: astore_3
      //   237: aload_3
      //   238: ifnull +229 -> 467
      //   241: aload_3
      //   242: ldc -63
      //   244: invokeinterface 199 2 0
      //   249: checkcast 201	java/util/List
      //   252: astore_3
      //   253: aload_3
      //   254: ifnull +218 -> 472
      //   257: aload_3
      //   258: invokeinterface 204 1 0
      //   263: ifle +209 -> 472
      //   266: aload_3
      //   267: iconst_0
      //   268: invokeinterface 207 2 0
      //   273: checkcast 127	java/lang/String
      //   276: astore_3
      //   277: ldc 64
      //   279: ldc -47
      //   281: iconst_3
      //   282: anewarray 4	java/lang/Object
      //   285: dup
      //   286: iconst_0
      //   287: aload 10
      //   289: aastore
      //   290: dup
      //   291: iconst_1
      //   292: iload_1
      //   293: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   296: aastore
      //   297: dup
      //   298: iconst_2
      //   299: aload_3
      //   300: aastore
      //   301: invokestatic 212	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   304: iload_1
      //   305: lookupswitch	default:+2022->2327, 404:+173->478, 502:+501->806, 503:+792->1097, 504:+1083->1388
      //   348: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   351: ldc2_w 150
      //   354: ldc2_w 213
      //   357: lconst_1
      //   358: iconst_1
      //   359: invokevirtual 156	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   362: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   365: sipush 14058
      //   368: bipush 10
      //   370: anewarray 4	java/lang/Object
      //   373: dup
      //   374: iconst_0
      //   375: ldc -41
      //   377: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   380: aastore
      //   381: dup
      //   382: iconst_1
      //   383: iload_1
      //   384: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   387: aastore
      //   388: dup
      //   389: iconst_2
      //   390: ldc 83
      //   392: aastore
      //   393: dup
      //   394: iconst_3
      //   395: iconst_0
      //   396: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   399: aastore
      //   400: dup
      //   401: iconst_4
      //   402: aload_0
      //   403: getfield 32	com/tencent/mm/ac/c$a:gsn	Lcom/tencent/mm/ac/h;
      //   406: invokevirtual 136	com/tencent/mm/ac/h:getUsername	()Ljava/lang/String;
      //   409: aastore
      //   410: dup
      //   411: iconst_5
      //   412: aload 5
      //   414: getfield 219	com/tencent/mm/network/u:hhi	Ljava/lang/String;
      //   417: aastore
      //   418: dup
      //   419: bipush 6
      //   421: aload 5
      //   423: getfield 222	com/tencent/mm/network/u:hgk	I
      //   426: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   429: aastore
      //   430: dup
      //   431: bipush 7
      //   433: aload 5
      //   435: getfield 226	com/tencent/mm/network/u:url	Ljava/net/URL;
      //   438: invokevirtual 231	java/net/URL:getHost	()Ljava/lang/String;
      //   441: aastore
      //   442: dup
      //   443: bipush 8
      //   445: aload 10
      //   447: aastore
      //   448: dup
      //   449: bipush 9
      //   451: aload_3
      //   452: aastore
      //   453: invokevirtual 234	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
      //   456: ldc2_w 49
      //   459: sipush 2860
      //   462: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   465: iconst_1
      //   466: ireturn
      //   467: aconst_null
      //   468: astore_3
      //   469: goto -216 -> 253
      //   472: ldc 83
      //   474: astore_3
      //   475: goto -198 -> 277
      //   478: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   481: ldc2_w 150
      //   484: ldc2_w 235
      //   487: lconst_1
      //   488: iconst_1
      //   489: invokevirtual 156	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   492: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   495: sipush 14058
      //   498: bipush 10
      //   500: anewarray 4	java/lang/Object
      //   503: dup
      //   504: iconst_0
      //   505: ldc -41
      //   507: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   510: aastore
      //   511: dup
      //   512: iconst_1
      //   513: iload_1
      //   514: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   517: aastore
      //   518: dup
      //   519: iconst_2
      //   520: ldc 83
      //   522: aastore
      //   523: dup
      //   524: iconst_3
      //   525: iconst_0
      //   526: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   529: aastore
      //   530: dup
      //   531: iconst_4
      //   532: aload_0
      //   533: getfield 32	com/tencent/mm/ac/c$a:gsn	Lcom/tencent/mm/ac/h;
      //   536: invokevirtual 136	com/tencent/mm/ac/h:getUsername	()Ljava/lang/String;
      //   539: aastore
      //   540: dup
      //   541: iconst_5
      //   542: aload 5
      //   544: getfield 219	com/tencent/mm/network/u:hhi	Ljava/lang/String;
      //   547: aastore
      //   548: dup
      //   549: bipush 6
      //   551: aload 5
      //   553: getfield 222	com/tencent/mm/network/u:hgk	I
      //   556: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   559: aastore
      //   560: dup
      //   561: bipush 7
      //   563: aload 5
      //   565: getfield 226	com/tencent/mm/network/u:url	Ljava/net/URL;
      //   568: invokevirtual 231	java/net/URL:getHost	()Ljava/lang/String;
      //   571: aastore
      //   572: dup
      //   573: bipush 8
      //   575: aload 10
      //   577: aastore
      //   578: dup
      //   579: bipush 9
      //   581: aload_3
      //   582: aastore
      //   583: invokevirtual 234	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
      //   586: goto -130 -> 456
      //   589: astore 6
      //   591: aconst_null
      //   592: astore_3
      //   593: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   596: ldc2_w 150
      //   599: lconst_1
      //   600: lconst_1
      //   601: iconst_1
      //   602: invokevirtual 156	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   605: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   608: astore 11
      //   610: aload 6
      //   612: invokevirtual 239	java/net/ProtocolException:getMessage	()Ljava/lang/String;
      //   615: astore 12
      //   617: aload_0
      //   618: getfield 32	com/tencent/mm/ac/c$a:gsn	Lcom/tencent/mm/ac/h;
      //   621: invokevirtual 136	com/tencent/mm/ac/h:getUsername	()Ljava/lang/String;
      //   624: astore 13
      //   626: aload 5
      //   628: ifnonnull +1316 -> 1944
      //   631: ldc -15
      //   633: astore 7
      //   635: aload 5
      //   637: ifnonnull +1317 -> 1954
      //   640: ldc -15
      //   642: astore 8
      //   644: aload 5
      //   646: ifnonnull +1321 -> 1967
      //   649: ldc -15
      //   651: astore 9
      //   653: aload 11
      //   655: sipush 14058
      //   658: bipush 10
      //   660: anewarray 4	java/lang/Object
      //   663: dup
      //   664: iconst_0
      //   665: ldc -41
      //   667: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   670: aastore
      //   671: dup
      //   672: iconst_1
      //   673: sipush 10001
      //   676: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   679: aastore
      //   680: dup
      //   681: iconst_2
      //   682: aload 12
      //   684: aastore
      //   685: dup
      //   686: iconst_3
      //   687: iconst_0
      //   688: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   691: aastore
      //   692: dup
      //   693: iconst_4
      //   694: aload 13
      //   696: aastore
      //   697: dup
      //   698: iconst_5
      //   699: aload 7
      //   701: aastore
      //   702: dup
      //   703: bipush 6
      //   705: aload 8
      //   707: aastore
      //   708: dup
      //   709: bipush 7
      //   711: aload 9
      //   713: aastore
      //   714: dup
      //   715: bipush 8
      //   717: aload 10
      //   719: aastore
      //   720: dup
      //   721: bipush 9
      //   723: ldc 83
      //   725: aastore
      //   726: invokevirtual 234	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
      //   729: ldc 64
      //   731: ldc -13
      //   733: iconst_3
      //   734: anewarray 4	java/lang/Object
      //   737: dup
      //   738: iconst_0
      //   739: aload 10
      //   741: aastore
      //   742: dup
      //   743: iconst_1
      //   744: aload 6
      //   746: invokevirtual 247	java/lang/Object:getClass	()Ljava/lang/Class;
      //   749: invokevirtual 252	java/lang/Class:getSimpleName	()Ljava/lang/String;
      //   752: aastore
      //   753: dup
      //   754: iconst_2
      //   755: aload 6
      //   757: invokevirtual 239	java/net/ProtocolException:getMessage	()Ljava/lang/String;
      //   760: aastore
      //   761: invokestatic 212	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   764: aload 5
      //   766: ifnull +11 -> 777
      //   769: aload 5
      //   771: getfield 256	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
      //   774: invokevirtual 261	java/net/HttpURLConnection:disconnect	()V
      //   777: aload_3
      //   778: ifnull +7 -> 785
      //   781: aload_3
      //   782: invokevirtual 266	java/io/InputStream:close	()V
      //   785: aload 4
      //   787: ifnull +8 -> 795
      //   790: aload 4
      //   792: invokevirtual 267	java/io/ByteArrayOutputStream:close	()V
      //   795: ldc2_w 49
      //   798: sipush 2860
      //   801: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   804: iconst_1
      //   805: ireturn
      //   806: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   809: ldc2_w 150
      //   812: ldc2_w 268
      //   815: lconst_1
      //   816: iconst_1
      //   817: invokevirtual 156	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   820: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   823: sipush 14058
      //   826: bipush 10
      //   828: anewarray 4	java/lang/Object
      //   831: dup
      //   832: iconst_0
      //   833: ldc -41
      //   835: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   838: aastore
      //   839: dup
      //   840: iconst_1
      //   841: iload_1
      //   842: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   845: aastore
      //   846: dup
      //   847: iconst_2
      //   848: ldc 83
      //   850: aastore
      //   851: dup
      //   852: iconst_3
      //   853: iconst_0
      //   854: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   857: aastore
      //   858: dup
      //   859: iconst_4
      //   860: aload_0
      //   861: getfield 32	com/tencent/mm/ac/c$a:gsn	Lcom/tencent/mm/ac/h;
      //   864: invokevirtual 136	com/tencent/mm/ac/h:getUsername	()Ljava/lang/String;
      //   867: aastore
      //   868: dup
      //   869: iconst_5
      //   870: aload 5
      //   872: getfield 219	com/tencent/mm/network/u:hhi	Ljava/lang/String;
      //   875: aastore
      //   876: dup
      //   877: bipush 6
      //   879: aload 5
      //   881: getfield 222	com/tencent/mm/network/u:hgk	I
      //   884: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   887: aastore
      //   888: dup
      //   889: bipush 7
      //   891: aload 5
      //   893: getfield 226	com/tencent/mm/network/u:url	Ljava/net/URL;
      //   896: invokevirtual 231	java/net/URL:getHost	()Ljava/lang/String;
      //   899: aastore
      //   900: dup
      //   901: bipush 8
      //   903: aload 10
      //   905: aastore
      //   906: dup
      //   907: bipush 9
      //   909: aload_3
      //   910: aastore
      //   911: invokevirtual 234	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
      //   914: goto -458 -> 456
      //   917: astore 6
      //   919: aconst_null
      //   920: astore_3
      //   921: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   924: ldc2_w 150
      //   927: ldc2_w 270
      //   930: lconst_1
      //   931: iconst_1
      //   932: invokevirtual 156	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   935: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   938: astore 11
      //   940: aload 6
      //   942: invokevirtual 272	java/net/SocketTimeoutException:getMessage	()Ljava/lang/String;
      //   945: astore 12
      //   947: aload_0
      //   948: getfield 32	com/tencent/mm/ac/c$a:gsn	Lcom/tencent/mm/ac/h;
      //   951: invokevirtual 136	com/tencent/mm/ac/h:getUsername	()Ljava/lang/String;
      //   954: astore 13
      //   956: aload 5
      //   958: ifnonnull +1022 -> 1980
      //   961: ldc -15
      //   963: astore 7
      //   965: aload 5
      //   967: ifnonnull +1023 -> 1990
      //   970: ldc -15
      //   972: astore 8
      //   974: aload 5
      //   976: ifnonnull +1027 -> 2003
      //   979: ldc -15
      //   981: astore 9
      //   983: aload 11
      //   985: sipush 14058
      //   988: bipush 10
      //   990: anewarray 4	java/lang/Object
      //   993: dup
      //   994: iconst_0
      //   995: ldc -41
      //   997: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1000: aastore
      //   1001: dup
      //   1002: iconst_1
      //   1003: sipush 10002
      //   1006: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1009: aastore
      //   1010: dup
      //   1011: iconst_2
      //   1012: aload 12
      //   1014: aastore
      //   1015: dup
      //   1016: iconst_3
      //   1017: iconst_0
      //   1018: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1021: aastore
      //   1022: dup
      //   1023: iconst_4
      //   1024: aload 13
      //   1026: aastore
      //   1027: dup
      //   1028: iconst_5
      //   1029: aload 7
      //   1031: aastore
      //   1032: dup
      //   1033: bipush 6
      //   1035: aload 8
      //   1037: aastore
      //   1038: dup
      //   1039: bipush 7
      //   1041: aload 9
      //   1043: aastore
      //   1044: dup
      //   1045: bipush 8
      //   1047: aload 10
      //   1049: aastore
      //   1050: dup
      //   1051: bipush 9
      //   1053: ldc 83
      //   1055: aastore
      //   1056: invokevirtual 234	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
      //   1059: ldc 64
      //   1061: ldc -13
      //   1063: iconst_3
      //   1064: anewarray 4	java/lang/Object
      //   1067: dup
      //   1068: iconst_0
      //   1069: aload 10
      //   1071: aastore
      //   1072: dup
      //   1073: iconst_1
      //   1074: aload 6
      //   1076: invokevirtual 247	java/lang/Object:getClass	()Ljava/lang/Class;
      //   1079: invokevirtual 252	java/lang/Class:getSimpleName	()Ljava/lang/String;
      //   1082: aastore
      //   1083: dup
      //   1084: iconst_2
      //   1085: aload 6
      //   1087: invokevirtual 272	java/net/SocketTimeoutException:getMessage	()Ljava/lang/String;
      //   1090: aastore
      //   1091: invokestatic 212	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   1094: goto -330 -> 764
      //   1097: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   1100: ldc2_w 150
      //   1103: ldc2_w 273
      //   1106: lconst_1
      //   1107: iconst_1
      //   1108: invokevirtual 156	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   1111: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   1114: sipush 14058
      //   1117: bipush 10
      //   1119: anewarray 4	java/lang/Object
      //   1122: dup
      //   1123: iconst_0
      //   1124: ldc -41
      //   1126: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1129: aastore
      //   1130: dup
      //   1131: iconst_1
      //   1132: iload_1
      //   1133: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1136: aastore
      //   1137: dup
      //   1138: iconst_2
      //   1139: ldc 83
      //   1141: aastore
      //   1142: dup
      //   1143: iconst_3
      //   1144: iconst_0
      //   1145: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1148: aastore
      //   1149: dup
      //   1150: iconst_4
      //   1151: aload_0
      //   1152: getfield 32	com/tencent/mm/ac/c$a:gsn	Lcom/tencent/mm/ac/h;
      //   1155: invokevirtual 136	com/tencent/mm/ac/h:getUsername	()Ljava/lang/String;
      //   1158: aastore
      //   1159: dup
      //   1160: iconst_5
      //   1161: aload 5
      //   1163: getfield 219	com/tencent/mm/network/u:hhi	Ljava/lang/String;
      //   1166: aastore
      //   1167: dup
      //   1168: bipush 6
      //   1170: aload 5
      //   1172: getfield 222	com/tencent/mm/network/u:hgk	I
      //   1175: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1178: aastore
      //   1179: dup
      //   1180: bipush 7
      //   1182: aload 5
      //   1184: getfield 226	com/tencent/mm/network/u:url	Ljava/net/URL;
      //   1187: invokevirtual 231	java/net/URL:getHost	()Ljava/lang/String;
      //   1190: aastore
      //   1191: dup
      //   1192: bipush 8
      //   1194: aload 10
      //   1196: aastore
      //   1197: dup
      //   1198: bipush 9
      //   1200: aload_3
      //   1201: aastore
      //   1202: invokevirtual 234	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
      //   1205: goto -749 -> 456
      //   1208: astore 6
      //   1210: aconst_null
      //   1211: astore_3
      //   1212: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   1215: ldc2_w 150
      //   1218: ldc2_w 275
      //   1221: lconst_1
      //   1222: iconst_1
      //   1223: invokevirtual 156	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   1226: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   1229: astore 11
      //   1231: aload 6
      //   1233: invokevirtual 277	java/io/IOException:getMessage	()Ljava/lang/String;
      //   1236: astore 12
      //   1238: aload_0
      //   1239: getfield 32	com/tencent/mm/ac/c$a:gsn	Lcom/tencent/mm/ac/h;
      //   1242: invokevirtual 136	com/tencent/mm/ac/h:getUsername	()Ljava/lang/String;
      //   1245: astore 13
      //   1247: aload 5
      //   1249: ifnonnull +767 -> 2016
      //   1252: ldc -15
      //   1254: astore 7
      //   1256: aload 5
      //   1258: ifnonnull +768 -> 2026
      //   1261: ldc -15
      //   1263: astore 8
      //   1265: aload 5
      //   1267: ifnonnull +772 -> 2039
      //   1270: ldc -15
      //   1272: astore 9
      //   1274: aload 11
      //   1276: sipush 14058
      //   1279: bipush 10
      //   1281: anewarray 4	java/lang/Object
      //   1284: dup
      //   1285: iconst_0
      //   1286: ldc -41
      //   1288: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1291: aastore
      //   1292: dup
      //   1293: iconst_1
      //   1294: sipush 10003
      //   1297: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1300: aastore
      //   1301: dup
      //   1302: iconst_2
      //   1303: aload 12
      //   1305: aastore
      //   1306: dup
      //   1307: iconst_3
      //   1308: iconst_0
      //   1309: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1312: aastore
      //   1313: dup
      //   1314: iconst_4
      //   1315: aload 13
      //   1317: aastore
      //   1318: dup
      //   1319: iconst_5
      //   1320: aload 7
      //   1322: aastore
      //   1323: dup
      //   1324: bipush 6
      //   1326: aload 8
      //   1328: aastore
      //   1329: dup
      //   1330: bipush 7
      //   1332: aload 9
      //   1334: aastore
      //   1335: dup
      //   1336: bipush 8
      //   1338: aload 10
      //   1340: aastore
      //   1341: dup
      //   1342: bipush 9
      //   1344: ldc 83
      //   1346: aastore
      //   1347: invokevirtual 234	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
      //   1350: ldc 64
      //   1352: ldc -13
      //   1354: iconst_3
      //   1355: anewarray 4	java/lang/Object
      //   1358: dup
      //   1359: iconst_0
      //   1360: aload 10
      //   1362: aastore
      //   1363: dup
      //   1364: iconst_1
      //   1365: aload 6
      //   1367: invokevirtual 247	java/lang/Object:getClass	()Ljava/lang/Class;
      //   1370: invokevirtual 252	java/lang/Class:getSimpleName	()Ljava/lang/String;
      //   1373: aastore
      //   1374: dup
      //   1375: iconst_2
      //   1376: aload 6
      //   1378: invokevirtual 277	java/io/IOException:getMessage	()Ljava/lang/String;
      //   1381: aastore
      //   1382: invokestatic 212	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   1385: goto -621 -> 764
      //   1388: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   1391: ldc2_w 150
      //   1394: ldc2_w 278
      //   1397: lconst_1
      //   1398: iconst_1
      //   1399: invokevirtual 156	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   1402: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   1405: sipush 14058
      //   1408: bipush 10
      //   1410: anewarray 4	java/lang/Object
      //   1413: dup
      //   1414: iconst_0
      //   1415: ldc -41
      //   1417: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1420: aastore
      //   1421: dup
      //   1422: iconst_1
      //   1423: iload_1
      //   1424: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1427: aastore
      //   1428: dup
      //   1429: iconst_2
      //   1430: ldc 83
      //   1432: aastore
      //   1433: dup
      //   1434: iconst_3
      //   1435: iconst_0
      //   1436: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1439: aastore
      //   1440: dup
      //   1441: iconst_4
      //   1442: aload_0
      //   1443: getfield 32	com/tencent/mm/ac/c$a:gsn	Lcom/tencent/mm/ac/h;
      //   1446: invokevirtual 136	com/tencent/mm/ac/h:getUsername	()Ljava/lang/String;
      //   1449: aastore
      //   1450: dup
      //   1451: iconst_5
      //   1452: aload 5
      //   1454: getfield 219	com/tencent/mm/network/u:hhi	Ljava/lang/String;
      //   1457: aastore
      //   1458: dup
      //   1459: bipush 6
      //   1461: aload 5
      //   1463: getfield 222	com/tencent/mm/network/u:hgk	I
      //   1466: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1469: aastore
      //   1470: dup
      //   1471: bipush 7
      //   1473: aload 5
      //   1475: getfield 226	com/tencent/mm/network/u:url	Ljava/net/URL;
      //   1478: invokevirtual 231	java/net/URL:getHost	()Ljava/lang/String;
      //   1481: aastore
      //   1482: dup
      //   1483: bipush 8
      //   1485: aload 10
      //   1487: aastore
      //   1488: dup
      //   1489: bipush 9
      //   1491: aload_3
      //   1492: aastore
      //   1493: invokevirtual 234	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
      //   1496: goto -1040 -> 456
      //   1499: astore 6
      //   1501: aconst_null
      //   1502: astore_3
      //   1503: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   1506: ldc2_w 150
      //   1509: lconst_0
      //   1510: lconst_1
      //   1511: iconst_1
      //   1512: invokevirtual 156	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   1515: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   1518: astore 11
      //   1520: aload 6
      //   1522: invokevirtual 280	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   1525: astore 12
      //   1527: aload_0
      //   1528: getfield 32	com/tencent/mm/ac/c$a:gsn	Lcom/tencent/mm/ac/h;
      //   1531: invokevirtual 136	com/tencent/mm/ac/h:getUsername	()Ljava/lang/String;
      //   1534: astore 13
      //   1536: aload 5
      //   1538: ifnonnull +514 -> 2052
      //   1541: ldc -15
      //   1543: astore 7
      //   1545: aload 5
      //   1547: ifnonnull +515 -> 2062
      //   1550: ldc -15
      //   1552: astore 8
      //   1554: aload 5
      //   1556: ifnonnull +519 -> 2075
      //   1559: ldc -15
      //   1561: astore 9
      //   1563: aload 11
      //   1565: sipush 14058
      //   1568: bipush 10
      //   1570: anewarray 4	java/lang/Object
      //   1573: dup
      //   1574: iconst_0
      //   1575: ldc -41
      //   1577: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1580: aastore
      //   1581: dup
      //   1582: iconst_1
      //   1583: sipush 10003
      //   1586: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1589: aastore
      //   1590: dup
      //   1591: iconst_2
      //   1592: aload 12
      //   1594: aastore
      //   1595: dup
      //   1596: iconst_3
      //   1597: iconst_0
      //   1598: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1601: aastore
      //   1602: dup
      //   1603: iconst_4
      //   1604: aload 13
      //   1606: aastore
      //   1607: dup
      //   1608: iconst_5
      //   1609: aload 7
      //   1611: aastore
      //   1612: dup
      //   1613: bipush 6
      //   1615: aload 8
      //   1617: aastore
      //   1618: dup
      //   1619: bipush 7
      //   1621: aload 9
      //   1623: aastore
      //   1624: dup
      //   1625: bipush 8
      //   1627: aload 10
      //   1629: aastore
      //   1630: dup
      //   1631: bipush 9
      //   1633: ldc 83
      //   1635: aastore
      //   1636: invokevirtual 234	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
      //   1639: ldc 64
      //   1641: ldc -13
      //   1643: iconst_3
      //   1644: anewarray 4	java/lang/Object
      //   1647: dup
      //   1648: iconst_0
      //   1649: aload 10
      //   1651: aastore
      //   1652: dup
      //   1653: iconst_1
      //   1654: aload 6
      //   1656: invokevirtual 247	java/lang/Object:getClass	()Ljava/lang/Class;
      //   1659: invokevirtual 252	java/lang/Class:getSimpleName	()Ljava/lang/String;
      //   1662: aastore
      //   1663: dup
      //   1664: iconst_2
      //   1665: aload 6
      //   1667: invokevirtual 280	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   1670: aastore
      //   1671: invokestatic 212	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   1674: goto -910 -> 764
      //   1677: aload 5
      //   1679: getfield 256	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
      //   1682: invokevirtual 283	java/net/HttpURLConnection:getContentLength	()I
      //   1685: istore_1
      //   1686: aload 5
      //   1688: invokevirtual 287	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
      //   1691: astore_3
      //   1692: aload_3
      //   1693: ifnonnull +31 -> 1724
      //   1696: ldc 64
      //   1698: ldc_w 289
      //   1701: iconst_1
      //   1702: anewarray 4	java/lang/Object
      //   1705: dup
      //   1706: iconst_0
      //   1707: aload 10
      //   1709: aastore
      //   1710: invokestatic 140	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   1713: ldc2_w 49
      //   1716: sipush 2860
      //   1719: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   1722: iconst_1
      //   1723: ireturn
      //   1724: sipush 1024
      //   1727: newarray <illegal type>
      //   1729: astore 6
      //   1731: aload_3
      //   1732: aload 6
      //   1734: invokevirtual 293	java/io/InputStream:read	([B)I
      //   1737: istore_2
      //   1738: iload_2
      //   1739: iconst_m1
      //   1740: if_icmpeq +15 -> 1755
      //   1743: aload 4
      //   1745: aload 6
      //   1747: iconst_0
      //   1748: iload_2
      //   1749: invokevirtual 297	java/io/ByteArrayOutputStream:write	([BII)V
      //   1752: goto -21 -> 1731
      //   1755: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   1758: ldc2_w 150
      //   1761: ldc2_w 298
      //   1764: lconst_1
      //   1765: iconst_1
      //   1766: invokevirtual 156	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   1769: invokestatic 304	com/tencent/mm/sdk/a/b:bPq	()Z
      //   1772: ifeq +100 -> 1872
      //   1775: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   1778: sipush 14058
      //   1781: bipush 10
      //   1783: anewarray 4	java/lang/Object
      //   1786: dup
      //   1787: iconst_0
      //   1788: ldc -41
      //   1790: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1793: aastore
      //   1794: dup
      //   1795: iconst_1
      //   1796: sipush 20000
      //   1799: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1802: aastore
      //   1803: dup
      //   1804: iconst_2
      //   1805: ldc 83
      //   1807: aastore
      //   1808: dup
      //   1809: iconst_3
      //   1810: iload_1
      //   1811: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1814: aastore
      //   1815: dup
      //   1816: iconst_4
      //   1817: aload_0
      //   1818: getfield 32	com/tencent/mm/ac/c$a:gsn	Lcom/tencent/mm/ac/h;
      //   1821: invokevirtual 136	com/tencent/mm/ac/h:getUsername	()Ljava/lang/String;
      //   1824: aastore
      //   1825: dup
      //   1826: iconst_5
      //   1827: aload 5
      //   1829: getfield 219	com/tencent/mm/network/u:hhi	Ljava/lang/String;
      //   1832: aastore
      //   1833: dup
      //   1834: bipush 6
      //   1836: aload 5
      //   1838: getfield 222	com/tencent/mm/network/u:hgk	I
      //   1841: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1844: aastore
      //   1845: dup
      //   1846: bipush 7
      //   1848: aload 5
      //   1850: getfield 226	com/tencent/mm/network/u:url	Ljava/net/URL;
      //   1853: invokevirtual 231	java/net/URL:getHost	()Ljava/lang/String;
      //   1856: aastore
      //   1857: dup
      //   1858: bipush 8
      //   1860: aload 10
      //   1862: aastore
      //   1863: dup
      //   1864: bipush 9
      //   1866: ldc 83
      //   1868: aastore
      //   1869: invokevirtual 234	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
      //   1872: aload_0
      //   1873: aload 4
      //   1875: invokevirtual 308	java/io/ByteArrayOutputStream:toByteArray	()[B
      //   1878: putfield 34	com/tencent/mm/ac/c$a:gso	[B
      //   1881: aload 4
      //   1883: invokevirtual 267	java/io/ByteArrayOutputStream:close	()V
      //   1886: aload 5
      //   1888: getfield 256	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
      //   1891: invokevirtual 261	java/net/HttpURLConnection:disconnect	()V
      //   1894: aload_3
      //   1895: invokevirtual 266	java/io/InputStream:close	()V
      //   1898: iload_1
      //   1899: ifle +34 -> 1933
      //   1902: aload_0
      //   1903: getfield 34	com/tencent/mm/ac/c$a:gso	[B
      //   1906: arraylength
      //   1907: iload_1
      //   1908: if_icmpge +25 -> 1933
      //   1911: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   1914: ldc2_w 150
      //   1917: ldc2_w 309
      //   1920: lconst_1
      //   1921: iconst_1
      //   1922: invokevirtual 156	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   1925: ldc 64
      //   1927: ldc_w 312
      //   1930: invokestatic 314	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   1933: aconst_null
      //   1934: astore 5
      //   1936: aconst_null
      //   1937: astore 4
      //   1939: aconst_null
      //   1940: astore_3
      //   1941: goto -1177 -> 764
      //   1944: aload 5
      //   1946: getfield 219	com/tencent/mm/network/u:hhi	Ljava/lang/String;
      //   1949: astore 7
      //   1951: goto -1316 -> 635
      //   1954: aload 5
      //   1956: getfield 222	com/tencent/mm/network/u:hgk	I
      //   1959: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1962: astore 8
      //   1964: goto -1320 -> 644
      //   1967: aload 5
      //   1969: getfield 226	com/tencent/mm/network/u:url	Ljava/net/URL;
      //   1972: invokevirtual 231	java/net/URL:getHost	()Ljava/lang/String;
      //   1975: astore 9
      //   1977: goto -1324 -> 653
      //   1980: aload 5
      //   1982: getfield 219	com/tencent/mm/network/u:hhi	Ljava/lang/String;
      //   1985: astore 7
      //   1987: goto -1022 -> 965
      //   1990: aload 5
      //   1992: getfield 222	com/tencent/mm/network/u:hgk	I
      //   1995: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   1998: astore 8
      //   2000: goto -1026 -> 974
      //   2003: aload 5
      //   2005: getfield 226	com/tencent/mm/network/u:url	Ljava/net/URL;
      //   2008: invokevirtual 231	java/net/URL:getHost	()Ljava/lang/String;
      //   2011: astore 9
      //   2013: goto -1030 -> 983
      //   2016: aload 5
      //   2018: getfield 219	com/tencent/mm/network/u:hhi	Ljava/lang/String;
      //   2021: astore 7
      //   2023: goto -767 -> 1256
      //   2026: aload 5
      //   2028: getfield 222	com/tencent/mm/network/u:hgk	I
      //   2031: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   2034: astore 8
      //   2036: goto -771 -> 1265
      //   2039: aload 5
      //   2041: getfield 226	com/tencent/mm/network/u:url	Ljava/net/URL;
      //   2044: invokevirtual 231	java/net/URL:getHost	()Ljava/lang/String;
      //   2047: astore 9
      //   2049: goto -775 -> 1274
      //   2052: aload 5
      //   2054: getfield 219	com/tencent/mm/network/u:hhi	Ljava/lang/String;
      //   2057: astore 7
      //   2059: goto -514 -> 1545
      //   2062: aload 5
      //   2064: getfield 222	com/tencent/mm/network/u:hgk	I
      //   2067: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   2070: astore 8
      //   2072: goto -518 -> 1554
      //   2075: aload 5
      //   2077: getfield 226	com/tencent/mm/network/u:url	Ljava/net/URL;
      //   2080: invokevirtual 231	java/net/URL:getHost	()Ljava/lang/String;
      //   2083: astore 9
      //   2085: goto -522 -> 1563
      //   2088: astore_3
      //   2089: ldc 64
      //   2091: ldc_w 316
      //   2094: iconst_1
      //   2095: anewarray 4	java/lang/Object
      //   2098: dup
      //   2099: iconst_0
      //   2100: aload_3
      //   2101: invokestatic 322	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   2104: aastore
      //   2105: invokestatic 212	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   2108: ldc 64
      //   2110: ldc_w 324
      //   2113: iconst_1
      //   2114: anewarray 4	java/lang/Object
      //   2117: dup
      //   2118: iconst_0
      //   2119: aload_3
      //   2120: invokevirtual 280	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   2123: aastore
      //   2124: invokestatic 212	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   2127: getstatic 149	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
      //   2130: ldc2_w 150
      //   2133: ldc2_w 325
      //   2136: lconst_1
      //   2137: iconst_1
      //   2138: invokevirtual 156	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
      //   2141: goto -1346 -> 795
      //   2144: astore 6
      //   2146: aconst_null
      //   2147: astore 5
      //   2149: aconst_null
      //   2150: astore_3
      //   2151: goto -648 -> 1503
      //   2154: astore 6
      //   2156: goto -653 -> 1503
      //   2159: astore 6
      //   2161: aconst_null
      //   2162: astore 4
      //   2164: goto -661 -> 1503
      //   2167: astore 6
      //   2169: aconst_null
      //   2170: astore 5
      //   2172: aconst_null
      //   2173: astore 4
      //   2175: goto -672 -> 1503
      //   2178: astore 6
      //   2180: aconst_null
      //   2181: astore 5
      //   2183: aconst_null
      //   2184: astore 4
      //   2186: aconst_null
      //   2187: astore_3
      //   2188: goto -685 -> 1503
      //   2191: astore 6
      //   2193: aconst_null
      //   2194: astore 5
      //   2196: aconst_null
      //   2197: astore_3
      //   2198: goto -986 -> 1212
      //   2201: astore 6
      //   2203: goto -991 -> 1212
      //   2206: astore 6
      //   2208: aconst_null
      //   2209: astore 4
      //   2211: goto -999 -> 1212
      //   2214: astore 6
      //   2216: aconst_null
      //   2217: astore 5
      //   2219: aconst_null
      //   2220: astore 4
      //   2222: goto -1010 -> 1212
      //   2225: astore 6
      //   2227: aconst_null
      //   2228: astore 5
      //   2230: aconst_null
      //   2231: astore 4
      //   2233: aconst_null
      //   2234: astore_3
      //   2235: goto -1023 -> 1212
      //   2238: astore 6
      //   2240: aconst_null
      //   2241: astore 5
      //   2243: aconst_null
      //   2244: astore_3
      //   2245: goto -1324 -> 921
      //   2248: astore 6
      //   2250: goto -1329 -> 921
      //   2253: astore 6
      //   2255: aconst_null
      //   2256: astore 4
      //   2258: goto -1337 -> 921
      //   2261: astore 6
      //   2263: aconst_null
      //   2264: astore 5
      //   2266: aconst_null
      //   2267: astore 4
      //   2269: goto -1348 -> 921
      //   2272: astore 6
      //   2274: aconst_null
      //   2275: astore 5
      //   2277: aconst_null
      //   2278: astore 4
      //   2280: aconst_null
      //   2281: astore_3
      //   2282: goto -1361 -> 921
      //   2285: astore 6
      //   2287: aconst_null
      //   2288: astore 5
      //   2290: aconst_null
      //   2291: astore_3
      //   2292: goto -1699 -> 593
      //   2295: astore 6
      //   2297: aconst_null
      //   2298: astore 4
      //   2300: goto -1707 -> 593
      //   2303: astore 6
      //   2305: aconst_null
      //   2306: astore 5
      //   2308: aconst_null
      //   2309: astore 4
      //   2311: goto -1718 -> 593
      //   2314: astore 6
      //   2316: aconst_null
      //   2317: astore 5
      //   2319: aconst_null
      //   2320: astore 4
      //   2322: aconst_null
      //   2323: astore_3
      //   2324: goto -1731 -> 593
      //   2327: goto -1979 -> 348
      //   2330: astore 6
      //   2332: goto -1739 -> 593
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	2335	0	this	a
      //   70	1839	1	i	int
      //   1737	12	2	j	int
      //   57	1884	3	localObject1	Object
      //   2088	32	3	localException1	Exception
      //   2150	174	3	localObject2	Object
      //   162	2159	4	localByteArrayOutputStream	java.io.ByteArrayOutputStream
      //   184	2134	5	localu	com.tencent.mm.network.u
      //   589	167	6	localProtocolException1	java.net.ProtocolException
      //   917	169	6	localSocketTimeoutException1	java.net.SocketTimeoutException
      //   1208	169	6	localIOException1	java.io.IOException
      //   1499	167	6	localException2	Exception
      //   1729	17	6	arrayOfByte	byte[]
      //   2144	1	6	localException3	Exception
      //   2154	1	6	localException4	Exception
      //   2159	1	6	localException5	Exception
      //   2167	1	6	localException6	Exception
      //   2178	1	6	localException7	Exception
      //   2191	1	6	localIOException2	java.io.IOException
      //   2201	1	6	localIOException3	java.io.IOException
      //   2206	1	6	localIOException4	java.io.IOException
      //   2214	1	6	localIOException5	java.io.IOException
      //   2225	1	6	localIOException6	java.io.IOException
      //   2238	1	6	localSocketTimeoutException2	java.net.SocketTimeoutException
      //   2248	1	6	localSocketTimeoutException3	java.net.SocketTimeoutException
      //   2253	1	6	localSocketTimeoutException4	java.net.SocketTimeoutException
      //   2261	1	6	localSocketTimeoutException5	java.net.SocketTimeoutException
      //   2272	1	6	localSocketTimeoutException6	java.net.SocketTimeoutException
      //   2285	1	6	localProtocolException2	java.net.ProtocolException
      //   2295	1	6	localProtocolException3	java.net.ProtocolException
      //   2303	1	6	localProtocolException4	java.net.ProtocolException
      //   2314	1	6	localProtocolException5	java.net.ProtocolException
      //   2330	1	6	localProtocolException6	java.net.ProtocolException
      //   633	1425	7	str1	String
      //   642	1429	8	localObject3	Object
      //   651	1433	9	str2	String
      //   53	1808	10	str3	String
      //   608	956	11	localg	com.tencent.mm.plugin.report.service.g
      //   615	978	12	str4	String
      //   624	981	13	str5	String
      // Exception table:
      //   from	to	target	type
      //   186	237	589	java/net/ProtocolException
      //   241	253	589	java/net/ProtocolException
      //   257	277	589	java/net/ProtocolException
      //   277	304	589	java/net/ProtocolException
      //   348	456	589	java/net/ProtocolException
      //   478	586	589	java/net/ProtocolException
      //   806	914	589	java/net/ProtocolException
      //   1097	1205	589	java/net/ProtocolException
      //   1388	1496	589	java/net/ProtocolException
      //   1677	1692	589	java/net/ProtocolException
      //   186	237	917	java/net/SocketTimeoutException
      //   241	253	917	java/net/SocketTimeoutException
      //   257	277	917	java/net/SocketTimeoutException
      //   277	304	917	java/net/SocketTimeoutException
      //   348	456	917	java/net/SocketTimeoutException
      //   478	586	917	java/net/SocketTimeoutException
      //   806	914	917	java/net/SocketTimeoutException
      //   1097	1205	917	java/net/SocketTimeoutException
      //   1388	1496	917	java/net/SocketTimeoutException
      //   1677	1692	917	java/net/SocketTimeoutException
      //   186	237	1208	java/io/IOException
      //   241	253	1208	java/io/IOException
      //   257	277	1208	java/io/IOException
      //   277	304	1208	java/io/IOException
      //   348	456	1208	java/io/IOException
      //   478	586	1208	java/io/IOException
      //   806	914	1208	java/io/IOException
      //   1097	1205	1208	java/io/IOException
      //   1388	1496	1208	java/io/IOException
      //   1677	1692	1208	java/io/IOException
      //   186	237	1499	java/lang/Exception
      //   241	253	1499	java/lang/Exception
      //   257	277	1499	java/lang/Exception
      //   277	304	1499	java/lang/Exception
      //   348	456	1499	java/lang/Exception
      //   478	586	1499	java/lang/Exception
      //   806	914	1499	java/lang/Exception
      //   1097	1205	1499	java/lang/Exception
      //   1388	1496	1499	java/lang/Exception
      //   1677	1692	1499	java/lang/Exception
      //   769	777	2088	java/lang/Exception
      //   781	785	2088	java/lang/Exception
      //   790	795	2088	java/lang/Exception
      //   178	186	2144	java/lang/Exception
      //   1696	1713	2154	java/lang/Exception
      //   1724	1731	2154	java/lang/Exception
      //   1731	1738	2154	java/lang/Exception
      //   1743	1752	2154	java/lang/Exception
      //   1755	1872	2154	java/lang/Exception
      //   1872	1886	2154	java/lang/Exception
      //   1886	1894	2159	java/lang/Exception
      //   1894	1898	2167	java/lang/Exception
      //   1902	1933	2178	java/lang/Exception
      //   178	186	2191	java/io/IOException
      //   1696	1713	2201	java/io/IOException
      //   1724	1731	2201	java/io/IOException
      //   1731	1738	2201	java/io/IOException
      //   1743	1752	2201	java/io/IOException
      //   1755	1872	2201	java/io/IOException
      //   1872	1886	2201	java/io/IOException
      //   1886	1894	2206	java/io/IOException
      //   1894	1898	2214	java/io/IOException
      //   1902	1933	2225	java/io/IOException
      //   178	186	2238	java/net/SocketTimeoutException
      //   1696	1713	2248	java/net/SocketTimeoutException
      //   1724	1731	2248	java/net/SocketTimeoutException
      //   1731	1738	2248	java/net/SocketTimeoutException
      //   1743	1752	2248	java/net/SocketTimeoutException
      //   1755	1872	2248	java/net/SocketTimeoutException
      //   1872	1886	2248	java/net/SocketTimeoutException
      //   1886	1894	2253	java/net/SocketTimeoutException
      //   1894	1898	2261	java/net/SocketTimeoutException
      //   1902	1933	2272	java/net/SocketTimeoutException
      //   178	186	2285	java/net/ProtocolException
      //   1886	1894	2295	java/net/ProtocolException
      //   1894	1898	2303	java/net/ProtocolException
      //   1902	1933	2314	java/net/ProtocolException
      //   1696	1713	2330	java/net/ProtocolException
      //   1724	1731	2330	java/net/ProtocolException
      //   1731	1738	2330	java/net/ProtocolException
      //   1743	1752	2330	java/net/ProtocolException
      //   1755	1872	2330	java/net/ProtocolException
      //   1872	1886	2330	java/net/ProtocolException
    }
    
    public final boolean Dk()
    {
      GMTrace.i(383996919808L, 2861);
      if ((this.gsn == null) || (bg.nm(this.gsn.getUsername())))
      {
        GMTrace.o(383996919808L, 2861);
        return false;
      }
      if (bg.bq(this.gso))
      {
        c.this.gsc.remove(this.gsn.getUsername());
        com.tencent.mm.plugin.report.service.g.ork.a(138L, 10L, 1L, true);
        GMTrace.o(383996919808L, 2861);
        return false;
      }
      if (ak.a.gmY != null) {
        ak.a.gmY.aI(this.gso.length, 0);
      }
      c.this.a(new c.d(c.this, this.gsn, this.gso));
      GMTrace.o(383996919808L, 2861);
      return false;
    }
  }
  
  private final class b
    implements ar.a
  {
    Bitmap gsp;
    String username;
    
    public b(String paramString)
    {
      GMTrace.i(382520524800L, 2850);
      this.username = null;
      this.gsp = null;
      this.username = paramString;
      GMTrace.o(382520524800L, 2850);
    }
    
    public final boolean Dj()
    {
      Context localContext = null;
      Object localObject1 = null;
      int i = 0;
      GMTrace.i(382654742528L, 2851);
      if (bg.nm(this.username))
      {
        GMTrace.o(382654742528L, 2851);
        return false;
      }
      String str1 = this.username;
      boolean bool;
      String str2;
      Object localObject2;
      if (str1 == null)
      {
        bool = false;
        if (bool)
        {
          str2 = (String)c.this.gsi.get(str1);
          if (!bg.nm(str2))
          {
            localObject2 = n.Di().ig(str1);
            if ((localObject2 == null) || (!str1.equals(((h)localObject2).getUsername())))
            {
              localObject2 = n.Di();
              String str3 = "select img_flag.username,img_flag.imgflag,img_flag.lastupdatetime,img_flag.reserved1,img_flag.reserved2,img_flag.reserved3,img_flag.reserved4 from img_flag where img_flag.reserved2=\"" + bg.nk(str2) + "\"";
              localObject2 = ((i)localObject2).goN.a(str3, null, 2);
              if (localObject2 != null) {
                break label273;
              }
            }
          }
        }
      }
      for (;;)
      {
        if ((localObject1 != null) && (!bg.nm(((h)localObject1).getUsername()))) {
          FileOp.o(b.hQ(((h)localObject1).getUsername()), b.hQ(str1));
        }
        localObject1 = new h();
        ((h)localObject1).username = str1;
        ((h)localObject1).fiZ = 3;
        ((h)localObject1).gsT = str2;
        ((h)localObject1).gsU = str2;
        ((h)localObject1).eQl = 3;
        ((h)localObject1).bi(true);
        ((h)localObject1).eQl = 31;
        n.Di().a((h)localObject1);
        localObject1 = c.Dh();
        if (localObject1 != null) {
          break label318;
        }
        GMTrace.o(382654742528L, 2851);
        return false;
        bool = str1.startsWith("ammURL_");
        break;
        label273:
        localObject1 = localContext;
        if (((Cursor)localObject2).moveToFirst())
        {
          ((Cursor)localObject2).moveToFirst();
          localObject1 = new h();
          ((h)localObject1).b((Cursor)localObject2);
        }
        ((Cursor)localObject2).close();
      }
      label318:
      if (d.gsu.containsKey(this.username)) {
        i = ((Integer)d.gsu.get(this.username)).intValue();
      }
      if (i != 0)
      {
        n.Dt();
        localContext = n.getContext();
        if (localContext != null) {
          ((d)localObject1).d(this.username, com.tencent.mm.compatible.f.a.decodeResource(localContext.getResources(), i));
        }
      }
      this.gsp = d.hX(this.username);
      GMTrace.o(382654742528L, 2851);
      return true;
    }
    
    public final boolean Dk()
    {
      GMTrace.i(382788960256L, 2852);
      if (this.gsp == null)
      {
        c localc = c.this;
        String str = this.username;
        w.d("MicroMsg.AvatarService", "avatar service push: %s", new Object[] { str });
        if (bg.nm(str))
        {
          localObject = null;
          if (localObject != null) {
            break label465;
          }
          localc.gsc.remove(str);
        }
        for (;;)
        {
          GMTrace.o(382788960256L, 2852);
          return false;
          if ((str.equals(localc.gsh + "@bottle")) && (!bg.a((Boolean)com.tencent.mm.kernel.h.xy().xh().get(60, null), false)))
          {
            localObject = null;
            break;
          }
          if ((str.equals(localc.gsh)) && (!bg.a((Boolean)com.tencent.mm.kernel.h.xy().xh().get(59, null), false)))
          {
            localObject = null;
            break;
          }
          long l = bg.Pu();
          c.c localc1 = (c.c)localc.gsd.get(str);
          if ((localc1 != null) && (localc1.gsq >= 5) && (l - localc1.goZ < 600L))
          {
            w.w("MicroMsg.AvatarService", "checkUser block by recentdown: %s", new Object[] { str });
            localObject = null;
            break;
          }
          localObject = c.hU(str);
          if (localObject == null)
          {
            w.w("MicroMsg.AvatarService", "checkUser block local no need: %s", new Object[] { str });
            localObject = new c.c();
            ((c.c)localObject).gsq = 5;
            ((c.c)localObject).goZ = l;
            localc.gsd.m(str, localObject);
            localObject = null;
            break;
          }
          if ((localc1 == null) || (l - localc1.goZ > 600L))
          {
            w.d("MicroMsg.AvatarService", "new user: %s", new Object[] { str });
            localc1 = new c.c();
            localc1.gsq = 1;
            localc1.goZ = l;
            localc.gsd.m(str, localc1);
          }
          for (;;)
          {
            break;
            if (localc1.gsq < 5)
            {
              w.d("MicroMsg.AvatarService", "checkUser: %s tryCount: %d time: %d", new Object[] { str, Integer.valueOf(localc1.gsq), Long.valueOf(l - localc1.goZ) });
              localc1.gsq += 1;
              localc1.goZ = l;
              localc.gsd.m(str, localc1);
            }
          }
          label465:
          if (!bg.nm(((h)localObject).Dp()))
          {
            localc.a(new c.a(localc, (h)localObject));
          }
          else
          {
            w.w("MicroMsg.AvatarService", "dkhurl [%s] has NO URL flag:%d !", new Object[] { str, Integer.valueOf(((h)localObject).fiZ) });
            if (4 == ((h)localObject).fiZ)
            {
              w.w("MicroMsg.AvatarService", "no avatar, do not batch get head image");
            }
            else
            {
              localc.gse.push(localObject);
              if (localc.gse.size() > 5) {
                localc.gsj.z(0L, 0L);
              } else {
                localc.gsj.z(1000L, 1000L);
              }
            }
          }
        }
      }
      Object localObject = c.Dh();
      if (localObject != null) {
        ((d)localObject).c(this.username, this.gsp);
      }
      c.this.gsc.remove(this.username);
      GMTrace.o(382788960256L, 2852);
      return false;
    }
  }
  
  private static final class c
  {
    public long goZ;
    public int gsq;
    
    public c()
    {
      GMTrace.i(380238823424L, 2833);
      this.goZ = 0L;
      this.gsq = 0;
      GMTrace.o(380238823424L, 2833);
    }
  }
  
  private final class d
    implements ar.a
  {
    Bitmap bitmap;
    byte[] buf;
    h gsr;
    
    public d(h paramh, byte[] paramArrayOfByte)
    {
      GMTrace.i(393392160768L, 2931);
      this.gsr = null;
      this.bitmap = null;
      this.gsr = paramh;
      this.buf = paramArrayOfByte;
      GMTrace.o(393392160768L, 2931);
    }
    
    public final boolean Dj()
    {
      GMTrace.i(393526378496L, 2932);
      if ((this.gsr == null) || (bg.nm(this.gsr.getUsername())))
      {
        w.e("MicroMsg.AvatarService", "SaveAvatar imgFlag info is null");
        com.tencent.mm.plugin.report.service.g.ork.a(138L, 13L, 1L, true);
        GMTrace.o(393526378496L, 2932);
        return false;
      }
      if (c.Dh() != null)
      {
        this.bitmap = d.e(this.gsr.getUsername(), this.buf);
        if (this.bitmap == null) {
          com.tencent.mm.plugin.report.service.g.ork.a(138L, 14L, 1L, true);
        }
      }
      i locali = c.Di();
      if (locali != null)
      {
        this.gsr.eQl = -1;
        this.gsr.Dq();
        locali.a(this.gsr);
      }
      GMTrace.o(393526378496L, 2932);
      return true;
    }
    
    public final boolean Dk()
    {
      GMTrace.i(393660596224L, 2933);
      if (bg.nm(this.gsr.getUsername()))
      {
        GMTrace.o(393660596224L, 2933);
        return false;
      }
      d locald = c.Dh();
      if ((locald != null) && (this.bitmap != null)) {
        locald.c(this.gsr.getUsername(), this.bitmap);
      }
      c.this.gsc.remove(this.gsr.getUsername());
      GMTrace.o(393660596224L, 2933);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ac\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */