package com.tencent.mm.bt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.m.a.a;
import com.tencent.mm.plugin.m.a.h;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class b
  extends com.tencent.mm.api.c
{
  public static final String vnj;
  public static final String vnk;
  private static final boolean vnl;
  private static b vnm;
  private LinkedList<c> iJu;
  private Context mContext;
  private LinkedList<d> vnA;
  private int vnn;
  private int vno;
  private int vnp;
  private int vnq;
  public long vnr;
  private a vns;
  private SparseArray<c> vnt;
  public SparseArray<c> vnu;
  private SparseArray<c> vnv;
  private SparseArray<SparseArray<c>> vnw;
  private SparseArray<String> vnx;
  private y<Integer, Bitmap> vny;
  private boolean vnz;
  
  static
  {
    GMTrace.i(4521929474048L, 33691);
    vnj = com.tencent.mm.compatible.util.e.ghu + "app_font";
    vnk = vnj + File.separator + "color_emoji";
    if (Build.VERSION.SDK_INT < 19) {}
    for (boolean bool = true;; bool = false)
    {
      vnl = bool;
      GMTrace.o(4521929474048L, 33691);
      return;
    }
  }
  
  private b()
  {
    GMTrace.i(4519647772672L, 33674);
    this.vnn = 0;
    this.vnr = 0L;
    this.vns = new a();
    this.vnt = new SparseArray();
    this.vnu = new SparseArray();
    this.vnv = new SparseArray();
    this.vnw = new SparseArray();
    this.vnx = null;
    this.vny = new y(200);
    this.vnz = false;
    this.mContext = ab.getContext();
    if (!com.tencent.mm.a.e.aZ(vnk))
    {
      long l = System.currentTimeMillis();
      bRw();
      j.z(this.mContext, "color_emoji", vnk);
      w.d("MicroMsg.EmojiHelper", "copyColorEmojiFile. use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    }
    for (;;)
    {
      init();
      if (!com.tencent.mm.br.a.ed(this.mContext)) {
        break;
      }
      this.vnn = com.tencent.mm.br.a.fromDPToPix(this.mContext, 4);
      GMTrace.o(4519647772672L, 33674);
      return;
      w.i("MicroMsg.EmojiHelper", "emoji color file exist.");
    }
    this.vnn = com.tencent.mm.br.a.fromDPToPix(this.mContext, 2);
    GMTrace.o(4519647772672L, 33674);
  }
  
  /* Error */
  public static long SW(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: ldc2_w 201
    //   9: ldc -53
    //   11: invokestatic 54	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   14: new 205	java/io/FileInputStream
    //   17: dup
    //   18: new 78	java/io/File
    //   21: dup
    //   22: aload_0
    //   23: invokespecial 208	java/io/File:<init>	(Ljava/lang/String;)V
    //   26: invokespecial 211	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   29: astore_3
    //   30: new 213	java/io/DataInputStream
    //   33: dup
    //   34: aload_3
    //   35: invokespecial 216	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   38: astore_0
    //   39: aload_0
    //   40: invokevirtual 220	java/io/DataInputStream:readInt	()I
    //   43: pop
    //   44: aload_0
    //   45: invokevirtual 223	java/io/DataInputStream:readLong	()J
    //   48: lstore_1
    //   49: aload_0
    //   50: invokevirtual 226	java/io/DataInputStream:close	()V
    //   53: aload_3
    //   54: invokevirtual 229	java/io/InputStream:close	()V
    //   57: ldc2_w 201
    //   60: ldc -53
    //   62: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   65: lload_1
    //   66: lreturn
    //   67: astore_0
    //   68: ldc -94
    //   70: aload_0
    //   71: ldc -25
    //   73: iconst_0
    //   74: anewarray 166	java/lang/Object
    //   77: invokestatic 235	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   80: goto -23 -> 57
    //   83: astore 4
    //   85: aconst_null
    //   86: astore_0
    //   87: aload 5
    //   89: astore_3
    //   90: ldc -94
    //   92: aload 4
    //   94: ldc -25
    //   96: iconst_0
    //   97: anewarray 166	java/lang/Object
    //   100: invokestatic 235	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   103: aload_3
    //   104: ifnull +7 -> 111
    //   107: aload_3
    //   108: invokevirtual 226	java/io/DataInputStream:close	()V
    //   111: aload_0
    //   112: ifnull +7 -> 119
    //   115: aload_0
    //   116: invokevirtual 229	java/io/InputStream:close	()V
    //   119: ldc2_w 201
    //   122: ldc -53
    //   124: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   127: lconst_0
    //   128: lreturn
    //   129: astore_0
    //   130: ldc -94
    //   132: aload_0
    //   133: ldc -25
    //   135: iconst_0
    //   136: anewarray 166	java/lang/Object
    //   139: invokestatic 235	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   142: goto -23 -> 119
    //   145: astore_0
    //   146: aconst_null
    //   147: astore_3
    //   148: aload 4
    //   150: ifnull +8 -> 158
    //   153: aload 4
    //   155: invokevirtual 226	java/io/DataInputStream:close	()V
    //   158: aload_3
    //   159: ifnull +7 -> 166
    //   162: aload_3
    //   163: invokevirtual 229	java/io/InputStream:close	()V
    //   166: aload_0
    //   167: athrow
    //   168: astore_3
    //   169: ldc -94
    //   171: aload_3
    //   172: ldc -25
    //   174: iconst_0
    //   175: anewarray 166	java/lang/Object
    //   178: invokestatic 235	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   181: goto -15 -> 166
    //   184: astore_0
    //   185: goto -37 -> 148
    //   188: astore 5
    //   190: aload_0
    //   191: astore 4
    //   193: aload 5
    //   195: astore_0
    //   196: goto -48 -> 148
    //   199: astore 4
    //   201: aload_0
    //   202: astore 5
    //   204: aload 4
    //   206: astore_0
    //   207: aload_3
    //   208: astore 4
    //   210: aload 5
    //   212: astore_3
    //   213: goto -65 -> 148
    //   216: astore 4
    //   218: aload_3
    //   219: astore_0
    //   220: aload 5
    //   222: astore_3
    //   223: goto -133 -> 90
    //   226: astore 4
    //   228: aload_3
    //   229: astore 5
    //   231: aload_0
    //   232: astore_3
    //   233: aload 5
    //   235: astore_0
    //   236: goto -146 -> 90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	239	0	paramString	String
    //   48	18	1	l	long
    //   29	134	3	localObject1	Object
    //   168	40	3	localIOException1	java.io.IOException
    //   212	21	3	localObject2	Object
    //   1	1	4	localObject3	Object
    //   83	71	4	localIOException2	java.io.IOException
    //   191	1	4	str	String
    //   199	6	4	localObject4	Object
    //   208	1	4	localObject5	Object
    //   216	1	4	localIOException3	java.io.IOException
    //   226	1	4	localIOException4	java.io.IOException
    //   4	84	5	localObject6	Object
    //   188	6	5	localObject7	Object
    //   202	32	5	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   49	57	67	java/io/IOException
    //   14	30	83	java/io/IOException
    //   107	111	129	java/io/IOException
    //   115	119	129	java/io/IOException
    //   14	30	145	finally
    //   153	158	168	java/io/IOException
    //   162	166	168	java/io/IOException
    //   30	39	184	finally
    //   39	49	188	finally
    //   90	103	199	finally
    //   30	39	216	java/io/IOException
    //   39	49	226	java/io/IOException
  }
  
  /* Error */
  public static int SX(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: ldc2_w 238
    //   8: ldc -16
    //   10: invokestatic 54	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   13: new 205	java/io/FileInputStream
    //   16: dup
    //   17: new 78	java/io/File
    //   20: dup
    //   21: aload_0
    //   22: invokespecial 208	java/io/File:<init>	(Ljava/lang/String;)V
    //   25: invokespecial 211	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   28: astore_2
    //   29: new 213	java/io/DataInputStream
    //   32: dup
    //   33: aload_2
    //   34: invokespecial 216	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   37: astore_0
    //   38: aload_0
    //   39: invokevirtual 220	java/io/DataInputStream:readInt	()I
    //   42: istore_1
    //   43: aload_0
    //   44: invokevirtual 226	java/io/DataInputStream:close	()V
    //   47: aload_2
    //   48: invokevirtual 229	java/io/InputStream:close	()V
    //   51: ldc2_w 238
    //   54: ldc -16
    //   56: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   59: iload_1
    //   60: ireturn
    //   61: astore_0
    //   62: ldc -94
    //   64: aload_0
    //   65: ldc -25
    //   67: iconst_0
    //   68: anewarray 166	java/lang/Object
    //   71: invokestatic 235	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   74: goto -23 -> 51
    //   77: astore_3
    //   78: aconst_null
    //   79: astore_0
    //   80: aload 4
    //   82: astore_2
    //   83: ldc -94
    //   85: aload_3
    //   86: ldc -25
    //   88: iconst_0
    //   89: anewarray 166	java/lang/Object
    //   92: invokestatic 235	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   95: aload_0
    //   96: ifnull +7 -> 103
    //   99: aload_0
    //   100: invokevirtual 226	java/io/DataInputStream:close	()V
    //   103: aload_2
    //   104: ifnull +7 -> 111
    //   107: aload_2
    //   108: invokevirtual 229	java/io/InputStream:close	()V
    //   111: ldc2_w 238
    //   114: ldc -16
    //   116: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   119: iconst_0
    //   120: ireturn
    //   121: astore_0
    //   122: ldc -94
    //   124: aload_0
    //   125: ldc -25
    //   127: iconst_0
    //   128: anewarray 166	java/lang/Object
    //   131: invokestatic 235	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   134: goto -23 -> 111
    //   137: astore_0
    //   138: aconst_null
    //   139: astore_2
    //   140: aload_3
    //   141: ifnull +7 -> 148
    //   144: aload_3
    //   145: invokevirtual 226	java/io/DataInputStream:close	()V
    //   148: aload_2
    //   149: ifnull +7 -> 156
    //   152: aload_2
    //   153: invokevirtual 229	java/io/InputStream:close	()V
    //   156: aload_0
    //   157: athrow
    //   158: astore_2
    //   159: ldc -94
    //   161: aload_2
    //   162: ldc -25
    //   164: iconst_0
    //   165: anewarray 166	java/lang/Object
    //   168: invokestatic 235	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   171: goto -15 -> 156
    //   174: astore_0
    //   175: goto -35 -> 140
    //   178: astore 4
    //   180: aload_0
    //   181: astore_3
    //   182: aload 4
    //   184: astore_0
    //   185: goto -45 -> 140
    //   188: astore 4
    //   190: aload_0
    //   191: astore_3
    //   192: aload 4
    //   194: astore_0
    //   195: goto -55 -> 140
    //   198: astore_3
    //   199: aconst_null
    //   200: astore_0
    //   201: goto -118 -> 83
    //   204: astore_3
    //   205: goto -122 -> 83
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	208	0	paramString	String
    //   42	18	1	i	int
    //   28	125	2	localObject1	Object
    //   158	4	2	localIOException1	java.io.IOException
    //   1	1	3	localObject2	Object
    //   77	68	3	localIOException2	java.io.IOException
    //   181	11	3	str	String
    //   198	1	3	localIOException3	java.io.IOException
    //   204	1	3	localIOException4	java.io.IOException
    //   3	78	4	localObject3	Object
    //   178	5	4	localObject4	Object
    //   188	5	4	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   43	51	61	java/io/IOException
    //   13	29	77	java/io/IOException
    //   99	103	121	java/io/IOException
    //   107	111	121	java/io/IOException
    //   13	29	137	finally
    //   144	148	158	java/io/IOException
    //   152	156	158	java/io/IOException
    //   29	38	174	finally
    //   38	43	178	finally
    //   83	95	188	finally
    //   29	38	198	java/io/IOException
    //   38	43	204	java/io/IOException
  }
  
  public static boolean SY(String paramString)
  {
    GMTrace.i(4520587296768L, 33681);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(4520587296768L, 33681);
      return false;
    }
    paramString = paramString.toString();
    int k = paramString.length();
    int j;
    for (int i = 0; i < k; i = j)
    {
      int m = paramString.codePointAt(i);
      j = Character.charCount(m) + i;
      if (j < k) {}
      for (i = paramString.codePointAt(j); bRv().Aq(m) != null; i = 0)
      {
        GMTrace.o(4520587296768L, 33681);
        return true;
      }
      if (bRv().ed(m, i) != null)
      {
        GMTrace.o(4520587296768L, 33681);
        return true;
      }
    }
    GMTrace.o(4520587296768L, 33681);
    return false;
  }
  
  public static b bRv()
  {
    GMTrace.i(4519781990400L, 33675);
    if (vnm == null) {}
    try
    {
      vnm = new b();
      b localb = vnm;
      GMTrace.o(4519781990400L, 33675);
      return localb;
    }
    finally {}
  }
  
  public static void bRw()
  {
    GMTrace.i(4519916208128L, 33676);
    File localFile = new File(vnj);
    if (localFile.isFile()) {
      localFile.delete();
    }
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    GMTrace.o(4519916208128L, 33676);
  }
  
  private void bRx()
  {
    GMTrace.i(4521661038592L, 33689);
    this.iJu = new LinkedList(this.vns.vni);
    if ((this.iJu == null) || (this.iJu.isEmpty()))
    {
      w.i("MicroMsg.EmojiHelper", "initIndex failed. items is empty.");
      GMTrace.o(4521661038592L, 33689);
      return;
    }
    Iterator localIterator = this.iJu.iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if (localc.vnE != 0)
      {
        SparseArray localSparseArray2 = (SparseArray)this.vnw.get(localc.vnE);
        SparseArray localSparseArray1 = localSparseArray2;
        if (localSparseArray2 == null)
        {
          localSparseArray1 = new SparseArray();
          this.vnw.append(localc.vnE, localSparseArray1);
        }
        localSparseArray1.put(localc.vnF, localc);
        if (localc.vnG != 0) {
          this.vnt.append(localc.vnG, localc);
        }
        if (localc.vnH != -1) {
          this.vnu.append(localc.vnH, localc);
        }
      }
      else
      {
        this.vnv.append(localc.vnI, localc);
      }
    }
    GMTrace.o(4521661038592L, 33689);
  }
  
  public static int bRy()
  {
    GMTrace.i(4521795256320L, 33690);
    GMTrace.o(4521795256320L, 33690);
    return 1;
  }
  
  public static String fa(String paramString1, String paramString2)
  {
    GMTrace.i(4520855732224L, 33683);
    StringBuilder localStringBuilder = new StringBuilder();
    int k = paramString1.length();
    int i = 0;
    int m;
    if (i < k)
    {
      m = paramString1.codePointAt(i);
      i += Character.charCount(m);
      if (i < k) {}
      for (int j = paramString1.codePointAt(i);; j = 0)
      {
        if (bRv().Aq(m) == null) {
          break label85;
        }
        localStringBuilder.append(paramString2);
        break;
      }
      label85:
      c localc = bRv().ed(m, j);
      if (localc != null)
      {
        if (localc.vnF == 0) {
          break label154;
        }
        i = Character.charCount(j) + i;
      }
    }
    label154:
    for (;;)
    {
      localStringBuilder.append(paramString2);
      break;
      localStringBuilder.appendCodePoint(m);
      break;
      paramString1 = localStringBuilder.toString();
      GMTrace.o(4520855732224L, 33683);
      return paramString1;
    }
  }
  
  public final c Aq(int paramInt)
  {
    GMTrace.i(4521258385408L, 33686);
    if ((paramInt >= 57345) && (paramInt <= 58679))
    {
      c localc = (c)this.vnt.get(paramInt);
      GMTrace.o(4521258385408L, 33686);
      return localc;
    }
    GMTrace.o(4521258385408L, 33686);
    return null;
  }
  
  public final String SZ(String paramString)
  {
    GMTrace.i(4520721514496L, 33682);
    if (bg.nm(paramString))
    {
      GMTrace.o(4520721514496L, 33682);
      return paramString;
    }
    Object localObject2;
    if (this.vnx == null)
    {
      localObject2 = ab.getContext();
      localObject1 = v.d(((Context)localObject2).getSharedPreferences(ab.bPU(), 0));
      if (((String)localObject1).equals("zh_CN")) {
        localObject1 = ((Context)localObject2).getResources().getStringArray(a.a.kvz);
      }
      for (;;)
      {
        localObject2 = ((Context)localObject2).getResources().getStringArray(a.a.kvy);
        this.vnx = new SparseArray();
        i = 0;
        while ((i < localObject2.length) && (i < localObject1.length))
        {
          this.vnx.put(localObject2[i].charAt(0), localObject1[i]);
          i += 1;
        }
        if ((((String)localObject1).equals("zh_TW")) || (((String)localObject1).equals("zh_HK"))) {
          localObject1 = ((Context)localObject2).getResources().getStringArray(a.a.kvB);
        } else {
          localObject1 = ((Context)localObject2).getResources().getStringArray(a.a.kvA);
        }
      }
    }
    Object localObject1 = new StringBuilder();
    int m = paramString.length();
    int i = 0;
    while (i < m)
    {
      int n = paramString.codePointAt(i);
      int j = i + Character.charCount(n);
      if (j < m) {}
      for (int k = paramString.codePointAt(j);; k = 0)
      {
        localObject2 = bRv().Aq(n);
        if (localObject2 == null) {
          break label325;
        }
        localObject2 = (String)this.vnx.get(((c)localObject2).vnG);
        if (localObject2 == null) {
          break label304;
        }
        ((StringBuilder)localObject1).append((String)localObject2);
        i = j;
        break;
      }
      label304:
      ((StringBuilder)localObject1).append(this.mContext.getString(a.h.cSE));
      i = j;
      continue;
      label325:
      localObject2 = bRv().ed(n, k);
      if (localObject2 != null)
      {
        i = j;
        if (((c)localObject2).vnF != 0) {
          i = Character.charCount(k) + j;
        }
        localObject2 = (String)this.vnx.get(((c)localObject2).vnG);
        if (localObject2 != null) {
          ((StringBuilder)localObject1).append((String)localObject2);
        } else {
          ((StringBuilder)localObject1).append(this.mContext.getString(a.h.cSE));
        }
      }
      else
      {
        ((StringBuilder)localObject1).appendCodePoint(n);
        i = j;
      }
    }
    paramString = ((StringBuilder)localObject1).toString();
    GMTrace.o(4520721514496L, 33682);
    return paramString;
  }
  
  public final Drawable a(c paramc)
  {
    GMTrace.i(4521526820864L, 33688);
    if (paramc == null)
    {
      w.i("MicroMsg.EmojiHelper", "Emoji Item is null.");
      GMTrace.o(4521526820864L, 33688);
      return null;
    }
    for (;;)
    {
      try
      {
        localObject1 = (Bitmap)this.vny.get(Integer.valueOf(paramc.gsM));
        if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
        {
          paramc = new BitmapDrawable(ab.getContext().getResources(), (Bitmap)localObject1);
          GMTrace.o(4521526820864L, 33688);
          return paramc;
        }
        localObject1 = com.tencent.mm.a.e.c(vnk, paramc.gsM + this.vnp, paramc.size);
        Object localObject2 = new BitmapFactory.Options();
        ((BitmapFactory.Options)localObject2).inPreferredConfig = Bitmap.Config.RGB_565;
        localObject2 = BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject2);
        if (localObject2 != null)
        {
          ((Bitmap)localObject2).setDensity(240);
          this.vny.put(Integer.valueOf(paramc.gsM), localObject2);
          paramc = new BitmapDrawable(ab.getContext().getResources(), (Bitmap)localObject2);
          GMTrace.o(4521526820864L, 33688);
          return paramc;
        }
        int j = paramc.size;
        if (localObject1 != null) {
          continue;
        }
        i = 0;
        w.i("MicroMsg.EmojiHelper", "bitmap is null. decode byte array failed. size:%d data length:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      }
      catch (Exception paramc)
      {
        Object localObject1;
        int i;
        w.printErrStackTrace("MicroMsg.EmojiHelper", paramc, "", new Object[0]);
        continue;
      }
      GMTrace.o(4521526820864L, 33688);
      return null;
      i = localObject1.length;
    }
  }
  
  public final SpannableString a(SpannableString paramSpannableString, int paramInt, PInt paramPInt)
  {
    GMTrace.i(4520453079040L, 33680);
    if ((paramSpannableString == null) || (paramSpannableString.length() == 0))
    {
      GMTrace.o(4520453079040L, 33680);
      return paramSpannableString;
    }
    Object localObject1 = paramSpannableString.toString();
    ArrayList localArrayList = new ArrayList();
    int j = 0;
    int n = ((String)localObject1).length();
    int k;
    int m;
    Object localObject2;
    if (j < n)
    {
      i = ((String)localObject1).codePointAt(j);
      k = j + Character.charCount(i);
      if (k >= n) {
        break label171;
      }
      m = ((String)localObject1).codePointAt(k);
      localObject2 = bRv().Aq(i);
      if (localObject2 == null) {
        break label177;
      }
      localArrayList.add(new a((c)localObject2, j, j + 1, true));
      i = k;
    }
    for (;;)
    {
      label140:
      if (localArrayList.size() >= paramPInt.value) {
        if (localArrayList.size() == 0)
        {
          GMTrace.o(4520453079040L, 33680);
          return paramSpannableString;
          label171:
          m = 0;
          break;
          label177:
          localObject2 = bRv().ed(i, m);
          i = k;
          if (localObject2 == null) {
            continue;
          }
          if ((((c)localObject2).vnF == 0) && ((127995 > m) || (m > 127999))) {
            break label507;
          }
        }
      }
    }
    label507:
    for (int i = k + Character.charCount(m);; i = k)
    {
      localArrayList.add(new a((c)localObject2, j, i, false));
      break label140;
      if (vnl)
      {
        paramSpannableString = new StringBuilder((String)localObject1);
        localObject1 = localArrayList.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (a)((Iterator)localObject1).next();
          if (!((a)localObject2).vnC) {
            if ((((a)localObject2).vnB.vnG != 0) && (((a)localObject2).end - ((a)localObject2).start == 1)) {
              paramSpannableString.replace(((a)localObject2).start, ((a)localObject2).end, String.valueOf((char)((a)localObject2).vnB.vnG));
            } else {
              paramSpannableString.replace(((a)localObject2).start, ((a)localObject2).end, "....".substring(0, ((a)localObject2).end - ((a)localObject2).start));
            }
          }
        }
        paramSpannableString = new SpannableString(paramSpannableString.toString());
      }
      for (;;)
      {
        localObject1 = localArrayList.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (a)((Iterator)localObject1).next();
          a(paramSpannableString, bRv().a(((a)localObject2).vnB), ((a)localObject2).start, ((a)localObject2).end, paramInt);
        }
        paramPInt.value -= localArrayList.size();
        GMTrace.o(4520453079040L, 33680);
        return paramSpannableString;
      }
      j = i;
      break;
    }
  }
  
  public final void a(Spannable paramSpannable, Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(4520989949952L, 33684);
    int i = (int)(paramInt3 * 1.3F);
    paramInt3 = (int)(paramInt3 * 1.3F);
    try
    {
      paramDrawable.setBounds(0, 0, i, paramInt3);
      paramDrawable = new com.tencent.mm.ui.widget.e(paramDrawable);
      paramDrawable.xpz = this.vnn;
      paramSpannable.setSpan(paramDrawable, paramInt1, paramInt2, 33);
      GMTrace.o(4520989949952L, 33684);
      return;
    }
    catch (Exception paramSpannable)
    {
      w.printErrStackTrace("MicroMsg.EmojiHelper", paramSpannable, "", new Object[0]);
      GMTrace.o(4520989949952L, 33684);
    }
  }
  
  final c ed(int paramInt1, int paramInt2)
  {
    GMTrace.i(4521124167680L, 33685);
    if ((this.vnA == null) || (this.vnA.isEmpty()) || (this.vnz))
    {
      this.vnA = new LinkedList(this.vns.vnh);
      this.vnz = false;
    }
    if ((this.vnA == null) || (this.vnA.isEmpty()))
    {
      GMTrace.o(4521124167680L, 33685);
      return null;
    }
    Object localObject = this.vnA.iterator();
    int i = 0;
    if (((Iterator)localObject).hasNext())
    {
      d locald = (d)((Iterator)localObject).next();
      if ((paramInt1 < locald.rqp) || (paramInt1 > locald.max)) {
        break label248;
      }
      i = 1;
    }
    label248:
    for (;;)
    {
      break;
      if (i == 0)
      {
        GMTrace.o(4521124167680L, 33685);
        return null;
      }
      localObject = (SparseArray)this.vnw.get(paramInt1);
      if (localObject != null)
      {
        if ((((SparseArray)localObject).size() == 1) && (((SparseArray)localObject).get(0) != null))
        {
          localObject = (c)((SparseArray)localObject).get(0);
          GMTrace.o(4521124167680L, 33685);
          return (c)localObject;
        }
        localObject = (c)((SparseArray)localObject).get(paramInt2);
        GMTrace.o(4521124167680L, 33685);
        return (c)localObject;
      }
      GMTrace.o(4521124167680L, 33685);
      return null;
    }
  }
  
  /* Error */
  public final void init()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: ldc2_w 610
    //   6: ldc_w 612
    //   9: invokestatic 54	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: invokestatic 151	java/lang/System:currentTimeMillis	()J
    //   15: lstore_1
    //   16: new 205	java/io/FileInputStream
    //   19: dup
    //   20: new 78	java/io/File
    //   23: dup
    //   24: getstatic 85	com/tencent/mm/bt/b:vnk	Ljava/lang/String;
    //   27: invokespecial 208	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: invokespecial 211	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   33: astore 5
    //   35: new 213	java/io/DataInputStream
    //   38: dup
    //   39: aload 5
    //   41: invokespecial 216	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   44: astore_3
    //   45: aload_0
    //   46: aload_3
    //   47: invokevirtual 220	java/io/DataInputStream:readInt	()I
    //   50: putfield 614	com/tencent/mm/bt/b:vnq	I
    //   53: aload_0
    //   54: aload_3
    //   55: invokevirtual 223	java/io/DataInputStream:readLong	()J
    //   58: putfield 104	com/tencent/mm/bt/b:vnr	J
    //   61: aload_0
    //   62: aload_3
    //   63: invokevirtual 220	java/io/DataInputStream:readInt	()I
    //   66: putfield 616	com/tencent/mm/bt/b:vno	I
    //   69: aload_0
    //   70: aload_0
    //   71: getfield 616	com/tencent/mm/bt/b:vno	I
    //   74: iconst_4
    //   75: iadd
    //   76: bipush 8
    //   78: iadd
    //   79: iconst_4
    //   80: iadd
    //   81: putfield 471	com/tencent/mm/bt/b:vnp	I
    //   84: aload_0
    //   85: getfield 616	com/tencent/mm/bt/b:vno	I
    //   88: newarray <illegal type>
    //   90: astore 4
    //   92: aload_3
    //   93: aload 4
    //   95: invokevirtual 620	java/io/DataInputStream:read	([B)I
    //   98: pop
    //   99: aload_0
    //   100: getfield 109	com/tencent/mm/bt/b:vns	Lcom/tencent/mm/bt/a;
    //   103: aload 4
    //   105: invokevirtual 624	com/tencent/mm/bt/a:aD	([B)Lcom/tencent/mm/bm/a;
    //   108: pop
    //   109: aload_0
    //   110: invokespecial 626	com/tencent/mm/bt/b:bRx	()V
    //   113: aload_0
    //   114: iconst_1
    //   115: putfield 131	com/tencent/mm/bt/b:vnz	Z
    //   118: ldc -94
    //   120: ldc_w 628
    //   123: iconst_1
    //   124: anewarray 166	java/lang/Object
    //   127: dup
    //   128: iconst_0
    //   129: invokestatic 151	java/lang/System:currentTimeMillis	()J
    //   132: lload_1
    //   133: lsub
    //   134: invokestatic 172	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   137: aastore
    //   138: invokestatic 506	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   141: aload_3
    //   142: invokevirtual 226	java/io/DataInputStream:close	()V
    //   145: aload 5
    //   147: invokevirtual 229	java/io/InputStream:close	()V
    //   150: ldc2_w 610
    //   153: ldc_w 612
    //   156: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   159: return
    //   160: astore_3
    //   161: ldc -94
    //   163: aload_3
    //   164: ldc -25
    //   166: iconst_0
    //   167: anewarray 166	java/lang/Object
    //   170: invokestatic 235	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: ldc2_w 610
    //   176: ldc_w 612
    //   179: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   182: return
    //   183: astore 5
    //   185: aconst_null
    //   186: astore_3
    //   187: ldc -94
    //   189: aload 5
    //   191: ldc -25
    //   193: iconst_0
    //   194: anewarray 166	java/lang/Object
    //   197: invokestatic 235	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   200: aload_3
    //   201: ifnull +7 -> 208
    //   204: aload_3
    //   205: invokevirtual 226	java/io/DataInputStream:close	()V
    //   208: aload 4
    //   210: ifnull +8 -> 218
    //   213: aload 4
    //   215: invokevirtual 229	java/io/InputStream:close	()V
    //   218: ldc2_w 610
    //   221: ldc_w 612
    //   224: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   227: return
    //   228: astore_3
    //   229: ldc -94
    //   231: aload_3
    //   232: ldc -25
    //   234: iconst_0
    //   235: anewarray 166	java/lang/Object
    //   238: invokestatic 235	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   241: ldc2_w 610
    //   244: ldc_w 612
    //   247: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   250: return
    //   251: astore 4
    //   253: aconst_null
    //   254: astore_3
    //   255: aconst_null
    //   256: astore 5
    //   258: aload_3
    //   259: ifnull +7 -> 266
    //   262: aload_3
    //   263: invokevirtual 226	java/io/DataInputStream:close	()V
    //   266: aload 5
    //   268: ifnull +8 -> 276
    //   271: aload 5
    //   273: invokevirtual 229	java/io/InputStream:close	()V
    //   276: aload 4
    //   278: athrow
    //   279: astore_3
    //   280: ldc -94
    //   282: aload_3
    //   283: ldc -25
    //   285: iconst_0
    //   286: anewarray 166	java/lang/Object
    //   289: invokestatic 235	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   292: goto -16 -> 276
    //   295: astore 4
    //   297: aconst_null
    //   298: astore_3
    //   299: goto -41 -> 258
    //   302: astore 4
    //   304: goto -46 -> 258
    //   307: astore 6
    //   309: aload 4
    //   311: astore 5
    //   313: aload 6
    //   315: astore 4
    //   317: goto -59 -> 258
    //   320: astore 6
    //   322: aconst_null
    //   323: astore_3
    //   324: aload 5
    //   326: astore 4
    //   328: aload 6
    //   330: astore 5
    //   332: goto -145 -> 187
    //   335: astore 6
    //   337: aload 5
    //   339: astore 4
    //   341: aload 6
    //   343: astore 5
    //   345: goto -158 -> 187
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	348	0	this	b
    //   15	118	1	l	long
    //   44	98	3	localDataInputStream	java.io.DataInputStream
    //   160	4	3	localIOException1	java.io.IOException
    //   186	19	3	localObject1	Object
    //   228	4	3	localIOException2	java.io.IOException
    //   254	9	3	localObject2	Object
    //   279	4	3	localIOException3	java.io.IOException
    //   298	26	3	localObject3	Object
    //   1	213	4	arrayOfByte	byte[]
    //   251	26	4	localObject4	Object
    //   295	1	4	localObject5	Object
    //   302	8	4	localObject6	Object
    //   315	25	4	localObject7	Object
    //   33	113	5	localFileInputStream	java.io.FileInputStream
    //   183	7	5	localException1	Exception
    //   256	88	5	localObject8	Object
    //   307	7	6	localObject9	Object
    //   320	9	6	localException2	Exception
    //   335	7	6	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   141	150	160	java/io/IOException
    //   12	35	183	java/lang/Exception
    //   204	208	228	java/io/IOException
    //   213	218	228	java/io/IOException
    //   12	35	251	finally
    //   262	266	279	java/io/IOException
    //   271	276	279	java/io/IOException
    //   35	45	295	finally
    //   45	141	302	finally
    //   187	200	307	finally
    //   35	45	320	java/lang/Exception
    //   45	141	335	java/lang/Exception
  }
  
  public final Drawable kg(int paramInt)
  {
    GMTrace.i(4521392603136L, 33687);
    Drawable localDrawable = a((c)this.vnv.get(paramInt));
    GMTrace.o(4521392603136L, 33687);
    return localDrawable;
  }
  
  private final class a
  {
    int end;
    int start;
    c vnB;
    boolean vnC;
    
    public a(c paramc, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      GMTrace.i(4522600562688L, 33696);
      this.vnC = false;
      this.vnB = paramc;
      this.start = paramInt1;
      this.end = paramInt2;
      this.vnC = paramBoolean;
      GMTrace.o(4522600562688L, 33696);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bt\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */