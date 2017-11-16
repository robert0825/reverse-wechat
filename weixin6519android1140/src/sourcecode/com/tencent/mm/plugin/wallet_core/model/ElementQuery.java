package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class ElementQuery
  implements Parcelable
{
  public static final Parcelable.Creator<ElementQuery> CREATOR;
  public static String rfL;
  public JSONObject gvP;
  public String mhU;
  public String nDt;
  public String nDu;
  public int rcw;
  public String rel;
  public String rfM;
  public boolean rfN;
  public boolean rfO;
  public boolean rfP;
  public boolean rfQ;
  public String rfR;
  public boolean rfS;
  public int rfT;
  public int rfU;
  public String rfV;
  public String rfW;
  public String rfX;
  public String rfY;
  public String rfZ;
  public String rga;
  public boolean rgb;
  public boolean rgc;
  public boolean rgd;
  public boolean rge;
  public boolean rgf;
  public boolean rgg;
  public boolean rgh;
  public boolean rgi;
  public boolean rgj;
  public String rgk;
  private List<Integer> rgl;
  public boolean rgm;
  public boolean rgn;
  
  static
  {
    GMTrace.i(6897314824192L, 51389);
    rfL = "bind_serial";
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6897314824192L, 51389);
  }
  
  public ElementQuery()
  {
    GMTrace.i(6896777953280L, 51385);
    this.rgl = null;
    this.rgn = false;
    GMTrace.o(6896777953280L, 51385);
  }
  
  public ElementQuery(Parcel paramParcel)
  {
    GMTrace.i(6896912171008L, 51386);
    this.rgl = null;
    this.rgn = false;
    this.nDu = paramParcel.readString();
    this.mhU = paramParcel.readString();
    this.rfM = paramParcel.readString();
    if (1 == paramParcel.readInt())
    {
      bool1 = true;
      this.rfN = bool1;
      if (1 != paramParcel.readInt()) {
        break label414;
      }
      bool1 = true;
      label73:
      this.rfO = bool1;
      if (1 != paramParcel.readInt()) {
        break label419;
      }
      bool1 = true;
      label88:
      this.rfP = bool1;
      if (1 != paramParcel.readInt()) {
        break label424;
      }
      bool1 = true;
      label103:
      this.rfQ = bool1;
      this.rfR = paramParcel.readString();
      this.nDu = paramParcel.readString();
      if (1 != paramParcel.readInt()) {
        break label429;
      }
      bool1 = true;
      label134:
      this.rfS = bool1;
      this.rfT = paramParcel.readInt();
      this.rfU = paramParcel.readInt();
      this.nDt = paramParcel.readString();
      this.rfV = paramParcel.readString();
      this.rfW = paramParcel.readString();
      this.rfX = paramParcel.readString();
      this.rga = paramParcel.readString();
      this.rfZ = paramParcel.readString();
      this.rfY = paramParcel.readString();
      if (1 != paramParcel.readInt()) {
        break label434;
      }
      bool1 = true;
      label221:
      this.rgb = bool1;
      if (1 != paramParcel.readInt()) {
        break label439;
      }
      bool1 = true;
      label236:
      this.rgc = bool1;
      if (1 != paramParcel.readInt()) {
        break label444;
      }
      bool1 = true;
      label251:
      this.rgd = bool1;
      if (1 != paramParcel.readInt()) {
        break label449;
      }
      bool1 = true;
      label266:
      this.rge = bool1;
      if (1 != paramParcel.readInt()) {
        break label454;
      }
      bool1 = true;
      label281:
      this.rgf = bool1;
      if (1 != paramParcel.readInt()) {
        break label459;
      }
      bool1 = true;
      label296:
      this.rgg = bool1;
      if (1 != paramParcel.readInt()) {
        break label464;
      }
      bool1 = true;
      label311:
      this.rgi = bool1;
      if (1 != paramParcel.readInt()) {
        break label469;
      }
      bool1 = true;
      label326:
      this.rgh = bool1;
      if (1 != paramParcel.readInt()) {
        break label474;
      }
      bool1 = true;
      label341:
      this.rgj = bool1;
      this.rcw = paramParcel.readInt();
      this.rgk = paramParcel.readString();
      if (1 != paramParcel.readInt()) {
        break label479;
      }
      bool1 = true;
      label372:
      this.rgn = bool1;
      this.rel = paramParcel.readString();
      if (1 != paramParcel.readInt()) {
        break label484;
      }
    }
    label414:
    label419:
    label424:
    label429:
    label434:
    label439:
    label444:
    label449:
    label454:
    label459:
    label464:
    label469:
    label474:
    label479:
    label484:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.rgm = bool1;
      GMTrace.o(6896912171008L, 51386);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label73;
      bool1 = false;
      break label88;
      bool1 = false;
      break label103;
      bool1 = false;
      break label134;
      bool1 = false;
      break label221;
      bool1 = false;
      break label236;
      bool1 = false;
      break label251;
      bool1 = false;
      break label266;
      bool1 = false;
      break label281;
      bool1 = false;
      break label296;
      bool1 = false;
      break label311;
      bool1 = false;
      break label326;
      bool1 = false;
      break label341;
      bool1 = false;
      break label372;
    }
  }
  
  public final boolean bym()
  {
    GMTrace.i(6896509517824L, 51383);
    if (1 == this.rfU)
    {
      GMTrace.o(6896509517824L, 51383);
      return true;
    }
    GMTrace.o(6896509517824L, 51383);
    return false;
  }
  
  public final List<Integer> byn()
  {
    GMTrace.i(6896643735552L, 51384);
    this.rgk = "1|2|5|9";
    Object localObject;
    if (this.rgl != null)
    {
      localObject = this.rgl;
      GMTrace.o(6896643735552L, 51384);
      return (List<Integer>)localObject;
    }
    if (!bg.nm(this.rgk))
    {
      this.rgl = new ArrayList();
      localObject = this.rgk.split("\\|");
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        int k = bg.getInt(localObject[i], 0);
        if (k > 0) {
          this.rgl.add(Integer.valueOf(k));
        }
        i += 1;
      }
      localObject = this.rgl;
      GMTrace.o(6896643735552L, 51384);
      return (List<Integer>)localObject;
    }
    GMTrace.o(6896643735552L, 51384);
    return null;
  }
  
  public int describeContents()
  {
    GMTrace.i(6897046388736L, 51387);
    GMTrace.o(6897046388736L, 51387);
    return 0;
  }
  
  public final boolean isError()
  {
    GMTrace.i(6896375300096L, 51382);
    boolean bool = "0".equals(bg.aq(this.rfW, "").trim());
    GMTrace.o(6896375300096L, 51382);
    return bool;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    GMTrace.i(6897180606464L, 51388);
    paramParcel.writeString(bg.aq(this.nDu, ""));
    paramParcel.writeString(bg.aq(this.mhU, ""));
    paramParcel.writeString(bg.aq(this.rfM, ""));
    if (this.rfN)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.rfO) {
        break label444;
      }
      paramInt = 1;
      label72:
      paramParcel.writeInt(paramInt);
      if (!this.rfP) {
        break label449;
      }
      paramInt = 1;
      label86:
      paramParcel.writeInt(paramInt);
      if (!this.rfQ) {
        break label454;
      }
      paramInt = 1;
      label100:
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(bg.aq(this.rfR, ""));
      paramParcel.writeString(bg.aq(this.nDu, ""));
      if (!this.rfS) {
        break label459;
      }
      paramInt = 1;
      label140:
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.rfT);
      paramParcel.writeInt(this.rfU);
      paramParcel.writeString(bg.aq(this.nDt, ""));
      paramParcel.writeString(bg.aq(this.rfV, ""));
      paramParcel.writeString(bg.aq(this.rfW, ""));
      paramParcel.writeString(bg.aq(this.rfX, ""));
      paramParcel.writeString(bg.aq(this.rga, ""));
      paramParcel.writeString(bg.aq(this.rfZ, ""));
      paramParcel.writeString(bg.aq(this.rfY, ""));
      if (!this.rgb) {
        break label464;
      }
      paramInt = 1;
      label261:
      paramParcel.writeInt(paramInt);
      if (!this.rgc) {
        break label469;
      }
      paramInt = 1;
      label275:
      paramParcel.writeInt(paramInt);
      if (!this.rgd) {
        break label474;
      }
      paramInt = 1;
      label289:
      paramParcel.writeInt(paramInt);
      if (!this.rge) {
        break label479;
      }
      paramInt = 1;
      label303:
      paramParcel.writeInt(paramInt);
      if (!this.rgf) {
        break label484;
      }
      paramInt = 1;
      label317:
      paramParcel.writeInt(paramInt);
      if (!this.rgg) {
        break label489;
      }
      paramInt = 1;
      label331:
      paramParcel.writeInt(paramInt);
      if (!this.rgi) {
        break label494;
      }
      paramInt = 1;
      label345:
      paramParcel.writeInt(paramInt);
      if (!this.rgh) {
        break label499;
      }
      paramInt = 1;
      label359:
      paramParcel.writeInt(paramInt);
      if (!this.rgj) {
        break label504;
      }
      paramInt = 1;
      label373:
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.rcw);
      paramParcel.writeString(this.rgk);
      if (!this.rgn) {
        break label509;
      }
      paramInt = 1;
      label403:
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.rel);
      if (!this.rgm) {
        break label514;
      }
    }
    label444:
    label449:
    label454:
    label459:
    label464:
    label469:
    label474:
    label479:
    label484:
    label489:
    label494:
    label499:
    label504:
    label509:
    label514:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      GMTrace.o(6897180606464L, 51388);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label72;
      paramInt = 0;
      break label86;
      paramInt = 0;
      break label100;
      paramInt = 0;
      break label140;
      paramInt = 0;
      break label261;
      paramInt = 0;
      break label275;
      paramInt = 0;
      break label289;
      paramInt = 0;
      break label303;
      paramInt = 0;
      break label317;
      paramInt = 0;
      break label331;
      paramInt = 0;
      break label345;
      paramInt = 0;
      break label359;
      paramInt = 0;
      break label373;
      paramInt = 0;
      break label403;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\ElementQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */