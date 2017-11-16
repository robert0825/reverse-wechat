package com.tencent.pb.talkroom.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MultiTalkGroupMember
  implements Parcelable
{
  public static final Parcelable.Creator<MultiTalkGroupMember> CREATOR = new Parcelable.Creator() {};
  public int eMw;
  public int status;
  public int xNB;
  public String xOC = "";
  public String xOD = "";
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "MultiTalkGroupMember [usrName=" + this.xOC + ", inviteUsrName=" + this.xOD + ", status=" + this.status + ", reason=" + this.eMw + ", inviteTime=" + this.xNB + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.xOC == null)
    {
      str = "";
      paramParcel.writeString(str);
      if (this.xOD != null) {
        break label63;
      }
    }
    label63:
    for (String str = "";; str = this.xOD)
    {
      paramParcel.writeString(str);
      paramParcel.writeInt(this.status);
      paramParcel.writeInt(this.eMw);
      paramParcel.writeInt(this.xNB);
      return;
      str = this.xOC;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\pb\talkroom\sdk\MultiTalkGroupMember.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */