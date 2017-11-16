package com.tencent.mm.a;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class d
{
  private Cipher epN;
  private Cipher epO;
  
  public d(String paramString)
  {
    GMTrace.i(13859591028736L, 103262);
    try
    {
      paramString = new DESKeySpec(paramString.getBytes("UTF8"));
      paramString = SecretKeyFactory.getInstance("DES").generateSecret(paramString);
      IvParameterSpec localIvParameterSpec = new IvParameterSpec("manifest".getBytes("UTF8"));
      this.epN = Cipher.getInstance("DES/CBC/PKCS5Padding");
      this.epN.init(1, paramString, localIvParameterSpec);
      this.epO = Cipher.getInstance("DES/CBC/PKCS5Padding");
      this.epO.init(2, paramString, localIvParameterSpec);
      GMTrace.o(13859591028736L, 103262);
      return;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.DESUtil", paramString, "", new Object[0]);
      GMTrace.o(13859591028736L, 103262);
    }
  }
  
  public final String aX(String paramString)
  {
    GMTrace.i(13859725246464L, 103263);
    try
    {
      Object localObject = Base64.decode(paramString, 0);
      localObject = new String(this.epO.doFinal((byte[])localObject), "UTF8");
      paramString = (String)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        paramString = "[des]" + paramString + "|" + localException.toString();
      }
    }
    GMTrace.o(13859725246464L, 103263);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */