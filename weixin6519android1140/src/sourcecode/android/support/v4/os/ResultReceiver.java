package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ResultReceiver
  implements Parcelable
{
  public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator() {};
  public final Handler mHandler = null;
  public final boolean uG = false;
  public a uH;
  
  ResultReceiver(Parcel paramParcel)
  {
    this.uH = a.a.b(paramParcel.readStrongBinder());
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void onReceiveResult(int paramInt, Bundle paramBundle) {}
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    try
    {
      if (this.uH == null) {
        this.uH = new a();
      }
      paramParcel.writeStrongBinder(this.uH.asBinder());
      return;
    }
    finally {}
  }
  
  final class a
    extends a.a
  {
    a() {}
    
    public final void send(int paramInt, Bundle paramBundle)
    {
      if (ResultReceiver.this.mHandler != null)
      {
        ResultReceiver.this.mHandler.post(new ResultReceiver.b(ResultReceiver.this, paramInt, paramBundle));
        return;
      }
      ResultReceiver.this.onReceiveResult(paramInt, paramBundle);
    }
  }
  
  public final class b
    implements Runnable
  {
    final int uJ;
    final Bundle uK;
    
    public b(int paramInt, Bundle paramBundle)
    {
      this.uJ = paramInt;
      this.uK = paramBundle;
    }
    
    public final void run()
    {
      ResultReceiver.this.onReceiveResult(this.uJ, this.uK);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\android\support\v4\os\ResultReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */