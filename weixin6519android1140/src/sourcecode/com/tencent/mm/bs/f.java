package com.tencent.mm.bs;

import android.util.SparseIntArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public final class f
{
  SparseIntArray veH;
  byte[] veI;
  
  private f(SparseIntArray paramSparseIntArray, byte[] paramArrayOfByte)
  {
    GMTrace.i(367756574720L, 2740);
    this.veH = paramSparseIntArray;
    this.veI = paramArrayOfByte;
    GMTrace.o(367756574720L, 2740);
  }
  
  public static f a(SparseIntArray paramSparseIntArray, InputStream paramInputStream, int paramInt)
  {
    GMTrace.i(367890792448L, 2741);
    byte[] arrayOfByte = new byte[paramInt];
    try
    {
      if (paramInputStream.read(arrayOfByte, 0, arrayOfByte.length) != arrayOfByte.length) {
        w.e("MicroMsg.language.StringsCollection", "[cpan] newStringsCollection failed. data length no equal.");
      }
      paramSparseIntArray = new f(paramSparseIntArray, arrayOfByte);
      GMTrace.o(367890792448L, 2741);
      return paramSparseIntArray;
    }
    catch (IOException paramSparseIntArray)
    {
      w.e("MicroMsg.language.StringsCollection", "[cpan] newStringsCollection failed. %s", new Object[] { bg.f(paramSparseIntArray) });
      GMTrace.o(367890792448L, 2741);
    }
    return null;
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(368025010176L, 2742);
    for (;;)
    {
      try
      {
        paramInt = this.veH.indexOfKey(paramInt);
        if (paramInt < 0)
        {
          GMTrace.o(368025010176L, 2742);
          return null;
        }
        i = this.veH.valueAt(paramInt);
        if (paramInt >= this.veH.size() - 1) {
          continue;
        }
        paramInt = this.veH.valueAt(paramInt + 1) - i;
        str = new String(this.veI, i, paramInt, "UTF-8");
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        int i;
        String str;
        w.e("MicroMsg.language.StringsCollection", "[cpan] getString failed. %s", new Object[] { bg.f(localUnsupportedEncodingException) });
        Object localObject1 = null;
        continue;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.language.StringsCollection", "[cpan] getString failed. %s", new Object[] { bg.f(localException) });
        Object localObject2 = null;
        continue;
      }
      GMTrace.o(368025010176L, 2742);
      return str;
      paramInt = this.veI.length;
      paramInt -= i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bs\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */