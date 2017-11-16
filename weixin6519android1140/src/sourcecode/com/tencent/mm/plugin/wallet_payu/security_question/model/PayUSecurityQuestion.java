package com.tencent.mm.plugin.wallet_payu.security_question.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class PayUSecurityQuestion
  implements Parcelable
{
  public static final Parcelable.Creator<PayUSecurityQuestion> CREATOR;
  public String desc;
  public String id;
  
  static
  {
    GMTrace.i(7924080443392L, 59039);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(7924080443392L, 59039);
  }
  
  public PayUSecurityQuestion(Parcel paramParcel)
  {
    GMTrace.i(7923677790208L, 59036);
    this.id = paramParcel.readString();
    this.desc = paramParcel.readString();
    GMTrace.o(7923677790208L, 59036);
  }
  
  public PayUSecurityQuestion(String paramString1, String paramString2)
  {
    GMTrace.i(7923543572480L, 59035);
    this.id = paramString1;
    this.desc = paramString2;
    GMTrace.o(7923543572480L, 59035);
  }
  
  public int describeContents()
  {
    GMTrace.i(7923812007936L, 59037);
    GMTrace.o(7923812007936L, 59037);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(7923946225664L, 59038);
    paramParcel.writeString(this.id);
    paramParcel.writeString(this.desc);
    GMTrace.o(7923946225664L, 59038);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\security_question\model\PayUSecurityQuestion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */