package com.tencent.mm.compatible.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public final class o
{
  private RandomAccessFile fQr;
  private RandomAccessFile fQs;
  private a fQt;
  private ArrayList<a> fQu;
  private long pid;
  
  public o()
  {
    GMTrace.i(13810333122560L, 102895);
    this.pid = 0L;
    GMTrace.o(13810333122560L, 102895);
  }
  
  public o(long paramLong)
  {
    GMTrace.i(13810467340288L, 102896);
    this.pid = 0L;
    this.pid = paramLong;
    GMTrace.o(13810467340288L, 102896);
  }
  
  /* Error */
  private void sV()
  {
    // Byte code:
    //   0: ldc2_w 44
    //   3: ldc 46
    //   5: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: getfield 48	com/tencent/mm/compatible/d/o:fQs	Ljava/io/RandomAccessFile;
    //   12: ifnull +149 -> 161
    //   15: aload_0
    //   16: getfield 48	com/tencent/mm/compatible/d/o:fQs	Ljava/io/RandomAccessFile;
    //   19: lconst_0
    //   20: invokevirtual 53	java/io/RandomAccessFile:seek	(J)V
    //   23: aload_0
    //   24: getfield 48	com/tencent/mm/compatible/d/o:fQs	Ljava/io/RandomAccessFile;
    //   27: invokevirtual 57	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   30: astore_2
    //   31: aload_0
    //   32: getfield 59	com/tencent/mm/compatible/d/o:fQr	Ljava/io/RandomAccessFile;
    //   35: ifnull +201 -> 236
    //   38: aload_0
    //   39: getfield 59	com/tencent/mm/compatible/d/o:fQr	Ljava/io/RandomAccessFile;
    //   42: lconst_0
    //   43: invokevirtual 53	java/io/RandomAccessFile:seek	(J)V
    //   46: iconst_m1
    //   47: istore_1
    //   48: aload_0
    //   49: getfield 59	com/tencent/mm/compatible/d/o:fQr	Ljava/io/RandomAccessFile;
    //   52: invokevirtual 57	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   55: astore_3
    //   56: aload_3
    //   57: ifnull +218 -> 275
    //   60: aload_3
    //   61: invokevirtual 65	java/lang/String:length	()I
    //   64: ifle +211 -> 275
    //   67: aload_3
    //   68: ldc 67
    //   70: invokevirtual 71	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   73: astore 4
    //   75: aload 4
    //   77: iconst_0
    //   78: aaload
    //   79: ldc 73
    //   81: invokevirtual 77	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   84: iconst_m1
    //   85: if_icmpeq +41 -> 126
    //   88: iload_1
    //   89: iconst_m1
    //   90: if_icmpne +76 -> 166
    //   93: aload_0
    //   94: getfield 79	com/tencent/mm/compatible/d/o:fQt	Lcom/tencent/mm/compatible/d/o$a;
    //   97: ifnonnull +19 -> 116
    //   100: aload_0
    //   101: new 6	com/tencent/mm/compatible/d/o$a
    //   104: dup
    //   105: aload_0
    //   106: aload_0
    //   107: getfield 32	com/tencent/mm/compatible/d/o:pid	J
    //   110: invokespecial 82	com/tencent/mm/compatible/d/o$a:<init>	(Lcom/tencent/mm/compatible/d/o;J)V
    //   113: putfield 79	com/tencent/mm/compatible/d/o:fQt	Lcom/tencent/mm/compatible/d/o$a;
    //   116: aload_0
    //   117: getfield 79	com/tencent/mm/compatible/d/o:fQt	Lcom/tencent/mm/compatible/d/o$a;
    //   120: aload 4
    //   122: aload_2
    //   123: invokevirtual 85	com/tencent/mm/compatible/d/o$a:a	([Ljava/lang/String;Ljava/lang/String;)V
    //   126: aload_3
    //   127: ifnonnull +169 -> 296
    //   130: ldc2_w 44
    //   133: ldc 46
    //   135: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   138: return
    //   139: astore_2
    //   140: ldc 87
    //   142: new 89	java/lang/StringBuilder
    //   145: dup
    //   146: ldc 91
    //   148: invokespecial 94	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   151: aload_2
    //   152: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   155: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   158: invokestatic 107	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   161: aconst_null
    //   162: astore_2
    //   163: goto -132 -> 31
    //   166: aload_0
    //   167: getfield 109	com/tencent/mm/compatible/d/o:fQu	Ljava/util/ArrayList;
    //   170: ifnonnull +14 -> 184
    //   173: aload_0
    //   174: new 111	java/util/ArrayList
    //   177: dup
    //   178: invokespecial 112	java/util/ArrayList:<init>	()V
    //   181: putfield 109	com/tencent/mm/compatible/d/o:fQu	Ljava/util/ArrayList;
    //   184: iload_1
    //   185: aload_0
    //   186: getfield 109	com/tencent/mm/compatible/d/o:fQu	Ljava/util/ArrayList;
    //   189: invokevirtual 115	java/util/ArrayList:size	()I
    //   192: if_icmpge +53 -> 245
    //   195: aload_0
    //   196: getfield 109	com/tencent/mm/compatible/d/o:fQu	Ljava/util/ArrayList;
    //   199: iload_1
    //   200: invokevirtual 119	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   203: checkcast 6	com/tencent/mm/compatible/d/o$a
    //   206: aload 4
    //   208: invokevirtual 122	com/tencent/mm/compatible/d/o$a:e	([Ljava/lang/String;)V
    //   211: goto -85 -> 126
    //   214: astore_2
    //   215: ldc 87
    //   217: new 89	java/lang/StringBuilder
    //   220: dup
    //   221: ldc 124
    //   223: invokespecial 94	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   226: aload_2
    //   227: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   230: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   233: invokestatic 107	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   236: ldc2_w 44
    //   239: ldc 46
    //   241: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   244: return
    //   245: new 6	com/tencent/mm/compatible/d/o$a
    //   248: dup
    //   249: aload_0
    //   250: invokespecial 127	com/tencent/mm/compatible/d/o$a:<init>	(Lcom/tencent/mm/compatible/d/o;)V
    //   253: astore 5
    //   255: aload 5
    //   257: aload 4
    //   259: invokevirtual 122	com/tencent/mm/compatible/d/o$a:e	([Ljava/lang/String;)V
    //   262: aload_0
    //   263: getfield 109	com/tencent/mm/compatible/d/o:fQu	Ljava/util/ArrayList;
    //   266: aload 5
    //   268: invokevirtual 131	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   271: pop
    //   272: goto -146 -> 126
    //   275: ldc 87
    //   277: ldc -123
    //   279: iconst_1
    //   280: anewarray 4	java/lang/Object
    //   283: dup
    //   284: iconst_0
    //   285: iload_1
    //   286: invokestatic 139	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   289: aastore
    //   290: invokestatic 142	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   293: goto -167 -> 126
    //   296: iload_1
    //   297: iconst_1
    //   298: iadd
    //   299: istore_1
    //   300: goto -252 -> 48
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	303	0	this	o
    //   47	253	1	i	int
    //   30	93	2	str1	String
    //   139	13	2	localIOException1	java.io.IOException
    //   162	1	2	localObject	Object
    //   214	13	2	localIOException2	java.io.IOException
    //   55	72	3	str2	String
    //   73	185	4	arrayOfString	String[]
    //   253	14	5	locala	a
    // Exception table:
    //   from	to	target	type
    //   15	31	139	java/io/IOException
    //   38	46	214	java/io/IOException
    //   48	56	214	java/io/IOException
    //   60	88	214	java/io/IOException
    //   93	116	214	java/io/IOException
    //   116	126	214	java/io/IOException
    //   166	184	214	java/io/IOException
    //   184	211	214	java/io/IOException
    //   245	272	214	java/io/IOException
    //   275	293	214	java/io/IOException
  }
  
  private void update()
  {
    GMTrace.i(13810601558016L, 102897);
    try
    {
      this.fQr = new RandomAccessFile("/proc/stat", "r");
      if (this.pid > 0L) {
        this.fQs = new RandomAccessFile("/proc/" + this.pid + "/stat", "r");
      }
      sV();
      if (this.fQr != null) {
        this.fQr.close();
      }
      if (this.fQs != null) {
        this.fQs.close();
      }
      GMTrace.o(13810601558016L, 102897);
      return;
    }
    catch (Exception localException1)
    {
      w.printErrStackTrace(" MicroMsg.CpuUsage", localException1, "update e:", new Object[0]);
      if (this.fQr == null) {}
    }
    try
    {
      this.fQr.close();
      this.fQr = null;
      if (this.fQs != null) {}
      try
      {
        this.fQs.close();
        this.fQs = null;
        GMTrace.o(13810601558016L, 102897);
        return;
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
    }
    catch (Exception localException3)
    {
      for (;;) {}
    }
  }
  
  public final int sW()
  {
    GMTrace.i(13810869993472L, 102899);
    if (bg.cc(this.fQu))
    {
      GMTrace.o(13810869993472L, 102899);
      return 1;
    }
    int i = this.fQu.size();
    GMTrace.o(13810869993472L, 102899);
    return i;
  }
  
  public final int sX()
  {
    GMTrace.i(13811004211200L, 102900);
    update();
    int i = 0;
    if (this.fQt != null) {
      i = this.fQt.fQv;
    }
    GMTrace.o(13811004211200L, 102900);
    return i;
  }
  
  public final int sY()
  {
    GMTrace.i(13811138428928L, 102901);
    int i = 0;
    if (this.fQt != null) {
      i = this.fQt.fQz;
    }
    int j = i;
    if (this.fQu != null)
    {
      j = i;
      if (this.fQu.size() > 1) {
        j = i * this.fQu.size();
      }
    }
    GMTrace.o(13811138428928L, 102901);
    return j;
  }
  
  public final String toString()
  {
    GMTrace.i(13811272646656L, 102902);
    update();
    Object localObject = new StringBuffer();
    if (this.fQt != null)
    {
      ((StringBuffer)localObject).append("Cpu Total : ");
      ((StringBuffer)localObject).append(this.fQt.fQv);
      ((StringBuffer)localObject).append("%");
      if (this.pid > 0L)
      {
        ((StringBuffer)localObject).append("pid(");
        ((StringBuffer)localObject).append(this.pid + ") :");
        ((StringBuffer)localObject).append(this.fQt.fQz);
        ((StringBuffer)localObject).append("%");
      }
    }
    if (this.fQu != null)
    {
      int i = 0;
      while (i < this.fQu.size())
      {
        a locala = (a)this.fQu.get(i);
        ((StringBuffer)localObject).append(" Cpu Core(" + i + ") : ");
        ((StringBuffer)localObject).append(locala.fQv);
        ((StringBuffer)localObject).append("%");
        i += 1;
      }
    }
    localObject = ((StringBuffer)localObject).toString();
    GMTrace.o(13811272646656L, 102902);
    return (String)localObject;
  }
  
  public final class a
  {
    int fQv;
    long fQw;
    long fQx;
    long fQy;
    int fQz;
    long mLastIdle;
    
    public a()
    {
      GMTrace.i(13806172372992L, 102864);
      this.fQv = 0;
      this.fQw = 0L;
      this.mLastIdle = 0L;
      this.fQx = 0L;
      this.fQy = 0L;
      this.fQz = 0;
      GMTrace.o(13806172372992L, 102864);
    }
    
    public a(long paramLong)
    {
      GMTrace.i(13806306590720L, 102865);
      this.fQx = paramLong;
      GMTrace.o(13806306590720L, 102865);
    }
    
    public final void a(String[] paramArrayOfString, String paramString)
    {
      GMTrace.i(13806440808448L, 102866);
      if (this.fQx <= 0L)
      {
        e(paramArrayOfString);
        GMTrace.o(13806440808448L, 102866);
        return;
      }
      if ((paramString != null) && (paramString.length() > 0))
      {
        String[] arrayOfString = paramString.split("[ ]+");
        if ((arrayOfString != null) && (arrayOfString.length > 0) && (arrayOfString[0] != null) && (Long.parseLong(arrayOfString[0], 10) == this.fQx))
        {
          long l2 = Long.parseLong(arrayOfString[13], 10);
          long l3 = Long.parseLong(arrayOfString[14], 10);
          long l4 = Long.parseLong(arrayOfString[15], 10);
          long l5 = Long.parseLong(arrayOfString[16], 10);
          long l6 = l2 + l3 + l4 + l5;
          long l7 = Long.parseLong(paramArrayOfString[4], 10);
          int k = paramArrayOfString.length;
          int i = 0;
          int j = 1;
          long l1 = 0L;
          if (i < k)
          {
            paramString = paramArrayOfString[i];
            if (j != 0) {
              j = 0;
            }
            for (;;)
            {
              i += 1;
              break;
              l1 += Long.parseLong(paramString, 10);
            }
          }
          long l8 = l7 - this.mLastIdle;
          long l9 = l1 - this.fQw;
          long l10 = l6 - this.fQy;
          this.fQv = ((int)((float)(l9 - l8) / (float)l9 * 100.0F));
          this.fQz = ((int)((float)l10 / (float)l9 * 100.0F));
          this.fQw = l1;
          this.mLastIdle = l7;
          this.fQy = l6;
          w.i(" MicroMsg.CpuUsage", "CpuUsageInfo(%d) CPU total=%d idle=%d usage=%d pid=%d pidTotal=%d mPidUsage=%d [%d, %d, %d, %d], [%d, %d, %d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(l1), Long.valueOf(l7), Integer.valueOf(this.fQv), Long.valueOf(this.fQx), Long.valueOf(l6), Integer.valueOf(this.fQz), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), Long.valueOf(l5), Long.valueOf(l9), Long.valueOf(l8), Long.valueOf(l10) });
          GMTrace.o(13806440808448L, 102866);
          return;
        }
      }
      w.e(" MicroMsg.CpuUsage", "update but pid not match[%d, %s] update nothing", new Object[] { Long.valueOf(this.fQx), paramString });
      GMTrace.o(13806440808448L, 102866);
    }
    
    public final void e(String[] paramArrayOfString)
    {
      GMTrace.i(13806575026176L, 102867);
      long l2 = Long.parseLong(paramArrayOfString[4], 10);
      long l1 = 0L;
      int j = 1;
      int k = paramArrayOfString.length;
      int i = 0;
      if (i < k)
      {
        String str = paramArrayOfString[i];
        if (j != 0) {
          j = 0;
        }
        for (;;)
        {
          i += 1;
          break;
          l1 += Long.parseLong(str, 10);
        }
      }
      long l3 = this.mLastIdle;
      long l4 = l1 - this.fQw;
      this.fQv = ((int)((float)(l4 - (l2 - l3)) / (float)l4 * 100.0F));
      this.fQw = l1;
      this.mLastIdle = l2;
      w.i(" MicroMsg.CpuUsage", "CpuUsageInfo(" + hashCode() + ") CPU total=" + l1 + "; idle=" + l2 + "; usage=" + this.fQv);
      GMTrace.o(13806575026176L, 102867);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\d\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */