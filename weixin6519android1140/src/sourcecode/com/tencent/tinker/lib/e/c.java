package com.tencent.tinker.lib.e;

import android.content.Context;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import java.io.File;
import java.io.IOException;

public final class c
{
  private static c ygU;
  private Context context = null;
  public boolean ygV = true;
  public File ygW = null;
  public File ygX = null;
  public int ygY = 5;
  
  private c(Context paramContext)
  {
    this.context = paramContext;
    this.ygW = new File(SharePatchFileUtil.hZ(paramContext), "patch.retry");
    this.ygX = new File(SharePatchFileUtil.hZ(paramContext), "temp.apk");
  }
  
  public static c hV(Context paramContext)
  {
    if (ygU == null) {
      ygU = new c(paramContext);
    }
    return ygU;
  }
  
  public final void V(File paramFile)
  {
    if (paramFile.getAbsolutePath().equals(this.ygX.getAbsolutePath())) {
      return;
    }
    a.w("Tinker.UpgradePatchRetry", "try copy file: %s to %s", new Object[] { paramFile.getAbsolutePath(), this.ygX.getAbsolutePath() });
    try
    {
      SharePatchFileUtil.l(paramFile, this.ygX);
      return;
    }
    catch (IOException localIOException)
    {
      a.e("Tinker.UpgradePatchRetry", "fail to copy file: %s to %s", new Object[] { paramFile.getAbsolutePath(), this.ygX.getAbsolutePath() });
    }
  }
  
  public final boolean YC(String paramString)
  {
    if (!this.ygV) {
      a.w("Tinker.UpgradePatchRetry", "onPatchListenerCheck retry disabled, just return", new Object[0]);
    }
    int i;
    do
    {
      a locala;
      do
      {
        return true;
        if (!this.ygW.exists())
        {
          a.w("Tinker.UpgradePatchRetry", "onPatchListenerCheck retry file is not exist, just return", new Object[0]);
          return true;
        }
        if (paramString == null)
        {
          a.w("Tinker.UpgradePatchRetry", "onPatchListenerCheck md5 is null, just return", new Object[0]);
          return true;
        }
        locala = a.W(this.ygW);
      } while (!paramString.equals(locala.eDW));
      i = Integer.parseInt(locala.ygZ);
    } while (i < this.ygY);
    a.w("Tinker.UpgradePatchRetry", "onPatchListenerCheck, retry count %d must exceed than max retry count", new Object[] { Integer.valueOf(i) });
    SharePatchFileUtil.ab(this.ygX);
    return false;
  }
  
  public final boolean cqJ()
  {
    if (!this.ygV)
    {
      a.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad retry disabled, just return", new Object[0]);
      return false;
    }
    if (!com.tencent.tinker.lib.d.a.hQ(this.context).qoU)
    {
      a.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad retry is not main process, just return", new Object[0]);
      return false;
    }
    if (!this.ygW.exists())
    {
      a.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad retry info not exist, just return", new Object[0]);
      return false;
    }
    if (b.hS(this.context))
    {
      a.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad tinker service is running, just return", new Object[0]);
      return false;
    }
    String str = this.ygX.getAbsolutePath();
    if ((str == null) || (!new File(str).exists()))
    {
      a.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad patch file: %s is not exist, just return", new Object[] { str });
      return false;
    }
    a.w("Tinker.UpgradePatchRetry", "onPatchRetryLoad patch file: %s is exist, retry to patch", new Object[] { str });
    com.tencent.tinker.lib.d.c.bM(this.context, str);
    return true;
  }
  
  public static final class a
  {
    public String eDW;
    public String ygZ;
    
    public a(String paramString1, String paramString2)
    {
      this.eDW = paramString1;
      this.ygZ = paramString2;
    }
    
    /* Error */
    public static a W(File paramFile)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 4
      //   3: new 26	java/util/Properties
      //   6: dup
      //   7: invokespecial 27	java/util/Properties:<init>	()V
      //   10: astore_2
      //   11: new 29	java/io/FileInputStream
      //   14: dup
      //   15: aload_0
      //   16: invokespecial 32	java/io/FileInputStream:<init>	(Ljava/io/File;)V
      //   19: astore_3
      //   20: aload_3
      //   21: astore_1
      //   22: aload_2
      //   23: aload_3
      //   24: invokevirtual 36	java/util/Properties:load	(Ljava/io/InputStream;)V
      //   27: aload_3
      //   28: astore_1
      //   29: aload_2
      //   30: ldc 38
      //   32: invokevirtual 42	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
      //   35: astore_0
      //   36: aload_3
      //   37: astore_1
      //   38: aload_2
      //   39: ldc 44
      //   41: invokevirtual 42	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
      //   44: astore_2
      //   45: aload_2
      //   46: astore_1
      //   47: aload_3
      //   48: invokestatic 50	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
      //   51: new 2	com/tencent/tinker/lib/e/c$a
      //   54: dup
      //   55: aload_0
      //   56: aload_1
      //   57: invokespecial 52	com/tencent/tinker/lib/e/c$a:<init>	(Ljava/lang/String;Ljava/lang/String;)V
      //   60: areturn
      //   61: astore_2
      //   62: aconst_null
      //   63: astore_3
      //   64: aconst_null
      //   65: astore_0
      //   66: aload_3
      //   67: astore_1
      //   68: ldc 54
      //   70: new 56	java/lang/StringBuilder
      //   73: dup
      //   74: ldc 58
      //   76: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   79: aload_2
      //   80: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   83: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   86: iconst_0
      //   87: anewarray 4	java/lang/Object
      //   90: invokestatic 75	com/tencent/tinker/lib/e/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   93: aload_3
      //   94: invokestatic 50	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
      //   97: aload 4
      //   99: astore_1
      //   100: goto -49 -> 51
      //   103: astore_0
      //   104: aconst_null
      //   105: astore_1
      //   106: aload_1
      //   107: invokestatic 50	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
      //   110: aload_0
      //   111: athrow
      //   112: astore_0
      //   113: goto -7 -> 106
      //   116: astore_2
      //   117: aconst_null
      //   118: astore_0
      //   119: goto -53 -> 66
      //   122: astore_2
      //   123: goto -57 -> 66
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	126	0	paramFile	File
      //   21	86	1	localObject1	Object
      //   10	36	2	localObject2	Object
      //   61	19	2	localIOException1	IOException
      //   116	1	2	localIOException2	IOException
      //   122	1	2	localIOException3	IOException
      //   19	75	3	localFileInputStream	java.io.FileInputStream
      //   1	97	4	localObject3	Object
      // Exception table:
      //   from	to	target	type
      //   11	20	61	java/io/IOException
      //   11	20	103	finally
      //   22	27	112	finally
      //   29	36	112	finally
      //   38	45	112	finally
      //   68	93	112	finally
      //   22	27	116	java/io/IOException
      //   29	36	116	java/io/IOException
      //   38	45	122	java/io/IOException
    }
    
    /* Error */
    public static void a(File paramFile, a parama)
    {
      // Byte code:
      //   0: aload_1
      //   1: ifnonnull +4 -> 5
      //   4: return
      //   5: aload_0
      //   6: invokevirtual 84	java/io/File:getParentFile	()Ljava/io/File;
      //   9: astore_2
      //   10: aload_2
      //   11: invokevirtual 88	java/io/File:exists	()Z
      //   14: ifne +8 -> 22
      //   17: aload_2
      //   18: invokevirtual 91	java/io/File:mkdirs	()Z
      //   21: pop
      //   22: new 26	java/util/Properties
      //   25: dup
      //   26: invokespecial 27	java/util/Properties:<init>	()V
      //   29: astore_2
      //   30: aload_2
      //   31: ldc 38
      //   33: aload_1
      //   34: getfield 17	com/tencent/tinker/lib/e/c$a:eDW	Ljava/lang/String;
      //   37: invokevirtual 95	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   40: pop
      //   41: aload_2
      //   42: ldc 44
      //   44: aload_1
      //   45: getfield 19	com/tencent/tinker/lib/e/c$a:ygZ	Ljava/lang/String;
      //   48: invokevirtual 95	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   51: pop
      //   52: new 97	java/io/FileOutputStream
      //   55: dup
      //   56: aload_0
      //   57: iconst_0
      //   58: invokespecial 100	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
      //   61: astore_1
      //   62: aload_1
      //   63: astore_0
      //   64: aload_2
      //   65: aload_1
      //   66: aconst_null
      //   67: invokevirtual 104	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
      //   70: aload_1
      //   71: invokestatic 50	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
      //   74: return
      //   75: astore_2
      //   76: aconst_null
      //   77: astore_1
      //   78: aload_1
      //   79: astore_0
      //   80: ldc 54
      //   82: aload_2
      //   83: ldc 106
      //   85: iconst_0
      //   86: anewarray 4	java/lang/Object
      //   89: invokestatic 110	com/tencent/tinker/lib/e/a:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   92: aload_1
      //   93: invokestatic 50	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
      //   96: return
      //   97: astore_1
      //   98: aconst_null
      //   99: astore_0
      //   100: aload_0
      //   101: invokestatic 50	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
      //   104: aload_1
      //   105: athrow
      //   106: astore_1
      //   107: goto -7 -> 100
      //   110: astore_2
      //   111: goto -33 -> 78
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	114	0	paramFile	File
      //   0	114	1	parama	a
      //   9	56	2	localObject	Object
      //   75	8	2	localException1	Exception
      //   110	1	2	localException2	Exception
      // Exception table:
      //   from	to	target	type
      //   52	62	75	java/lang/Exception
      //   52	62	97	finally
      //   64	70	106	finally
      //   80	92	106	finally
      //   64	70	110	java/lang/Exception
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\lib\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */