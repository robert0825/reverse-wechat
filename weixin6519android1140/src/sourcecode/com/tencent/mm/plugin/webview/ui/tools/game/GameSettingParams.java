package com.tencent.mm.plugin.webview.ui.tools.game;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class GameSettingParams
  implements Parcelable
{
  public static final Parcelable.Creator<GameSettingParams> CREATOR;
  public String eKs;
  public String eKt;
  
  static
  {
    GMTrace.i(19390703599616L, 144472);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(19390703599616L, 144472);
  }
  
  public GameSettingParams()
  {
    GMTrace.i(19390435164160L, 144470);
    GMTrace.o(19390435164160L, 144470);
  }
  
  public GameSettingParams(Parcel paramParcel)
  {
    GMTrace.i(19390569381888L, 144471);
    this.eKs = paramParcel.readString();
    this.eKt = paramParcel.readString();
    GMTrace.o(19390569381888L, 144471);
  }
  
  public int describeContents()
  {
    GMTrace.i(19390166728704L, 144468);
    GMTrace.o(19390166728704L, 144468);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(19390300946432L, 144469);
    paramParcel.writeString(this.eKs);
    paramParcel.writeString(this.eKt);
    GMTrace.o(19390300946432L, 144469);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\game\GameSettingParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */