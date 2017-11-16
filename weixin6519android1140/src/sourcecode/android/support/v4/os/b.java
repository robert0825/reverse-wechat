package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
{
  public static <T> Parcelable.Creator<T> a(c<T> paramc)
  {
    if (Build.VERSION.SDK_INT >= 13) {
      return new d(paramc);
    }
    return new a(paramc);
  }
  
  static final class a<T>
    implements Parcelable.Creator<T>
  {
    final c<T> uF;
    
    public a(c<T> paramc)
    {
      this.uF = paramc;
    }
    
    public final T createFromParcel(Parcel paramParcel)
    {
      return (T)this.uF.createFromParcel(paramParcel, null);
    }
    
    public final T[] newArray(int paramInt)
    {
      return this.uF.newArray(paramInt);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\os\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */