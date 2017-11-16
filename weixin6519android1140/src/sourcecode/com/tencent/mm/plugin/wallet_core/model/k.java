package com.tencent.mm.plugin.wallet_core.model;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.security.PublicKey;
import javax.crypto.Cipher;

public final class k
{
  static k rgz;
  private PublicKey rgA;
  
  public k()
  {
    GMTrace.i(6870471278592L, 51189);
    this.rgA = null;
    GMTrace.o(6870471278592L, 51189);
  }
  
  public final String aM(byte[] paramArrayOfByte)
  {
    GMTrace.i(17628290613248L, 131341);
    try
    {
      this.rgA = l.l(ab.getContext(), "lbs_rsa_public_key.pem");
      w.i("MicroMsg.LocationEncrypt", "getPemPublickKeyFromAsset23 done2");
      PublicKey localPublicKey = this.rgA;
      Cipher localCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
      localCipher.init(1, localPublicKey);
      paramArrayOfByte = new String(Base64.encode(localCipher.doFinal(paramArrayOfByte), 0));
      GMTrace.o(17628290613248L, 131341);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      w.e("MicroMsg.LocationEncrypt", "encry publicKey error %s", new Object[] { paramArrayOfByte.getMessage() });
      GMTrace.o(17628290613248L, 131341);
    }
    return "";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */