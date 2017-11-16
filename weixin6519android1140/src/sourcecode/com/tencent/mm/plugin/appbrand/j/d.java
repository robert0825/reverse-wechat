package com.tencent.mm.plugin.appbrand.j;

import android.content.Intent;
import android.text.Spannable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.az.e;
import com.tencent.mm.az.r;
import com.tencent.mm.plugin.appbrand.compat.a.g;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public final class d
  implements g
{
  public d()
  {
    GMTrace.i(19479689953280L, 145135);
    GMTrace.o(19479689953280L, 145135);
  }
  
  public final int KK()
  {
    GMTrace.i(19479958388736L, 145137);
    int i = r.KK();
    GMTrace.o(19479958388736L, 145137);
    return i;
  }
  
  public final String Ko()
  {
    GMTrace.i(19479824171008L, 145136);
    String str = r.Ko();
    GMTrace.o(19479824171008L, 145136);
    return str;
  }
  
  public final Intent Kv()
  {
    GMTrace.i(19480092606464L, 145138);
    Intent localIntent = new Intent();
    localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
    localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
    localIntent.putExtra("neverGetA8Key", true);
    GMTrace.o(19480092606464L, 145138);
    return localIntent;
  }
  
  public final Map<String, String> Up()
  {
    GMTrace.i(19480226824192L, 145139);
    Map localMap = r.a(201, true, 64);
    GMTrace.o(19480226824192L, 145139);
    return localMap;
  }
  
  public final Spannable a(CharSequence paramCharSequence, List<String> paramList, String paramString)
  {
    GMTrace.i(19480629477376L, 145142);
    paramCharSequence = e.a(paramCharSequence, paramList, paramString);
    GMTrace.o(19480629477376L, 145142);
    return paramCharSequence;
  }
  
  public final Spannable a(CharSequence paramCharSequence, List<String> paramList, boolean paramBoolean, String paramString)
  {
    GMTrace.i(19480495259648L, 145141);
    paramCharSequence = e.a(paramCharSequence, paramList, paramBoolean, paramString);
    GMTrace.o(19480495259648L, 145141);
    return paramCharSequence;
  }
  
  /* Error */
  public final boolean aP(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: ldc2_w 106
    //   6: ldc 108
    //   8: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: invokestatic 114	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   14: invokevirtual 120	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   17: astore 5
    //   19: aload 5
    //   21: aload_2
    //   22: invokevirtual 126	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   25: astore_2
    //   26: aload_2
    //   27: ifnonnull +38 -> 65
    //   30: ldc -128
    //   32: ldc -126
    //   34: invokestatic 136	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   37: ldc2_w 106
    //   40: ldc 108
    //   42: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   45: iconst_0
    //   46: ireturn
    //   47: astore_2
    //   48: ldc -128
    //   50: aload_2
    //   51: ldc -118
    //   53: iconst_0
    //   54: anewarray 4	java/lang/Object
    //   57: invokestatic 142	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   60: aconst_null
    //   61: astore_2
    //   62: goto -36 -> 26
    //   65: new 144	java/io/File
    //   68: dup
    //   69: aload_1
    //   70: invokespecial 147	java/io/File:<init>	(Ljava/lang/String;)V
    //   73: astore_1
    //   74: aload_1
    //   75: invokevirtual 151	java/io/File:exists	()Z
    //   78: ifeq +8 -> 86
    //   81: aload_1
    //   82: invokevirtual 154	java/io/File:delete	()Z
    //   85: pop
    //   86: aload_1
    //   87: invokevirtual 158	java/io/File:getParentFile	()Ljava/io/File;
    //   90: invokevirtual 161	java/io/File:mkdirs	()Z
    //   93: pop
    //   94: new 163	java/io/FileOutputStream
    //   97: dup
    //   98: aload_1
    //   99: invokespecial 166	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   102: astore_1
    //   103: aload_1
    //   104: ifnull +116 -> 220
    //   107: sipush 1024
    //   110: newarray <illegal type>
    //   112: astore 4
    //   114: aload_2
    //   115: aload 4
    //   117: invokevirtual 172	java/io/InputStream:read	([B)I
    //   120: istore_3
    //   121: iload_3
    //   122: iconst_m1
    //   123: if_icmpeq +66 -> 189
    //   126: aload_1
    //   127: aload 4
    //   129: iconst_0
    //   130: iload_3
    //   131: invokevirtual 178	java/io/OutputStream:write	([BII)V
    //   134: goto -20 -> 114
    //   137: astore 4
    //   139: ldc -128
    //   141: aload 4
    //   143: ldc -118
    //   145: iconst_0
    //   146: anewarray 4	java/lang/Object
    //   149: invokestatic 142	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   152: aload_2
    //   153: invokestatic 184	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   156: aload_1
    //   157: invokestatic 187	com/tencent/mm/a/e:a	(Ljava/io/OutputStream;)V
    //   160: ldc2_w 106
    //   163: ldc 108
    //   165: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   168: iconst_0
    //   169: ireturn
    //   170: astore_1
    //   171: ldc -128
    //   173: aload_1
    //   174: ldc -118
    //   176: iconst_0
    //   177: anewarray 4	java/lang/Object
    //   180: invokestatic 142	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   183: aload 4
    //   185: astore_1
    //   186: goto -83 -> 103
    //   189: aload_2
    //   190: invokestatic 184	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   193: aload_1
    //   194: invokestatic 187	com/tencent/mm/a/e:a	(Ljava/io/OutputStream;)V
    //   197: ldc2_w 106
    //   200: ldc 108
    //   202: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   205: iconst_1
    //   206: ireturn
    //   207: astore 4
    //   209: aload_2
    //   210: invokestatic 184	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   213: aload_1
    //   214: invokestatic 187	com/tencent/mm/a/e:a	(Ljava/io/OutputStream;)V
    //   217: aload 4
    //   219: athrow
    //   220: aload_2
    //   221: invokestatic 184	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   224: ldc2_w 106
    //   227: ldc 108
    //   229: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   232: iconst_0
    //   233: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	234	0	this	d
    //   0	234	1	paramString1	String
    //   0	234	2	paramString2	String
    //   120	11	3	i	int
    //   1	127	4	arrayOfByte	byte[]
    //   137	47	4	localIOException	java.io.IOException
    //   207	11	4	localObject	Object
    //   17	3	5	localAssetManager	android.content.res.AssetManager
    // Exception table:
    //   from	to	target	type
    //   19	26	47	java/io/IOException
    //   107	114	137	java/io/IOException
    //   114	121	137	java/io/IOException
    //   126	134	137	java/io/IOException
    //   94	103	170	java/io/FileNotFoundException
    //   107	114	207	finally
    //   114	121	207	finally
    //   126	134	207	finally
    //   139	152	207	finally
  }
  
  public final String n(Map<String, String> paramMap)
  {
    GMTrace.i(10665745973248L, 79466);
    paramMap = r.n(paramMap);
    GMTrace.o(10665745973248L, 79466);
    return paramMap;
  }
  
  public final Properties n(File paramFile)
  {
    GMTrace.i(19480361041920L, 145140);
    paramFile = r.n(paramFile);
    GMTrace.o(19480361041920L, 145140);
    return paramFile;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\j\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */