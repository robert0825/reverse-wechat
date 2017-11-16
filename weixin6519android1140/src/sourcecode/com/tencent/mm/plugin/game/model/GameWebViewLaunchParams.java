package com.tencent.mm.plugin.game.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class GameWebViewLaunchParams
  implements Parcelable
{
  public static final Parcelable.Creator<GameWebViewLaunchParams> CREATOR;
  public GameFloatLayerInfo lOx;
  
  static
  {
    GMTrace.i(18028125224960L, 134320);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18028125224960L, 134320);
  }
  
  public GameWebViewLaunchParams()
  {
    GMTrace.i(18027856789504L, 134318);
    GMTrace.o(18027856789504L, 134318);
  }
  
  public GameWebViewLaunchParams(Parcel paramParcel)
  {
    GMTrace.i(18027991007232L, 134319);
    this.lOx = ((GameFloatLayerInfo)paramParcel.readParcelable(GameFloatLayerInfo.class.getClassLoader()));
    GMTrace.o(18027991007232L, 134319);
  }
  
  public int describeContents()
  {
    GMTrace.i(18027588354048L, 134316);
    GMTrace.o(18027588354048L, 134316);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18027722571776L, 134317);
    paramParcel.writeParcelable(this.lOx, paramInt);
    GMTrace.o(18027722571776L, 134317);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\GameWebViewLaunchParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */