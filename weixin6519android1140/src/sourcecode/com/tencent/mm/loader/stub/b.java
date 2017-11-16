package com.tencent.mm.loader.stub;

import com.tencent.gmtrace.GMTrace;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public final class b
{
  public static byte[] c(InputStream paramInputStream)
  {
    GMTrace.i(14008706924544L, 104373);
    if (paramInputStream == null)
    {
      GMTrace.o(14008706924544L, 104373);
      return null;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte['Ѐ'];
    int i = 0;
    for (;;)
    {
      try
      {
        int j = paramInputStream.read(arrayOfByte, 0, 1024);
        i = j;
      }
      catch (IOException localIOException)
      {
        continue;
      }
      if (i <= 0) {
        continue;
      }
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    paramInputStream = localByteArrayOutputStream.toByteArray();
    GMTrace.o(14008706924544L, 104373);
    return paramInputStream;
  }
  
  public static boolean deleteFile(String paramString)
  {
    GMTrace.i(14008841142272L, 104374);
    if (paramString == null)
    {
      GMTrace.o(14008841142272L, 104374);
      return true;
    }
    paramString = new File(paramString);
    if (paramString.exists())
    {
      boolean bool = paramString.delete();
      GMTrace.o(14008841142272L, 104374);
      return bool;
    }
    GMTrace.o(14008841142272L, 104374);
    return true;
  }
  
  public static final boolean g(File paramFile)
  {
    int i = 0;
    GMTrace.i(14008572706816L, 104372);
    if ((paramFile == null) || (!paramFile.exists()))
    {
      GMTrace.o(14008572706816L, 104372);
      return false;
    }
    if (paramFile.isDirectory())
    {
      paramFile = paramFile.listFiles();
      if (paramFile == null)
      {
        GMTrace.o(14008572706816L, 104372);
        return false;
      }
      while (i < paramFile.length)
      {
        paramFile[i].delete();
        i += 1;
      }
      GMTrace.o(14008572706816L, 104372);
      return true;
    }
    GMTrace.o(14008572706816L, 104372);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\loader\stub\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */