package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Credential
  implements SafeParcelable
{
  public static final Parcelable.Creator<Credential> CREATOR = new a();
  public final String abK;
  public final String afA;
  public final String afB;
  public final Uri afC;
  public final List<IdToken> afD;
  public final String afE;
  public final String afF;
  public final String afG;
  public final String afH;
  public final String mName;
  final int mVersionCode;
  
  Credential(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, List<IdToken> paramList, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    this.mVersionCode = paramInt;
    this.afA = paramString1;
    this.afB = paramString2;
    this.abK = ((String)w.aa(paramString3));
    this.mName = paramString4;
    this.afC = paramUri;
    if (paramList == null) {}
    for (paramString1 = Collections.emptyList();; paramString1 = Collections.unmodifiableList(paramList))
    {
      this.afD = paramString1;
      this.afE = paramString5;
      this.afF = paramString6;
      this.afG = paramString7;
      this.afH = paramString8;
      return;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof Credential)) {
        return false;
      }
      paramObject = (Credential)paramObject;
    } while ((TextUtils.equals(this.abK, ((Credential)paramObject).abK)) && (TextUtils.equals(this.mName, ((Credential)paramObject).mName)) && (v.d(this.afC, ((Credential)paramObject).afC)) && (TextUtils.equals(this.afE, ((Credential)paramObject).afE)) && (TextUtils.equals(this.afF, ((Credential)paramObject).afF)) && (TextUtils.equals(this.afG, ((Credential)paramObject).afG)));
    return false;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.abK, this.mName, this.afC, this.afE, this.afF, this.afG });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\auth\api\credentials\Credential.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */