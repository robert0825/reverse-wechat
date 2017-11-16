package com.tencent.mm.compatible.loader;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.m;
import java.io.Serializable;

public class PluginDescription
  implements Parcelable, Serializable
{
  public static final Parcelable.Creator<PluginDescription> CREATOR;
  public final String eDW;
  public final int fRw;
  public final String name;
  public final int size;
  public final String url;
  public final String version;
  
  static
  {
    GMTrace.i(13794629648384L, 102778);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(13794629648384L, 102778);
  }
  
  protected PluginDescription(Parcel paramParcel)
  {
    GMTrace.i(13794361212928L, 102776);
    this.name = ((String)m.ak(paramParcel.readString()));
    this.url = ((String)m.ak(paramParcel.readString()));
    this.eDW = ((String)m.ak(paramParcel.readString()));
    this.version = ((String)m.ak(paramParcel.readString()));
    this.size = paramParcel.readInt();
    this.fRw = paramParcel.readInt();
    GMTrace.o(13794361212928L, 102776);
  }
  
  public int describeContents()
  {
    GMTrace.i(13794092777472L, 102774);
    GMTrace.o(13794092777472L, 102774);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(13794495430656L, 102777);
    String str = String.format("PluginDescription = [name=%s, url=%s, md5=%s, version=%s, size=%d, downloadType=%d]", new Object[] { this.name, this.url, this.eDW, this.version, Integer.valueOf(this.size), Integer.valueOf(this.fRw) });
    GMTrace.o(13794495430656L, 102777);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(13794226995200L, 102775);
    paramParcel.writeString(this.name);
    paramParcel.writeString(this.url);
    paramParcel.writeString(this.eDW);
    paramParcel.writeString(this.version);
    paramParcel.writeInt(this.size);
    paramParcel.writeInt(this.fRw);
    GMTrace.o(13794226995200L, 102775);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\compatible\loader\PluginDescription.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */