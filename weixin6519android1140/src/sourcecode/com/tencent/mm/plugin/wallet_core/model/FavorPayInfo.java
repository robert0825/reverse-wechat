package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;
import java.util.List;

public class FavorPayInfo
  implements Parcelable
{
  public static final Parcelable.Creator<FavorPayInfo> CREATOR;
  public String rgo;
  public int rgp;
  public String rgq;
  public String rgr;
  public String rgs;
  public List<String> rgt;
  
  static
  {
    GMTrace.i(6911005032448L, 51491);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6911005032448L, 51491);
  }
  
  public FavorPayInfo()
  {
    GMTrace.i(6910468161536L, 51487);
    this.rgt = new LinkedList();
    GMTrace.o(6910468161536L, 51487);
  }
  
  public FavorPayInfo(Parcel paramParcel)
  {
    GMTrace.i(6910602379264L, 51488);
    this.rgt = new LinkedList();
    this.rgo = paramParcel.readString();
    this.rgp = paramParcel.readInt();
    this.rgq = paramParcel.readString();
    this.rgr = paramParcel.readString();
    this.rgs = paramParcel.readString();
    this.rgt = paramParcel.createStringArrayList();
    GMTrace.o(6910602379264L, 51488);
  }
  
  public int describeContents()
  {
    GMTrace.i(6910736596992L, 51489);
    GMTrace.o(6910736596992L, 51489);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(6910870814720L, 51490);
    paramParcel.writeString(this.rgo);
    paramParcel.writeInt(this.rgp);
    paramParcel.writeString(this.rgq);
    paramParcel.writeString(this.rgr);
    paramParcel.writeString(this.rgs);
    paramParcel.writeStringList(this.rgt);
    GMTrace.o(6910870814720L, 51490);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\FavorPayInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */