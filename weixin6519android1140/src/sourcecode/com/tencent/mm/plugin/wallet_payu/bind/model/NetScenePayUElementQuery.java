package com.tencent.mm.plugin.wallet_payu.bind.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class NetScenePayUElementQuery
  extends a
{
  public String rth;
  public PayUBankcardElement rtj;
  
  public NetScenePayUElementQuery(String paramString)
  {
    GMTrace.i(7912671936512L, 58954);
    this.rth = paramString;
    HashMap localHashMap = new HashMap();
    localHashMap.put("card_number", paramString);
    x(localHashMap);
    GMTrace.o(7912671936512L, 58954);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7912940371968L, 58956);
    this.rtj = new PayUBankcardElement();
    this.rtj.rtk = paramJSONObject.optString("bin");
    this.rtj.nEp = paramJSONObject.optString("bank_name");
    this.rtj.rtl = paramJSONObject.optString("issuer_type");
    this.rtj.cardType = paramJSONObject.optString("card_type");
    this.rtj.eMJ = paramJSONObject.optString("payu_reference");
    GMTrace.o(7912940371968L, 58956);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7912806154240L, 58955);
    GMTrace.o(7912806154240L, 58955);
    return 22;
  }
  
  public static class PayUBankcardElement
    implements Parcelable
  {
    public String cardType;
    public String eMJ;
    public String nEp;
    public String rtk;
    public String rtl;
    
    public PayUBankcardElement()
    {
      GMTrace.i(7917503774720L, 58990);
      this.rtk = "";
      this.nEp = "";
      this.rtl = "";
      this.cardType = "";
      this.eMJ = "";
      GMTrace.o(7917503774720L, 58990);
    }
    
    public int describeContents()
    {
      GMTrace.i(7917637992448L, 58991);
      GMTrace.o(7917637992448L, 58991);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(7917772210176L, 58992);
      paramParcel.writeString(this.rtk);
      paramParcel.writeString(this.nEp);
      paramParcel.writeString(this.rtl);
      paramParcel.writeString(this.cardType);
      paramParcel.writeString(this.eMJ);
      GMTrace.o(7917772210176L, 58992);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\bind\model\NetScenePayUElementQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */