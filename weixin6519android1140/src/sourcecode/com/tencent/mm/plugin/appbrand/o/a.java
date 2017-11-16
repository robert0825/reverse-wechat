package com.tencent.mm.plugin.appbrand.o;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public final class a
{
  /* Error */
  public static String convertStreamToString(InputStream paramInputStream)
  {
    // Byte code:
    //   0: ldc2_w 9
    //   3: ldc 11
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 19	java/io/InputStreamReader
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 23	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   16: astore_2
    //   17: sipush 4096
    //   20: newarray <illegal type>
    //   22: astore_3
    //   23: new 25	java/io/StringWriter
    //   26: dup
    //   27: invokespecial 28	java/io/StringWriter:<init>	()V
    //   30: astore 4
    //   32: aload_2
    //   33: aload_3
    //   34: invokevirtual 32	java/io/InputStreamReader:read	([C)I
    //   37: istore_1
    //   38: iconst_m1
    //   39: iload_1
    //   40: if_icmpeq +52 -> 92
    //   43: aload 4
    //   45: aload_3
    //   46: iconst_0
    //   47: iload_1
    //   48: invokevirtual 36	java/io/StringWriter:write	([CII)V
    //   51: goto -19 -> 32
    //   54: astore_3
    //   55: ldc 38
    //   57: ldc 40
    //   59: iconst_1
    //   60: anewarray 4	java/lang/Object
    //   63: dup
    //   64: iconst_0
    //   65: aload_3
    //   66: invokevirtual 44	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   69: aastore
    //   70: invokestatic 50	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: aload_2
    //   74: invokestatic 56	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   77: aload_0
    //   78: invokestatic 56	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   81: ldc2_w 9
    //   84: ldc 11
    //   86: invokestatic 59	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   89: ldc 61
    //   91: areturn
    //   92: aload_2
    //   93: invokestatic 56	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   96: aload_0
    //   97: invokestatic 56	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   100: aload 4
    //   102: invokevirtual 64	java/io/StringWriter:toString	()Ljava/lang/String;
    //   105: astore_0
    //   106: ldc2_w 9
    //   109: ldc 11
    //   111: invokestatic 59	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   114: aload_0
    //   115: areturn
    //   116: astore_3
    //   117: aload_2
    //   118: invokestatic 56	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   121: aload_0
    //   122: invokestatic 56	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   125: aload_3
    //   126: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	paramInputStream	InputStream
    //   37	11	1	i	int
    //   16	102	2	localInputStreamReader	java.io.InputStreamReader
    //   22	24	3	arrayOfChar	char[]
    //   54	12	3	localException	Exception
    //   116	10	3	localObject	Object
    //   30	71	4	localStringWriter	java.io.StringWriter
    // Exception table:
    //   from	to	target	type
    //   32	38	54	java/lang/Exception
    //   43	51	54	java/lang/Exception
    //   32	38	116	finally
    //   43	51	116	finally
    //   55	73	116	finally
  }
  
  public static byte[] j(InputStream paramInputStream)
  {
    GMTrace.i(18184623095808L, 135486);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte['က'];
    try
    {
      for (;;)
      {
        int i = paramInputStream.read(arrayOfByte, 0, 4096);
        if (i == -1) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      try
      {
        paramInputStream.close();
        throw ((Throwable)localObject);
      }
      catch (Exception paramInputStream)
      {
        for (;;)
        {
          w.e("MicroMsg.AppBrandIOUtil", "close: " + paramInputStream);
        }
      }
    }
    catch (Exception localException)
    {
      localException = localException;
      w.e("MicroMsg.AppBrandIOUtil", "readPkgCertificate: " + localException);
      try
      {
        paramInputStream.close();
        GMTrace.o(18184623095808L, 135486);
        return new byte[0];
        localException.flush();
        try
        {
          paramInputStream.close();
          paramInputStream = localException.toByteArray();
          GMTrace.o(18184623095808L, 135486);
          return paramInputStream;
        }
        catch (Exception paramInputStream)
        {
          for (;;)
          {
            w.e("MicroMsg.AppBrandIOUtil", "close: " + paramInputStream);
          }
        }
      }
      catch (Exception paramInputStream)
      {
        for (;;)
        {
          w.e("MicroMsg.AppBrandIOUtil", "close: " + paramInputStream);
        }
      }
    }
    finally {}
  }
  
  public static String sx(String paramString)
  {
    GMTrace.i(18184488878080L, 135485);
    Object localObject2 = ab.getContext().getAssets();
    Object localObject1 = null;
    try
    {
      localObject2 = ((AssetManager)localObject2).open(paramString);
      paramString = (String)localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrandIOUtil", "openRead file( %s ) failed, exp = %s", new Object[] { paramString, bg.f(localException) });
        paramString = (String)localObject1;
      }
      paramString = convertStreamToString(paramString);
      GMTrace.o(18184488878080L, 135485);
    }
    if (paramString == null)
    {
      GMTrace.o(18184488878080L, 135485);
      return "";
    }
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\o\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */