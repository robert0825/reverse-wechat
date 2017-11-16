package com.tencent.smtt.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.smtt.sdk.a.c;
import java.io.File;
import java.util.Map;

public final class m
{
  private static m xYJ = null;
  private Handler mHandler = null;
  
  /* Error */
  private static Map<String, String> Yn(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 39	java/lang/String:length	()I
    //   4: ifgt +7 -> 11
    //   7: aconst_null
    //   8: astore_0
    //   9: aload_0
    //   10: areturn
    //   11: new 41	java/util/HashMap
    //   14: dup
    //   15: invokespecial 42	java/util/HashMap:<init>	()V
    //   18: astore_3
    //   19: aload_0
    //   20: ldc 44
    //   22: invokevirtual 48	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   25: astore 4
    //   27: aload 4
    //   29: arraylength
    //   30: istore_2
    //   31: iconst_0
    //   32: istore_1
    //   33: aload_3
    //   34: astore_0
    //   35: iload_1
    //   36: iload_2
    //   37: if_icmpge -28 -> 9
    //   40: aload 4
    //   42: iload_1
    //   43: aaload
    //   44: astore_0
    //   45: aload_0
    //   46: ifnull +66 -> 112
    //   49: aload_0
    //   50: invokevirtual 39	java/lang/String:length	()I
    //   53: ifle +59 -> 112
    //   56: aload_0
    //   57: invokevirtual 52	java/lang/String:trim	()Ljava/lang/String;
    //   60: ldc 54
    //   62: iconst_2
    //   63: invokevirtual 57	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   66: astore 5
    //   68: aload 5
    //   70: ifnull +42 -> 112
    //   73: aload 5
    //   75: arraylength
    //   76: iconst_2
    //   77: if_icmplt +35 -> 112
    //   80: aload 5
    //   82: iconst_0
    //   83: aaload
    //   84: astore_0
    //   85: aload 5
    //   87: iconst_1
    //   88: aaload
    //   89: astore 5
    //   91: aload_0
    //   92: ifnull +20 -> 112
    //   95: aload_0
    //   96: invokevirtual 39	java/lang/String:length	()I
    //   99: ifle +13 -> 112
    //   102: aload_3
    //   103: aload_0
    //   104: aload 5
    //   106: invokeinterface 63 3 0
    //   111: pop
    //   112: iload_1
    //   113: iconst_1
    //   114: iadd
    //   115: istore_1
    //   116: goto -83 -> 33
    //   119: astore_0
    //   120: aconst_null
    //   121: areturn
    //   122: astore_0
    //   123: aload_3
    //   124: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	paramString	String
    //   32	84	1	i	int
    //   30	8	2	j	int
    //   18	106	3	localHashMap	java.util.HashMap
    //   25	16	4	arrayOfString	String[]
    //   66	39	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   11	19	119	java/lang/Throwable
    //   19	31	122	java/lang/Throwable
    //   49	68	122	java/lang/Throwable
    //   73	80	122	java/lang/Throwable
    //   95	112	122	java/lang/Throwable
  }
  
  public static void bJ(Context paramContext, String paramString)
  {
    if ((paramContext != null) && (paramString != null) && (paramString.length() > 0)) {
      c.a(paramContext, paramString, null, null);
    }
  }
  
  public static void bK(Context paramContext, String paramString)
  {
    if ((paramContext != null) && (paramString != null) && (paramString.length() > 0))
    {
      paramString = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      paramString.addFlags(268435456);
      paramContext.startActivity(paramString);
    }
  }
  
  public static m cpo()
  {
    if (xYJ == null) {
      xYJ = new m();
    }
    return xYJ;
  }
  
  /* Error */
  private static Map<String, String> cpp()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 107	java/io/File
    //   5: dup
    //   6: ldc 109
    //   8: invokespecial 112	java/io/File:<init>	(Ljava/lang/String;)V
    //   11: astore_2
    //   12: aload_2
    //   13: astore_0
    //   14: aload_2
    //   15: invokevirtual 116	java/io/File:exists	()Z
    //   18: ifne +13 -> 31
    //   21: new 107	java/io/File
    //   24: dup
    //   25: ldc 118
    //   27: invokespecial 112	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: astore_0
    //   31: aload_0
    //   32: invokevirtual 116	java/io/File:exists	()Z
    //   35: ifne +143 -> 178
    //   38: new 107	java/io/File
    //   41: dup
    //   42: ldc 120
    //   44: invokespecial 112	java/io/File:<init>	(Ljava/lang/String;)V
    //   47: astore_0
    //   48: aload_0
    //   49: invokevirtual 116	java/io/File:exists	()Z
    //   52: ifeq +118 -> 170
    //   55: new 122	java/io/FileInputStream
    //   58: dup
    //   59: aload_0
    //   60: invokespecial 125	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   63: astore_0
    //   64: aload_0
    //   65: invokestatic 131	com/tencent/smtt/utils/f:q	(Ljava/io/InputStream;)[B
    //   68: astore_1
    //   69: aload_1
    //   70: ifnull +90 -> 160
    //   73: new 35	java/lang/String
    //   76: dup
    //   77: aload_1
    //   78: ldc -123
    //   80: invokespecial 136	java/lang/String:<init>	([BLjava/lang/String;)V
    //   83: astore_2
    //   84: aload_0
    //   85: astore_1
    //   86: aload_2
    //   87: astore_0
    //   88: aload_0
    //   89: astore_2
    //   90: aload_1
    //   91: ifnull +9 -> 100
    //   94: aload_1
    //   95: invokevirtual 139	java/io/FileInputStream:close	()V
    //   98: aload_0
    //   99: astore_2
    //   100: aload_2
    //   101: invokestatic 141	com/tencent/smtt/utils/m:Yn	(Ljava/lang/String;)Ljava/util/Map;
    //   104: areturn
    //   105: astore_1
    //   106: aconst_null
    //   107: astore_0
    //   108: aload_0
    //   109: ifnull +7 -> 116
    //   112: aload_0
    //   113: invokevirtual 139	java/io/FileInputStream:close	()V
    //   116: aload_1
    //   117: athrow
    //   118: astore_0
    //   119: aload_1
    //   120: astore_0
    //   121: aload_0
    //   122: ifnull +7 -> 129
    //   125: aload_0
    //   126: invokevirtual 139	java/io/FileInputStream:close	()V
    //   129: ldc -113
    //   131: astore_2
    //   132: goto -32 -> 100
    //   135: astore_0
    //   136: ldc -113
    //   138: astore_2
    //   139: goto -39 -> 100
    //   142: astore_1
    //   143: aload_0
    //   144: astore_2
    //   145: goto -45 -> 100
    //   148: astore_0
    //   149: goto -33 -> 116
    //   152: astore_1
    //   153: goto -45 -> 108
    //   156: astore_1
    //   157: goto -36 -> 121
    //   160: ldc -113
    //   162: astore_2
    //   163: aload_0
    //   164: astore_1
    //   165: aload_2
    //   166: astore_0
    //   167: goto -79 -> 88
    //   170: aconst_null
    //   171: astore_1
    //   172: ldc -113
    //   174: astore_0
    //   175: goto -87 -> 88
    //   178: goto -130 -> 48
    // Local variable table:
    //   start	length	slot	name	signature
    //   13	100	0	localObject1	Object
    //   118	1	0	localThrowable1	Throwable
    //   120	6	0	localObject2	Object
    //   135	9	0	localIOException1	java.io.IOException
    //   148	16	0	localIOException2	java.io.IOException
    //   166	9	0	localObject3	Object
    //   1	94	1	localObject4	Object
    //   105	15	1	localObject5	Object
    //   142	1	1	localIOException3	java.io.IOException
    //   152	1	1	localObject6	Object
    //   156	1	1	localThrowable2	Throwable
    //   164	8	1	localObject7	Object
    //   11	155	2	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   2	12	105	finally
    //   14	31	105	finally
    //   31	48	105	finally
    //   48	64	105	finally
    //   2	12	118	java/lang/Throwable
    //   14	31	118	java/lang/Throwable
    //   31	48	118	java/lang/Throwable
    //   48	64	118	java/lang/Throwable
    //   125	129	135	java/io/IOException
    //   94	98	142	java/io/IOException
    //   112	116	148	java/io/IOException
    //   64	69	152	finally
    //   73	84	152	finally
    //   64	69	156	java/lang/Throwable
    //   73	84	156	java/lang/Throwable
  }
  
  private static PackageInfo m(String paramString, Context paramContext)
  {
    if ((paramContext == null) || (TextUtils.isEmpty(paramString))) {
      return null;
    }
    try
    {
      paramString = paramContext.getPackageManager().getPackageInfo(paramString, 128);
      return paramString;
    }
    catch (Throwable paramString) {}
    return null;
  }
  
  public final boolean bI(Context paramContext, String paramString)
  {
    if (paramString != null) {}
    for (;;)
    {
      try
      {
        if (paramString.startsWith("tbsqbdownload://"))
        {
          Object localObject1 = paramString.substring(16).split(",");
          if (localObject1.length > 1)
          {
            paramString = localObject1[0].split("=");
            if ((paramString.length > 1) && ("url".equalsIgnoreCase(paramString[0])))
            {
              paramString = localObject1[0].substring(4);
              Object localObject2 = localObject1[1].split("=");
              if ((localObject2.length > 1) && ("downloadurl".equalsIgnoreCase(localObject2[0])))
              {
                localObject2 = localObject1[1].substring(12);
                localObject1 = paramString;
                paramString = (String)localObject2;
                continue;
                if (m("com.tencent.mtt", paramContext) != null)
                {
                  i = 2;
                  if (i == 2)
                  {
                    paramString = new Message();
                    paramString.what = 0;
                    paramString.obj = new Object[] { paramContext, localObject1 };
                    this.mHandler.sendMessage(paramString);
                    return true;
                  }
                }
                else
                {
                  if (TextUtils.isEmpty(cpq())) {
                    break label308;
                  }
                  i = 1;
                  continue;
                }
                if (i == 1)
                {
                  paramString = new Message();
                  paramString.what = 1;
                  paramString.obj = new Object[] { paramContext };
                  this.mHandler.sendMessage(paramString);
                  return true;
                }
                localObject1 = new Message();
                ((Message)localObject1).what = 2;
                ((Message)localObject1).obj = new Object[] { paramContext, paramString };
                this.mHandler.sendMessage((Message)localObject1);
                return true;
              }
              else
              {
                localObject1 = paramString;
                paramString = null;
              }
            }
            else
            {
              paramString = null;
              continue;
            }
          }
          else
          {
            paramString = null;
            localObject1 = null;
          }
          if ((localObject1 != null) && (paramString != null)) {
            continue;
          }
          return false;
        }
      }
      catch (Exception paramContext) {}
      return false;
      label308:
      int i = 0;
    }
  }
  
  final String cpq()
  {
    Object localObject = cpp();
    if ((localObject != null) && (((Map)localObject).size() > 0))
    {
      String str = (String)((Map)localObject).get("FileDownloadPath");
      localObject = (String)((Map)localObject).get("FileDownloadVerifyInfo");
      if (TextUtils.isEmpty(str)) {
        str = "";
      }
      File localFile;
      do
      {
        return str;
        if (TextUtils.isEmpty((CharSequence)localObject)) {
          return "";
        }
        localFile = new File(str);
        if (!localFile.exists()) {
          return "";
        }
      } while (TextUtils.equals(i.bg(localFile.lastModified()), (CharSequence)localObject));
    }
    return "";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\utils\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */