package com.tencent.mm.plugin.wallet_core.model.mall;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;

public class MallFunction
  implements Parcelable
{
  public static final Parcelable.Creator<MallFunction> CREATOR;
  public String eVy;
  public String eYm;
  public String mRS;
  public String mRT;
  public String mci;
  public String odH;
  public String rjJ;
  public ArrayList<String> rjK;
  public MallNews rjL;
  public String rjM;
  public int rjN;
  public int type;
  
  static
  {
    GMTrace.i(6883624615936L, 51287);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6883624615936L, 51287);
  }
  
  public MallFunction()
  {
    GMTrace.i(6883087745024L, 51283);
    this.rjN = 0;
    GMTrace.o(6883087745024L, 51283);
  }
  
  public MallFunction(Parcel paramParcel)
  {
    GMTrace.i(6883356180480L, 51285);
    this.rjN = 0;
    this.odH = paramParcel.readString();
    this.eVy = paramParcel.readString();
    this.rjJ = paramParcel.readString();
    this.mRS = paramParcel.readString();
    this.mRT = paramParcel.readString();
    this.eYm = paramParcel.readString();
    this.mci = paramParcel.readString();
    this.rjK = new ArrayList();
    paramParcel.readStringList(this.rjK);
    this.rjL = ((MallNews)paramParcel.readParcelable(MallNews.class.getClassLoader()));
    this.type = paramParcel.readInt();
    this.rjM = paramParcel.readString();
    this.rjN = paramParcel.readInt();
    GMTrace.o(6883356180480L, 51285);
  }
  
  public int describeContents()
  {
    GMTrace.i(6883221962752L, 51284);
    GMTrace.o(6883221962752L, 51284);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(6883490398208L, 51286);
    paramParcel.writeString(this.odH);
    paramParcel.writeString(this.eVy);
    paramParcel.writeString(this.rjJ);
    paramParcel.writeString(this.mRS);
    paramParcel.writeString(this.mRT);
    paramParcel.writeString(this.eYm);
    paramParcel.writeString(this.mci);
    paramParcel.writeStringList(this.rjK);
    paramParcel.writeParcelable(this.rjL, paramInt);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.rjM);
    paramParcel.writeInt(this.rjN);
    GMTrace.o(6883490398208L, 51286);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\mall\MallFunction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */