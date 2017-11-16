package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public final class AppBrandLaunchReferrer
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandLaunchReferrer> CREATOR;
  public String appId;
  public int hQF;
  public String hQG;
  public String url;
  
  static
  {
    GMTrace.i(10593536835584L, 78928);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10593536835584L, 78928);
  }
  
  public AppBrandLaunchReferrer()
  {
    GMTrace.i(10592865746944L, 78923);
    GMTrace.o(10592865746944L, 78923);
  }
  
  public AppBrandLaunchReferrer(Parcel paramParcel)
  {
    GMTrace.i(10592999964672L, 78924);
    g(paramParcel);
    GMTrace.o(10592999964672L, 78924);
  }
  
  /* Error */
  public final org.json.JSONObject Uy()
  {
    // Byte code:
    //   0: ldc2_w 53
    //   3: ldc 55
    //   5: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 57	org/json/JSONObject
    //   11: dup
    //   12: aload_0
    //   13: getfield 59	com/tencent/mm/plugin/appbrand/config/AppBrandLaunchReferrer:hQG	Ljava/lang/String;
    //   16: invokespecial 62	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   19: astore_1
    //   20: new 57	org/json/JSONObject
    //   23: dup
    //   24: invokespecial 63	org/json/JSONObject:<init>	()V
    //   27: astore_2
    //   28: aload_2
    //   29: ldc 64
    //   31: aload_0
    //   32: getfield 66	com/tencent/mm/plugin/appbrand/config/AppBrandLaunchReferrer:appId	Ljava/lang/String;
    //   35: invokevirtual 70	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   38: pop
    //   39: aload_2
    //   40: ldc 72
    //   42: aload_1
    //   43: invokevirtual 70	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   46: pop
    //   47: aload_2
    //   48: invokevirtual 76	org/json/JSONObject:length	()I
    //   51: ifne +22 -> 73
    //   54: ldc2_w 53
    //   57: ldc 55
    //   59: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   62: aconst_null
    //   63: areturn
    //   64: astore_1
    //   65: aload_0
    //   66: getfield 59	com/tencent/mm/plugin/appbrand/config/AppBrandLaunchReferrer:hQG	Ljava/lang/String;
    //   69: astore_1
    //   70: goto -50 -> 20
    //   73: ldc2_w 53
    //   76: ldc 55
    //   78: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   81: aload_2
    //   82: areturn
    //   83: astore_1
    //   84: goto -37 -> 47
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	AppBrandLaunchReferrer
    //   19	24	1	localJSONObject1	org.json.JSONObject
    //   64	1	1	localException1	Exception
    //   69	1	1	str	String
    //   83	1	1	localException2	Exception
    //   27	55	2	localJSONObject2	org.json.JSONObject
    // Exception table:
    //   from	to	target	type
    //   8	20	64	java/lang/Exception
    //   28	47	83	java/lang/Exception
  }
  
  public final void a(AppBrandLaunchReferrer paramAppBrandLaunchReferrer)
  {
    GMTrace.i(10593268400128L, 78926);
    if (paramAppBrandLaunchReferrer == null)
    {
      GMTrace.o(10593268400128L, 78926);
      return;
    }
    Parcel localParcel = Parcel.obtain();
    localParcel.setDataPosition(0);
    paramAppBrandLaunchReferrer.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    g(localParcel);
    localParcel.recycle();
    GMTrace.o(10593268400128L, 78926);
  }
  
  public final int describeContents()
  {
    GMTrace.i(10592597311488L, 78921);
    GMTrace.o(10592597311488L, 78921);
    return 0;
  }
  
  final void g(Parcel paramParcel)
  {
    GMTrace.i(10593134182400L, 78925);
    this.hQF = paramParcel.readInt();
    this.appId = paramParcel.readString();
    this.hQG = paramParcel.readString();
    this.url = paramParcel.readString();
    GMTrace.o(10593134182400L, 78925);
  }
  
  public final String toString()
  {
    GMTrace.i(20753147756544L, 154623);
    String str = "AppBrandLaunchReferrer{launchScene=" + this.hQF + ", appId='" + this.appId + '\'' + ", extraData='" + this.hQG + '\'' + ", url='" + this.url + '\'' + '}';
    GMTrace.o(20753147756544L, 154623);
    return str;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10592731529216L, 78922);
    paramParcel.writeInt(this.hQF);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.hQG);
    paramParcel.writeString(this.url);
    GMTrace.o(10592731529216L, 78922);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\AppBrandLaunchReferrer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */