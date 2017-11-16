package com.tencent.mm.plugin.appbrand.collector;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import junit.framework.Assert;

public class CollectSession
  implements Parcelable
{
  public static final Parcelable.Creator<CollectSession> CREATOR;
  public final Bundle eJV;
  String groupId;
  TimePoint hOA;
  TimePoint hOB;
  final Map<String, TimePoint> hOC;
  String hOD;
  String id;
  
  static
  {
    GMTrace.i(20004212834304L, 149043);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(20004212834304L, 149043);
  }
  
  CollectSession()
  {
    GMTrace.i(20003407527936L, 149037);
    this.hOC = new HashMap();
    this.eJV = new Bundle();
    GMTrace.o(20003407527936L, 149037);
  }
  
  public CollectSession(String paramString)
  {
    GMTrace.i(20003541745664L, 149038);
    this.hOC = new HashMap();
    this.eJV = new Bundle();
    this.id = paramString;
    GMTrace.o(20003541745664L, 149038);
  }
  
  public int describeContents()
  {
    GMTrace.i(20003944398848L, 149041);
    GMTrace.o(20003944398848L, 149041);
    return 0;
  }
  
  public final void oN(String paramString)
  {
    GMTrace.i(20003675963392L, 149039);
    Assert.assertNull(this.hOA);
    this.hOA = new TimePoint(paramString, System.nanoTime());
    this.hOB = this.hOA;
    this.hOA.hOM.set(1);
    this.hOC.put(paramString, this.hOA);
    GMTrace.o(20003675963392L, 149039);
  }
  
  public final void oO(String paramString)
  {
    GMTrace.i(20003810181120L, 149040);
    Assert.assertNotNull(this.hOB);
    long l = System.nanoTime();
    TimePoint localTimePoint = (TimePoint)this.hOC.get(paramString);
    if (localTimePoint == null)
    {
      localTimePoint = new TimePoint(paramString, l);
      localTimePoint.hOM.set(1);
      this.hOC.put(paramString, localTimePoint);
      this.hOB.hOO.set(localTimePoint);
      this.hOB = localTimePoint;
      GMTrace.o(20003810181120L, 149040);
      return;
    }
    localTimePoint.hON.set((l + localTimePoint.hON.get() * localTimePoint.hOM.get()) / (localTimePoint.hOM.get() + 1));
    localTimePoint.hOM.incrementAndGet();
    GMTrace.o(20003810181120L, 149040);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(20004078616576L, 149042);
    paramParcel.writeString(this.groupId);
    paramParcel.writeString(this.id);
    paramParcel.writeParcelable(this.hOA, paramInt);
    paramParcel.writeString(this.hOD);
    paramParcel.writeBundle(this.eJV);
    GMTrace.o(20004078616576L, 149042);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\collector\CollectSession.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */