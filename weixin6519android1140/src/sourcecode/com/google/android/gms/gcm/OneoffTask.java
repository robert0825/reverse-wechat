package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class OneoffTask
  extends Task
{
  public static final Parcelable.Creator<OneoffTask> CREATOR = new Parcelable.Creator() {};
  private final long anF;
  private final long anG;
  
  @Deprecated
  public OneoffTask(Parcel paramParcel)
  {
    super(paramParcel);
    this.anF = paramParcel.readLong();
    this.anG = paramParcel.readLong();
  }
  
  public String toString()
  {
    return super.toString() + " windowStart=" + this.anF + " windowEnd=" + this.anG;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.anF);
    paramParcel.writeLong(this.anG);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\google\android\gms\gcm\OneoffTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */