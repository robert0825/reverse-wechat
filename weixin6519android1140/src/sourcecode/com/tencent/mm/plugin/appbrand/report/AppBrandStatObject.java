package com.tencent.mm.plugin.appbrand.report;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public final class AppBrandStatObject
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandStatObject> CREATOR;
  public String eAv;
  public int eVh;
  public int eVi;
  public String eVj;
  public transient String iyl;
  public int iym;
  public int scene;
  
  static
  {
    GMTrace.i(10629909839872L, 79199);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10629909839872L, 79199);
  }
  
  public AppBrandStatObject()
  {
    GMTrace.i(10629372968960L, 79195);
    GMTrace.o(10629372968960L, 79195);
  }
  
  protected AppBrandStatObject(Parcel paramParcel)
  {
    GMTrace.i(10629775622144L, 79198);
    this.eVi = paramParcel.readInt();
    this.eVj = paramParcel.readString();
    this.scene = paramParcel.readInt();
    this.eAv = paramParcel.readString();
    this.iym = paramParcel.readInt();
    this.eVh = paramParcel.readInt();
    GMTrace.o(10629775622144L, 79198);
  }
  
  public final int describeContents()
  {
    GMTrace.i(10629507186688L, 79196);
    GMTrace.o(10629507186688L, 79196);
    return 0;
  }
  
  public final String toString()
  {
    GMTrace.i(16167464861696L, 120457);
    String str = "AppBrandStatObject{preScene=" + this.eVi + ", preSceneNote='" + this.eVj + '\'' + ", scene=" + this.scene + ", sceneNote='" + this.eAv + '\'' + ", usedState=" + this.iym + '}';
    GMTrace.o(16167464861696L, 120457);
    return str;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10629641404416L, 79197);
    paramParcel.writeInt(this.eVi);
    paramParcel.writeString(this.eVj);
    paramParcel.writeInt(this.scene);
    paramParcel.writeString(this.eAv);
    paramParcel.writeInt(this.iym);
    paramParcel.writeInt(this.eVh);
    GMTrace.o(10629641404416L, 79197);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\appbrand\report\AppBrandStatObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */