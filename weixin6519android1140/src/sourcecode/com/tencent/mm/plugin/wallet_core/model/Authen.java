package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;

public class Authen
  implements Parcelable
{
  public static final Parcelable.Creator<Authen> CREATOR;
  public String country;
  public int eQl;
  public String fjd;
  public String fjk;
  public String fjl;
  public String gEy;
  public String hur;
  public String mhW;
  public String nDt;
  public String nDu;
  public PayInfo oek;
  public String qWc;
  public String rcs;
  public int rec;
  public String red;
  public String ree;
  public String ref;
  public int reg;
  public String reh;
  public String rei;
  public String rej;
  public String rek;
  public String rel;
  public String rem;
  public String ren;
  public String reo;
  public String rep;
  public String req;
  public String rer;
  public String res;
  public String reu;
  public String token;
  
  static
  {
    GMTrace.i(6909394419712L, 51479);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6909394419712L, 51479);
  }
  
  public Authen()
  {
    GMTrace.i(6909125984256L, 51477);
    this.rec = 0;
    this.oek = new PayInfo();
    GMTrace.o(6909125984256L, 51477);
  }
  
  public Authen(Parcel paramParcel)
  {
    GMTrace.i(6909260201984L, 51478);
    this.rec = 0;
    this.oek = new PayInfo();
    this.eQl = paramParcel.readInt();
    this.red = paramParcel.readString();
    this.nDt = paramParcel.readString();
    this.nDu = paramParcel.readString();
    this.ree = paramParcel.readString();
    this.ref = paramParcel.readString();
    this.reg = paramParcel.readInt();
    this.rcs = paramParcel.readString();
    this.reh = paramParcel.readString();
    this.rei = paramParcel.readString();
    this.rej = paramParcel.readString();
    this.token = paramParcel.readString();
    this.rem = paramParcel.readString();
    this.ren = paramParcel.readString();
    this.country = paramParcel.readString();
    this.fjk = paramParcel.readString();
    this.fjl = paramParcel.readString();
    this.gEy = paramParcel.readString();
    this.mhW = paramParcel.readString();
    this.hur = paramParcel.readString();
    this.fjd = paramParcel.readString();
    this.qWc = paramParcel.readString();
    this.reo = paramParcel.readString();
    this.rep = paramParcel.readString();
    this.rel = paramParcel.readString();
    this.req = paramParcel.readString();
    this.rer = paramParcel.readString();
    this.res = paramParcel.readString();
    this.reu = paramParcel.readString();
    GMTrace.o(6909260201984L, 51478);
  }
  
  public int describeContents()
  {
    GMTrace.i(6908857548800L, 51475);
    GMTrace.o(6908857548800L, 51475);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(6908991766528L, 51476);
    paramParcel.writeInt(this.eQl);
    paramParcel.writeString(bg.aq(this.red, ""));
    paramParcel.writeString(bg.aq(this.nDt, ""));
    paramParcel.writeString(bg.aq(this.nDu, ""));
    paramParcel.writeString(bg.aq(this.ree, ""));
    paramParcel.writeString(bg.aq(this.ref, ""));
    paramParcel.writeInt(this.reg);
    paramParcel.writeString(bg.aq(this.rcs, ""));
    paramParcel.writeString(bg.aq(this.reh, ""));
    paramParcel.writeString(bg.aq(this.rei, ""));
    paramParcel.writeString(bg.aq(this.rej, ""));
    paramParcel.writeString(bg.aq(this.token, ""));
    paramParcel.writeString(bg.aq(this.rem, ""));
    paramParcel.writeString(bg.aq(this.ren, ""));
    paramParcel.writeString(bg.aq(this.country, ""));
    paramParcel.writeString(bg.aq(this.fjk, ""));
    paramParcel.writeString(bg.aq(this.fjl, ""));
    paramParcel.writeString(bg.aq(this.gEy, ""));
    paramParcel.writeString(bg.aq(this.mhW, ""));
    paramParcel.writeString(bg.aq(this.hur, ""));
    paramParcel.writeString(bg.aq(this.fjd, ""));
    paramParcel.writeString(bg.aq(this.qWc, ""));
    paramParcel.writeString(bg.aq(this.reo, ""));
    paramParcel.writeString(bg.aq(this.rep, ""));
    paramParcel.writeString(bg.aq(this.rel, ""));
    paramParcel.writeString(bg.aq(this.req, ""));
    paramParcel.writeString(bg.aq(this.rer, ""));
    paramParcel.writeString(bg.aq(this.res, ""));
    paramParcel.writeString(bg.aq(this.reu, ""));
    GMTrace.o(6908991766528L, 51476);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\Authen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */