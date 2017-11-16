package com.tencent.mm.e.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.e.b.g.a;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public final class d
  implements a
{
  private com.tencent.qqpinyin.voicerecoapi.a ezD;
  private a ezE;
  public BlockingQueue<g.a> ezr;
  public boolean ezs;
  public String ezt;
  private FileOutputStream mFileOutputStream;
  
  public d()
  {
    GMTrace.i(4465826463744L, 33273);
    this.ezr = new ArrayBlockingQueue(1024);
    this.ezs = false;
    GMTrace.o(4465826463744L, 33273);
  }
  
  public static boolean t(String paramString1, String paramString2)
  {
    GMTrace.i(4466363334656L, 33277);
    long l = System.currentTimeMillis();
    if ((paramString1 == null) || (paramString1.length() <= 0))
    {
      w.e("MicroMsg.SpeexWriter", "[voiceControl] decodePCMToSpeex filePath null");
      GMTrace.o(4466363334656L, 33277);
      return false;
    }
    paramString1 = new File(paramString1);
    if (!paramString1.exists())
    {
      w.e("MicroMsg.SpeexWriter", "[voiceControl] decodePCMToSpeex filePath null");
      GMTrace.o(4466363334656L, 33277);
      return false;
    }
    w.i("MicroMsg.SpeexWriter", "[voiceControl] decodePCMToSpeex pcmLen = " + paramString1.length());
    for (;;)
    {
      try
      {
        locala = new com.tencent.qqpinyin.voicerecoapi.a();
        if (locala.cnc() != 0)
        {
          w.e("MicroMsg.SpeexWriter", "[voiceControl] speexInit fail");
          locala.cnd();
          GMTrace.o(4466363334656L, 33277);
          return false;
        }
        b.deleteFile(paramString2);
        localObject = new File(paramString2);
        ((File)localObject).createNewFile();
        ((File)localObject).setReadable(true);
      }
      catch (Exception paramString1)
      {
        com.tencent.qqpinyin.voicerecoapi.a locala;
        Object localObject;
        w.e("MicroMsg.SpeexWriter", "[voiceControl] Exception in decodePCMToSpeex, " + paramString1.getMessage());
        GMTrace.o(4466363334656L, 33277);
        return false;
      }
      try
      {
        localObject = new byte['က'];
        paramString1 = new FileInputStream(paramString1);
        try
        {
          int i = paramString1.read((byte[])localObject);
          if (i <= 0) {
            continue;
          }
          byte[] arrayOfByte = locala.D((byte[])localObject, i);
          if (arrayOfByte == null)
          {
            paramString1.close();
            GMTrace.o(4466363334656L, 33277);
            return false;
          }
          int j = e.d(paramString2, arrayOfByte);
          w.i("MicroMsg.SpeexWriter", "[voiceControl] appendToFile " + j + ", readLen = " + i);
          continue;
          if (paramString1 == null) {
            continue;
          }
        }
        catch (Exception paramString2) {}
      }
      catch (Exception paramString1)
      {
        paramString1 = null;
      }
    }
    paramString1.close();
    locala.cnd();
    GMTrace.o(4466363334656L, 33277);
    return false;
    paramString1.close();
    locala.cnd();
    w.i("MicroMsg.SpeexWriter", "[voiceControl] decodePCMToSpeex = " + (System.currentTimeMillis() - l));
    GMTrace.o(4466363334656L, 33277);
    return true;
  }
  
  public final int a(g.a parama, int paramInt)
  {
    GMTrace.i(4466094899200L, 33275);
    paramInt = a(parama, 0, false);
    GMTrace.o(4466094899200L, 33275);
    return paramInt;
  }
  
  public final int a(g.a parama, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(14591346081792L, 108714);
    if ((this.ezD == null) || (parama.buf == null) || (parama.eyw == 0))
    {
      w.e("MicroMsg.SpeexWriter", "try write invalid data to file");
      GMTrace.o(14591346081792L, 108714);
      return -1;
    }
    try
    {
      parama = this.ezD.D(parama.buf, parama.eyw);
      if ((parama != null) && (parama.length > 0))
      {
        w.d("MicroMsg.SpeexWriter", "write to file, len: %d", new Object[] { Integer.valueOf(parama.length) });
        this.mFileOutputStream.write(parama);
        this.mFileOutputStream.flush();
        paramInt = parama.length;
        GMTrace.o(14591346081792L, 108714);
        return paramInt;
      }
      StringBuilder localStringBuilder = new StringBuilder("convert failed: ");
      if (parama == null) {}
      for (parama = "outBuffer is null";; parama = "size is zero")
      {
        w.e("MicroMsg.SpeexWriter", parama);
        GMTrace.o(14591346081792L, 108714);
        return -1;
      }
      return -1;
    }
    catch (Exception parama)
    {
      w.e("MicroMsg.SpeexWriter", "write to file failed", new Object[] { parama });
      GMTrace.o(14591346081792L, 108714);
    }
  }
  
  public final boolean bU(String paramString)
  {
    GMTrace.i(4465960681472L, 33274);
    w.i("MicroMsg.SpeexWriter", "initWriter, path: " + paramString);
    if (paramString == null)
    {
      GMTrace.o(4465960681472L, 33274);
      return false;
    }
    this.ezt = paramString;
    try
    {
      this.mFileOutputStream = new FileOutputStream(new File(paramString));
      this.ezD = new com.tencent.qqpinyin.voicerecoapi.a();
      int i = this.ezD.cnc();
      if (i != 0)
      {
        w.e("MicroMsg.SpeexWriter", "speexInit failed: " + i);
        GMTrace.o(4465960681472L, 33274);
        return false;
      }
    }
    catch (Exception paramString)
    {
      if (this.mFileOutputStream == null) {}
    }
    try
    {
      this.mFileOutputStream.close();
      w.e("MicroMsg.SpeexWriter", "Error on init file: ", new Object[] { paramString });
      GMTrace.o(4465960681472L, 33274);
      return false;
      GMTrace.o(4465960681472L, 33274);
      return true;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public final void qI()
  {
    // Byte code:
    //   0: ldc2_w 242
    //   3: ldc -12
    //   5: invokestatic 35	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: ldc 69
    //   10: ldc -10
    //   12: invokestatic 103	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   15: aload_0
    //   16: monitorenter
    //   17: aload_0
    //   18: iconst_1
    //   19: putfield 44	com/tencent/mm/e/c/d:ezs	Z
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_0
    //   25: getfield 248	com/tencent/mm/e/c/d:ezE	Lcom/tencent/mm/e/c/d$a;
    //   28: ifnull +15 -> 43
    //   31: aload_0
    //   32: getfield 248	com/tencent/mm/e/c/d:ezE	Lcom/tencent/mm/e/c/d$a;
    //   35: invokestatic 254	com/tencent/mm/sdk/f/e:N	(Ljava/lang/Runnable;)V
    //   38: aload_0
    //   39: aconst_null
    //   40: putfield 248	com/tencent/mm/e/c/d:ezE	Lcom/tencent/mm/e/c/d$a;
    //   43: aload_0
    //   44: getfield 178	com/tencent/mm/e/c/d:ezD	Lcom/tencent/qqpinyin/voicerecoapi/a;
    //   47: ifnull +16 -> 63
    //   50: aload_0
    //   51: getfield 178	com/tencent/mm/e/c/d:ezD	Lcom/tencent/qqpinyin/voicerecoapi/a;
    //   54: invokevirtual 114	com/tencent/qqpinyin/voicerecoapi/a:cnd	()I
    //   57: pop
    //   58: aload_0
    //   59: aconst_null
    //   60: putfield 178	com/tencent/mm/e/c/d:ezD	Lcom/tencent/qqpinyin/voicerecoapi/a;
    //   63: aload_0
    //   64: getfield 203	com/tencent/mm/e/c/d:mFileOutputStream	Ljava/io/FileOutputStream;
    //   67: ifnull +15 -> 82
    //   70: aload_0
    //   71: getfield 203	com/tencent/mm/e/c/d:mFileOutputStream	Ljava/io/FileOutputStream;
    //   74: invokevirtual 236	java/io/FileOutputStream:close	()V
    //   77: aload_0
    //   78: aconst_null
    //   79: putfield 203	com/tencent/mm/e/c/d:mFileOutputStream	Ljava/io/FileOutputStream;
    //   82: ldc2_w 242
    //   85: ldc -12
    //   87: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   90: return
    //   91: astore_1
    //   92: aload_0
    //   93: monitorexit
    //   94: aload_1
    //   95: athrow
    //   96: astore_1
    //   97: ldc 69
    //   99: ldc_w 256
    //   102: invokestatic 77	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   105: goto -62 -> 43
    //   108: astore_1
    //   109: ldc 69
    //   111: new 88	java/lang/StringBuilder
    //   114: dup
    //   115: ldc_w 258
    //   118: invokespecial 91	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   121: aload_0
    //   122: getfield 232	com/tencent/mm/e/c/d:ezt	Ljava/lang/String;
    //   125: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: ldc_w 260
    //   131: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: aload_1
    //   135: invokevirtual 166	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   138: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   144: invokestatic 77	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   147: goto -70 -> 77
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	150	0	this	d
    //   91	4	1	localObject	Object
    //   96	1	1	localInterruptedException	InterruptedException
    //   108	27	1	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   17	24	91	finally
    //   92	94	91	finally
    //   31	43	96	java/lang/InterruptedException
    //   70	77	108	java/lang/Exception
  }
  
  public final boolean qJ()
  {
    GMTrace.i(14591480299520L, 108715);
    if (this.ezD != null)
    {
      this.ezD.cnd();
      this.ezD = null;
    }
    this.ezD = new com.tencent.qqpinyin.voicerecoapi.a();
    int i = this.ezD.cnc();
    if (i != 0)
    {
      w.e("MicroMsg.SpeexWriter", "resetWriter speexInit failed: " + i);
      GMTrace.o(14591480299520L, 108715);
      return false;
    }
    GMTrace.o(14591480299520L, 108715);
    return true;
  }
  
  private final class a
    implements Runnable
  {
    public final void run()
    {
      GMTrace.i(4466497552384L, 33278);
      for (;;)
      {
        synchronized (this.ezF)
        {
          boolean bool = this.ezF.ezs;
          w.d("MicroMsg.SpeexWriter", "ThreadSpeex in: " + bool + " queueLen: " + this.ezF.ezr.size());
          if (bool) {
            if (this.ezF.ezr.isEmpty()) {
              break;
            }
          }
        }
        try
        {
          ??? = (g.a)this.ezF.ezr.poll(200L, TimeUnit.MILLISECONDS);
          if (??? != null) {
            break label157;
          }
          w.e("MicroMsg.SpeexWriter", "poll byteBuf is null, " + this.ezF.ezt);
        }
        catch (InterruptedException localInterruptedException)
        {
          w.i("MicroMsg.SpeexWriter", "ThreadSpeex poll null");
        }
        localObject2 = finally;
        throw ((Throwable)localObject2);
        continue;
        label157:
        this.ezF.a(localInterruptedException, 0, false);
      }
      GMTrace.o(4466497552384L, 33278);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\e\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */