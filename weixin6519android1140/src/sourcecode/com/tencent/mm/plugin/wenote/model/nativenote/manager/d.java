package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.os.Looper;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class d
  extends Thread
{
  private static HashMap<String, b> sem;
  private static Object sen;
  private static ar seo;
  public boolean isStop;
  private List<String> sec;
  private List<Integer> sed;
  private List<String> see;
  private List<String> sef;
  private List<Integer> seg;
  private a seh;
  private com.tencent.mm.plugin.wenote.model.a.j sei;
  private String sej;
  private String sek;
  private boolean sel;
  
  static
  {
    GMTrace.i(17225368993792L, 128339);
    sem = new HashMap();
    sen = new byte[0];
    GMTrace.o(17225368993792L, 128339);
  }
  
  public d(List<String> paramList, String paramString1, String paramString2, com.tencent.mm.plugin.wenote.model.a.j paramj, a parama)
  {
    GMTrace.i(17223758381056L, 128327);
    this.sel = false;
    this.sec = paramList;
    this.sed = new ArrayList();
    this.see = new ArrayList();
    this.seg = new ArrayList();
    this.sef = new ArrayList();
    this.seh = parama;
    this.sei = paramj;
    this.sek = paramString2;
    this.sej = paramString1;
    GMTrace.o(17223758381056L, 128327);
  }
  
  private void a(final int paramInt1, String paramString1, String paramString2, int paramInt2, VideoTransPara paramVideoTransPara, Context arg6, final String paramString3)
  {
    GMTrace.i(17224026816512L, 128329);
    w.i("MicroMsg.NoteVideoCompress", "finish to import %s to %s | ret %d | duration %d", new Object[] { paramString2, paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    d(paramInt1, paramString1, paramString2, paramInt2);
    if (paramInt1 == -50002) {
      aL(???, ???.getString(R.l.ego));
    }
    for (;;)
    {
      if ((this.seh != null) && (!this.isStop)) {
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17235166887936L, 128412);
            d.b(d.this).a(paramString3, d.a(d.this));
            if ((d.c(d.this)) || (paramInt1 != -50006)) {
              com.tencent.mm.y.at.xB().h(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(17236777500672L, 128424);
                  d.b(d.this).b(d.d(d.this), d.a(d.this));
                  GMTrace.o(17236777500672L, 128424);
                }
              }, 80L);
            }
            GMTrace.o(17235166887936L, 128412);
          }
        });
      }
      GMTrace.o(17224026816512L, 128329);
      return;
      if (paramInt1 == -50008)
      {
        aL(???, ???.getString(R.l.egm));
      }
      else
      {
        if (paramInt1 == -50006)
        {
          b localb;
          if (bg.nm(paramString1))
          {
            w.w("MicroMsg.NoteVideoCompress", "do insertVideoStorage, but file name is null");
            if (seo == null) {
              seo = new ar(5, "remuxing-thread-" + System.currentTimeMillis(), 1, Looper.getMainLooper());
            }
            localb = new b();
          }
          synchronized (sen)
          {
            sem.put(paramString1, localb);
            localb.euR = paramString1;
            localb.hac = paramString2;
            localb.ser = this.sek;
            localb.set = paramVideoTransPara;
            localb.seh = this.seh;
            localb.sei = this.sei;
            seo.c(localb);
            continue;
            ??? = new r();
            ???.euR = paramString1;
            ???.hcv = 1;
            ???.eQu = null;
            com.tencent.mm.y.at.AR();
            ???.hcn = ((String)c.xh().get(2, ""));
            ???.hcs = bg.Pu();
            ???.hct = bg.Pu();
            ???.hcB = null;
            ???.hac = paramString2;
            if (!bg.nm(paramString2)) {
              ???.hcz = 1;
            }
            ???.gsL = 0;
            o.Nh().a(???);
          }
        }
        if (paramInt1 < 0) {
          aL(???, ???.getString(R.l.egn));
        } else {
          this.sel = true;
        }
      }
    }
  }
  
  private void aL(final Context paramContext, final String paramString)
  {
    GMTrace.i(17224161034240L, 128330);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17237045936128L, 128426);
        Toast.makeText(paramContext, paramString, 0).show();
        GMTrace.o(17237045936128L, 128426);
      }
    });
    GMTrace.o(17224161034240L, 128330);
  }
  
  /* Error */
  public static void b(String paramString, int[] paramArrayOfInt)
  {
    // Byte code:
    //   0: ldc2_w 310
    //   3: ldc_w 312
    //   6: invokestatic 52	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 314	android/media/MediaMetadataRetriever
    //   12: dup
    //   13: invokespecial 315	android/media/MediaMetadataRetriever:<init>	()V
    //   16: astore 7
    //   18: aload 7
    //   20: astore 6
    //   22: aload 7
    //   24: aload_0
    //   25: invokevirtual 318	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   28: aload 7
    //   30: astore 6
    //   32: aload 7
    //   34: bipush 18
    //   36: invokevirtual 321	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   39: iconst_0
    //   40: invokestatic 325	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   43: istore_2
    //   44: aload 7
    //   46: astore 6
    //   48: aload 7
    //   50: bipush 19
    //   52: invokevirtual 321	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   55: iconst_0
    //   56: invokestatic 325	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   59: istore 4
    //   61: aload 7
    //   63: invokevirtual 328	android/media/MediaMetadataRetriever:release	()V
    //   66: iload_2
    //   67: istore_3
    //   68: iload 4
    //   70: istore_2
    //   71: aload_1
    //   72: iconst_0
    //   73: iload_3
    //   74: iastore
    //   75: aload_1
    //   76: iconst_1
    //   77: iload_2
    //   78: iastore
    //   79: iconst_0
    //   80: istore 5
    //   82: iload_3
    //   83: istore 4
    //   85: iload 5
    //   87: istore_3
    //   88: iload_3
    //   89: iconst_3
    //   90: if_icmpge +124 -> 214
    //   93: iload 4
    //   95: iconst_2
    //   96: irem
    //   97: ifne +9 -> 106
    //   100: iload_2
    //   101: iconst_2
    //   102: irem
    //   103: ifeq +69 -> 172
    //   106: ldc2_w 310
    //   109: ldc_w 312
    //   112: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   115: return
    //   116: astore_0
    //   117: aconst_null
    //   118: astore 7
    //   120: iconst_0
    //   121: istore_2
    //   122: aload 7
    //   124: astore 6
    //   126: ldc 105
    //   128: aload_0
    //   129: ldc_w 330
    //   132: iconst_0
    //   133: anewarray 109	java/lang/Object
    //   136: invokestatic 334	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   139: aload 7
    //   141: ifnull +8 -> 149
    //   144: aload 7
    //   146: invokevirtual 328	android/media/MediaMetadataRetriever:release	()V
    //   149: iload_2
    //   150: istore_3
    //   151: iconst_0
    //   152: istore_2
    //   153: goto -82 -> 71
    //   156: astore_0
    //   157: aconst_null
    //   158: astore 6
    //   160: aload 6
    //   162: ifnull +8 -> 170
    //   165: aload 6
    //   167: invokevirtual 328	android/media/MediaMetadataRetriever:release	()V
    //   170: aload_0
    //   171: athrow
    //   172: iload 4
    //   174: iload_2
    //   175: if_icmplt +18 -> 193
    //   178: iload 4
    //   180: sipush 640
    //   183: if_icmple +31 -> 214
    //   186: iload_2
    //   187: sipush 480
    //   190: if_icmple +24 -> 214
    //   193: iload 4
    //   195: iload_2
    //   196: if_icmpgt +37 -> 233
    //   199: iload 4
    //   201: sipush 480
    //   204: if_icmple +10 -> 214
    //   207: iload_2
    //   208: sipush 640
    //   211: if_icmpgt +22 -> 233
    //   214: aload_1
    //   215: iconst_0
    //   216: iload 4
    //   218: iastore
    //   219: aload_1
    //   220: iconst_1
    //   221: iload_2
    //   222: iastore
    //   223: ldc2_w 310
    //   226: ldc_w 312
    //   229: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   232: return
    //   233: iload 4
    //   235: iconst_2
    //   236: idiv
    //   237: istore 4
    //   239: iload_2
    //   240: iconst_2
    //   241: idiv
    //   242: istore_2
    //   243: iload_3
    //   244: iconst_1
    //   245: iadd
    //   246: istore_3
    //   247: goto -159 -> 88
    //   250: astore_0
    //   251: goto -91 -> 160
    //   254: astore_0
    //   255: iconst_0
    //   256: istore_2
    //   257: goto -135 -> 122
    //   260: astore_0
    //   261: goto -139 -> 122
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	264	0	paramString	String
    //   0	264	1	paramArrayOfInt	int[]
    //   43	214	2	i	int
    //   67	180	3	j	int
    //   59	179	4	k	int
    //   80	6	5	m	int
    //   20	146	6	localMediaMetadataRetriever1	android.media.MediaMetadataRetriever
    //   16	129	7	localMediaMetadataRetriever2	android.media.MediaMetadataRetriever
    // Exception table:
    //   from	to	target	type
    //   9	18	116	java/lang/Exception
    //   9	18	156	finally
    //   22	28	250	finally
    //   32	44	250	finally
    //   48	61	250	finally
    //   126	139	250	finally
    //   22	28	254	java/lang/Exception
    //   32	44	254	java/lang/Exception
    //   48	61	260	java/lang/Exception
  }
  
  private void d(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    try
    {
      GMTrace.i(17224429469696L, 128332);
      this.sed.add(Integer.valueOf(paramInt1));
      this.see.add(paramString1);
      this.sef.add(paramString2);
      this.seg.add(Integer.valueOf(paramInt2));
      GMTrace.o(17224429469696L, 128332);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: ldc2_w 363
    //   3: ldc_w 365
    //   6: invokestatic 52	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 74	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:sec	Ljava/util/List;
    //   13: ifnull +1253 -> 1266
    //   16: aload_0
    //   17: getfield 74	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:sec	Ljava/util/List;
    //   20: invokeinterface 369 1 0
    //   25: ifle +1241 -> 1266
    //   28: iconst_0
    //   29: istore 6
    //   31: iload 6
    //   33: aload_0
    //   34: getfield 74	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:sec	Ljava/util/List;
    //   37: invokeinterface 369 1 0
    //   42: if_icmpge +1224 -> 1266
    //   45: aload_0
    //   46: getfield 143	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:isStop	Z
    //   49: ifne +1217 -> 1266
    //   52: ldc 105
    //   54: ldc_w 371
    //   57: iconst_1
    //   58: anewarray 109	java/lang/Object
    //   61: dup
    //   62: iconst_0
    //   63: aload_0
    //   64: getfield 74	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:sec	Ljava/util/List;
    //   67: invokevirtual 372	java/lang/Object:toString	()Ljava/lang/String;
    //   70: aastore
    //   71: invokestatic 120	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   74: new 374	android/content/Intent
    //   77: dup
    //   78: invokespecial 375	android/content/Intent:<init>	()V
    //   81: astore 14
    //   83: aload 14
    //   85: new 175	java/lang/StringBuilder
    //   88: dup
    //   89: ldc_w 377
    //   92: invokespecial 180	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   95: aload_0
    //   96: getfield 74	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:sec	Ljava/util/List;
    //   99: iload 6
    //   101: invokeinterface 380 2 0
    //   106: checkcast 259	java/lang/String
    //   109: invokevirtual 383	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: invokestatic 389	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   118: invokevirtual 393	android/content/Intent:setData	(Landroid/net/Uri;)Landroid/content/Intent;
    //   121: pop
    //   122: invokestatic 399	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   125: astore 15
    //   127: new 175	java/lang/StringBuilder
    //   130: dup
    //   131: ldc_w 401
    //   134: invokespecial 180	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   137: astore 10
    //   139: invokestatic 243	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   142: pop
    //   143: aload 10
    //   145: invokestatic 249	com/tencent/mm/y/c:xh	()Lcom/tencent/mm/storage/t;
    //   148: iconst_2
    //   149: ldc -5
    //   151: invokevirtual 257	com/tencent/mm/storage/t:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   154: checkcast 259	java/lang/String
    //   157: invokestatic 405	com/tencent/mm/modelvideo/s:mj	(Ljava/lang/String;)Ljava/lang/String;
    //   160: invokevirtual 383	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   166: astore 11
    //   168: aload_0
    //   169: getfield 93	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:sej	Ljava/lang/String;
    //   172: invokestatic 163	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   175: ifne +13 -> 188
    //   178: aload_0
    //   179: getfield 91	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:sek	Ljava/lang/String;
    //   182: invokestatic 163	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   185: ifeq +83 -> 268
    //   188: invokestatic 288	com/tencent/mm/modelvideo/o:Nh	()Lcom/tencent/mm/modelvideo/s;
    //   191: pop
    //   192: aload 11
    //   194: invokestatic 408	com/tencent/mm/modelvideo/s:ml	(Ljava/lang/String;)Ljava/lang/String;
    //   197: astore 13
    //   199: invokestatic 288	com/tencent/mm/modelvideo/o:Nh	()Lcom/tencent/mm/modelvideo/s;
    //   202: pop
    //   203: aload 11
    //   205: invokestatic 411	com/tencent/mm/modelvideo/s:mk	(Ljava/lang/String;)Ljava/lang/String;
    //   208: astore 12
    //   210: invokestatic 399	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   213: invokestatic 417	com/tencent/mm/sdk/platformtools/am:is2G	(Landroid/content/Context;)Z
    //   216: istore 9
    //   218: aload 15
    //   220: aload 14
    //   222: invokestatic 423	com/tencent/mm/compatible/i/a:h	(Landroid/content/Context;Landroid/content/Intent;)Ljava/lang/String;
    //   225: astore 16
    //   227: aload 16
    //   229: invokestatic 163	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   232: ifeq +79 -> 311
    //   235: ldc 105
    //   237: ldc_w 425
    //   240: invokestatic 428	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   243: aload_0
    //   244: ldc_w 429
    //   247: aload 11
    //   249: aload 16
    //   251: iconst_0
    //   252: aconst_null
    //   253: aload 15
    //   255: aconst_null
    //   256: invokespecial 431	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:a	(ILjava/lang/String;Ljava/lang/String;ILcom/tencent/mm/modelcontrol/VideoTransPara;Landroid/content/Context;Ljava/lang/String;)V
    //   259: iload 6
    //   261: iconst_1
    //   262: iadd
    //   263: istore 6
    //   265: goto -234 -> 31
    //   268: aload_0
    //   269: getfield 93	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:sej	Ljava/lang/String;
    //   272: astore 13
    //   274: aload_0
    //   275: getfield 91	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:sek	Ljava/lang/String;
    //   278: aload_0
    //   279: getfield 91	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:sek	Ljava/lang/String;
    //   282: ldc_w 433
    //   285: invokevirtual 437	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   288: iconst_1
    //   289: iadd
    //   290: aload_0
    //   291: getfield 91	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:sek	Ljava/lang/String;
    //   294: invokevirtual 440	java/lang/String:length	()I
    //   297: invokevirtual 444	java/lang/String:substring	(II)Ljava/lang/String;
    //   300: astore 11
    //   302: aload_0
    //   303: getfield 91	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:sek	Ljava/lang/String;
    //   306: astore 12
    //   308: goto -98 -> 210
    //   311: aload 16
    //   313: invokestatic 449	com/tencent/mm/plugin/a/c:np	(Ljava/lang/String;)Z
    //   316: istore 8
    //   318: aload 16
    //   320: invokestatic 454	com/tencent/mm/a/e:aY	(Ljava/lang/String;)I
    //   323: istore 4
    //   325: iload 8
    //   327: ifeq +555 -> 882
    //   330: new 456	com/tencent/mm/pointers/PInt
    //   333: dup
    //   334: invokespecial 457	com/tencent/mm/pointers/PInt:<init>	()V
    //   337: astore 17
    //   339: invokestatic 463	com/tencent/mm/modelcontrol/d:Gv	()Lcom/tencent/mm/modelcontrol/d;
    //   342: aload 16
    //   344: invokevirtual 466	com/tencent/mm/modelcontrol/d:jF	(Ljava/lang/String;)Z
    //   347: ifeq +160 -> 507
    //   350: ldc 105
    //   352: ldc_w 468
    //   355: iconst_1
    //   356: anewarray 109	java/lang/Object
    //   359: dup
    //   360: iconst_0
    //   361: aload 16
    //   363: aastore
    //   364: invokestatic 120	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   367: aload 17
    //   369: iconst_1
    //   370: putfield 471	com/tencent/mm/pointers/PInt:value	I
    //   373: aconst_null
    //   374: astore 10
    //   376: aload 17
    //   378: getfield 471	com/tencent/mm/pointers/PInt:value	I
    //   381: istore_3
    //   382: ldc 105
    //   384: ldc_w 473
    //   387: iconst_3
    //   388: anewarray 109	java/lang/Object
    //   391: dup
    //   392: iconst_0
    //   393: iload_3
    //   394: invokestatic 115	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   397: aastore
    //   398: dup
    //   399: iconst_1
    //   400: iload 8
    //   402: invokestatic 478	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   405: aastore
    //   406: dup
    //   407: iconst_2
    //   408: iload 4
    //   410: invokestatic 115	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   413: aastore
    //   414: invokestatic 120	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   417: iload_3
    //   418: tableswitch	default:+62->480, -6:+608->1026, -5:+626->1044, -4:+608->1026, -3:+608->1026, -2:+608->1026, -1:+589->1007, 0:+581->999, 1:+503->921, 2:+503->921, 3:+503->921, 4:+503->921, 5:+503->921
    //   480: ldc 105
    //   482: ldc_w 480
    //   485: invokestatic 428	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   488: aload_0
    //   489: ldc_w 481
    //   492: aload 11
    //   494: aload 16
    //   496: iconst_0
    //   497: aconst_null
    //   498: aload 15
    //   500: aconst_null
    //   501: invokespecial 431	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:a	(ILjava/lang/String;Ljava/lang/String;ILcom/tencent/mm/modelcontrol/VideoTransPara;Landroid/content/Context;Ljava/lang/String;)V
    //   504: goto -245 -> 259
    //   507: new 483	com/tencent/mm/modelcontrol/VideoTransPara
    //   510: dup
    //   511: invokespecial 484	com/tencent/mm/modelcontrol/VideoTransPara:<init>	()V
    //   514: astore 18
    //   516: new 456	com/tencent/mm/pointers/PInt
    //   519: dup
    //   520: invokespecial 457	com/tencent/mm/pointers/PInt:<init>	()V
    //   523: astore 10
    //   525: new 456	com/tencent/mm/pointers/PInt
    //   528: dup
    //   529: invokespecial 457	com/tencent/mm/pointers/PInt:<init>	()V
    //   532: astore 19
    //   534: new 456	com/tencent/mm/pointers/PInt
    //   537: dup
    //   538: invokespecial 457	com/tencent/mm/pointers/PInt:<init>	()V
    //   541: astore 20
    //   543: new 456	com/tencent/mm/pointers/PInt
    //   546: dup
    //   547: invokespecial 457	com/tencent/mm/pointers/PInt:<init>	()V
    //   550: astore 21
    //   552: new 456	com/tencent/mm/pointers/PInt
    //   555: dup
    //   556: invokespecial 457	com/tencent/mm/pointers/PInt:<init>	()V
    //   559: astore 22
    //   561: aload 16
    //   563: aload 10
    //   565: aload 19
    //   567: aload 20
    //   569: aload 21
    //   571: aload 22
    //   573: invokestatic 489	com/tencent/mm/plugin/sight/base/d:a	(Ljava/lang/String;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)Ljava/lang/String;
    //   576: pop
    //   577: aload 18
    //   579: aload 10
    //   581: getfield 471	com/tencent/mm/pointers/PInt:value	I
    //   584: sipush 1000
    //   587: idiv
    //   588: putfield 492	com/tencent/mm/modelcontrol/VideoTransPara:duration	I
    //   591: aload 18
    //   593: aload 19
    //   595: getfield 471	com/tencent/mm/pointers/PInt:value	I
    //   598: putfield 495	com/tencent/mm/modelcontrol/VideoTransPara:width	I
    //   601: aload 18
    //   603: aload 20
    //   605: getfield 471	com/tencent/mm/pointers/PInt:value	I
    //   608: putfield 498	com/tencent/mm/modelcontrol/VideoTransPara:height	I
    //   611: aload 18
    //   613: aload 21
    //   615: getfield 471	com/tencent/mm/pointers/PInt:value	I
    //   618: putfield 501	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   621: aload 18
    //   623: aload 22
    //   625: getfield 471	com/tencent/mm/pointers/PInt:value	I
    //   628: putfield 504	com/tencent/mm/modelcontrol/VideoTransPara:videoBitrate	I
    //   631: ldc 105
    //   633: ldc_w 506
    //   636: iconst_1
    //   637: anewarray 109	java/lang/Object
    //   640: dup
    //   641: iconst_0
    //   642: aload 18
    //   644: aastore
    //   645: invokestatic 508	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   648: invokestatic 463	com/tencent/mm/modelcontrol/d:Gv	()Lcom/tencent/mm/modelcontrol/d;
    //   651: aload 18
    //   653: invokevirtual 511	com/tencent/mm/modelcontrol/d:a	(Lcom/tencent/mm/modelcontrol/VideoTransPara;)Lcom/tencent/mm/modelcontrol/VideoTransPara;
    //   656: astore 10
    //   658: aload 10
    //   660: ifnonnull +33 -> 693
    //   663: ldc 105
    //   665: ldc_w 513
    //   668: iconst_1
    //   669: anewarray 109	java/lang/Object
    //   672: dup
    //   673: iconst_0
    //   674: aload 18
    //   676: aastore
    //   677: invokestatic 120	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   680: aload 17
    //   682: bipush -5
    //   684: putfield 471	com/tencent/mm/pointers/PInt:value	I
    //   687: aconst_null
    //   688: astore 10
    //   690: goto -314 -> 376
    //   693: ldc 105
    //   695: ldc_w 515
    //   698: iconst_1
    //   699: anewarray 109	java/lang/Object
    //   702: dup
    //   703: iconst_0
    //   704: aload 10
    //   706: aastore
    //   707: invokestatic 508	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   710: aload 18
    //   712: getfield 504	com/tencent/mm/modelcontrol/VideoTransPara:videoBitrate	I
    //   715: ldc_w 516
    //   718: if_icmple +16 -> 734
    //   721: aload 10
    //   723: getfield 504	com/tencent/mm/modelcontrol/VideoTransPara:videoBitrate	I
    //   726: aload 18
    //   728: getfield 504	com/tencent/mm/modelcontrol/VideoTransPara:videoBitrate	I
    //   731: if_icmple +37 -> 768
    //   734: ldc 105
    //   736: ldc_w 518
    //   739: iconst_2
    //   740: anewarray 109	java/lang/Object
    //   743: dup
    //   744: iconst_0
    //   745: aload 10
    //   747: aastore
    //   748: dup
    //   749: iconst_1
    //   750: aload 18
    //   752: aastore
    //   753: invokestatic 120	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   756: aload 17
    //   758: iconst_1
    //   759: putfield 471	com/tencent/mm/pointers/PInt:value	I
    //   762: aconst_null
    //   763: astore 10
    //   765: goto -389 -> 376
    //   768: aload 18
    //   770: getfield 501	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   773: bipush 45
    //   775: if_icmplt +31 -> 806
    //   778: aload 18
    //   780: getfield 492	com/tencent/mm/modelcontrol/VideoTransPara:duration	I
    //   783: sipush 1000
    //   786: imul
    //   787: ldc_w 519
    //   790: if_icmplt +16 -> 806
    //   793: aload 17
    //   795: bipush -6
    //   797: putfield 471	com/tencent/mm/pointers/PInt:value	I
    //   800: aconst_null
    //   801: astore 10
    //   803: goto -427 -> 376
    //   806: invokestatic 399	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   809: invokestatic 417	com/tencent/mm/sdk/platformtools/am:is2G	(Landroid/content/Context;)Z
    //   812: istore 9
    //   814: aload 10
    //   816: getfield 495	com/tencent/mm/modelcontrol/VideoTransPara:width	I
    //   819: istore 5
    //   821: aload 10
    //   823: getfield 498	com/tencent/mm/modelcontrol/VideoTransPara:height	I
    //   826: istore 7
    //   828: iload 9
    //   830: ifeq +38 -> 868
    //   833: ldc_w 520
    //   836: istore_3
    //   837: iload 9
    //   839: ifeq +36 -> 875
    //   842: ldc2_w 521
    //   845: dstore_1
    //   846: aload 17
    //   848: aload 16
    //   850: iload 5
    //   852: iload 7
    //   854: iload_3
    //   855: dload_1
    //   856: ldc_w 523
    //   859: invokestatic 529	com/tencent/mm/plugin/sight/base/SightVideoJNI:shouldRemuxing	(Ljava/lang/String;IIIDI)I
    //   862: putfield 471	com/tencent/mm/pointers/PInt:value	I
    //   865: goto -489 -> 376
    //   868: ldc_w 530
    //   871: istore_3
    //   872: goto -35 -> 837
    //   875: ldc2_w 531
    //   878: dstore_1
    //   879: goto -33 -> 846
    //   882: iload 9
    //   884: ifeq +22 -> 906
    //   887: ldc_w 520
    //   890: istore_3
    //   891: iload 4
    //   893: iload_3
    //   894: if_icmple +19 -> 913
    //   897: bipush -5
    //   899: istore_3
    //   900: aconst_null
    //   901: astore 10
    //   903: goto -521 -> 382
    //   906: ldc_w 530
    //   909: istore_3
    //   910: goto -19 -> 891
    //   913: iconst_1
    //   914: istore_3
    //   915: aconst_null
    //   916: astore 10
    //   918: goto -536 -> 382
    //   921: iload 4
    //   923: ldc_w 530
    //   926: if_icmple +65 -> 991
    //   929: aload_0
    //   930: ldc 125
    //   932: aload 11
    //   934: aload 16
    //   936: iconst_0
    //   937: aconst_null
    //   938: aload 15
    //   940: aconst_null
    //   941: invokespecial 431	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:a	(ILjava/lang/String;Ljava/lang/String;ILcom/tencent/mm/modelcontrol/VideoTransPara;Landroid/content/Context;Ljava/lang/String;)V
    //   944: iconst_0
    //   945: istore 4
    //   947: ldc 125
    //   949: istore_3
    //   950: aload 15
    //   952: aload 14
    //   954: invokestatic 535	com/tencent/mm/compatible/i/a:i	(Landroid/content/Context;Landroid/content/Intent;)Lcom/tencent/mm/compatible/i/a$a;
    //   957: astore 14
    //   959: aload 14
    //   961: ifnonnull +122 -> 1083
    //   964: ldc 105
    //   966: ldc_w 425
    //   969: invokestatic 428	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   972: aload_0
    //   973: ldc_w 429
    //   976: aload 11
    //   978: aload 16
    //   980: iconst_0
    //   981: aconst_null
    //   982: aload 15
    //   984: aconst_null
    //   985: invokespecial 431	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:a	(ILjava/lang/String;Ljava/lang/String;ILcom/tencent/mm/modelcontrol/VideoTransPara;Landroid/content/Context;Ljava/lang/String;)V
    //   988: goto -729 -> 259
    //   991: iconst_0
    //   992: istore 4
    //   994: iconst_0
    //   995: istore_3
    //   996: goto -46 -> 950
    //   999: iconst_1
    //   1000: istore 4
    //   1002: iconst_0
    //   1003: istore_3
    //   1004: goto -54 -> 950
    //   1007: aload_0
    //   1008: ldc_w 536
    //   1011: aload 11
    //   1013: aload 16
    //   1015: iconst_0
    //   1016: aconst_null
    //   1017: aload 15
    //   1019: aconst_null
    //   1020: invokespecial 431	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:a	(ILjava/lang/String;Ljava/lang/String;ILcom/tencent/mm/modelcontrol/VideoTransPara;Landroid/content/Context;Ljava/lang/String;)V
    //   1023: goto -764 -> 259
    //   1026: aload_0
    //   1027: ldc 125
    //   1029: aload 11
    //   1031: aload 16
    //   1033: iconst_0
    //   1034: aconst_null
    //   1035: aload 15
    //   1037: aconst_null
    //   1038: invokespecial 431	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:a	(ILjava/lang/String;Ljava/lang/String;ILcom/tencent/mm/modelcontrol/VideoTransPara;Landroid/content/Context;Ljava/lang/String;)V
    //   1041: goto -782 -> 259
    //   1044: aload_0
    //   1045: ldc -103
    //   1047: aload 11
    //   1049: aload 16
    //   1051: iconst_0
    //   1052: aconst_null
    //   1053: aload 15
    //   1055: aconst_null
    //   1056: invokespecial 431	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:a	(ILjava/lang/String;Ljava/lang/String;ILcom/tencent/mm/modelcontrol/VideoTransPara;Landroid/content/Context;Ljava/lang/String;)V
    //   1059: goto -800 -> 259
    //   1062: astore 14
    //   1064: ldc 105
    //   1066: aload 14
    //   1068: ldc -5
    //   1070: iconst_0
    //   1071: anewarray 109	java/lang/Object
    //   1074: invokestatic 334	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1077: aconst_null
    //   1078: astore 14
    //   1080: goto -121 -> 959
    //   1083: iload 4
    //   1085: ifne +136 -> 1221
    //   1088: aload 16
    //   1090: aload 12
    //   1092: iconst_0
    //   1093: invokestatic 542	com/tencent/mm/sdk/platformtools/j:r	(Ljava/lang/String;Ljava/lang/String;Z)Z
    //   1096: pop
    //   1097: aload 14
    //   1099: getfield 545	com/tencent/mm/compatible/i/a$a:duration	I
    //   1102: i2l
    //   1103: invokestatic 549	com/tencent/mm/sdk/platformtools/bg:eN	(J)I
    //   1106: istore 7
    //   1108: aload 14
    //   1110: getfield 553	com/tencent/mm/compatible/i/a$a:bitmap	Landroid/graphics/Bitmap;
    //   1113: ifnull +129 -> 1242
    //   1116: aload 14
    //   1118: getfield 553	com/tencent/mm/compatible/i/a$a:bitmap	Landroid/graphics/Bitmap;
    //   1121: bipush 60
    //   1123: getstatic 559	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   1126: aload 13
    //   1128: iconst_1
    //   1129: invokestatic 564	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   1132: iconst_0
    //   1133: istore 5
    //   1135: iload 5
    //   1137: ifeq +26 -> 1163
    //   1140: ldc_w 565
    //   1143: sipush 320
    //   1146: sipush 480
    //   1149: invokestatic 569	com/tencent/mm/sdk/platformtools/d:X	(III)Landroid/graphics/Bitmap;
    //   1152: bipush 60
    //   1154: getstatic 559	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   1157: aload 13
    //   1159: iconst_1
    //   1160: invokestatic 564	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   1163: iload_3
    //   1164: istore 5
    //   1166: iload 4
    //   1168: ifne +19 -> 1187
    //   1171: iload_3
    //   1172: istore 5
    //   1174: aload 12
    //   1176: invokestatic 572	com/tencent/mm/a/e:aZ	(Ljava/lang/String;)Z
    //   1179: ifne +8 -> 1187
    //   1182: ldc_w 573
    //   1185: istore 5
    //   1187: aload 13
    //   1189: invokestatic 572	com/tencent/mm/a/e:aZ	(Ljava/lang/String;)Z
    //   1192: ifne +8 -> 1200
    //   1195: ldc_w 574
    //   1198: istore 5
    //   1200: aload_0
    //   1201: iload 5
    //   1203: aload 11
    //   1205: aload 16
    //   1207: iload 7
    //   1209: aload 10
    //   1211: aload 15
    //   1213: aload 13
    //   1215: invokespecial 431	com/tencent/mm/plugin/wenote/model/nativenote/manager/d:a	(ILjava/lang/String;Ljava/lang/String;ILcom/tencent/mm/modelcontrol/VideoTransPara;Landroid/content/Context;Ljava/lang/String;)V
    //   1218: goto -959 -> 259
    //   1221: ldc -99
    //   1223: istore_3
    //   1224: goto -127 -> 1097
    //   1227: astore 14
    //   1229: ldc 105
    //   1231: aload 14
    //   1233: ldc -5
    //   1235: iconst_0
    //   1236: anewarray 109	java/lang/Object
    //   1239: invokestatic 334	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1242: iconst_1
    //   1243: istore 5
    //   1245: goto -110 -> 1135
    //   1248: astore 14
    //   1250: ldc 105
    //   1252: aload 14
    //   1254: ldc -5
    //   1256: iconst_0
    //   1257: anewarray 109	java/lang/Object
    //   1260: invokestatic 334	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1263: goto -100 -> 1163
    //   1266: ldc2_w 363
    //   1269: ldc_w 365
    //   1272: invokestatic 64	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1275: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1276	0	this	d
    //   845	34	1	d	double
    //   381	843	3	i	int
    //   323	844	4	j	int
    //   819	425	5	k	int
    //   29	235	6	m	int
    //   826	382	7	n	int
    //   316	85	8	bool1	boolean
    //   216	667	9	bool2	boolean
    //   137	1073	10	localObject1	Object
    //   166	1038	11	str1	String
    //   208	967	12	str2	String
    //   197	1017	13	str3	String
    //   81	879	14	localObject2	Object
    //   1062	5	14	localException1	Exception
    //   1078	39	14	localObject3	Object
    //   1227	5	14	localException2	Exception
    //   1248	5	14	localException3	Exception
    //   125	1087	15	localContext	Context
    //   225	981	16	str4	String
    //   337	510	17	localPInt1	PInt
    //   514	265	18	localVideoTransPara	VideoTransPara
    //   532	62	19	localPInt2	PInt
    //   541	63	20	localPInt3	PInt
    //   550	64	21	localPInt4	PInt
    //   559	65	22	localPInt5	PInt
    // Exception table:
    //   from	to	target	type
    //   950	959	1062	java/lang/Exception
    //   1116	1132	1227	java/lang/Exception
    //   1140	1163	1248	java/lang/Exception
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString, com.tencent.mm.plugin.wenote.model.a.j paramj);
    
    public abstract void b(String paramString, com.tencent.mm.plugin.wenote.model.a.j paramj);
  }
  
  private static final class b
    implements ar.a
  {
    String euR;
    String hac;
    private int outputHeight;
    private int outputWidth;
    public d.a seh;
    com.tencent.mm.plugin.wenote.model.a.j sei;
    String ser;
    int ses;
    VideoTransPara set;
    private boolean seu;
    private int sev;
    
    public b()
    {
      GMTrace.i(17217181712384L, 128278);
      this.sev = 0;
      GMTrace.o(17217181712384L, 128278);
    }
    
    public final boolean Dj()
    {
      GMTrace.i(17217315930112L, 128279);
      for (;;)
      {
        synchronized (d.bHA())
        {
          int i;
          if (!d.bHB().containsKey(this.euR))
          {
            i = 1;
            j = i;
            if (i == 0)
            {
              if (com.tencent.mm.modelvideo.t.mw(this.euR) == null) {
                j = 1;
              }
            }
            else
            {
              if (j == 0) {
                break;
              }
              w.w("MicroMsg.NoteVideoCompress", "remuxing job has been removed, filename %s", new Object[] { this.euR });
              GMTrace.o(17217315930112L, 128279);
              return true;
            }
          }
          else
          {
            i = 0;
          }
        }
        int j = 0;
      }
      if ((this.set != null) && (!this.set.isDefault)) {
        this.outputWidth = this.set.width;
      }
      Object localObject3;
      for (this.outputHeight = this.set.height;; this.outputHeight = ???[1])
      {
        ??? = new PString();
        localObject3 = new PInt();
        com.tencent.mm.y.at.AR();
        if ((!c.yR().a(this.hac, (PString)???, (PInt)localObject3)) || (!com.tencent.mm.sdk.platformtools.j.eR(((PString)???).value, this.ser))) {
          break;
        }
        w.i("MicroMsg.NoteVideoCompress", "copy remuxing file success, do not remuxing again.");
        this.ses = ((PInt)localObject3).value;
        this.seu = true;
        GMTrace.o(17217315930112L, 128279);
        return true;
        ??? = new int[2];
        d.b(this.hac, (int[])???);
        this.outputWidth = ???[0];
      }
      long l = bg.Pw();
      if (this.set != null)
      {
        w.i("MicroMsg.NoteVideoCompress", "remuxing new para %s", new Object[] { this.set });
        this.ses = SightVideoJNI.remuxing(this.hac, this.ser, this.outputWidth, this.outputHeight, this.set.videoBitrate, this.set.gBn, 8, this.set.gBm, 25.0F, this.set.fps, null, 0, false);
        this.sev = ((int)bg.aI(l));
        w.i("MicroMsg.NoteVideoCompress", "remuxing [%s] to [%s], result %d, resolution:[%d, %d]", new Object[] { this.hac, this.ser, Integer.valueOf(this.ses), Integer.valueOf(this.outputWidth), Integer.valueOf(this.outputHeight) });
        if (this.ses < 0) {
          break label574;
        }
      }
      label574:
      for (boolean bool = true;; bool = false)
      {
        this.seu = bool;
        ??? = new PInt();
        localObject3 = new PInt();
        if (com.tencent.mm.modelvideo.t.a(this.ser, (PInt)???, (PInt)localObject3)) {
          this.ses = ((PInt)???).value;
        }
        if (this.seu) {
          break label580;
        }
        w.w("MicroMsg.NoteVideoCompress", "remuxing video error, copy source video to send.");
        com.tencent.mm.loader.stub.b.deleteFile(this.ser);
        com.tencent.mm.sdk.platformtools.j.r(this.hac, this.ser, false);
        GMTrace.o(17217315930112L, 128279);
        return true;
        w.w("MicroMsg.NoteVideoCompress", "remuxing but new para is null. %s", new Object[] { this.euR });
        this.ses = SightVideoJNI.remuxing(this.hac, this.ser, this.outputWidth, this.outputHeight, com.tencent.mm.plugin.sight.base.b.oRE, com.tencent.mm.plugin.sight.base.b.oRD, 8, 2, 25.0F, com.tencent.mm.plugin.sight.base.b.oRF, null, 0, false);
        break;
      }
      label580:
      w.i("MicroMsg.NoteVideoCompress", "remuxing video sucess,insert to media duplication storage");
      for (;;)
      {
        PInt localPInt;
        try
        {
          ??? = new File(this.ser).getName();
          localObject3 = this.ser + ".tmp";
          localPInt = new PInt(0);
          if (!com.tencent.mm.plugin.a.d.b(this.ser, (String)localObject3, localPInt)) {
            break label797;
          }
          bool = com.tencent.mm.loader.stub.b.deleteFile(this.ser);
          localObject3 = new File((String)localObject3);
          w.i("MicroMsg.NoteVideoCompress", "fast start success. delOld[%b] rename[%b] path[%s] target[%s]", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(e.g(((File)localObject3).getParent() + File.separator, ((File)localObject3).getName(), (String)???)), ((File)localObject3).getAbsolutePath(), this.ser });
          com.tencent.mm.y.at.AR();
          c.yR().H(this.hac, this.ser, this.ses);
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.NoteVideoCompress", "fast start exception e[%s]", new Object[] { localException.toString() });
        }
        break;
        label797:
        w.i("MicroMsg.NoteVideoCompress", "fast start fail. msg[%d] importpath[%s] targetPath[%s]", new Object[] { Integer.valueOf(localPInt.value), this.hac, this.ser });
      }
    }
    
    public final boolean Dk()
    {
      GMTrace.i(17217450147840L, 128280);
      synchronized (d.bHA())
      {
        d.bHB().remove(this.euR);
        if (this.seh != null) {
          this.seh.b(this.ser, this.sei);
        }
        GMTrace.o(17217450147840L, 128280);
        return false;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\manager\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */