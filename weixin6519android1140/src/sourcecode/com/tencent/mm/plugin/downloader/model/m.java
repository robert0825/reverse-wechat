package com.tencent.mm.plugin.downloader.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.c.k;
import com.tencent.mm.c.l;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;
import java.util.zip.ZipException;

public final class m
{
  protected static final k erg;
  public static l kfJ;
  
  static
  {
    GMTrace.i(18605395673088L, 138621);
    erg = new k(101010256L);
    kfJ = new l(38650);
    GMTrace.o(18605395673088L, 138621);
  }
  
  private static String d(File paramFile, String paramString)
  {
    GMTrace.i(18604993019904L, 138618);
    try
    {
      paramFile = new RandomAccessFile(paramFile, "r");
      try
      {
        byte[] arrayOfByte1 = d(paramFile);
        if (arrayOfByte1 == null)
        {
          paramFile.close();
          GMTrace.o(18604993019904L, 138618);
          return null;
        }
        locala = new a();
        if (arrayOfByte1 == null) {
          break label252;
        }
        localByteBuffer = ByteBuffer.wrap(arrayOfByte1);
        kfJ.getBytes();
        arrayOfByte2 = new byte[2];
        localByteBuffer.get(arrayOfByte2);
        if (kfJ.equals(new l(arrayOfByte2))) {
          break label146;
        }
        throw new ProtocolException("unknow protocl [" + Arrays.toString(arrayOfByte1) + "]");
      }
      finally
      {
        paramString = paramFile;
        paramFile = (File)localObject;
      }
    }
    finally
    {
      for (;;)
      {
        a locala;
        ByteBuffer localByteBuffer;
        byte[] arrayOfByte2;
        int i;
        paramString = null;
      }
    }
    if (paramString != null) {
      paramString.close();
    }
    throw paramFile;
    label146:
    if (localObject.length - 2 > 2)
    {
      arrayOfByte2 = new byte[2];
      localByteBuffer.get(arrayOfByte2);
      i = new l(arrayOfByte2).value;
      if (localObject.length - 2 - 2 >= i)
      {
        arrayOfByte2 = new byte[i];
        localByteBuffer.get(arrayOfByte2);
        locala.kfK.load(new ByteArrayInputStream(arrayOfByte2));
        i = localObject.length - 2 - i - 2;
        if (i > 0)
        {
          locala.kfL = new byte[i];
          localByteBuffer.get(locala.kfL);
        }
      }
    }
    label252:
    paramString = locala.kfK.getProperty(paramString);
    paramFile.close();
    GMTrace.o(18604993019904L, 138618);
    return paramString;
  }
  
  private static byte[] d(RandomAccessFile paramRandomAccessFile)
  {
    int j = 1;
    GMTrace.i(18605261455360L, 138620);
    long l = paramRandomAccessFile.length() - 22L;
    paramRandomAccessFile.seek(l);
    byte[] arrayOfByte = erg.getBytes();
    int i = paramRandomAccessFile.read();
    if (i != -1) {
      if ((i != arrayOfByte[0]) || (paramRandomAccessFile.read() != arrayOfByte[1]) || (paramRandomAccessFile.read() != arrayOfByte[2]) || (paramRandomAccessFile.read() != arrayOfByte[3])) {}
    }
    for (i = j;; i = 0)
    {
      if (i == 0)
      {
        throw new ZipException("archive is not a ZIP archive");
        l -= 1L;
        paramRandomAccessFile.seek(l);
        i = paramRandomAccessFile.read();
        break;
      }
      paramRandomAccessFile.seek(16L + l + 4L);
      arrayOfByte = new byte[2];
      paramRandomAccessFile.readFully(arrayOfByte);
      i = new l(arrayOfByte).value;
      if (i == 0)
      {
        GMTrace.o(18605261455360L, 138620);
        return null;
      }
      arrayOfByte = new byte[i];
      paramRandomAccessFile.read(arrayOfByte);
      GMTrace.o(18605261455360L, 138620);
      return arrayOfByte;
    }
  }
  
  public static String s(File paramFile)
  {
    GMTrace.i(18605127237632L, 138619);
    paramFile = d(paramFile, "channelId");
    GMTrace.o(18605127237632L, 138619);
    return paramFile;
  }
  
  private static final class a
  {
    Properties kfK;
    byte[] kfL;
    
    public a()
    {
      GMTrace.i(18600295399424L, 138583);
      this.kfK = new Properties();
      GMTrace.o(18600295399424L, 138583);
    }
    
    public final String toString()
    {
      GMTrace.i(18600429617152L, 138584);
      String str = "ApkExternalInfo [p=" + this.kfK + ", otherData=" + Arrays.toString(this.kfL) + "]";
      GMTrace.o(18600429617152L, 138584);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\model\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */