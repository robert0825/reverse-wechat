package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetServiceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<GetServiceRequest> CREATOR = new j();
  final int ajY;
  int ajZ;
  String aka;
  IBinder akb;
  Scope[] akc;
  Bundle akd;
  Account ake;
  final int version;
  
  public GetServiceRequest(int paramInt)
  {
    this.version = 2;
    this.ajZ = b.agC;
    this.ajY = paramInt;
  }
  
  GetServiceRequest(int paramInt1, int paramInt2, int paramInt3, String paramString, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount)
  {
    this.version = paramInt1;
    this.ajY = paramInt2;
    this.ajZ = paramInt3;
    this.aka = paramString;
    if (paramInt1 < 2)
    {
      paramString = null;
      if (paramIBinder != null) {
        paramString = a.b(p.a.g(paramIBinder));
      }
    }
    for (this.ake = paramString;; this.ake = paramAccount)
    {
      this.akc = paramArrayOfScope;
      this.akd = paramBundle;
      return;
      this.akb = paramIBinder;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    j.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\internal\GetServiceRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */