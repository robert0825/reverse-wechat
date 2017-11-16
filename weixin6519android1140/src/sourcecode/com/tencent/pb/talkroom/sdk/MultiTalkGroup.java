package com.tencent.pb.talkroom.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public class MultiTalkGroup
  implements Parcelable
{
  public static final Parcelable.Creator<MultiTalkGroup> CREATOR = new Parcelable.Creator() {};
  public int xKw;
  public String xOA = "";
  public List<MultiTalkGroupMember> xOB = new ArrayList();
  public String xOx = "";
  public String xOy = "";
  public String xOz = "";
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "MultiTalkGroup [mMultiTalkGroupId=" + this.xOx + ", mMultiTalkClientGroupId=" + this.xOy + ", mWxGroupId=" + this.xOz + ", mRouteId=" + this.xKw + ", mCreatorUsrName=" + this.xOA + ", mMultiTalkGroupMemberList=" + this.xOB + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int j = 0;
    String str;
    if (this.xOx == null)
    {
      str = "";
      paramParcel.writeString(str);
      if (this.xOy != null) {
        break label136;
      }
      str = "";
      label31:
      paramParcel.writeString(str);
      if (this.xOz != null) {
        break label145;
      }
      str = "";
      label48:
      paramParcel.writeString(str);
      paramParcel.writeInt(this.xKw);
      if (this.xOA != null) {
        break label154;
      }
      str = "";
      label73:
      paramParcel.writeString(str);
      if (this.xOB != null) {
        break label163;
      }
    }
    label136:
    label145:
    label154:
    label163:
    for (int i = 0;; i = this.xOB.size())
    {
      paramParcel.writeInt(i);
      while (j < i)
      {
        paramParcel.writeParcelable((MultiTalkGroupMember)this.xOB.get(j), paramInt);
        j += 1;
      }
      str = this.xOx;
      break;
      str = this.xOy;
      break label31;
      str = this.xOz;
      break label48;
      str = this.xOA;
      break label73;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\pb\talkroom\sdk\MultiTalkGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */