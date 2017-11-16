package com.tencent.mm.c;

import com.tencent.gmtrace.GMTrace;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;

public final class a
{
  public a eqR;
  public b eqS;
  
  public a(b paramb)
  {
    GMTrace.i(14022397132800L, 104475);
    this.eqS = null;
    this.eqS = paramb;
    GMTrace.o(14022397132800L, 104475);
  }
  
  public static a bq(String paramString)
  {
    int i = 0;
    GMTrace.i(14022665568256L, 104477);
    if (paramString == null) {}
    for (;;)
    {
      if (i < 8)
      {
        GMTrace.o(14022665568256L, 104477);
        return null;
      }
      try
      {
        localObject = new File(paramString);
        if (((File)localObject).exists()) {
          i = (int)((File)localObject).length();
        }
      }
      catch (Exception paramString)
      {
        Object localObject;
        b localb;
        GMTrace.o(14022665568256L, 104477);
      }
    }
    localObject = a.r(d(paramString, i - 8, 8));
    if (localObject == null)
    {
      GMTrace.o(14022665568256L, 104477);
      return null;
    }
    if (((a)localObject).eqU >= 0)
    {
      localb = new b();
      localb.aD(d(paramString, i - ((a)localObject).eqU - 8, ((a)localObject).eqU));
      paramString = new a(localb);
      paramString.eqR = ((a)localObject);
      GMTrace.o(14022665568256L, 104477);
      return paramString;
    }
    return null;
  }
  
  public static boolean br(String paramString)
  {
    GMTrace.i(14022799785984L, 104478);
    if (paramString == null)
    {
      GMTrace.o(14022799785984L, 104478);
      return false;
    }
    File localFile = new File(paramString);
    if (!localFile.exists())
    {
      GMTrace.o(14022799785984L, 104478);
      return false;
    }
    a locala = bq(paramString);
    if ((locala != null) && (locala.eqS != null)) {
      try
      {
        paramString = new File(paramString);
        if (paramString.exists())
        {
          boolean bool = locala.eqS.apkMd5.equalsIgnoreCase(g.a(paramString, (int)(localFile.length() - (locala.eqR.eqU + 8) - 2L), new byte[] { 0, 0 }));
          GMTrace.o(14022799785984L, 104478);
          return bool;
        }
      }
      catch (Exception paramString) {}
    }
    GMTrace.o(14022799785984L, 104478);
    return false;
  }
  
  private static byte[] d(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(14022934003712L, 104479);
    if (paramString == null)
    {
      GMTrace.o(14022934003712L, 104479);
      return null;
    }
    Object localObject = new File(paramString);
    if (!((File)localObject).exists())
    {
      GMTrace.o(14022934003712L, 104479);
      return null;
    }
    if (paramInt2 == -1)
    {
      paramInt2 = (int)((File)localObject).length();
      for (;;)
      {
        if (paramInt1 < 0)
        {
          GMTrace.o(14022934003712L, 104479);
          return null;
        }
        if (paramInt2 <= 0)
        {
          GMTrace.o(14022934003712L, 104479);
          return null;
        }
        int i = paramInt2;
        if (paramInt1 + paramInt2 > (int)((File)localObject).length()) {
          i = (int)((File)localObject).length() - paramInt1;
        }
        try
        {
          localObject = new RandomAccessFile(paramString, "r");
          paramString = new byte[i];
          l = paramInt1;
        }
        catch (Exception paramString)
        {
          try
          {
            long l;
            ((RandomAccessFile)localObject).seek(l);
            ((RandomAccessFile)localObject).readFully(paramString);
            ((RandomAccessFile)localObject).close();
            for (;;)
            {
              GMTrace.o(14022934003712L, 104479);
              return paramString;
              paramString = paramString;
              paramString = null;
            }
          }
          catch (Exception localException)
          {
            for (;;) {}
          }
        }
      }
    }
  }
  
  public final int i(File paramFile)
  {
    GMTrace.i(14022531350528L, 104476);
    try
    {
      if (bq(paramFile.getAbsolutePath()) != null)
      {
        System.out.println("Error: duplicate append apk external info!");
        GMTrace.o(14022531350528L, 104476);
        return -1;
      }
      byte[] arrayOfByte = this.eqS.toByteArray();
      Object localObject = new a(arrayOfByte.length);
      localObject = a.u(a.eqT << 32 | ((a)localObject).eqU);
      int i = (byte)((arrayOfByte.length + 8) % 256);
      int j = (byte)((arrayOfByte.length + 8) / 256);
      RandomAccessFile localRandomAccessFile = new RandomAccessFile(paramFile, "rw");
      localRandomAccessFile.seek(paramFile.length() - 2L);
      localRandomAccessFile.write(new byte[] { i, j });
      localRandomAccessFile.close();
      paramFile = new FileOutputStream(paramFile, true);
      paramFile.write(arrayOfByte);
      paramFile.write((byte[])localObject);
      paramFile.flush();
      paramFile.close();
      GMTrace.o(14022531350528L, 104476);
      return 0;
    }
    catch (Exception paramFile)
    {
      GMTrace.o(14022531350528L, 104476);
    }
    return -1;
  }
  
  public static final class a
  {
    static final long eqT;
    public int eqU;
    
    static
    {
      GMTrace.i(14021860261888L, 104471);
      eqT = "Micromsg".hashCode();
      GMTrace.o(14021860261888L, 104471);
    }
    
    public a(int paramInt)
    {
      GMTrace.i(14021994479616L, 104472);
      this.eqU = 0;
      this.eqU = paramInt;
      GMTrace.o(14021994479616L, 104472);
    }
    
    public static a r(byte[] paramArrayOfByte)
    {
      GMTrace.i(14022128697344L, 104473);
      long l;
      int i;
      if (paramArrayOfByte.length == 8)
      {
        l = 0L;
        i = 0;
        if (i >= paramArrayOfByte.length) {
          if (l >> 32 != eqT) {
            break label79;
          }
        }
      }
      label79:
      for (paramArrayOfByte = new a((int)l);; paramArrayOfByte = null)
      {
        GMTrace.o(14022128697344L, 104473);
        return paramArrayOfByte;
        l |= (paramArrayOfByte[i] & 0xFF) << i * 8;
        i += 1;
        break;
      }
    }
    
    static byte[] u(long paramLong)
    {
      GMTrace.i(14022262915072L, 104474);
      byte[] arrayOfByte = new byte[8];
      int i = 0;
      for (;;)
      {
        if (i >= 8)
        {
          GMTrace.o(14022262915072L, 104474);
          return arrayOfByte;
        }
        arrayOfByte[i] = ((byte)(int)(paramLong >> i * 8 & 0xFF));
        i += 1;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */