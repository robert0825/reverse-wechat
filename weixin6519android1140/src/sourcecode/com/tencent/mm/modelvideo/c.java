package com.tencent.mm.modelvideo;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.storage.t;

public final class c
{
  Context context;
  int duration;
  String eIy;
  String euR;
  public a hab;
  String hac;
  final AsyncTask<String, Integer, String> had;
  Intent intent;
  String videoPath;
  
  public c()
  {
    GMTrace.i(326149079040L, 2430);
    this.context = null;
    this.hab = null;
    this.hac = null;
    this.duration = 0;
    this.intent = null;
    this.euR = null;
    this.eIy = null;
    this.videoPath = null;
    this.had = new AsyncTask()
    {
      int ret;
      
      /* Error */
      private String MO()
      {
        // Byte code:
        //   0: ldc2_w 37
        //   3: sipush 2463
        //   6: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   9: aload_0
        //   10: iconst_0
        //   11: putfield 28	com/tencent/mm/modelvideo/c$1:ret	I
        //   14: invokestatic 44	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
        //   17: invokestatic 50	com/tencent/mm/sdk/platformtools/am:is2G	(Landroid/content/Context;)Z
        //   20: istore_3
        //   21: aload_0
        //   22: getfield 15	com/tencent/mm/modelvideo/c$1:hae	Lcom/tencent/mm/modelvideo/c;
        //   25: getfield 54	com/tencent/mm/modelvideo/c:context	Landroid/content/Context;
        //   28: aload_0
        //   29: getfield 15	com/tencent/mm/modelvideo/c$1:hae	Lcom/tencent/mm/modelvideo/c;
        //   32: getfield 58	com/tencent/mm/modelvideo/c:intent	Landroid/content/Intent;
        //   35: invokestatic 63	com/tencent/mm/compatible/i/a:i	(Landroid/content/Context;Landroid/content/Intent;)Lcom/tencent/mm/compatible/i/a$a;
        //   38: astore 4
        //   40: aload 4
        //   42: ifnonnull +68 -> 110
        //   45: ldc 65
        //   47: ldc 67
        //   49: invokestatic 73	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   52: getstatic 79	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
        //   55: ldc2_w 80
        //   58: ldc2_w 82
        //   61: lconst_1
        //   62: iconst_0
        //   63: invokevirtual 87	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
        //   66: aload_0
        //   67: ldc 88
        //   69: putfield 28	com/tencent/mm/modelvideo/c$1:ret	I
        //   72: ldc2_w 37
        //   75: sipush 2463
        //   78: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   81: aconst_null
        //   82: areturn
        //   83: astore 4
        //   85: ldc 65
        //   87: ldc 90
        //   89: iconst_1
        //   90: anewarray 92	java/lang/Object
        //   93: dup
        //   94: iconst_0
        //   95: aload 4
        //   97: invokestatic 98	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   100: aastore
        //   101: invokestatic 101	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   104: aconst_null
        //   105: astore 4
        //   107: goto -67 -> 40
        //   110: aload_0
        //   111: getfield 15	com/tencent/mm/modelvideo/c$1:hae	Lcom/tencent/mm/modelvideo/c;
        //   114: aload 4
        //   116: getfield 107	com/tencent/mm/compatible/i/a$a:filename	Ljava/lang/String;
        //   119: putfield 110	com/tencent/mm/modelvideo/c:hac	Ljava/lang/String;
        //   122: aload_0
        //   123: getfield 15	com/tencent/mm/modelvideo/c$1:hae	Lcom/tencent/mm/modelvideo/c;
        //   126: getfield 110	com/tencent/mm/modelvideo/c:hac	Ljava/lang/String;
        //   129: invokestatic 116	com/tencent/mm/a/e:aY	(Ljava/lang/String;)I
        //   132: istore_2
        //   133: ldc 65
        //   135: ldc 118
        //   137: iconst_4
        //   138: anewarray 92	java/lang/Object
        //   141: dup
        //   142: iconst_0
        //   143: iload_3
        //   144: invokestatic 124	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
        //   147: aastore
        //   148: dup
        //   149: iconst_1
        //   150: iload_2
        //   151: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   154: aastore
        //   155: dup
        //   156: iconst_2
        //   157: aload 4
        //   159: getfield 132	com/tencent/mm/compatible/i/a$a:duration	I
        //   162: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   165: aastore
        //   166: dup
        //   167: iconst_3
        //   168: aload_0
        //   169: getfield 15	com/tencent/mm/modelvideo/c$1:hae	Lcom/tencent/mm/modelvideo/c;
        //   172: getfield 110	com/tencent/mm/modelvideo/c:hac	Ljava/lang/String;
        //   175: aastore
        //   176: invokestatic 134	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   179: iload_2
        //   180: ifgt +34 -> 214
        //   183: getstatic 79	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
        //   186: ldc2_w 80
        //   189: ldc2_w 82
        //   192: lconst_1
        //   193: iconst_0
        //   194: invokevirtual 87	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
        //   197: aload_0
        //   198: ldc -121
        //   200: putfield 28	com/tencent/mm/modelvideo/c$1:ret	I
        //   203: ldc2_w 37
        //   206: sipush 2463
        //   209: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   212: aconst_null
        //   213: areturn
        //   214: iload_3
        //   215: ifeq +42 -> 257
        //   218: ldc -120
        //   220: istore_1
        //   221: iload_2
        //   222: iload_1
        //   223: if_icmple +40 -> 263
        //   226: getstatic 79	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
        //   229: ldc2_w 80
        //   232: ldc2_w 137
        //   235: lconst_1
        //   236: iconst_0
        //   237: invokevirtual 87	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
        //   240: aload_0
        //   241: ldc -117
        //   243: putfield 28	com/tencent/mm/modelvideo/c$1:ret	I
        //   246: ldc2_w 37
        //   249: sipush 2463
        //   252: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   255: aconst_null
        //   256: areturn
        //   257: ldc -116
        //   259: istore_1
        //   260: goto -39 -> 221
        //   263: aload_0
        //   264: getfield 15	com/tencent/mm/modelvideo/c$1:hae	Lcom/tencent/mm/modelvideo/c;
        //   267: getfield 110	com/tencent/mm/modelvideo/c:hac	Ljava/lang/String;
        //   270: aload_0
        //   271: getfield 15	com/tencent/mm/modelvideo/c$1:hae	Lcom/tencent/mm/modelvideo/c;
        //   274: getfield 143	com/tencent/mm/modelvideo/c:videoPath	Ljava/lang/String;
        //   277: iconst_0
        //   278: invokestatic 149	com/tencent/mm/sdk/platformtools/j:r	(Ljava/lang/String;Ljava/lang/String;Z)Z
        //   281: pop
        //   282: aload_0
        //   283: getfield 15	com/tencent/mm/modelvideo/c$1:hae	Lcom/tencent/mm/modelvideo/c;
        //   286: aload 4
        //   288: getfield 132	com/tencent/mm/compatible/i/a$a:duration	I
        //   291: sipush 1000
        //   294: idiv
        //   295: putfield 150	com/tencent/mm/modelvideo/c:duration	I
        //   298: iconst_1
        //   299: istore_2
        //   300: iconst_1
        //   301: istore_1
        //   302: aload 4
        //   304: getfield 154	com/tencent/mm/compatible/i/a$a:bitmap	Landroid/graphics/Bitmap;
        //   307: ifnull +40 -> 347
        //   310: aload 4
        //   312: getfield 154	com/tencent/mm/compatible/i/a$a:bitmap	Landroid/graphics/Bitmap;
        //   315: bipush 60
        //   317: getstatic 160	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
        //   320: aload_0
        //   321: getfield 15	com/tencent/mm/modelvideo/c$1:hae	Lcom/tencent/mm/modelvideo/c;
        //   324: getfield 163	com/tencent/mm/modelvideo/c:eIy	Ljava/lang/String;
        //   327: iconst_1
        //   328: invokestatic 168	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
        //   331: getstatic 79	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
        //   334: ldc2_w 80
        //   337: ldc2_w 169
        //   340: lconst_1
        //   341: iconst_0
        //   342: invokevirtual 87	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
        //   345: iconst_0
        //   346: istore_1
        //   347: iload_1
        //   348: ifeq +44 -> 392
        //   351: getstatic 79	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
        //   354: ldc2_w 80
        //   357: ldc2_w 171
        //   360: lconst_1
        //   361: iconst_0
        //   362: invokevirtual 87	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
        //   365: ldc -83
        //   367: sipush 320
        //   370: sipush 480
        //   373: invokestatic 177	com/tencent/mm/sdk/platformtools/d:X	(III)Landroid/graphics/Bitmap;
        //   376: bipush 60
        //   378: getstatic 160	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
        //   381: aload_0
        //   382: getfield 15	com/tencent/mm/modelvideo/c$1:hae	Lcom/tencent/mm/modelvideo/c;
        //   385: getfield 163	com/tencent/mm/modelvideo/c:eIy	Ljava/lang/String;
        //   388: iconst_1
        //   389: invokestatic 168	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
        //   392: aload_0
        //   393: getfield 15	com/tencent/mm/modelvideo/c$1:hae	Lcom/tencent/mm/modelvideo/c;
        //   396: getfield 143	com/tencent/mm/modelvideo/c:videoPath	Ljava/lang/String;
        //   399: invokestatic 181	com/tencent/mm/a/e:aZ	(Ljava/lang/String;)Z
        //   402: ifne +9 -> 411
        //   405: aload_0
        //   406: ldc -74
        //   408: putfield 28	com/tencent/mm/modelvideo/c$1:ret	I
        //   411: aload_0
        //   412: getfield 15	com/tencent/mm/modelvideo/c$1:hae	Lcom/tencent/mm/modelvideo/c;
        //   415: getfield 163	com/tencent/mm/modelvideo/c:eIy	Ljava/lang/String;
        //   418: invokestatic 181	com/tencent/mm/a/e:aZ	(Ljava/lang/String;)Z
        //   421: ifne +9 -> 430
        //   424: aload_0
        //   425: ldc -73
        //   427: putfield 28	com/tencent/mm/modelvideo/c$1:ret	I
        //   430: ldc2_w 37
        //   433: sipush 2463
        //   436: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   439: aconst_null
        //   440: areturn
        //   441: astore 4
        //   443: iload_2
        //   444: istore_1
        //   445: ldc 65
        //   447: ldc 90
        //   449: iconst_1
        //   450: anewarray 92	java/lang/Object
        //   453: dup
        //   454: iconst_0
        //   455: aload 4
        //   457: invokestatic 98	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   460: aastore
        //   461: invokestatic 101	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   464: goto -117 -> 347
        //   467: astore 4
        //   469: ldc 65
        //   471: ldc 90
        //   473: iconst_1
        //   474: anewarray 92	java/lang/Object
        //   477: dup
        //   478: iconst_0
        //   479: aload 4
        //   481: invokestatic 98	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   484: aastore
        //   485: invokestatic 101	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   488: goto -96 -> 392
        //   491: astore 4
        //   493: iconst_0
        //   494: istore_1
        //   495: goto -50 -> 445
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	498	0	this	1
        //   220	275	1	i	int
        //   132	312	2	j	int
        //   20	195	3	bool	boolean
        //   38	3	4	locala	com.tencent.mm.compatible.i.a.a
        //   83	13	4	localException1	Exception
        //   105	206	4	localObject	Object
        //   441	15	4	localException2	Exception
        //   467	13	4	localException3	Exception
        //   491	1	4	localException4	Exception
        // Exception table:
        //   from	to	target	type
        //   21	40	83	java/lang/Exception
        //   310	331	441	java/lang/Exception
        //   351	392	467	java/lang/Exception
        //   331	345	491	java/lang/Exception
      }
    };
    GMTrace.o(326149079040L, 2430);
  }
  
  public final void a(Context paramContext, Intent paramIntent, a parama)
  {
    GMTrace.i(326283296768L, 2431);
    this.context = paramContext;
    this.intent = paramIntent;
    this.euR = s.mj((String)h.xy().xh().get(2, ""));
    o.Nh();
    this.eIy = s.ml(this.euR);
    o.Nh();
    this.videoPath = s.mk(this.euR);
    this.hab = parama;
    this.had.execute(new String[0]);
    GMTrace.o(326283296768L, 2431);
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt1, String paramString1, String paramString2, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */