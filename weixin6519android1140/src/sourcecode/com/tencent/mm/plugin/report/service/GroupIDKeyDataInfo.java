package com.tencent.mm.plugin.report.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import java.util.ArrayList;

class GroupIDKeyDataInfo
  implements Parcelable
{
  public static final Parcelable.Creator<GroupIDKeyDataInfo> CREATOR;
  ArrayList<IDKey> oqD;
  public boolean oqE;
  
  static
  {
    GMTrace.i(13120588218368L, 97756);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(13120588218368L, 97756);
  }
  
  protected GroupIDKeyDataInfo(Parcel paramParcel)
  {
    GMTrace.i(13120454000640L, 97755);
    this.oqD = new ArrayList();
    paramParcel.readTypedList(this.oqD, IDKey.CREATOR);
    if (paramParcel.readInt() == 1) {}
    for (;;)
    {
      this.oqE = bool;
      GMTrace.o(13120454000640L, 97755);
      return;
      bool = false;
    }
  }
  
  GroupIDKeyDataInfo(ArrayList<IDKey> paramArrayList, boolean paramBoolean)
  {
    GMTrace.i(13120051347456L, 97752);
    this.oqD = new ArrayList();
    this.oqD = paramArrayList;
    this.oqE = false;
    GMTrace.o(13120051347456L, 97752);
  }
  
  public int describeContents()
  {
    GMTrace.i(13120185565184L, 97753);
    GMTrace.o(13120185565184L, 97753);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(13120319782912L, 97754);
    paramParcel.writeTypedList(this.oqD);
    if (this.oqE) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      GMTrace.o(13120319782912L, 97754);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\service\GroupIDKeyDataInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */