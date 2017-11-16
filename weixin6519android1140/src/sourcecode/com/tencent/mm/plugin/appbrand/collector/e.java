package com.tencent.mm.plugin.appbrand.collector;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class e
{
  public static StringBuilder a(TimePoint paramTimePoint)
  {
    GMTrace.i(20006897188864L, 149063);
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramTimePoint == null)
    {
      w.i("MicroMsg.CostTimeUtil", "print failed, headPoint is null.");
      GMTrace.o(20006897188864L, 149063);
      return localStringBuilder;
    }
    localStringBuilder.append(0).append(". ").append(paramTimePoint.name).append(" : ");
    localStringBuilder.append(paramTimePoint.hON);
    localStringBuilder.append(", ");
    localStringBuilder.append(paramTimePoint.hOM.get());
    localStringBuilder.append(", ");
    localStringBuilder.append(paramTimePoint.hON.get() - paramTimePoint.hON.get());
    int i = 0;
    TimePoint localTimePoint;
    for (Object localObject = paramTimePoint; ((TimePoint)localObject).hOO.get() != null; localObject = localTimePoint)
    {
      localTimePoint = (TimePoint)((TimePoint)localObject).hOO.get();
      localStringBuilder.append("\n");
      localStringBuilder.append(i + 1).append(". ").append(localTimePoint.name).append(" : ");
      localStringBuilder.append((localTimePoint.hON.get() - ((TimePoint)localObject).hON.get()) / 1000000.0D);
      i += 1;
    }
    localStringBuilder.append("\n");
    localStringBuilder.append("total cost : ").append((((TimePoint)localObject).hON.get() - paramTimePoint.hON.get()) / 1000000.0D);
    GMTrace.o(20006897188864L, 149063);
    return localStringBuilder;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\collector\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */