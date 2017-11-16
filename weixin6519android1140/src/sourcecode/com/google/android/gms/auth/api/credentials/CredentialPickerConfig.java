package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CredentialPickerConfig
  implements SafeParcelable
{
  public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new b();
  final boolean afI;
  final boolean afJ;
  final int mVersionCode;
  
  CredentialPickerConfig(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.mVersionCode = paramInt;
    this.afI = paramBoolean1;
    this.afJ = paramBoolean2;
  }
  
  public CredentialPickerConfig(a parama)
  {
    this(1, parama.afI, parama.afJ);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel);
  }
  
  public static final class a
  {
    public boolean afI = false;
    public boolean afJ = true;
    
    public final CredentialPickerConfig jz()
    {
      return new CredentialPickerConfig(this);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\auth\api\credentials\CredentialPickerConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */