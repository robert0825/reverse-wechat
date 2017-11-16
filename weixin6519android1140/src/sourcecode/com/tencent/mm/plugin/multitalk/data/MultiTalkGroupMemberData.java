package com.tencent.mm.plugin.multitalk.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;

public class MultiTalkGroupMemberData
  implements Parcelable
{
  public static final Parcelable.Creator<MultiTalkGroupMemberData> CREATOR;
  MultiTalkGroupMember nlU;
  
  static
  {
    GMTrace.i(4793586155520L, 35715);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(4793586155520L, 35715);
  }
  
  public MultiTalkGroupMemberData(MultiTalkGroupMember paramMultiTalkGroupMember)
  {
    GMTrace.i(4793183502336L, 35712);
    this.nlU = paramMultiTalkGroupMember;
    GMTrace.o(4793183502336L, 35712);
  }
  
  public int describeContents()
  {
    GMTrace.i(4793317720064L, 35713);
    GMTrace.o(4793317720064L, 35713);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(4793451937792L, 35714);
    paramParcel.writeString(bg.aq(this.nlU.xOC, ""));
    paramParcel.writeString(bg.aq(this.nlU.xOD, ""));
    paramParcel.writeInt(this.nlU.status);
    paramParcel.writeInt(this.nlU.eMw);
    paramParcel.writeInt(this.nlU.xNB);
    GMTrace.o(4793451937792L, 35714);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\data\MultiTalkGroupMemberData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */