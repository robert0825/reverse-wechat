package com.tencent.mm.wallet_core.ui.formview;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.a.a;
import com.tencent.mm.y.q;
import com.tenpay.android.wechat.TenpaySecureEditText;

abstract interface c
{
  public static final class a
  {
    public static String a(int paramInt, TenpaySecureEditText paramTenpaySecureEditText)
    {
      GMTrace.i(1483642765312L, 11054);
      if (q.zR())
      {
        w.v("MicroMsg.IEncryptDelegate", "hy: is payu. encrypt with payu");
        new c.b();
        paramTenpaySecureEditText.setSecureEncrypt(new a(paramInt));
        paramTenpaySecureEditText = paramTenpaySecureEditText.get3DesEncrptData();
        GMTrace.o(1483642765312L, 11054);
        return paramTenpaySecureEditText;
      }
      w.v("MicroMsg.IEncryptDelegate", "hy: is tenpay. encrypt with tenpay");
      new c.c();
      switch (paramInt)
      {
      default: 
        if (paramTenpaySecureEditText.getText().toString() == null)
        {
          GMTrace.o(1483642765312L, 11054);
          return "";
        }
        break;
      case 2: 
        paramTenpaySecureEditText = paramTenpaySecureEditText.get3DesEncrptData();
        GMTrace.o(1483642765312L, 11054);
        return paramTenpaySecureEditText;
      case 1: 
        paramTenpaySecureEditText = paramTenpaySecureEditText.getEncryptDataWithHash(true);
        GMTrace.o(1483642765312L, 11054);
        return paramTenpaySecureEditText;
      case 0: 
        paramTenpaySecureEditText = paramTenpaySecureEditText.getEncryptDataWithHash(false);
        GMTrace.o(1483642765312L, 11054);
        return paramTenpaySecureEditText;
      case 3: 
        paramTenpaySecureEditText = paramTenpaySecureEditText.get3DesVerifyCode();
        GMTrace.o(1483642765312L, 11054);
        return paramTenpaySecureEditText;
      }
      paramTenpaySecureEditText = paramTenpaySecureEditText.getText().toString();
      GMTrace.o(1483642765312L, 11054);
      return paramTenpaySecureEditText;
    }
  }
  
  public static final class b
  {
    public b()
    {
      GMTrace.i(1500017328128L, 11176);
      GMTrace.o(1500017328128L, 11176);
    }
  }
  
  public static final class c
  {
    public c()
    {
      GMTrace.i(1496527667200L, 11150);
      GMTrace.o(1496527667200L, 11150);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\ui\formview\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */