package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MessengerCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MessengerCompat> CREATOR = new Parcelable.Creator() {};
  Messenger aoc;
  c aod;
  
  public MessengerCompat(Handler paramHandler)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.aoc = new Messenger(paramHandler);
      return;
    }
    this.aod = new a(paramHandler);
  }
  
  public MessengerCompat(IBinder paramIBinder)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.aoc = new Messenger(paramIBinder);
      return;
    }
    this.aod = c.a.l(paramIBinder);
  }
  
  public static int c(Message paramMessage)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramMessage.sendingUid;
    }
    return paramMessage.arg2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    try
    {
      boolean bool = getBinder().equals(((MessengerCompat)paramObject).getBinder());
      return bool;
    }
    catch (ClassCastException paramObject) {}
    return false;
  }
  
  public final IBinder getBinder()
  {
    if (this.aoc != null) {
      return this.aoc.getBinder();
    }
    return this.aod.asBinder();
  }
  
  public int hashCode()
  {
    return getBinder().hashCode();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.aoc != null)
    {
      paramParcel.writeStrongBinder(this.aoc.getBinder());
      return;
    }
    paramParcel.writeStrongBinder(this.aod.asBinder());
  }
  
  private final class a
    extends c.a
  {
    Handler handler;
    
    a(Handler paramHandler)
    {
      this.handler = paramHandler;
    }
    
    public final void send(Message paramMessage)
    {
      paramMessage.arg2 = Binder.getCallingUid();
      this.handler.dispatchMessage(paramMessage);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\iid\MessengerCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */