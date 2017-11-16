package com.tencent.mm.plugin.wallet_index.b.a;

import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import org.json.JSONObject;

public final class d
{
  public String klt;
  String mPackageName;
  public String mToken;
  public String qiS;
  String rrV;
  public String rrW;
  long rrX;
  int rrY;
  public String rrZ;
  public String rsa;
  public String rsb;
  public String rsc;
  
  public d(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(7588804558848L, 56541);
    this.rrV = paramString1;
    this.rsa = paramString2;
    paramString1 = new JSONObject(this.rsa);
    this.rrW = paramString1.optString("orderId");
    this.mPackageName = paramString1.optString("packageName");
    this.klt = paramString1.optString("productId");
    this.rrX = paramString1.optLong("purchaseTime");
    this.rrY = paramString1.optInt("purchaseState");
    paramString2 = paramString1.optString("developerPayload");
    ArrayList localArrayList = KH(paramString2);
    if (localArrayList.size() == 3)
    {
      this.rrZ = ((String)localArrayList.get(0));
      this.rsc = ((String)localArrayList.get(1));
      this.rsb = ((String)localArrayList.get(2));
    }
    for (;;)
    {
      this.mToken = paramString1.optString("token", paramString1.optString("purchaseToken"));
      this.qiS = paramString3;
      GMTrace.o(7588804558848L, 56541);
      return;
      this.rrZ = paramString2;
    }
  }
  
  public d(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(7588938776576L, 56542);
    this.klt = paramString1;
    this.rrZ = paramString2;
    this.rsb = paramString3;
    this.rsc = paramString4;
    GMTrace.o(7588938776576L, 56542);
  }
  
  private static ArrayList<String> KH(String paramString)
  {
    GMTrace.i(7589072994304L, 56543);
    ArrayList localArrayList = new ArrayList();
    while (paramString.indexOf("[#]") >= 0)
    {
      String str = paramString.substring(0, paramString.indexOf("[#]"));
      paramString = paramString.substring(str.length() + 3);
      localArrayList.add(str);
    }
    localArrayList.add(paramString);
    GMTrace.o(7589072994304L, 56543);
    return localArrayList;
  }
  
  public final String toString()
  {
    GMTrace.i(7589207212032L, 56544);
    String str = "PurchaseInfo(type:" + this.rrV + "):" + this.rsa;
    GMTrace.o(7589207212032L, 56544);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_index\b\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */