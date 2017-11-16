package com.tencent.mm.wallet_core.a;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.w;
import com.tenpay.android.wechat.PayuSecureEncrypt;

public final class a
  extends PayuSecureEncrypt
{
  public a(int paramInt)
  {
    GMTrace.i(1516660326400L, 11300);
    this.mEncrptType = paramInt;
    GMTrace.o(1516660326400L, 11300);
  }
  
  private String f(boolean paramBoolean, String paramString1, String paramString2)
  {
    GMTrace.i(1517331415040L, 11305);
    int i = this.mEncrptType;
    Object localObject = "10";
    StringBuilder localStringBuilder;
    if (-20 == this.mEncrptType)
    {
      i = 40;
      if ((this.mEncrptType == -10) || (this.mEncrptType == -20) || (this.mEncrptType == 60)) {
        localObject = "30";
      }
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(i);
      localStringBuilder.append("|");
      localStringBuilder.append((String)localObject);
      localStringBuilder.append("|");
      localStringBuilder.append(paramString2);
      localStringBuilder.append("|");
      if (!paramBoolean) {
        break label241;
      }
      localStringBuilder.append(aa.RP(paramString1));
    }
    for (;;)
    {
      paramString1 = null;
      try
      {
        paramString2 = localStringBuilder.toString().getBytes();
        localObject = new PByteArray();
        if (!MMProtocalJni.rsaPublicEncrypt(paramString2, (PByteArray)localObject, getRsaEKey().getBytes("UTF-8"), getRsaNKey().getBytes("UTF-8"))) {
          w.e("MicroMsg.WxPayuSecureEncrypt", "MMProtocalJni encrypt failed!");
        }
        paramString2 = "01" + Base64.encodeToString(((PByteArray)localObject).value, 2);
        paramString1 = paramString2;
      }
      catch (Exception paramString2)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.WxPayuSecureEncrypt", paramString2, "", new Object[0]);
        }
      }
      GMTrace.o(1517331415040L, 11305);
      return paramString1;
      if (-10 != this.mEncrptType) {
        break;
      }
      i = 20;
      break;
      label241:
      localStringBuilder.append(paramString1);
    }
  }
  
  private String fs(String paramString1, String paramString2)
  {
    GMTrace.i(1517197197312L, 11304);
    String str = paramString1;
    if (this.mEncrptType != 40)
    {
      str = paramString1;
      if (this.mEncrptType != -20) {
        str = paramString1.replaceAll(" ", "");
      }
    }
    switch (this.mEncrptType)
    {
    default: 
      GMTrace.o(1517197197312L, 11304);
      return str;
    case -20: 
    case -10: 
    case 60: 
      paramString1 = f(true, str, paramString2);
      GMTrace.o(1517197197312L, 11304);
      return paramString1;
    }
    paramString1 = f(false, str, paramString2);
    GMTrace.o(1517197197312L, 11304);
    return paramString1;
  }
  
  public final String desedeEncode(String paramString1, String paramString2)
  {
    GMTrace.i(1516794544128L, 11301);
    paramString1 = fs(paramString1, paramString2);
    GMTrace.o(1516794544128L, 11301);
    return paramString1;
  }
  
  public final String desedeVerifyCode(String paramString1, String paramString2)
  {
    GMTrace.i(1516928761856L, 11302);
    paramString1 = fs(paramString1, paramString2);
    GMTrace.o(1516928761856L, 11302);
    return paramString1;
  }
  
  public final String encryptPasswd(boolean paramBoolean, String paramString1, String paramString2)
  {
    GMTrace.i(1517062979584L, 11303);
    paramString1 = fs(paramString1, paramString2);
    GMTrace.o(1517062979584L, 11303);
    return paramString1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */