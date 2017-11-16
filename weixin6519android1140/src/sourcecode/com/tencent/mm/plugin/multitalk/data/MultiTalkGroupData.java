package com.tencent.mm.plugin.multitalk.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import java.util.List;

public class MultiTalkGroupData
  implements Parcelable
{
  public static final Parcelable.Creator<MultiTalkGroupData> CREATOR;
  private MultiTalkGroup nlT;
  
  static
  {
    GMTrace.i(4794659897344L, 35723);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(4794659897344L, 35723);
  }
  
  public MultiTalkGroupData()
  {
    GMTrace.i(4794123026432L, 35719);
    GMTrace.o(4794123026432L, 35719);
  }
  
  public MultiTalkGroupData(MultiTalkGroup paramMultiTalkGroup)
  {
    GMTrace.i(4794257244160L, 35720);
    this.nlT = paramMultiTalkGroup;
    GMTrace.o(4794257244160L, 35720);
  }
  
  public int describeContents()
  {
    GMTrace.i(4794391461888L, 35721);
    GMTrace.o(4794391461888L, 35721);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(4794525679616L, 35722);
    paramParcel.writeString(bg.aq(this.nlT.xOx, ""));
    paramParcel.writeString(bg.aq(this.nlT.xOy, ""));
    paramParcel.writeString(bg.aq(this.nlT.xOz, ""));
    paramParcel.writeInt(this.nlT.xKw);
    paramParcel.writeString(bg.aq(this.nlT.xOA, ""));
    paramParcel.writeInt(this.nlT.xOB.size());
    int i = 0;
    while (i < this.nlT.xOB.size())
    {
      paramParcel.writeParcelable(new MultiTalkGroupMemberData((MultiTalkGroupMember)this.nlT.xOB.get(i)), paramInt);
      i += 1;
    }
    GMTrace.o(4794525679616L, 35722);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\data\MultiTalkGroupData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */