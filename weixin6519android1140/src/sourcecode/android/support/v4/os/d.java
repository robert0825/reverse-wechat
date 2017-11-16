package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class d<T>
  implements Parcelable.ClassLoaderCreator<T>
{
  private final c<T> uF;
  
  public d(c<T> paramc)
  {
    this.uF = paramc;
  }
  
  public final T createFromParcel(Parcel paramParcel)
  {
    return (T)this.uF.createFromParcel(paramParcel, null);
  }
  
  public final T createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return (T)this.uF.createFromParcel(paramParcel, paramClassLoader);
  }
  
  public final T[] newArray(int paramInt)
  {
    return this.uF.newArray(paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\os\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */