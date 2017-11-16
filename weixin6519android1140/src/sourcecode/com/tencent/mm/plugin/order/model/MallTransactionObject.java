package com.tencent.mm.plugin.order.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class MallTransactionObject
  implements Parcelable
{
  public static final Parcelable.Creator<MallTransactionObject> CREATOR;
  public String desc;
  public int eCt;
  public String eRP;
  public int ewG;
  public int gGY;
  public String hQJ;
  public double jWS;
  public List<MallOrderDetailObject.HelpCenter> nDR;
  public int nDS;
  public String nDU;
  public String nEA;
  public String nEB;
  public String nEC;
  public int nED;
  public int nEE;
  public double nEF;
  public String nEG;
  public int nEH;
  public String nEI;
  public int nEJ;
  public int nEK;
  public int nEL;
  public String nEM;
  public String nEN;
  public String nEO;
  public String nEP;
  public String nEQ;
  public String nER;
  public double nES;
  public String nET;
  public int nEc;
  public String nEd;
  public String nEe;
  public String nEf;
  public String nEg;
  public String nEh;
  public String nEi;
  public String nEj;
  public String nEk;
  public String nEl;
  public String nEm;
  public int nEn;
  public String nEo;
  public String nEp;
  public String nEq;
  public String nEr;
  public String nEs;
  public String nEt;
  public String nEu;
  public String nEv;
  public String nEw;
  public double nEx;
  public String nEy;
  public String nEz;
  public int type;
  
  static
  {
    GMTrace.i(6628610932736L, 49387);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6628610932736L, 49387);
  }
  
  public MallTransactionObject()
  {
    GMTrace.i(6627939844096L, 49382);
    this.jWS = 0.0D;
    this.nDR = new LinkedList();
    this.nDS = -1;
    GMTrace.o(6627939844096L, 49382);
  }
  
  public MallTransactionObject(Parcel paramParcel)
  {
    GMTrace.i(6628074061824L, 49383);
    this.jWS = 0.0D;
    this.nDR = new LinkedList();
    this.nDS = -1;
    this.eCt = paramParcel.readInt();
    this.nEc = paramParcel.readInt();
    this.ewG = paramParcel.readInt();
    this.nEd = paramParcel.readString();
    this.nEe = paramParcel.readString();
    this.nEf = paramParcel.readString();
    this.nEg = paramParcel.readString();
    this.desc = paramParcel.readString();
    this.nEh = paramParcel.readString();
    this.nEi = paramParcel.readString();
    this.jWS = paramParcel.readDouble();
    this.nEj = paramParcel.readString();
    this.nEk = paramParcel.readString();
    this.nEl = paramParcel.readString();
    this.nEm = paramParcel.readString();
    this.gGY = paramParcel.readInt();
    this.nEn = paramParcel.readInt();
    this.eRP = paramParcel.readString();
    this.nEo = paramParcel.readString();
    this.nEp = paramParcel.readString();
    this.nEr = paramParcel.readString();
    this.nEs = paramParcel.readString();
    this.nDU = paramParcel.readString();
    this.nEt = paramParcel.readString();
    this.hQJ = paramParcel.readString();
    this.nEu = paramParcel.readString();
    this.nEv = paramParcel.readString();
    this.nEw = paramParcel.readString();
    this.nEx = paramParcel.readDouble();
    this.nEy = paramParcel.readString();
    this.nEz = paramParcel.readString();
    this.nEA = paramParcel.readString();
    this.nEB = paramParcel.readString();
    this.nED = paramParcel.readInt();
    this.nEJ = paramParcel.readInt();
    this.nEF = paramParcel.readDouble();
    this.nEG = paramParcel.readString();
    this.nEH = paramParcel.readInt();
    this.nEI = paramParcel.readString();
    this.nEJ = paramParcel.readInt();
    this.nEK = paramParcel.readInt();
    this.nEL = paramParcel.readInt();
    this.nEM = paramParcel.readString();
    this.nEN = paramParcel.readString();
    this.nEO = paramParcel.readString();
    this.nEP = paramParcel.readString();
    this.nEQ = paramParcel.readString();
    this.nER = paramParcel.readString();
    this.nES = paramParcel.readDouble();
    this.nET = paramParcel.readString();
    this.nEC = paramParcel.readString();
    this.nDS = paramParcel.readInt();
    int j = paramParcel.readInt();
    this.nDR = new LinkedList();
    int i = 0;
    while (i < j)
    {
      MallOrderDetailObject.HelpCenter localHelpCenter = (MallOrderDetailObject.HelpCenter)paramParcel.readParcelable(MallOrderDetailObject.HelpCenter.class.getClassLoader());
      this.nDR.add(localHelpCenter);
      i += 1;
    }
    GMTrace.o(6628074061824L, 49383);
  }
  
  public static MallTransactionObject I(JSONObject paramJSONObject)
  {
    GMTrace.i(6628342497280L, 49385);
    if (paramJSONObject != null)
    {
      MallTransactionObject localMallTransactionObject = new MallTransactionObject();
      localMallTransactionObject.type = paramJSONObject.optInt("rec_type", 1);
      localMallTransactionObject.eCt = paramJSONObject.optInt("sub_pay_type", 0);
      localMallTransactionObject.nEc = paramJSONObject.optInt("pay_scene");
      localMallTransactionObject.ewG = paramJSONObject.optInt("user_type");
      localMallTransactionObject.nEd = paramJSONObject.optString("buy_uin");
      localMallTransactionObject.nEe = paramJSONObject.optString("buy_name");
      localMallTransactionObject.nEf = paramJSONObject.optString("sale_uin");
      localMallTransactionObject.nEg = paramJSONObject.optString("sale_name");
      localMallTransactionObject.eRP = paramJSONObject.optString("trans_id");
      localMallTransactionObject.nEo = paramJSONObject.optString("sp_billno");
      localMallTransactionObject.desc = paramJSONObject.optString("goods_name");
      localMallTransactionObject.nEh = paramJSONObject.optString("goods_detail");
      localMallTransactionObject.jWS = (paramJSONObject.optDouble("fee") / 100.0D);
      localMallTransactionObject.nEj = paramJSONObject.optString("fee_color");
      localMallTransactionObject.nEk = paramJSONObject.optString("trade_state");
      localMallTransactionObject.nEl = paramJSONObject.optString("trade_state_name");
      localMallTransactionObject.nEm = paramJSONObject.optString("trade_state_color");
      localMallTransactionObject.nEp = paramJSONObject.optString("buy_bank_name");
      localMallTransactionObject.nEq = paramJSONObject.optString("card_tail");
      localMallTransactionObject.gGY = paramJSONObject.optInt("create_timestamp");
      localMallTransactionObject.nEn = paramJSONObject.optInt("modify_timestamp");
      localMallTransactionObject.nEr = paramJSONObject.optString("fee_type");
      JSONObject localJSONObject = paramJSONObject.optJSONObject("appinfo");
      if (localJSONObject != null)
      {
        localMallTransactionObject.nEs = localJSONObject.optString("app_username");
        localMallTransactionObject.nDU = localJSONObject.optString("app_telephone");
        localMallTransactionObject.nEt = localJSONObject.optString("app_nickname");
        localMallTransactionObject.hQJ = localJSONObject.optString("app_icon_url");
        localMallTransactionObject.nEB = localJSONObject.optString("safeguard_url");
        localMallTransactionObject.nEC = localJSONObject.optString("display_name");
      }
      localMallTransactionObject.nEu = paramJSONObject.optString("deliver_price");
      localMallTransactionObject.nEv = paramJSONObject.optString("preferential_price");
      localMallTransactionObject.nEw = paramJSONObject.optString("discount");
      localMallTransactionObject.nEx = (paramJSONObject.optDouble("original_total_fee") / 100.0D);
      localMallTransactionObject.nEy = paramJSONObject.optString("total_price");
      localMallTransactionObject.nEz = paramJSONObject.optString("receipt_company");
      localMallTransactionObject.nEA = paramJSONObject.optString("biz_pledge");
      localMallTransactionObject.nED = paramJSONObject.optInt("pre_fetch_timestamp");
      localMallTransactionObject.nEE = paramJSONObject.optInt("arrived_timestamp");
      localMallTransactionObject.nEF = (paramJSONObject.optDouble("transfer_fee") / 100.0D);
      localMallTransactionObject.nEG = paramJSONObject.optString("receiver_name");
      localMallTransactionObject.nEH = paramJSONObject.optInt("allow_resend_msg");
      localMallTransactionObject.nEI = paramJSONObject.optString("charge_fee");
      localMallTransactionObject.nEJ = paramJSONObject.optInt("receive_timestamp");
      localMallTransactionObject.nEK = paramJSONObject.optInt("refund_timestamp");
      localMallTransactionObject.nEL = paramJSONObject.optInt("create_timestamp");
      localMallTransactionObject.nEM = paramJSONObject.optString("buy_bank_type");
      localMallTransactionObject.nEN = paramJSONObject.optString("payer_name");
      localMallTransactionObject.nEO = paramJSONObject.optString("true_name");
      localMallTransactionObject.nEP = paramJSONObject.optString("refund_bank_type");
      localMallTransactionObject.nEQ = paramJSONObject.optString("rateinfo");
      localMallTransactionObject.nER = paramJSONObject.optString("original_feeinfo");
      localMallTransactionObject.nES = (paramJSONObject.optDouble("fetch_total_fee") / 100.0D);
      localMallTransactionObject.nET = paramJSONObject.optString("fetch_total_fee_color");
      localMallTransactionObject.nDS = paramJSONObject.optInt("userroll_type");
      localMallTransactionObject.nDR = J(paramJSONObject);
      GMTrace.o(6628342497280L, 49385);
      return localMallTransactionObject;
    }
    GMTrace.o(6628342497280L, 49385);
    return null;
  }
  
  private static List<MallOrderDetailObject.HelpCenter> J(JSONObject paramJSONObject)
  {
    GMTrace.i(6628476715008L, 49386);
    localLinkedList = new LinkedList();
    try
    {
      paramJSONObject = paramJSONObject.getJSONArray("help_center");
      int i = 0;
      while (i < paramJSONObject.length())
      {
        MallOrderDetailObject.HelpCenter localHelpCenter = new MallOrderDetailObject.HelpCenter();
        JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
        localHelpCenter.eCg = localJSONObject.optBoolean("is_show_button");
        localHelpCenter.name = localJSONObject.optString("name");
        localHelpCenter.url = localJSONObject.optString("url");
        localLinkedList.add(localHelpCenter);
        i += 1;
      }
      return localLinkedList;
    }
    catch (Exception paramJSONObject)
    {
      w.printErrStackTrace("MicroMsg.MallTransactionObject", paramJSONObject, "", new Object[0]);
      w.e("MicroMsg.MallTransactionObject", "parseHelpCenter error %s", new Object[] { paramJSONObject.getMessage() });
      GMTrace.o(6628476715008L, 49386);
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(6627805626368L, 49381);
    GMTrace.o(6627805626368L, 49381);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(6628208279552L, 49384);
    paramParcel.writeInt(this.eCt);
    paramParcel.writeInt(this.nEc);
    paramParcel.writeInt(this.ewG);
    paramParcel.writeString(this.nEd);
    paramParcel.writeString(this.nEe);
    paramParcel.writeString(this.nEf);
    paramParcel.writeString(this.nEg);
    paramParcel.writeString(this.desc);
    paramParcel.writeString(this.nEh);
    paramParcel.writeString(this.nEi);
    paramParcel.writeDouble(this.jWS);
    paramParcel.writeString(this.nEj);
    paramParcel.writeString(this.nEk);
    paramParcel.writeString(this.nEl);
    paramParcel.writeString(this.nEm);
    paramParcel.writeInt(this.gGY);
    paramParcel.writeInt(this.nEn);
    paramParcel.writeString(this.eRP);
    paramParcel.writeString(this.nEo);
    paramParcel.writeString(this.nEp);
    paramParcel.writeString(this.nEr);
    paramParcel.writeString(this.nEs);
    paramParcel.writeString(this.nDU);
    paramParcel.writeString(this.nEt);
    paramParcel.writeString(this.hQJ);
    paramParcel.writeString(this.nEu);
    paramParcel.writeString(this.nEv);
    paramParcel.writeString(this.nEw);
    paramParcel.writeDouble(this.nEx);
    paramParcel.writeString(this.nEy);
    paramParcel.writeString(this.nEz);
    paramParcel.writeString(this.nEA);
    paramParcel.writeString(this.nEB);
    paramParcel.writeInt(this.nED);
    paramParcel.writeInt(this.nEJ);
    paramParcel.writeDouble(this.nEF);
    paramParcel.writeString(this.nEG);
    paramParcel.writeInt(this.nEH);
    paramParcel.writeString(this.nEI);
    paramParcel.writeInt(this.nEJ);
    paramParcel.writeInt(this.nEK);
    paramParcel.writeInt(this.nEL);
    paramParcel.writeString(this.nEM);
    paramParcel.writeString(this.nEN);
    paramParcel.writeString(this.nEO);
    paramParcel.writeString(this.nEP);
    paramParcel.writeString(this.nEQ);
    paramParcel.writeString(this.nER);
    paramParcel.writeDouble(this.nES);
    paramParcel.writeString(this.nET);
    paramParcel.writeString(this.nEC);
    paramParcel.writeInt(this.nDS);
    paramParcel.writeInt(this.nDR.size());
    Iterator localIterator = this.nDR.iterator();
    while (localIterator.hasNext()) {
      paramParcel.writeParcelable((MallOrderDetailObject.HelpCenter)localIterator.next(), paramInt);
    }
    GMTrace.o(6628208279552L, 49384);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\model\MallTransactionObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */