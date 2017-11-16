package com.tencent.mm.plugin.wallet_core.model.mall;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class MallNews
  implements Parcelable
{
  public static final Parcelable.Creator<MallNews> CREATOR;
  public String eEU;
  public String qrG;
  public int rhZ;
  public String rjR;
  public String rjS;
  public String rjT;
  public String rjU;
  public String rjV;
  public String rjW;
  public int rjX;
  public String rjY;
  public int rjZ;
  public String rka;
  public String rkb;
  public int showType;
  public String type;
  
  static
  {
    GMTrace.i(6880269172736L, 51262);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6880269172736L, 51262);
  }
  
  public MallNews(Parcel paramParcel)
  {
    GMTrace.i(6879732301824L, 51258);
    this.rjR = "0";
    this.rjS = "0";
    this.rjT = paramParcel.readString();
    this.qrG = paramParcel.readString();
    this.eEU = paramParcel.readString();
    this.rjU = paramParcel.readString();
    this.rjV = paramParcel.readString();
    this.rjW = paramParcel.readString();
    this.rjX = paramParcel.readInt();
    this.rjY = paramParcel.readString();
    this.rjR = paramParcel.readString();
    this.rjS = paramParcel.readString();
    this.showType = paramParcel.readInt();
    this.rka = paramParcel.readString();
    this.rhZ = paramParcel.readInt();
    this.rkb = paramParcel.readString();
    GMTrace.o(6879732301824L, 51258);
  }
  
  public MallNews(String paramString)
  {
    GMTrace.i(6879463866368L, 51256);
    this.rjR = "0";
    this.rjS = "0";
    this.rjT = paramString;
    GMTrace.o(6879463866368L, 51256);
  }
  
  public int describeContents()
  {
    GMTrace.i(6880000737280L, 51260);
    GMTrace.o(6880000737280L, 51260);
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    GMTrace.i(6879598084096L, 51257);
    if ((paramObject instanceof MallNews))
    {
      paramObject = (MallNews)paramObject;
      if ((this.rjT == null) || (!this.rjT.equals(((MallNews)paramObject).rjT)))
      {
        GMTrace.o(6879598084096L, 51257);
        return false;
      }
      if ((this.qrG == null) || (!this.qrG.equals(((MallNews)paramObject).qrG)))
      {
        GMTrace.o(6879598084096L, 51257);
        return false;
      }
      GMTrace.o(6879598084096L, 51257);
      return true;
    }
    GMTrace.o(6879598084096L, 51257);
    return false;
  }
  
  public String toString()
  {
    GMTrace.i(6880134955008L, 51261);
    String str = String.format("functionId : %s, activityId : %s, ticket : %s, activityMsg : %s, activityLink : %s, activityIconLink : %s, showFlag : %s, orgStr : %s, activityTips: %s, activityType: %d, activityUrl: %s", new Object[] { this.rjT, this.qrG, this.eEU, this.rjU, this.rjV, this.rjW, this.rjR, this.rka, this.rjY, Integer.valueOf(this.rhZ), this.rkb });
    GMTrace.o(6880134955008L, 51261);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(6879866519552L, 51259);
    paramParcel.writeString(this.rjT);
    paramParcel.writeString(this.qrG);
    paramParcel.writeString(this.eEU);
    paramParcel.writeString(this.rjU);
    paramParcel.writeString(this.rjV);
    paramParcel.writeString(this.rjW);
    paramParcel.writeInt(this.rjX);
    paramParcel.writeString(this.rjY);
    paramParcel.writeString(this.rjR);
    paramParcel.writeString(this.rjS);
    paramParcel.writeInt(this.showType);
    paramParcel.writeString(this.rka);
    paramParcel.writeInt(this.rhZ);
    paramParcel.writeString(this.rkb);
    GMTrace.o(6879866519552L, 51259);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\mall\MallNews.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */