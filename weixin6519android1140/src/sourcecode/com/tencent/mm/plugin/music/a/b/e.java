package com.tencent.mm.plugin.music.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.music.a.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class e
{
  public String euR;
  private String mUrl;
  public RandomAccessFile randomAccessFile;
  
  public e(String paramString)
  {
    GMTrace.i(15022990295040L, 111930);
    this.randomAccessFile = null;
    this.mUrl = paramString;
    this.euR = g.Dk(this.mUrl);
    w.i("MicroMsg.PieceFileCache", "PieceFileCache mUrl:%s, fileName:%s,", new Object[] { this.mUrl, this.euR });
    GMTrace.o(15022990295040L, 111930);
  }
  
  public static void vd(String paramString)
  {
    GMTrace.i(15359876792320L, 114440);
    Logger.i("MicroMsg.PieceFileCache", "deleteFile, fileName:" + paramString);
    paramString = new File(paramString);
    if (paramString.exists())
    {
      Logger.i("MicroMsg.PieceFileCache", "delete the piece File");
      paramString.delete();
      GMTrace.o(15359876792320L, 114440);
      return;
    }
    Logger.e("MicroMsg.PieceFileCache", "file not exist, delete piece File fail");
    GMTrace.o(15359876792320L, 114440);
  }
  
  public final int a(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    int i = -1;
    for (;;)
    {
      try
      {
        GMTrace.i(15023124512768L, 111931);
        if (paramInt == 0)
        {
          Logger.e("MicroMsg.PieceFileCache", "read error, length == 0");
          GMTrace.o(15023124512768L, 111931);
          paramInt = i;
          return paramInt;
        }
        if (this.randomAccessFile == null)
        {
          Logger.e("MicroMsg.PieceFileCache", "read error, randomAccessFile is null");
          GMTrace.o(15023124512768L, 111931);
          paramInt = i;
        }
        else
        {
          try
          {
            this.randomAccessFile.seek(paramLong);
            int j = this.randomAccessFile.read(paramArrayOfByte, 0, paramInt);
            paramInt = j;
            GMTrace.o(15023124512768L, 111931);
          }
          catch (IOException localIOException)
          {
            Logger.e("MicroMsg.PieceFileCache", String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong), Integer.valueOf(getLength()), Integer.valueOf(paramArrayOfByte.length) }));
            GMTrace.o(15023124512768L, 111931);
            paramInt = i;
          }
        }
      }
      finally {}
    }
  }
  
  /* Error */
  public final long aTe()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 135
    //   5: ldc -119
    //   7: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: new 73	java/io/File
    //   13: dup
    //   14: aload_0
    //   15: getfield 35	com/tencent/mm/plugin/music/a/b/e:euR	Ljava/lang/String;
    //   18: invokespecial 74	java/io/File:<init>	(Ljava/lang/String;)V
    //   21: astore_3
    //   22: aload_3
    //   23: invokevirtual 78	java/io/File:exists	()Z
    //   26: ifeq +20 -> 46
    //   29: aload_3
    //   30: invokevirtual 140	java/io/File:length	()J
    //   33: lstore_1
    //   34: ldc2_w 135
    //   37: ldc -119
    //   39: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   42: aload_0
    //   43: monitorexit
    //   44: lload_1
    //   45: lreturn
    //   46: ldc2_w 141
    //   49: lstore_1
    //   50: ldc2_w 135
    //   53: ldc -119
    //   55: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   58: goto -16 -> 42
    //   61: astore_3
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_3
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	e
    //   33	17	1	l	long
    //   21	9	3	localFile	File
    //   61	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	42	61	finally
    //   50	58	61	finally
  }
  
  public final boolean b(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    boolean bool = false;
    for (;;)
    {
      try
      {
        GMTrace.i(15023258730496L, 111932);
        if (paramInt == 0)
        {
          Logger.e("MicroMsg.PieceFileCache", "write error, length == 0");
          GMTrace.o(15023258730496L, 111932);
          return bool;
        }
        if (this.randomAccessFile == null)
        {
          Logger.e("MicroMsg.PieceFileCache", "write error, randomAccessFile is null");
          GMTrace.o(15023258730496L, 111932);
        }
        else
        {
          try
          {
            this.randomAccessFile.seek(paramLong);
            this.randomAccessFile.write(paramArrayOfByte, 0, paramInt);
            GMTrace.o(15023258730496L, 111932);
            bool = true;
          }
          catch (IOException localIOException)
          {
            Logger.e("MicroMsg.PieceFileCache", String.format("Error writing %d bytes to from buffer with size %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length) }));
            GMTrace.o(15023258730496L, 111932);
          }
        }
      }
      finally {}
    }
  }
  
  /* Error */
  public final void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 159
    //   5: ldc -95
    //   7: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: ldc 37
    //   12: ldc -94
    //   14: invokestatic 71	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: aload_0
    //   18: getfield 25	com/tencent/mm/plugin/music/a/b/e:randomAccessFile	Ljava/io/RandomAccessFile;
    //   21: astore_1
    //   22: aload_1
    //   23: ifnull +53 -> 76
    //   26: aload_0
    //   27: getfield 25	com/tencent/mm/plugin/music/a/b/e:randomAccessFile	Ljava/io/RandomAccessFile;
    //   30: invokevirtual 164	java/io/RandomAccessFile:close	()V
    //   33: ldc2_w 159
    //   36: ldc -95
    //   38: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: astore_1
    //   45: ldc 37
    //   47: ldc -90
    //   49: iconst_1
    //   50: anewarray 4	java/lang/Object
    //   53: dup
    //   54: iconst_0
    //   55: new 54	java/lang/StringBuilder
    //   58: dup
    //   59: invokespecial 167	java/lang/StringBuilder:<init>	()V
    //   62: aload_1
    //   63: invokevirtual 170	java/io/IOException:getMessage	()Ljava/lang/String;
    //   66: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: invokevirtual 66	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   72: aastore
    //   73: invokestatic 172	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   76: ldc2_w 159
    //   79: ldc -95
    //   81: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   84: goto -43 -> 41
    //   87: astore_1
    //   88: aload_0
    //   89: monitorexit
    //   90: aload_1
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	e
    //   21	2	1	localRandomAccessFile	RandomAccessFile
    //   44	19	1	localIOException	IOException
    //   87	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   26	33	44	java/io/IOException
    //   2	22	87	finally
    //   26	33	87	finally
    //   33	41	87	finally
    //   45	76	87	finally
    //   76	84	87	finally
  }
  
  public final int getLength()
  {
    int i = -1;
    for (;;)
    {
      try
      {
        GMTrace.i(15023392948224L, 111933);
        if (this.randomAccessFile == null)
        {
          Logger.e("MicroMsg.PieceFileCache", "getLength error, randomAccessFile is null");
          GMTrace.o(15023392948224L, 111933);
          return i;
        }
      }
      finally
      {
        try
        {
          long l = this.randomAccessFile.length();
          i = (int)l;
          GMTrace.o(15023392948224L, 111933);
        }
        catch (IOException localIOException)
        {
          Logger.e("MicroMsg.PieceFileCache", "Error get length of file , err %s", new Object[] { localIOException.getMessage() });
          GMTrace.o(15023392948224L, 111933);
        }
        localObject = finally;
      }
    }
  }
  
  public final void setLength(int paramInt)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(15023527165952L, 111934);
        if (this.randomAccessFile == null)
        {
          Logger.e("MicroMsg.PieceFileCache", "setLength error, randomAccessFile is null");
          GMTrace.o(15023527165952L, 111934);
          return;
        }
        if (paramInt <= 0)
        {
          Logger.e("MicroMsg.PieceFileCache", "setLength error, length is " + paramInt);
          GMTrace.o(15023527165952L, 111934);
          continue;
        }
      }
      finally {}
      tmp84_81[0] = String.valueOf(paramInt);
      Logger.e("MicroMsg.PieceFileCache", "set file length %s ", tmp84_81);
      try
      {
        this.randomAccessFile.setLength(paramInt);
        GMTrace.o(15023527165952L, 111934);
      }
      catch (IOException localIOException)
      {
        Logger.e("MicroMsg.PieceFileCache", "Error set length of file, err %s", new Object[] { localIOException.getMessage() });
        GMTrace.o(15023527165952L, 111934);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */