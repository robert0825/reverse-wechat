package com.tencent.mm.plugin.report.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;

class BroadCastData
  implements Parcelable
{
  public static final Parcelable.Creator<BroadCastData> CREATOR;
  ArrayList<KVReportDataInfo> oqA;
  ArrayList<StIDKeyDataInfo> oqB;
  ArrayList<GroupIDKeyDataInfo> oqC;
  
  static
  {
    GMTrace.i(13115890597888L, 97721);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(13115890597888L, 97721);
  }
  
  public BroadCastData()
  {
    GMTrace.i(13115219509248L, 97716);
    this.oqA = new ArrayList();
    this.oqB = new ArrayList();
    this.oqC = new ArrayList();
    GMTrace.o(13115219509248L, 97716);
  }
  
  protected BroadCastData(Parcel paramParcel)
  {
    GMTrace.i(13115487944704L, 97718);
    this.oqA = new ArrayList();
    this.oqB = new ArrayList();
    this.oqC = new ArrayList();
    paramParcel.readTypedList(this.oqA, KVReportDataInfo.CREATOR);
    paramParcel.readTypedList(this.oqB, StIDKeyDataInfo.CREATOR);
    paramParcel.readTypedList(this.oqC, GroupIDKeyDataInfo.CREATOR);
    GMTrace.o(13115487944704L, 97718);
  }
  
  public BroadCastData(BroadCastData paramBroadCastData)
  {
    GMTrace.i(13115353726976L, 97717);
    this.oqA = new ArrayList();
    this.oqB = new ArrayList();
    this.oqC = new ArrayList();
    if (paramBroadCastData == null)
    {
      GMTrace.o(13115353726976L, 97717);
      return;
    }
    this.oqA = new ArrayList(paramBroadCastData.oqA);
    this.oqB = new ArrayList(paramBroadCastData.oqB);
    this.oqC = new ArrayList(paramBroadCastData.oqC);
    GMTrace.o(13115353726976L, 97717);
  }
  
  public int describeContents()
  {
    GMTrace.i(13115622162432L, 97719);
    GMTrace.o(13115622162432L, 97719);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(13115756380160L, 97720);
    paramParcel.writeTypedList(this.oqA);
    paramParcel.writeTypedList(this.oqB);
    paramParcel.writeTypedList(this.oqC);
    GMTrace.o(13115756380160L, 97720);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\service\BroadCastData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */