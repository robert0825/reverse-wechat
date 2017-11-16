package com.tencent.map.geolocation;

import android.os.Bundle;
import com.tencent.map.geolocation.internal.TencentExtraKeys;

public final class TencentLocationRequest
{
  public static final int REQUEST_LEVEL_ADMIN_AREA = 3;
  public static final int REQUEST_LEVEL_GEO = 0;
  public static final int REQUEST_LEVEL_NAME = 1;
  public static final int REQUEST_LEVEL_POI = 4;
  private long a;
  private int b;
  private boolean c;
  private boolean d;
  private boolean e;
  private long f;
  private int g;
  private String h;
  private Bundle i;
  
  private TencentLocationRequest() {}
  
  public TencentLocationRequest(TencentLocationRequest paramTencentLocationRequest)
  {
    this.a = paramTencentLocationRequest.a;
    this.b = paramTencentLocationRequest.b;
    this.d = paramTencentLocationRequest.d;
    this.e = paramTencentLocationRequest.e;
    this.f = paramTencentLocationRequest.f;
    this.g = paramTencentLocationRequest.g;
    this.c = paramTencentLocationRequest.c;
    this.h = paramTencentLocationRequest.h;
    this.i = new Bundle();
    this.i.putAll(paramTencentLocationRequest.i);
  }
  
  public static void copy(TencentLocationRequest paramTencentLocationRequest1, TencentLocationRequest paramTencentLocationRequest2)
  {
    paramTencentLocationRequest1.a = paramTencentLocationRequest2.a;
    paramTencentLocationRequest1.b = paramTencentLocationRequest2.b;
    paramTencentLocationRequest1.d = paramTencentLocationRequest2.d;
    paramTencentLocationRequest1.e = paramTencentLocationRequest2.e;
    paramTencentLocationRequest1.f = paramTencentLocationRequest2.f;
    paramTencentLocationRequest1.g = paramTencentLocationRequest2.g;
    paramTencentLocationRequest1.c = paramTencentLocationRequest2.c;
    paramTencentLocationRequest1.h = paramTencentLocationRequest2.h;
    paramTencentLocationRequest1.i.clear();
    paramTencentLocationRequest1.i.putAll(paramTencentLocationRequest2.i);
  }
  
  public static TencentLocationRequest create()
  {
    TencentLocationRequest localTencentLocationRequest = new TencentLocationRequest();
    localTencentLocationRequest.a = 10000L;
    localTencentLocationRequest.b = 1;
    localTencentLocationRequest.d = true;
    localTencentLocationRequest.e = false;
    localTencentLocationRequest.f = Long.MAX_VALUE;
    localTencentLocationRequest.g = Integer.MAX_VALUE;
    localTencentLocationRequest.c = true;
    localTencentLocationRequest.h = "";
    localTencentLocationRequest.i = new Bundle();
    return localTencentLocationRequest;
  }
  
  public final Bundle getExtras()
  {
    return this.i;
  }
  
  public final long getInterval()
  {
    return this.a;
  }
  
  public final String getPhoneNumber()
  {
    String str2 = this.i.getString("phoneNumber");
    String str1 = str2;
    if (str2 == null) {
      str1 = "";
    }
    return str1;
  }
  
  public final String getQQ()
  {
    return this.h;
  }
  
  public final int getRequestLevel()
  {
    return this.b;
  }
  
  public final boolean isAllowCache()
  {
    return this.d;
  }
  
  public final boolean isAllowDirection()
  {
    return this.e;
  }
  
  public final boolean isAllowGPS()
  {
    return this.c;
  }
  
  public final TencentLocationRequest setAllowCache(boolean paramBoolean)
  {
    this.d = paramBoolean;
    return this;
  }
  
  public final TencentLocationRequest setAllowDirection(boolean paramBoolean)
  {
    this.e = paramBoolean;
    return this;
  }
  
  public final TencentLocationRequest setAllowGPS(boolean paramBoolean)
  {
    this.c = paramBoolean;
    return this;
  }
  
  public final TencentLocationRequest setInterval(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("interval should >= 0");
    }
    this.a = paramLong;
    return this;
  }
  
  public final TencentLocationRequest setPhoneNumber(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    this.i.putString("phoneNumber", str);
    return this;
  }
  
  public final TencentLocationRequest setQQ(String paramString)
  {
    this.h = paramString;
    return this;
  }
  
  public final TencentLocationRequest setRequestLevel(int paramInt)
  {
    if (TencentExtraKeys.isAllowedLevel(paramInt))
    {
      this.b = paramInt;
      return this;
    }
    throw new IllegalArgumentException("request_level: " + paramInt + " not supported!");
  }
  
  public final String toString()
  {
    return "TencentLocationRequest {interval=" + this.a + "ms,level=" + this.b + ",allowCache=" + this.d + ",allowGps=" + this.c + ",allowDirection=" + this.e + ",QQ=" + this.h + "}";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\map\geolocation\TencentLocationRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */