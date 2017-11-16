package com.tencent.mm.plugin.game.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class GameFloatLayerInfo
  implements Parcelable
{
  public static final Parcelable.Creator<GameFloatLayerInfo> CREATOR;
  public boolean lMy;
  public int orientation;
  public String url;
  
  static
  {
    GMTrace.i(18029870055424L, 134333);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18029870055424L, 134333);
  }
  
  public GameFloatLayerInfo()
  {
    GMTrace.i(18029601619968L, 134331);
    GMTrace.o(18029601619968L, 134331);
  }
  
  public GameFloatLayerInfo(Parcel paramParcel)
  {
    GMTrace.i(18029735837696L, 134332);
    this.url = paramParcel.readString();
    if (paramParcel.readInt() == 1) {}
    for (;;)
    {
      this.lMy = bool;
      this.orientation = paramParcel.readInt();
      GMTrace.o(18029735837696L, 134332);
      return;
      bool = false;
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(18029333184512L, 134329);
    GMTrace.o(18029333184512L, 134329);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18029467402240L, 134330);
    paramParcel.writeString(this.url);
    if (this.lMy) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.orientation);
      GMTrace.o(18029467402240L, 134330);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\GameFloatLayerInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */