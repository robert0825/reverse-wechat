package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentState
  implements Parcelable
{
  public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator() {};
  final boolean mDetached;
  final int mIndex;
  final String mTag;
  final int oB;
  final int oC;
  final boolean oE;
  Bundle oi;
  final Bundle ol;
  final boolean ot;
  final String qj;
  Fragment qk;
  
  public FragmentState(Parcel paramParcel)
  {
    this.qj = paramParcel.readString();
    this.mIndex = paramParcel.readInt();
    if (paramParcel.readInt() != 0)
    {
      bool1 = true;
      this.ot = bool1;
      this.oB = paramParcel.readInt();
      this.oC = paramParcel.readInt();
      this.mTag = paramParcel.readString();
      if (paramParcel.readInt() == 0) {
        break label110;
      }
      bool1 = true;
      label69:
      this.oE = bool1;
      if (paramParcel.readInt() == 0) {
        break label115;
      }
    }
    label110:
    label115:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.mDetached = bool1;
      this.ol = paramParcel.readBundle();
      this.oi = paramParcel.readBundle();
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label69;
    }
  }
  
  public FragmentState(Fragment paramFragment)
  {
    this.qj = paramFragment.getClass().getName();
    this.mIndex = paramFragment.mIndex;
    this.ot = paramFragment.ot;
    this.oB = paramFragment.oB;
    this.oC = paramFragment.oC;
    this.mTag = paramFragment.mTag;
    this.oE = paramFragment.oE;
    this.mDetached = paramFragment.mDetached;
    this.ol = paramFragment.ol;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(this.qj);
    paramParcel.writeInt(this.mIndex);
    if (this.ot)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.oB);
      paramParcel.writeInt(this.oC);
      paramParcel.writeString(this.mTag);
      if (!this.oE) {
        break label106;
      }
      paramInt = 1;
      label65:
      paramParcel.writeInt(paramInt);
      if (!this.mDetached) {
        break label111;
      }
    }
    label106:
    label111:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeBundle(this.ol);
      paramParcel.writeBundle(this.oi);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label65;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\FragmentState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */