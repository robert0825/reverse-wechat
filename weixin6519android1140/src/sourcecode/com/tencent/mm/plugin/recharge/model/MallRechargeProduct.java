package com.tencent.mm.plugin.recharge.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class MallRechargeProduct
  implements Parcelable
{
  public static final Parcelable.Creator<MallRechargeProduct> CREATOR;
  public String appId;
  public String eEa;
  public boolean isDefault;
  public String kry;
  public String odH;
  public String odI;
  public float odJ;
  public float odK;
  public boolean odL;
  public int odM;
  public int odN;
  public int odO;
  public final boolean odP;
  public boolean odQ;
  
  static
  {
    GMTrace.i(7854018789376L, 58517);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(7854018789376L, 58517);
  }
  
  public MallRechargeProduct(Parcel paramParcel)
  {
    GMTrace.i(7853750353920L, 58515);
    this.odJ = 0.0F;
    this.odK = 0.0F;
    this.odQ = true;
    this.odH = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.eEa = paramParcel.readString();
    this.kry = paramParcel.readString();
    this.odI = paramParcel.readString();
    this.odJ = paramParcel.readFloat();
    this.odK = paramParcel.readFloat();
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      this.odL = bool1;
      this.odM = paramParcel.readInt();
      this.odN = paramParcel.readInt();
      if (paramParcel.readInt() != 1) {
        break label168;
      }
      bool1 = true;
      label126:
      this.isDefault = bool1;
      if (paramParcel.readInt() != 1) {
        break label173;
      }
    }
    label168:
    label173:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.odP = bool1;
      this.odO = paramParcel.readInt();
      GMTrace.o(7853750353920L, 58515);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label126;
    }
  }
  
  public MallRechargeProduct(boolean paramBoolean)
  {
    GMTrace.i(7853213483008L, 58511);
    this.odJ = 0.0F;
    this.odK = 0.0F;
    this.odQ = true;
    this.odP = paramBoolean;
    GMTrace.o(7853213483008L, 58511);
  }
  
  public static void a(MallRechargeProduct paramMallRechargeProduct1, MallRechargeProduct paramMallRechargeProduct2)
  {
    GMTrace.i(7853481918464L, 58513);
    paramMallRechargeProduct2.appId = paramMallRechargeProduct1.appId;
    paramMallRechargeProduct2.odH = paramMallRechargeProduct1.odH;
    paramMallRechargeProduct2.eEa = paramMallRechargeProduct1.eEa;
    paramMallRechargeProduct2.kry = paramMallRechargeProduct1.kry;
    paramMallRechargeProduct2.odI = paramMallRechargeProduct1.odI;
    paramMallRechargeProduct2.odJ = paramMallRechargeProduct1.odJ;
    paramMallRechargeProduct2.odK = paramMallRechargeProduct1.odK;
    paramMallRechargeProduct2.odL = paramMallRechargeProduct1.odL;
    paramMallRechargeProduct2.odM = paramMallRechargeProduct1.odM;
    paramMallRechargeProduct2.odN = paramMallRechargeProduct1.odN;
    paramMallRechargeProduct2.isDefault = paramMallRechargeProduct1.isDefault;
    paramMallRechargeProduct2.odQ = paramMallRechargeProduct1.odQ;
    paramMallRechargeProduct2.odO = paramMallRechargeProduct1.odO;
    GMTrace.o(7853481918464L, 58513);
  }
  
  public int describeContents()
  {
    GMTrace.i(7853616136192L, 58514);
    GMTrace.o(7853616136192L, 58514);
    return 0;
  }
  
  public final boolean isValid()
  {
    GMTrace.i(7853347700736L, 58512);
    if ((this.odL) && (this.odM <= 0))
    {
      GMTrace.o(7853347700736L, 58512);
      return false;
    }
    GMTrace.o(7853347700736L, 58512);
    return true;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    GMTrace.i(7853884571648L, 58516);
    paramParcel.writeString(this.odH);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.eEa);
    paramParcel.writeString(this.kry);
    paramParcel.writeString(this.odI);
    paramParcel.writeFloat(this.odJ);
    paramParcel.writeFloat(this.odK);
    if (this.odL)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.odM);
      paramParcel.writeInt(this.odN);
      if (!this.isDefault) {
        break label146;
      }
      paramInt = 1;
      label105:
      paramParcel.writeInt(paramInt);
      if (!this.odP) {
        break label151;
      }
    }
    label146:
    label151:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.odO);
      GMTrace.o(7853884571648L, 58516);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label105;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\model\MallRechargeProduct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */