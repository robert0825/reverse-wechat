package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class PeriodicTask
  extends Task
{
  public static final Parcelable.Creator<PeriodicTask> CREATOR = new Parcelable.Creator() {};
  protected long anH = -1L;
  protected long anI = -1L;
  
  @Deprecated
  public PeriodicTask(Parcel paramParcel)
  {
    super(paramParcel);
    this.anH = paramParcel.readLong();
    this.anI = paramParcel.readLong();
  }
  
  public String toString()
  {
    return super.toString() + " period=" + this.anH + " flex=" + this.anI;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.anH);
    paramParcel.writeLong(this.anI);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\google\android\gms\gcm\PeriodicTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */