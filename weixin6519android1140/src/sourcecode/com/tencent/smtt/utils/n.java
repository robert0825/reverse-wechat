package com.tencent.smtt.utils;

import android.content.Context;
import android.provider.Settings.System;

public final class n
{
  private static Context mContext = null;
  private static n xYL = null;
  
  /* Error */
  static void Yo(String paramString)
  {
    // Byte code:
    //   0: invokestatic 30	com/tencent/smtt/utils/f:cpf	()Z
    //   3: ifne +4 -> 7
    //   6: return
    //   7: aconst_null
    //   8: astore_2
    //   9: new 32	java/io/File
    //   12: dup
    //   13: invokestatic 36	com/tencent/smtt/utils/f:cpg	()Ljava/io/File;
    //   16: ldc 38
    //   18: invokespecial 41	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   21: astore_1
    //   22: aload_1
    //   23: invokevirtual 44	java/io/File:exists	()Z
    //   26: ifne +8 -> 34
    //   29: aload_1
    //   30: invokevirtual 47	java/io/File:createNewFile	()Z
    //   33: pop
    //   34: new 49	java/io/DataOutputStream
    //   37: dup
    //   38: new 51	java/io/BufferedOutputStream
    //   41: dup
    //   42: aload_1
    //   43: invokestatic 55	com/tencent/smtt/utils/f:Q	(Ljava/io/File;)Ljava/io/FileOutputStream;
    //   46: invokespecial 58	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   49: invokespecial 59	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   52: astore_1
    //   53: aload_1
    //   54: aload_0
    //   55: invokevirtual 62	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   58: aload_1
    //   59: invokevirtual 65	java/io/DataOutputStream:flush	()V
    //   62: aload_1
    //   63: invokevirtual 68	java/io/DataOutputStream:close	()V
    //   66: return
    //   67: astore_0
    //   68: return
    //   69: astore_0
    //   70: aconst_null
    //   71: astore_1
    //   72: aload_1
    //   73: ifnull +7 -> 80
    //   76: aload_1
    //   77: invokevirtual 68	java/io/DataOutputStream:close	()V
    //   80: aload_0
    //   81: athrow
    //   82: astore_0
    //   83: aload_2
    //   84: astore_0
    //   85: aload_0
    //   86: ifnull -80 -> 6
    //   89: aload_0
    //   90: invokevirtual 68	java/io/DataOutputStream:close	()V
    //   93: return
    //   94: astore_0
    //   95: return
    //   96: astore_1
    //   97: goto -17 -> 80
    //   100: astore_0
    //   101: goto -29 -> 72
    //   104: astore_0
    //   105: aload_1
    //   106: astore_0
    //   107: goto -22 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	paramString	String
    //   21	56	1	localObject1	Object
    //   96	10	1	localIOException	java.io.IOException
    //   8	76	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   62	66	67	java/io/IOException
    //   9	34	69	finally
    //   34	53	69	finally
    //   9	34	82	java/lang/Exception
    //   34	53	82	java/lang/Exception
    //   89	93	94	java/io/IOException
    //   76	80	96	java/io/IOException
    //   53	62	100	finally
    //   53	62	104	java/lang/Exception
  }
  
  static void Yp(String paramString)
  {
    try
    {
      Settings.System.putString(mContext.getContentResolver(), "sys_setting_tbs_qb_installer", paramString);
      return;
    }
    catch (Exception paramString) {}
  }
  
  public static n hw(Context paramContext)
  {
    mContext = paramContext.getApplicationContext();
    if (xYL == null) {
      xYL = new n();
    }
    return xYL;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\utils\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */