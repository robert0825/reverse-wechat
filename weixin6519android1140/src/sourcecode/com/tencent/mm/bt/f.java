package com.tencent.mm.bt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.plugin.m.a.a;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;

public final class f
{
  private static volatile f vnP;
  public static Pattern voa;
  private static final Comparator<a> vob;
  public String[] vnQ;
  public String[] vnR;
  public String[] vnS;
  public String[] vnT;
  public String[] vnU;
  public String[] vnV;
  public ArrayList<q> vnW;
  private a[] vnX;
  private HashMap<String, q> vnY;
  private SparseArray<String> vnZ;
  
  static
  {
    GMTrace.i(4519513554944L, 33673);
    vnP = null;
    vob = new Comparator() {};
    GMTrace.o(4519513554944L, 33673);
  }
  
  private f(Context paramContext)
  {
    GMTrace.i(4518305595392L, 33664);
    this.vnQ = null;
    this.vnR = null;
    this.vnS = null;
    this.vnT = null;
    this.vnU = null;
    this.vnV = null;
    this.vnX = null;
    this.vnY = new HashMap();
    this.vnZ = new SparseArray();
    long l = System.currentTimeMillis();
    this.vnQ = paramContext.getResources().getStringArray(a.a.kvC);
    this.vnR = paramContext.getResources().getStringArray(a.a.kvF);
    this.vnS = paramContext.getResources().getStringArray(a.a.kvD);
    this.vnT = paramContext.getResources().getStringArray(a.a.kvH);
    this.vnU = paramContext.getResources().getStringArray(a.a.kvE);
    this.vnV = paramContext.getResources().getStringArray(a.a.kvG);
    bRC();
    w.d("MicroMsg.QQSmileyManager", "QQSmileyManager use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(4518305595392L, 33664);
  }
  
  /* Error */
  static Drawable Tb(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 151
    //   3: ldc -103
    //   5: invokestatic 45	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 155	java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial 156	java/lang/StringBuilder:<init>	()V
    //   15: invokestatic 162	com/tencent/mm/aj/a:GK	()Ljava/lang/String;
    //   18: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: ldc -88
    //   23: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: aload_0
    //   27: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: invokevirtual 171	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   33: astore_0
    //   34: new 173	java/io/FileInputStream
    //   37: dup
    //   38: aload_0
    //   39: invokespecial 176	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   42: astore_1
    //   43: aload_1
    //   44: astore_0
    //   45: new 178	android/graphics/BitmapFactory$Options
    //   48: dup
    //   49: invokespecial 179	android/graphics/BitmapFactory$Options:<init>	()V
    //   52: astore_2
    //   53: aload_1
    //   54: astore_0
    //   55: aload_2
    //   56: getstatic 185	android/graphics/Bitmap$Config:RGB_565	Landroid/graphics/Bitmap$Config;
    //   59: putfield 188	android/graphics/BitmapFactory$Options:inPreferredConfig	Landroid/graphics/Bitmap$Config;
    //   62: aload_1
    //   63: astore_0
    //   64: aload_1
    //   65: aconst_null
    //   66: aload_2
    //   67: invokestatic 194	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   70: astore_2
    //   71: aload_2
    //   72: ifnonnull +12 -> 84
    //   75: aload_1
    //   76: astore_0
    //   77: ldc -126
    //   79: ldc -60
    //   81: invokestatic 199	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   84: aload_1
    //   85: astore_0
    //   86: new 201	android/graphics/drawable/BitmapDrawable
    //   89: dup
    //   90: invokestatic 207	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   93: invokevirtual 97	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   96: aload_2
    //   97: invokespecial 210	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    //   100: astore_2
    //   101: aload_1
    //   102: invokevirtual 213	java/io/FileInputStream:close	()V
    //   105: ldc2_w 151
    //   108: ldc -103
    //   110: invokestatic 55	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   113: aload_2
    //   114: areturn
    //   115: astore_0
    //   116: ldc -126
    //   118: aload_0
    //   119: invokestatic 219	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   122: invokestatic 199	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   125: goto -20 -> 105
    //   128: astore_2
    //   129: aconst_null
    //   130: astore_1
    //   131: aload_1
    //   132: astore_0
    //   133: ldc -126
    //   135: aload_2
    //   136: invokestatic 219	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   139: invokestatic 199	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   142: aload_1
    //   143: ifnull +7 -> 150
    //   146: aload_1
    //   147: invokevirtual 213	java/io/FileInputStream:close	()V
    //   150: ldc2_w 151
    //   153: ldc -103
    //   155: invokestatic 55	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   158: aconst_null
    //   159: areturn
    //   160: astore_0
    //   161: ldc -126
    //   163: aload_0
    //   164: invokestatic 219	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   167: invokestatic 199	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   170: goto -20 -> 150
    //   173: astore_1
    //   174: aconst_null
    //   175: astore_0
    //   176: aload_0
    //   177: ifnull +7 -> 184
    //   180: aload_0
    //   181: invokevirtual 213	java/io/FileInputStream:close	()V
    //   184: aload_1
    //   185: athrow
    //   186: astore_0
    //   187: ldc -126
    //   189: aload_0
    //   190: invokestatic 219	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   193: invokestatic 199	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   196: goto -12 -> 184
    //   199: astore_1
    //   200: goto -24 -> 176
    //   203: astore_2
    //   204: goto -73 -> 131
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	207	0	paramString	String
    //   42	105	1	localFileInputStream	java.io.FileInputStream
    //   173	12	1	localObject1	Object
    //   199	1	1	localObject2	Object
    //   52	62	2	localObject3	Object
    //   128	8	2	localFileNotFoundException1	java.io.FileNotFoundException
    //   203	1	2	localFileNotFoundException2	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   101	105	115	java/io/IOException
    //   34	43	128	java/io/FileNotFoundException
    //   146	150	160	java/io/IOException
    //   34	43	173	finally
    //   180	184	186	java/io/IOException
    //   45	53	199	finally
    //   55	62	199	finally
    //   64	71	199	finally
    //   77	84	199	finally
    //   86	101	199	finally
    //   133	142	199	finally
    //   45	53	203	java/io/FileNotFoundException
    //   55	62	203	java/io/FileNotFoundException
    //   64	71	203	java/io/FileNotFoundException
    //   77	84	203	java/io/FileNotFoundException
    //   86	101	203	java/io/FileNotFoundException
  }
  
  private boolean a(int paramInt1, SpannableString paramSpannableString, int paramInt2)
  {
    GMTrace.i(4519110901760L, 33670);
    a locala = Ta(paramSpannableString.subSequence(paramInt1, paramSpannableString.length()));
    if (locala != null)
    {
      int i = locala.pos;
      if (i >= 0) {}
      for (Drawable localDrawable = b.bRv().kg(i); (localDrawable != null) && (paramInt1 <= paramSpannableString.length()) && (locala.text.length() + paramInt1 <= paramSpannableString.length()); localDrawable = Tb(locala.name))
      {
        b.bRv().a(paramSpannableString, localDrawable, paramInt1, paramInt1 + locala.text.length(), paramInt2);
        GMTrace.o(4519110901760L, 33670);
        return true;
      }
      w.i("MicroMsg.QQSmileyManager", "spanQQSmileyIcon failed. drawable not found. smiley:%s", new Object[] { locala.toString() });
    }
    GMTrace.o(4519110901760L, 33670);
    return false;
  }
  
  public static f bRB()
  {
    GMTrace.i(4518439813120L, 33665);
    if (vnP == null) {}
    try
    {
      if (vnP == null) {
        vnP = new f(ab.getContext());
      }
      f localf = vnP;
      GMTrace.o(4518439813120L, 33665);
      return localf;
    }
    finally {}
  }
  
  private int bRC()
  {
    int j = 0;
    int i;
    String str3;
    label143:
    String str4;
    label167:
    String str5;
    for (;;)
    {
      try
      {
        GMTrace.i(4518574030848L, 33666);
        if ((this.vnQ == null) || (this.vnS == null) || (this.vnQ.length != this.vnS.length)) {
          break;
        }
        j = this.vnQ.length;
        if (this.vnW != null)
        {
          this.vnX = new a[(this.vnW.size() + j) * 6];
          break label493;
          if (i >= j) {
            break label522;
          }
          String str6 = this.vnQ[i];
          String str7 = this.vnS[i];
          if ((this.vnR != null) && (this.vnR.length > i))
          {
            String str1 = this.vnR[i];
            if ((this.vnT == null) || (this.vnT.length <= i)) {
              break label498;
            }
            str3 = this.vnT[i];
            if ((this.vnU == null) || (this.vnU.length <= i)) {
              break label506;
            }
            str4 = this.vnU[i];
            if ((this.vnV == null) || (this.vnV.length <= i)) {
              break label514;
            }
            str5 = this.vnV[i];
            label191:
            q localq = new q(str6, str1, str7, str3, str4, str5, i);
            this.vnX[(i * 6 + 0)] = new a(i, str6, "");
            this.vnX[(i * 6 + 1)] = new a(i, str7, "");
            this.vnX[(i * 6 + 2)] = new a(i, str1, "");
            this.vnX[(i * 6 + 3)] = new a(i, str3, "");
            this.vnX[(i * 6 + 4)] = new a(i, str4, "");
            this.vnX[(i * 6 + 5)] = new a(i, str5, "");
            this.vnY.put(str6, localq);
            this.vnZ.put(localq.field_eggIndex, localq.field_key);
            i += 1;
            continue;
          }
        }
        else
        {
          this.vnX = new a[j * 6];
        }
      }
      finally {}
      String str2 = "";
    }
    for (;;)
    {
      if ((this.vnW == null) || (this.vnW.isEmpty())) {
        Arrays.sort(this.vnX, vob);
      }
      GMTrace.o(4518574030848L, 33666);
      return i;
      w.i("MicroMsg.QQSmileyManager", "read smiley array failed.");
      i = j;
      if (this.vnW != null)
      {
        this.vnX = new a[this.vnW.size()];
        i = j;
        continue;
        label493:
        i = 0;
        break;
        label498:
        str3 = "";
        break label143;
        label506:
        str4 = "";
        break label167;
        label514:
        str5 = "";
        break label191;
        label522:
        i = j;
      }
    }
  }
  
  public final a Ta(String paramString)
  {
    GMTrace.i(4518842466304L, 33668);
    a[] arrayOfa = bRB().vnX;
    if (arrayOfa != null)
    {
      a locala = new a(0, paramString, "");
      int j = Arrays.binarySearch(this.vnX, locala, vob);
      int i = j;
      if (j < 0) {
        i = -j - 2;
      }
      if ((i >= 0) && (paramString.startsWith(this.vnX[i].text)))
      {
        paramString = arrayOfa[i];
        GMTrace.o(4518842466304L, 33668);
        return paramString;
      }
    }
    GMTrace.o(4518842466304L, 33668);
    return null;
  }
  
  public final q Tc(String paramString)
  {
    GMTrace.i(4519379337216L, 33672);
    if ((this.vnY != null) && (this.vnY.containsKey(paramString)))
    {
      paramString = (q)this.vnY.get(paramString);
      GMTrace.o(4519379337216L, 33672);
      return paramString;
    }
    w.i("MicroMsg.QQSmileyManager", "getSmileyInfo failed. smiley map no contains key:%s", new Object[] { paramString });
    GMTrace.o(4519379337216L, 33672);
    return null;
  }
  
  public final SpannableString a(SpannableString paramSpannableString, int paramInt1, int paramInt2)
  {
    GMTrace.i(4518976684032L, 33669);
    if ((paramSpannableString == null) || (paramSpannableString.length() == 0))
    {
      GMTrace.o(4518976684032L, 33669);
      return paramSpannableString;
    }
    String str = paramSpannableString.toString();
    int i = 0;
    int k = -1;
    int m;
    for (;;)
    {
      int j = str.indexOf('/', k + 1);
      k = j;
      m = i;
      if (j == -1) {
        break;
      }
      k = j;
      if (j < str.length() - 1)
      {
        k = j;
        m = i;
        if (i >= paramInt2) {
          break;
        }
        k = j;
        if (a(j, paramSpannableString, paramInt1))
        {
          i += 1;
          k = j;
        }
      }
    }
    for (;;)
    {
      i = str.indexOf('[', k + 1);
      if (i == -1) {
        break;
      }
      k = i;
      if (i < str.length() - 1)
      {
        if (m >= paramInt2) {
          break;
        }
        k = i;
        if (a(i, paramSpannableString, paramInt1))
        {
          m += 1;
          k = i;
        }
      }
    }
    GMTrace.o(4518976684032L, 33669);
    return paramSpannableString;
  }
  
  public final void bRD()
  {
    GMTrace.i(4518708248576L, 33667);
    long l = System.currentTimeMillis();
    this.vnY.clear();
    this.vnZ.clear();
    this.vnW = ((PluginEmoji)h.j(PluginEmoji.class)).getEmojiMgr().aqA();
    int i = bRC();
    if ((this.vnW != null) && (!this.vnW.isEmpty()))
    {
      Iterator localIterator = this.vnW.iterator();
      if (localIterator.hasNext())
      {
        q localq = (q)localIterator.next();
        this.vnY.put(localq.field_key, localq);
        this.vnZ.put(localq.field_eggIndex, localq.field_key);
        this.vnX[(i * 6 + 0)] = new a(-1, localq.field_key, localq.field_fileName);
        if ((bg.nm(localq.field_cnValue)) || ("null".equalsIgnoreCase(localq.field_cnValue)))
        {
          this.vnX[(i * 6 + 1)] = new a(-1, localq.field_key, localq.field_fileName);
          label216:
          if ((!bg.nm(localq.field_qqValue)) && (!"null".equalsIgnoreCase(localq.field_qqValue))) {
            break label471;
          }
          this.vnX[(i * 6 + 2)] = new a(-1, localq.field_key, localq.field_fileName);
          label270:
          if ((!bg.nm(localq.field_twValue)) && (!"null".equalsIgnoreCase(localq.field_twValue))) {
            break label503;
          }
          this.vnX[(i * 6 + 3)] = new a(-1, localq.field_key, localq.field_fileName);
          label324:
          if ((!bg.nm(localq.field_enValue)) && (!"null".equalsIgnoreCase(localq.field_enValue))) {
            break label535;
          }
          this.vnX[(i * 6 + 4)] = new a(-1, localq.field_key, localq.field_fileName);
          label378:
          if ((!bg.nm(localq.field_thValue)) && (!"null".equalsIgnoreCase(localq.field_thValue))) {
            break label567;
          }
          this.vnX[(i * 6 + 5)] = new a(-1, localq.field_key, localq.field_fileName);
        }
        for (;;)
        {
          i += 1;
          break;
          this.vnX[(i * 6 + 1)] = new a(-1, localq.field_cnValue, localq.field_fileName);
          break label216;
          label471:
          this.vnX[(i * 6 + 2)] = new a(-1, localq.field_qqValue, localq.field_fileName);
          break label270;
          label503:
          this.vnX[(i * 6 + 3)] = new a(-1, localq.field_twValue, localq.field_fileName);
          break label324;
          label535:
          this.vnX[(i * 6 + 4)] = new a(-1, localq.field_enValue, localq.field_fileName);
          break label378;
          label567:
          this.vnX[(i * 6 + 5)] = new a(-1, localq.field_thValue, localq.field_fileName);
        }
      }
    }
    else
    {
      w.i("MicroMsg.QQSmileyManager", "newSmileys list is null.");
    }
    Arrays.sort(this.vnX, vob);
    w.i("MicroMsg.QQSmileyManager", "updateSmiley end use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(4518708248576L, 33667);
  }
  
  public final String fb(String paramString1, String paramString2)
  {
    GMTrace.i(18912083181568L, 140906);
    int i = 0;
    int j = paramString1.length();
    StringBuilder localStringBuilder = new StringBuilder(j);
    while (i < j)
    {
      char c = paramString1.charAt(i);
      if ((c == '/') || (c == '['))
      {
        a locala = Ta(paramString1.substring(i));
        if (locala != null)
        {
          localStringBuilder.append(paramString2);
          i += locala.text.length();
          continue;
        }
      }
      localStringBuilder.append(c);
      i += 1;
    }
    paramString1 = localStringBuilder.toString();
    GMTrace.o(18912083181568L, 140906);
    return paramString1;
  }
  
  public static final class a
  {
    public String name;
    public int pos;
    public String text;
    
    a()
    {
      GMTrace.i(4516829200384L, 33653);
      GMTrace.o(4516829200384L, 33653);
    }
    
    a(int paramInt, String paramString1, String paramString2)
    {
      GMTrace.i(4516963418112L, 33654);
      this.pos = paramInt;
      this.text = paramString1;
      this.name = paramString2;
      GMTrace.o(4516963418112L, 33654);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bt\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */