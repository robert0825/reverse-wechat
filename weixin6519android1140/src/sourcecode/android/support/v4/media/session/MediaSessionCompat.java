package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat
{
  public static final class QueueItem
    implements Parcelable
  {
    public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator() {};
    private final MediaDescriptionCompat tv;
    private final long ul;
    
    public QueueItem(Parcel paramParcel)
    {
      this.tv = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
      this.ul = paramParcel.readLong();
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final String toString()
    {
      return "MediaSession.QueueItem {Description=" + this.tv + ", Id=" + this.ul + " }";
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      this.tv.writeToParcel(paramParcel, paramInt);
      paramParcel.writeLong(this.ul);
    }
  }
  
  static final class ResultReceiverWrapper
    implements Parcelable
  {
    public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator() {};
    public ResultReceiver um;
    
    ResultReceiverWrapper(Parcel paramParcel)
    {
      this.um = ((ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel));
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      this.um.writeToParcel(paramParcel, paramInt);
    }
  }
  
  public static final class Token
    implements Parcelable
  {
    public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator() {};
    private final Object un;
    
    Token(Object paramObject)
    {
      this.un = paramObject;
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramParcel.writeParcelable((Parcelable)this.un, paramInt);
        return;
      }
      paramParcel.writeStrongBinder((IBinder)this.un);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\android\support\v4\media\session\MediaSessionCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */