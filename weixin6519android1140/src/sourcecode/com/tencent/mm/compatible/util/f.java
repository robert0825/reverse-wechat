package com.tencent.mm.compatible.util;

import android.os.Build.VERSION;
import android.os.StatFs;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class f
{
  /* Error */
  public static boolean L(long paramLong)
  {
    // Byte code:
    //   0: ldc2_w 9
    //   3: ldc 11
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: invokestatic 21	com/tencent/mm/compatible/util/f:ty	()Z
    //   11: ifne +20 -> 31
    //   14: ldc 23
    //   16: ldc 25
    //   18: invokestatic 30	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: ldc2_w 9
    //   24: ldc 11
    //   26: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   29: iconst_0
    //   30: ireturn
    //   31: new 35	android/os/StatFs
    //   34: dup
    //   35: getstatic 41	com/tencent/mm/compatible/util/e:ghx	Ljava/lang/String;
    //   38: invokespecial 45	android/os/StatFs:<init>	(Ljava/lang/String;)V
    //   41: astore 8
    //   43: aload 8
    //   45: invokevirtual 49	android/os/StatFs:getBlockCount	()I
    //   48: istore_2
    //   49: iload_2
    //   50: i2l
    //   51: lstore_3
    //   52: aload 8
    //   54: invokevirtual 52	android/os/StatFs:getAvailableBlocks	()I
    //   57: istore_2
    //   58: iload_2
    //   59: i2l
    //   60: lstore 5
    //   62: aload 8
    //   64: ifnonnull +42 -> 106
    //   67: ldc2_w 9
    //   70: ldc 11
    //   72: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   75: iconst_0
    //   76: ireturn
    //   77: astore 7
    //   79: aconst_null
    //   80: astore 8
    //   82: lconst_0
    //   83: lstore_3
    //   84: ldc 23
    //   86: ldc 54
    //   88: iconst_1
    //   89: anewarray 4	java/lang/Object
    //   92: dup
    //   93: iconst_0
    //   94: aload 7
    //   96: aastore
    //   97: invokestatic 58	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   100: lconst_0
    //   101: lstore 5
    //   103: goto -41 -> 62
    //   106: lload_3
    //   107: lconst_0
    //   108: lcmp
    //   109: ifgt +13 -> 122
    //   112: ldc2_w 9
    //   115: ldc 11
    //   117: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   120: iconst_0
    //   121: ireturn
    //   122: lload_3
    //   123: lload 5
    //   125: lsub
    //   126: lconst_0
    //   127: lcmp
    //   128: ifge +13 -> 141
    //   131: ldc2_w 9
    //   134: ldc 11
    //   136: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   139: iconst_0
    //   140: ireturn
    //   141: aload 8
    //   143: invokevirtual 61	android/os/StatFs:getBlockSize	()I
    //   146: i2l
    //   147: lstore_3
    //   148: aload 8
    //   150: invokevirtual 64	android/os/StatFs:getFreeBlocks	()I
    //   153: i2l
    //   154: lload_3
    //   155: lmul
    //   156: lload_0
    //   157: lcmp
    //   158: ifge +39 -> 197
    //   161: ldc 23
    //   163: new 66	java/lang/StringBuilder
    //   166: dup
    //   167: ldc 68
    //   169: invokespecial 69	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   172: lload_0
    //   173: invokevirtual 73	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   176: ldc 75
    //   178: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   184: invokestatic 30	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   187: ldc2_w 9
    //   190: ldc 11
    //   192: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   195: iconst_0
    //   196: ireturn
    //   197: ldc2_w 9
    //   200: ldc 11
    //   202: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   205: iconst_1
    //   206: ireturn
    //   207: astore 7
    //   209: lconst_0
    //   210: lstore_3
    //   211: goto -127 -> 84
    //   214: astore 7
    //   216: goto -132 -> 84
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	219	0	paramLong	long
    //   48	11	2	i	int
    //   51	160	3	l1	long
    //   60	64	5	l2	long
    //   77	18	7	localException1	Exception
    //   207	1	7	localException2	Exception
    //   214	1	7	localException3	Exception
    //   41	108	8	localStatFs	StatFs
    // Exception table:
    //   from	to	target	type
    //   31	43	77	java/lang/Exception
    //   43	49	207	java/lang/Exception
    //   52	58	214	java/lang/Exception
  }
  
  public static boolean et(int paramInt)
  {
    GMTrace.i(13786442366976L, 102717);
    if (Build.VERSION.SDK_INT >= paramInt)
    {
      GMTrace.o(13786442366976L, 102717);
      return true;
    }
    GMTrace.o(13786442366976L, 102717);
    return false;
  }
  
  public static boolean eu(int paramInt)
  {
    GMTrace.i(13786576584704L, 102718);
    if (Build.VERSION.SDK_INT < paramInt)
    {
      GMTrace.o(13786576584704L, 102718);
      return true;
    }
    GMTrace.o(13786576584704L, 102718);
    return false;
  }
  
  public static boolean ty()
  {
    GMTrace.i(13786710802432L, 102719);
    String str = h.getExternalStorageDirectory().getAbsolutePath();
    if (e.ghx.equalsIgnoreCase(str)) {
      try
      {
        if ((h.getExternalStorageState().equals("mounted")) && (new File(h.getExternalStorageDirectory().getAbsolutePath()).canWrite()))
        {
          GMTrace.o(13786710802432L, 102719);
          return true;
        }
        GMTrace.o(13786710802432L, 102719);
        return false;
      }
      catch (Exception localException1)
      {
        w.w("MicroMsg.CUtil", "summer isSDCardAvail 1 e: " + localException1.getMessage() + " SDCARD_ROOT: " + e.ghx);
        GMTrace.o(13786710802432L, 102719);
        return false;
      }
    }
    try
    {
      boolean bool = new File(e.ghx).canWrite();
      GMTrace.o(13786710802432L, 102719);
      return bool;
    }
    catch (Exception localException2)
    {
      w.w("MicroMsg.CUtil", "summer isSDCardAvail 1 e: " + localException2.getMessage() + " SDCARD_ROOT: " + e.ghx);
      GMTrace.o(13786710802432L, 102719);
    }
    return false;
  }
  
  public static boolean tz()
  {
    GMTrace.i(13786845020160L, 102720);
    if (!ty())
    {
      GMTrace.o(13786845020160L, 102720);
      return false;
    }
    l2 = 0L;
    long l4 = 0L;
    for (;;)
    {
      try
      {
        StatFs localStatFs = new StatFs(e.ghx);
        l1 = l4;
      }
      catch (Exception localException1)
      {
        try
        {
          l3 = localStatFs.getBlockCount();
          l1 = l4;
          l2 = l3;
          l4 = localStatFs.getAvailableBlocks();
          l1 = l4;
          l2 = l3;
          i = localStatFs.getBlockSize();
          l2 = i;
          l1 = l3;
          l3 = l4;
          if (localStatFs != null) {
            break;
          }
          GMTrace.o(13786845020160L, 102720);
          return false;
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            int i;
            long l3 = l1;
            long l1 = l2;
          }
        }
        localException1 = localException1;
        localStatFs = null;
        l1 = l2;
        l3 = l4;
      }
      tmp122_119[0] = localException1;
      w.e("MicroMsg.CUtil", "checkSDCardFull", tmp122_119);
      l2 = 0L;
    }
    if (l1 <= 0L)
    {
      GMTrace.o(13786845020160L, 102720);
      return false;
    }
    if (l1 - l3 < 0L)
    {
      GMTrace.o(13786845020160L, 102720);
      return false;
    }
    i = (int)((l1 - l3) * 100L / l1);
    l4 = l2 * l3;
    w.i("MicroMsg.CUtil", "checkSDCardFull blockCount: %d, availCount: %d, blockSize: %d, totalSize: %d, availSize: %d, used percent: %d", new Object[] { Long.valueOf(l1), Long.valueOf(l3), Long.valueOf(l2), Long.valueOf(l2 * l1), Long.valueOf(l4), Integer.valueOf(i) });
    if (95 > i)
    {
      GMTrace.o(13786845020160L, 102720);
      return false;
    }
    if (l4 > 314572800L)
    {
      GMTrace.o(13786845020160L, 102720);
      return false;
    }
    w.i("MicroMsg.CUtil", "checkSDCardFull is full!");
    GMTrace.o(13786845020160L, 102720);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\util\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */