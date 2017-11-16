package com.tencent.mm.plugin.qqmail.b;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class k
{
  String eMI;
  private String[] nSE;
  private String[] nSF;
  private String[] nSG;
  String nSH;
  a[] nSI;
  a[] nSJ;
  String nSb;
  
  public k(String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString2)
  {
    GMTrace.i(5446555402240L, 40580);
    this.eMI = null;
    this.nSE = null;
    this.nSF = null;
    this.nSG = null;
    this.nSb = null;
    this.nSH = null;
    this.nSI = null;
    this.nSJ = null;
    if (!bg.nm(paramString1)) {
      this.eMI = paramString1;
    }
    if ((paramArrayOfString1 != null) && (paramArrayOfString1.length > 0))
    {
      this.nSE = paramArrayOfString1;
      if ((paramArrayOfString2 == null) || (paramArrayOfString2.length <= 0)) {
        break label140;
      }
      this.nSF = paramArrayOfString2;
      label92:
      if ((paramArrayOfString3 == null) || (paramArrayOfString3.length <= 0)) {
        break label148;
      }
    }
    label140:
    label148:
    for (this.nSG = paramArrayOfString3;; this.nSG = null)
    {
      if (bg.nm(paramString2)) {
        break label156;
      }
      this.nSb = paramString2;
      GMTrace.o(5446555402240L, 40580);
      return;
      this.nSE = null;
      break;
      this.nSF = null;
      break label92;
    }
    label156:
    this.nSb = null;
    GMTrace.o(5446555402240L, 40580);
  }
  
  public static String EY(String paramString)
  {
    Object localObject = null;
    GMTrace.i(5447092273152L, 40584);
    int k = "abEdf4&^^*sxcSD$%&1sdfz@!~AZcT4s322dA%^&&*$##C$%__SDy4d_(*%".length();
    paramString = paramString + "d$3^&xRw%&*_(";
    try
    {
      paramString = g.n(paramString.getBytes());
      arrayOfChar = new char[paramString.length() * 2];
      int i = 0;
      int j = 0;
      while (i < paramString.length())
      {
        int m = j + 1;
        arrayOfChar[j] = paramString.charAt(i);
        int n = paramString.charAt(i);
        j = m + 1;
        int i1 = paramString.charAt(i);
        arrayOfChar[m] = ((char)("abEdf4&^^*sxcSD$%&1sdfz@!~AZcT4s322dA%^&&*$##C$%__SDy4d_(*%".charAt(n % k) + i1));
        i += 1;
      }
    }
    catch (Exception paramString)
    {
      char[] arrayOfChar;
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MailContentFormatter", paramString, "", new Object[0]);
        w.e("MicroMsg.MailContentFormatter", "attachIdToKey, error:" + paramString.getLocalizedMessage());
        paramString = null;
      }
      paramString = new String(arrayOfChar);
    }
    try
    {
      paramString = g.n(paramString.getBytes("ISO-8859-1"));
      GMTrace.o(5447092273152L, 40584);
      return paramString;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MailContentFormatter", paramString, "", new Object[0]);
        w.e("MicroMsg.MailContentFormatter", "attachIdToKey, error:" + paramString.getLocalizedMessage());
        paramString = (String)localObject;
      }
    }
  }
  
  final String aYv()
  {
    GMTrace.i(5446689619968L, 40581);
    if (this.nSE != null)
    {
      Object localObject1 = new StringBuilder("");
      ((StringBuilder)localObject1).append("To: ");
      Object localObject2 = this.nSE;
      int j = localObject2.length;
      int i = 0;
      while (i < j)
      {
        String str = localObject2[i];
        ((StringBuilder)localObject1).append("\"");
        ((StringBuilder)localObject1).append("=?utf-8?B?");
        ((StringBuilder)localObject1).append(Base64.encodeToString(str.getBytes(), 2));
        ((StringBuilder)localObject1).append("?=");
        ((StringBuilder)localObject1).append("\"");
        ((StringBuilder)localObject1).append(" ");
        ((StringBuilder)localObject1).append("<");
        ((StringBuilder)localObject1).append(str);
        ((StringBuilder)localObject1).append(">");
        ((StringBuilder)localObject1).append(" ,");
        i += 1;
      }
      localObject2 = ((StringBuilder)localObject1).toString();
      i = ((String)localObject2).lastIndexOf(" ,");
      localObject1 = localObject2;
      if (i != -1) {
        localObject1 = ((String)localObject2).substring(0, i);
      }
      GMTrace.o(5446689619968L, 40581);
      return (String)localObject1;
    }
    GMTrace.o(5446689619968L, 40581);
    return null;
  }
  
  final String aYw()
  {
    GMTrace.i(5446823837696L, 40582);
    if (this.nSF != null)
    {
      Object localObject1 = new StringBuilder("");
      ((StringBuilder)localObject1).append("Cc: ");
      Object localObject2 = this.nSF;
      int j = localObject2.length;
      int i = 0;
      while (i < j)
      {
        String str = localObject2[i];
        ((StringBuilder)localObject1).append("\"");
        ((StringBuilder)localObject1).append("=?utf-8?B?");
        ((StringBuilder)localObject1).append(Base64.encodeToString(str.getBytes(), 2));
        ((StringBuilder)localObject1).append("?=");
        ((StringBuilder)localObject1).append("\"");
        ((StringBuilder)localObject1).append(" ");
        ((StringBuilder)localObject1).append("<");
        ((StringBuilder)localObject1).append(str);
        ((StringBuilder)localObject1).append(">");
        ((StringBuilder)localObject1).append(" ,");
        i += 1;
      }
      localObject2 = ((StringBuilder)localObject1).toString();
      i = ((String)localObject2).lastIndexOf(" ,");
      localObject1 = localObject2;
      if (i != -1) {
        localObject1 = ((String)localObject2).substring(0, i);
      }
      GMTrace.o(5446823837696L, 40582);
      return (String)localObject1;
    }
    GMTrace.o(5446823837696L, 40582);
    return null;
  }
  
  final String aYx()
  {
    GMTrace.i(5446958055424L, 40583);
    if (this.nSG != null)
    {
      Object localObject1 = new StringBuilder("");
      ((StringBuilder)localObject1).append("Bcc: ");
      Object localObject2 = this.nSF;
      int j = localObject2.length;
      int i = 0;
      while (i < j)
      {
        String str = localObject2[i];
        ((StringBuilder)localObject1).append("\"");
        ((StringBuilder)localObject1).append("=?utf-8?B?");
        ((StringBuilder)localObject1).append(Base64.encodeToString(str.getBytes(), 2));
        ((StringBuilder)localObject1).append("?=");
        ((StringBuilder)localObject1).append("\"");
        ((StringBuilder)localObject1).append(" ");
        ((StringBuilder)localObject1).append("<");
        ((StringBuilder)localObject1).append(str);
        ((StringBuilder)localObject1).append(">");
        ((StringBuilder)localObject1).append(" ,");
        i += 1;
      }
      localObject2 = ((StringBuilder)localObject1).toString();
      i = ((String)localObject2).lastIndexOf(" ,");
      localObject1 = localObject2;
      if (i != -1) {
        localObject1 = ((String)localObject2).substring(0, i);
      }
      GMTrace.o(5446958055424L, 40583);
      return (String)localObject1;
    }
    GMTrace.o(5446958055424L, 40583);
    return null;
  }
  
  public static final class a
  {
    String euR;
    int fileSize;
    String nSK;
    String name;
    
    public a()
    {
      GMTrace.i(5447226490880L, 40585);
      GMTrace.o(5447226490880L, 40585);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */