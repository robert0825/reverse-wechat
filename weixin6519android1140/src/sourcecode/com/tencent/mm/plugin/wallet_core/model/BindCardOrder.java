package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public class BindCardOrder
  implements Parcelable
{
  public static final Parcelable.Creator<BindCardOrder> CREATOR;
  public static int rfh;
  public static int rfi;
  public static int rfj;
  public int jumpType;
  public String nDt;
  private String rfg;
  public int rfk;
  public String rfl;
  public String rfn;
  public int rfo;
  public int rfp;
  public m rfq;
  public m.a rfr;
  public m.b rfs;
  public String yvq;
  public String yvr;
  public String yvs;
  
  static
  {
    GMTrace.i(20887231266816L, 155622);
    rfh = 1;
    rfi = 2;
    rfj = 6;
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(20887231266816L, 155622);
  }
  
  public BindCardOrder()
  {
    GMTrace.i(20886291742720L, 155615);
    this.rfg = "";
    this.rfl = "";
    this.yvq = "";
    this.yvr = "";
    this.yvs = "";
    this.rfn = "";
    GMTrace.o(20886291742720L, 155615);
  }
  
  protected BindCardOrder(Parcel paramParcel)
  {
    GMTrace.i(20886425960448L, 155616);
    this.rfg = "";
    this.rfl = "";
    this.yvq = "";
    this.yvr = "";
    this.yvs = "";
    this.rfn = "";
    this.rfg = paramParcel.readString();
    try
    {
      O(new JSONObject(this.rfg));
      GMTrace.o(20886425960448L, 155616);
      return;
    }
    catch (Exception paramParcel)
    {
      w.printErrStackTrace("MicroMsg.BindCardOrder", paramParcel, "", new Object[0]);
      GMTrace.o(20886425960448L, 155616);
    }
  }
  
  public final void O(JSONObject paramJSONObject)
  {
    GMTrace.i(20887097049088L, 155621);
    if (paramJSONObject == null) {}
    for (Object localObject = "";; localObject = paramJSONObject.toString())
    {
      this.rfg = ((String)localObject);
      w.i("MicroMsg.BindCardOrder", "feed json %s", new Object[] { this.rfg });
      try
      {
        this.rfk = paramJSONObject.optInt("show_bind_succ_page", 0);
        this.rfl = paramJSONObject.optString("bind_succ_btn_wording", "");
        this.yvq = paramJSONObject.optString("bind_succ_remind_wording", "");
        this.jumpType = paramJSONObject.optInt("jump_type", 0);
        this.rfn = paramJSONObject.optString("bind_serial");
        localObject = paramJSONObject.optJSONObject("activity_info");
        this.rfq = new m();
        if (localObject != null)
        {
          m localm = this.rfq;
          localm.rgN = ((JSONObject)localObject).optLong("activity_id");
          localm.rgO = ((JSONObject)localObject).optLong("activity_type", 0L);
          localm.rgP = ((JSONObject)localObject).optLong("award_id");
          localm.rgQ = ((JSONObject)localObject).optInt("send_record_id");
          localm.rgR = ((JSONObject)localObject).optInt("user_record_id");
          localm.rgS = ((JSONObject)localObject).optLong("activity_mch_id", 0L);
        }
        localObject = paramJSONObject.optJSONObject("h5_info");
        if (localObject != null)
        {
          this.rfr = new m.a();
          this.rfr.P((JSONObject)localObject);
        }
        localObject = paramJSONObject.optJSONObject("native_info");
        if (localObject != null)
        {
          this.rfr = new m.a();
          this.rfr.P((JSONObject)localObject);
        }
        paramJSONObject = paramJSONObject.optJSONObject("tinyapp_info");
        if (paramJSONObject != null)
        {
          this.rfs = new m.b();
          localObject = this.rfs;
          ((m.b)localObject).rgV = paramJSONObject.optString("tinyapp_name");
          ((m.b)localObject).rgW = paramJSONObject.optString("tinyapp_logo");
          ((m.b)localObject).rgX = paramJSONObject.optString("tinyapp_desc");
          ((m.b)localObject).rgY = paramJSONObject.optString("tinyapp_username");
          ((m.b)localObject).rgZ = paramJSONObject.optString("tinyapp_path");
          ((m.b)localObject).rha = paramJSONObject.optString("activity_tinyapp_btn_text");
          ((m.b)localObject).rhb = paramJSONObject.optInt("tinyapp_version", 0);
        }
        GMTrace.o(20887097049088L, 155621);
        return;
      }
      catch (Exception paramJSONObject)
      {
        w.printErrStackTrace("MicroMsg.BindCardOrder", paramJSONObject, "", new Object[0]);
        GMTrace.o(20887097049088L, 155621);
      }
    }
  }
  
  public final boolean byi()
  {
    GMTrace.i(20886828613632L, 155619);
    if ((this.jumpType == rfh) && (this.rfr != null))
    {
      GMTrace.o(20886828613632L, 155619);
      return true;
    }
    GMTrace.o(20886828613632L, 155619);
    return false;
  }
  
  public final boolean byj()
  {
    GMTrace.i(20886962831360L, 155620);
    if ((this.jumpType == rfj) && (this.rfr != null))
    {
      GMTrace.o(20886962831360L, 155620);
      return true;
    }
    GMTrace.o(20886962831360L, 155620);
    return false;
  }
  
  public int describeContents()
  {
    GMTrace.i(20886694395904L, 155618);
    GMTrace.o(20886694395904L, 155618);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(20886560178176L, 155617);
    paramParcel.writeString(this.rfg);
    GMTrace.o(20886560178176L, 155617);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\BindCardOrder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */