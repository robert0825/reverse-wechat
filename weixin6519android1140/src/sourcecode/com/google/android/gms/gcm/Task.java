package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class Task
  implements Parcelable
{
  private final String anJ;
  private final boolean anK;
  private final boolean anL;
  private final int anM;
  private final boolean anN;
  private final Bundle mExtras;
  private final String mTag;
  
  @Deprecated
  Task(Parcel paramParcel)
  {
    this.anJ = paramParcel.readString();
    this.mTag = paramParcel.readString();
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      this.anK = bool1;
      if (paramParcel.readInt() != 1) {
        break label73;
      }
    }
    label73:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.anL = bool1;
      this.anM = 2;
      this.anN = false;
      this.mExtras = null;
      return;
      bool1 = false;
      break;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(this.anJ);
    paramParcel.writeString(this.mTag);
    if (this.anK)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.anL) {
        break label52;
      }
    }
    label52:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
      paramInt = 0;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\google\android\gms\gcm\Task.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */