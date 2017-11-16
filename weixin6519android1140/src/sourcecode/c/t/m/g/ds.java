package c.t.m.g;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentPoi;
import com.tencent.map.geolocation.internal.TencentExtraKeys;
import com.tencent.tencentmap.lbssdk.service.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

public final class ds
  implements Parcelable, TencentLocation
{
  public static final ds a = new ds(-1);
  public do b;
  private dn c;
  public int d;
  private int e;
  private String f;
  public dl g;
  public final Bundle h = new Bundle();
  public String i = "network";
  public Location j;
  private final long k;
  public long l;
  private int m;
  
  static
  {
    new Parcelable.Creator() {};
  }
  
  public ds(int paramInt)
  {
    this.d = paramInt;
    this.k = SystemClock.elapsedRealtime();
    this.l = System.currentTimeMillis();
  }
  
  /* Error */
  public ds(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 46	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: new 48	android/os/Bundle
    //   8: dup
    //   9: invokespecial 49	android/os/Bundle:<init>	()V
    //   12: putfield 51	c/t/m/g/ds:h	Landroid/os/Bundle;
    //   15: aload_0
    //   16: ldc 53
    //   18: putfield 55	c/t/m/g/ds:i	Ljava/lang/String;
    //   21: aload_0
    //   22: invokestatic 63	android/os/SystemClock:elapsedRealtime	()J
    //   25: putfield 65	c/t/m/g/ds:k	J
    //   28: aload_0
    //   29: invokestatic 70	java/lang/System:currentTimeMillis	()J
    //   32: putfield 72	c/t/m/g/ds:l	J
    //   35: new 81	org/json/JSONObject
    //   38: dup
    //   39: aload_1
    //   40: invokespecial 83	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   43: astore_1
    //   44: aload_0
    //   45: new 85	c/t/m/g/do
    //   48: dup
    //   49: aload_1
    //   50: ldc 87
    //   52: invokevirtual 91	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   55: invokespecial 94	c/t/m/g/do:<init>	(Lorg/json/JSONObject;)V
    //   58: putfield 96	c/t/m/g/ds:b	Lc/t/m/g/do;
    //   61: aload_0
    //   62: new 98	c/t/m/g/dn
    //   65: dup
    //   66: aload_1
    //   67: ldc 100
    //   69: invokevirtual 91	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   72: invokespecial 101	c/t/m/g/dn:<init>	(Lorg/json/JSONObject;)V
    //   75: putfield 103	c/t/m/g/ds:c	Lc/t/m/g/dn;
    //   78: aload_0
    //   79: aload_1
    //   80: ldc 105
    //   82: invokevirtual 109	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   85: putfield 111	c/t/m/g/ds:f	Ljava/lang/String;
    //   88: aload_0
    //   89: aload_1
    //   90: ldc 113
    //   92: iconst_0
    //   93: invokevirtual 117	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   96: putfield 119	c/t/m/g/ds:e	I
    //   99: aload_0
    //   100: aload_1
    //   101: ldc 121
    //   103: invokestatic 70	java/lang/System:currentTimeMillis	()J
    //   106: invokevirtual 125	org/json/JSONObject:optLong	(Ljava/lang/String;J)J
    //   109: putfield 72	c/t/m/g/ds:l	J
    //   112: aload_1
    //   113: ldc 127
    //   115: invokevirtual 109	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   118: astore_2
    //   119: aload_2
    //   120: invokestatic 133	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   123: ifne +26 -> 149
    //   126: aload_0
    //   127: getfield 51	c/t/m/g/ds:h	Landroid/os/Bundle;
    //   130: ldc 127
    //   132: aload_2
    //   133: ldc -121
    //   135: invokevirtual 141	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   138: iconst_0
    //   139: aaload
    //   140: invokestatic 147	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   143: invokevirtual 151	java/lang/Integer:intValue	()I
    //   146: invokevirtual 155	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   149: aload_1
    //   150: ldc -99
    //   152: invokevirtual 160	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   155: astore_2
    //   156: aload_2
    //   157: ifnull +56 -> 213
    //   160: aload_0
    //   161: new 162	c/t/m/g/dl
    //   164: dup
    //   165: aload_2
    //   166: invokespecial 163	c/t/m/g/dl:<init>	(Lorg/json/JSONObject;)V
    //   169: putfield 165	c/t/m/g/ds:g	Lc/t/m/g/dl;
    //   172: aload_0
    //   173: getfield 165	c/t/m/g/ds:g	Lc/t/m/g/dl;
    //   176: ifnull +30 -> 206
    //   179: aload_0
    //   180: getfield 165	c/t/m/g/ds:g	Lc/t/m/g/dl;
    //   183: getfield 168	c/t/m/g/dl:c	Lc/t/m/g/dq;
    //   186: ifnull +20 -> 206
    //   189: aload_0
    //   190: getfield 51	c/t/m/g/ds:h	Landroid/os/Bundle;
    //   193: aload_0
    //   194: getfield 165	c/t/m/g/ds:g	Lc/t/m/g/dl;
    //   197: getfield 168	c/t/m/g/dl:c	Lc/t/m/g/dq;
    //   200: getfield 172	c/t/m/g/dq:m	Landroid/os/Bundle;
    //   203: invokevirtual 176	android/os/Bundle:putAll	(Landroid/os/Bundle;)V
    //   206: return
    //   207: astore_1
    //   208: aload_1
    //   209: athrow
    //   210: astore_1
    //   211: aload_1
    //   212: athrow
    //   213: aload_1
    //   214: ldc -78
    //   216: invokevirtual 160	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   219: astore_1
    //   220: aload_1
    //   221: ifnull -49 -> 172
    //   224: aload_1
    //   225: ldc -76
    //   227: invokevirtual 184	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   230: ifeq -58 -> 172
    //   233: aload_0
    //   234: new 162	c/t/m/g/dl
    //   237: dup
    //   238: aload_1
    //   239: ldc -76
    //   241: invokevirtual 160	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   244: invokespecial 163	c/t/m/g/dl:<init>	(Lorg/json/JSONObject;)V
    //   247: putfield 165	c/t/m/g/ds:g	Lc/t/m/g/dl;
    //   250: goto -78 -> 172
    //   253: astore_2
    //   254: goto -105 -> 149
    //   257: astore_2
    //   258: goto -180 -> 78
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	261	0	this	ds
    //   0	261	1	paramString	String
    //   118	48	2	localObject	Object
    //   253	1	2	localException	Exception
    //   257	1	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   44	61	207	org/json/JSONException
    //   160	172	210	org/json/JSONException
    //   112	149	253	java/lang/Exception
    //   61	78	257	java/lang/Throwable
  }
  
  public static ds a(ds paramds, int paramInt)
  {
    paramds.m = paramInt;
    return paramds;
  }
  
  public static ds a(ds paramds, boolean paramBoolean)
  {
    Object localObject;
    int n;
    if ((paramds != null) && (paramds.f != null) && (!paramBoolean))
    {
      localObject = paramds.f;
      int i1 = 0;
      n = i1;
      if (localObject != null)
      {
        n = i1;
        if (((String)localObject).split(",").length > 1) {
          n = Integer.parseInt(localObject.split(",")[1]);
        }
      }
      localObject = paramds.b;
      if (localObject == null) {}
    }
    try
    {
      ((do)localObject).d = ((float)e.r(((do)localObject).d, n, -70));
      return paramds;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError) {}
    return paramds;
  }
  
  public static void a(ds paramds)
  {
    if (paramds == a) {
      throw new JSONException("location failed");
    }
  }
  
  public final void a(double paramDouble1, double paramDouble2)
  {
    this.b.a = (Math.round(paramDouble1 * 1000000.0D) / 1000000.0D);
    this.b.b = (Math.round(paramDouble2 * 1000000.0D) / 1000000.0D);
  }
  
  public final void a(Location paramLocation)
  {
    if ((paramLocation != null) && (this.b != null))
    {
      double d2 = paramLocation.getLatitude();
      double d1 = paramLocation.getLongitude();
      d2 = Math.round(d2 * 1000000.0D) / 1000000.0D;
      d1 = Math.round(d1 * 1000000.0D) / 1000000.0D;
      this.b.a = d2;
      this.b.b = d1;
      this.b.c = paramLocation.getAltitude();
      this.b.d = paramLocation.getAccuracy();
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final float getAccuracy()
  {
    if (this.b != null) {
      return this.b.d;
    }
    return 0.0F;
  }
  
  public final String getAddress()
  {
    if (this.d == 5) {
      return this.h.getString("addrdesp.name");
    }
    if (this.d == 3)
    {
      if (this.g != null) {
        return this.g.c.l;
      }
      return "";
    }
    if (this.b != null) {
      return this.b.f;
    }
    return "";
  }
  
  public final double getAltitude()
  {
    if (this.b != null) {
      return this.b.c;
    }
    return 0.0D;
  }
  
  public final Integer getAreaStat()
  {
    if (this.g != null) {
      return Integer.valueOf(this.g.a);
    }
    return null;
  }
  
  public final float getBearing()
  {
    if (this.j == null) {
      return 0.0F;
    }
    return this.j.getBearing();
  }
  
  public final String getCity()
  {
    if (this.g != null) {
      return this.g.c.f;
    }
    return "";
  }
  
  public final String getCityCode()
  {
    if (this.g != null) {
      return this.g.c.d;
    }
    return "";
  }
  
  public final int getCoordinateType()
  {
    return this.m;
  }
  
  public final double getDirection()
  {
    if (this.h != null) {
      return this.h.getDouble("direction");
    }
    return NaN.0D;
  }
  
  public final String getDistrict()
  {
    if (this.g != null) {
      return this.g.c.g;
    }
    return "";
  }
  
  public final long getElapsedRealtime()
  {
    return this.k;
  }
  
  public final Bundle getExtra()
  {
    return this.h;
  }
  
  public final int getGPSRssi()
  {
    if (this.j == null) {}
    Bundle localBundle;
    do
    {
      return 0;
      localBundle = this.j.getExtras();
    } while (localBundle == null);
    return localBundle.getInt("rssi", 0);
  }
  
  public final String getIndoorBuildingFloor()
  {
    if (this.c != null) {
      return this.c.b;
    }
    return "";
  }
  
  public final String getIndoorBuildingId()
  {
    if (this.c != null) {
      return this.c.a;
    }
    return "";
  }
  
  public final int getIndoorLocationType()
  {
    if (this.c != null) {
      return this.c.c;
    }
    return -1;
  }
  
  public final double getLatitude()
  {
    if (this.b != null) {
      return this.b.a;
    }
    return 0.0D;
  }
  
  public final double getLongitude()
  {
    if (this.b != null) {
      return this.b.b;
    }
    return 0.0D;
  }
  
  public final String getName()
  {
    if (this.d == 5) {
      return this.h.getString("addrdesp.name");
    }
    if (this.d == 3)
    {
      if (this.g != null) {
        return this.g.c.c;
      }
      return "";
    }
    if (this.b != null) {
      return this.b.e;
    }
    return "";
  }
  
  public final String getNation()
  {
    if (this.g != null) {
      return this.g.c.b;
    }
    return "";
  }
  
  public final List<TencentPoi> getPoiList()
  {
    if (this.g != null) {
      return new ArrayList(this.g.b);
    }
    return Collections.emptyList();
  }
  
  public final String getProvider()
  {
    return this.i;
  }
  
  public final String getProvince()
  {
    if (this.g != null) {
      return this.g.c.e;
    }
    return "";
  }
  
  public final float getSpeed()
  {
    if (this.j == null) {
      return 0.0F;
    }
    return this.j.getSpeed();
  }
  
  public final String getStreet()
  {
    if (this.g != null) {
      return this.g.c.j;
    }
    return "";
  }
  
  public final String getStreetNo()
  {
    if (this.g != null) {
      return this.g.c.k;
    }
    return "";
  }
  
  public final long getTime()
  {
    return this.l;
  }
  
  public final String getTown()
  {
    if (this.g != null) {
      return this.g.c.h;
    }
    return "";
  }
  
  public final String getVillage()
  {
    if (this.g != null) {
      return this.g.c.i;
    }
    return "";
  }
  
  public final int isMockGps()
  {
    return this.e;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("TxLocation{");
    localStringBuilder.append("level=").append(this.d).append(",");
    localStringBuilder.append("name=").append(getName()).append(",");
    localStringBuilder.append("address=").append(getAddress()).append(",");
    localStringBuilder.append("provider=").append(getProvider()).append(",");
    localStringBuilder.append("latitude=").append(getLatitude()).append(",");
    localStringBuilder.append("longitude=").append(getLongitude()).append(",");
    localStringBuilder.append("altitude=").append(getAltitude()).append(",");
    localStringBuilder.append("accuracy=").append(getAccuracy()).append(",");
    localStringBuilder.append("cityCode=").append(getCityCode()).append(",");
    localStringBuilder.append("areaStat=").append(getAreaStat()).append(",");
    localStringBuilder.append("nation=").append(getNation()).append(",");
    localStringBuilder.append("province=").append(getProvince()).append(",");
    localStringBuilder.append("city=").append(getCity()).append(",");
    localStringBuilder.append("district=").append(getDistrict()).append(",");
    localStringBuilder.append("street=").append(getStreet()).append(",");
    localStringBuilder.append("streetNo=").append(getStreetNo()).append(",");
    localStringBuilder.append("town=").append(getTown()).append(",");
    localStringBuilder.append("village=").append(getVillage()).append(",");
    localStringBuilder.append("bearing=").append(getBearing()).append(",");
    localStringBuilder.append("time=").append(getTime()).append(",");
    localStringBuilder.append("poilist=[");
    Iterator localIterator = getPoiList().iterator();
    while (localIterator.hasNext()) {
      localStringBuilder.append((TencentPoi)localIterator.next()).append(",");
    }
    localStringBuilder.append("]");
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.d);
    paramParcel.writeString(getProvider());
    paramParcel.writeDouble(getLatitude());
    paramParcel.writeDouble(getLongitude());
    paramParcel.writeDouble(getAccuracy());
    paramParcel.writeDouble(getAltitude());
    paramParcel.writeString(getAddress());
    paramParcel.writeString(getNation());
    paramParcel.writeString(getProvince());
    paramParcel.writeString(getCity());
    paramParcel.writeString(getDistrict());
    paramParcel.writeString(getStreet());
    paramParcel.writeString(getStreetNo());
    if (this.g != null) {}
    for (String str = this.g.c.d;; str = "")
    {
      paramParcel.writeString(str);
      paramParcel.writeString(getName());
      paramParcel.writeLong(this.l);
      paramParcel.writeBundle(this.h);
      return;
    }
  }
  
  public static final class a
  {
    public String a;
    public ds b;
    public int c;
    public String d = "network";
    private Location e;
    
    public final a a(Location paramLocation)
    {
      this.e = new Location(paramLocation);
      return this;
    }
    
    public final ds a()
    {
      if (this.a != null) {}
      for (;;)
      {
        try
        {
          ds localds1 = new ds(this.a);
          localds1.d = this.c;
          localds1.i = this.d;
          localds1.j = this.e;
          TencentExtraKeys.setRawGps(localds1, this.e);
          return localds1;
        }
        catch (JSONException localJSONException)
        {
          return ds.a;
        }
        ds localds2 = ds.c(this.b);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\ds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */