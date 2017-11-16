package com.tencent.mm.plugin.s;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecList;
import android.util.Range;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class e
{
  private static long mVk;
  
  static
  {
    GMTrace.i(12910671691776L, 96192);
    mVk = 0L;
    GMTrace.o(12910671691776L, 96192);
  }
  
  private static String a(MediaCodecInfo paramMediaCodecInfo)
  {
    GMTrace.i(12910537474048L, 96191);
    paramMediaCodecInfo = paramMediaCodecInfo.getSupportedTypes();
    int i = 0;
    while (i < paramMediaCodecInfo.length)
    {
      String str = paramMediaCodecInfo[i];
      if ((!bg.nm(str)) && (str.contains("hevc")))
      {
        GMTrace.o(12910537474048L, 96191);
        return str;
      }
      i += 1;
    }
    GMTrace.o(12910537474048L, 96191);
    return "";
  }
  
  public static String aOA()
  {
    GMTrace.i(12910269038592L, 96189);
    w.d("MicroMsg.MediaCodecUtil", "check hevc info last rpt time[%d]", new Object[] { Long.valueOf(mVk) });
    for (;;)
    {
      try
      {
        mVk = bg.Pv();
        if (!d.et(21)) {
          continue;
        }
        l = bg.Pw();
        localObject1 = new MediaCodecList(1).getCodecInfos();
        j = localObject1.length;
        ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        i = 0;
        if (i < j)
        {
          localObject2 = a(localObject1[i]);
          if (bg.nm((String)localObject2)) {
            break label955;
          }
          localArrayList1.add(Integer.valueOf(i));
          localArrayList2.add(localObject2);
          break label955;
        }
        if (localArrayList1.isEmpty())
        {
          GMTrace.o(12910269038592L, 96189);
          return "";
        }
        i4 = 0;
        i5 = 0;
        k = 0;
        m = 0;
        n = 0;
        i1 = 0;
        i2 = 0;
        i3 = 0;
        i = 0;
        j = 0;
        localObject2 = new StringBuilder();
        localStringBuilder = new StringBuilder();
        bool = false;
        i6 = 0;
        i7 = 0;
        if (i7 < localArrayList1.size())
        {
          int i10 = ((Integer)localArrayList1.get(i7)).intValue();
          Object localObject3 = (String)localArrayList2.get(i7);
          bool = localObject1[i10].isEncoder();
          if (localObject1[i10].isEncoder()) {
            break label1007;
          }
          i4 = 1;
          localObject3 = localObject1[i10].getCapabilitiesForType((String)localObject3);
          if (localObject3 != null)
          {
            localObject3 = ((MediaCodecInfo.CodecCapabilities)localObject3).getVideoCapabilities();
            if (localObject3 == null) {
              break label920;
            }
            i6 = Math.max(((Integer)((MediaCodecInfo.VideoCapabilities)localObject3).getBitrateRange().getLower()).intValue(), k);
            i8 = Math.max(((Integer)((MediaCodecInfo.VideoCapabilities)localObject3).getBitrateRange().getUpper()).intValue(), m);
            n = Math.max(((Integer)((MediaCodecInfo.VideoCapabilities)localObject3).getSupportedFrameRates().getLower()).intValue(), n);
            i1 = Math.max(((Integer)((MediaCodecInfo.VideoCapabilities)localObject3).getSupportedFrameRates().getUpper()).intValue(), i1);
            m = Math.max(((Integer)((MediaCodecInfo.VideoCapabilities)localObject3).getSupportedWidths().getLower()).intValue(), i2);
            k = Math.max(((Integer)((MediaCodecInfo.VideoCapabilities)localObject3).getSupportedWidths().getUpper()).intValue(), i3);
            i2 = Math.max(((Integer)((MediaCodecInfo.VideoCapabilities)localObject3).getSupportedHeights().getLower()).intValue(), i);
            i = Math.max(((Integer)((MediaCodecInfo.VideoCapabilities)localObject3).getSupportedHeights().getUpper()).intValue(), j);
            j = i2;
            i3 = n;
            i2 = i8;
            n = i6;
            ((StringBuilder)localObject2).append(localObject1[i10].getName()).append("|");
            i6 = 1;
            break label962;
          }
          localStringBuilder.append(localObject1[i10].getName()).append("|");
          i5 = m;
          i8 = k;
          i9 = 1;
          k = i;
          i = j;
          j = k;
          k = i3;
          m = i2;
          i3 = n;
          i2 = i5;
          n = i8;
          i5 = i9;
          break label962;
        }
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append(1).append(",");
        if ((i4 == 0) || (!bool)) {
          continue;
        }
        ((StringBuilder)localObject1).append(3).append(",");
      }
      catch (Exception localException)
      {
        long l;
        Object localObject1;
        Object localObject2;
        int i1;
        StringBuilder localStringBuilder;
        boolean bool;
        w.printErrStackTrace("MicroMsg.MediaCodecUtil", localException, "report hevc info error %s", new Object[] { localException.toString() });
        GMTrace.o(12910269038592L, 96189);
        return "";
        localException.append(1).append(",");
        continue;
      }
      catch (Throwable localThrowable)
      {
        int i5;
        w.printErrStackTrace("MicroMsg.MediaCodecUtil", localThrowable, "report hevc info error %s", new Object[] { localThrowable.toString() });
        continue;
        if (i5 == 0) {
          continue;
        }
        localThrowable.append(2).append(",");
        continue;
        localThrowable.append(1).append(",");
        continue;
        String str = aOB();
        GMTrace.o(12910269038592L, 96189);
        return str;
      }
      if ((i6 != 0) && (i5 != 0))
      {
        ((StringBuilder)localObject1).append(3).append(",");
        ((StringBuilder)localObject1).append(((StringBuilder)localObject2).toString()).append(",");
        ((StringBuilder)localObject1).append(localStringBuilder.toString()).append(",");
        ((StringBuilder)localObject1).append(k).append(",").append(m).append(",");
        ((StringBuilder)localObject1).append(n).append(",").append(i1).append(",");
        ((StringBuilder)localObject1).append(i2).append(",").append(i3).append(",");
        ((StringBuilder)localObject1).append(i).append(",").append(j);
        localObject1 = ((StringBuilder)localObject1).toString();
        w.i("MicroMsg.MediaCodecUtil", "high api 21 cost[%d] hevc info %s", new Object[] { Long.valueOf(bg.aI(l)), localObject1 });
        GMTrace.o(12910269038592L, 96189);
        return (String)localObject1;
        if (bool)
        {
          ((StringBuilder)localObject1).append(2).append(",");
          continue;
        }
      }
      label920:
      int i6 = i;
      int i8 = m;
      int i9 = k;
      int i = j;
      int j = i6;
      int k = i3;
      int m = i2;
      int i3 = n;
      int i2 = i8;
      int n = i9;
      continue;
      label955:
      i += 1;
      continue;
      label962:
      i9 = i7 + 1;
      int i7 = n;
      i8 = i2;
      n = i3;
      i2 = j;
      j = i;
      i = i2;
      i3 = k;
      i2 = m;
      m = i8;
      k = i7;
      i7 = i9;
      continue;
      label1007:
      int i4 = 0;
    }
  }
  
  private static String aOB()
  {
    GMTrace.i(12910403256320L, 96190);
    long l = bg.Pw();
    int j = MediaCodecList.getCodecCount();
    Object localObject1 = new ArrayList();
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < j)
    {
      localObject2 = a(MediaCodecList.getCodecInfoAt(i));
      if (!bg.nm((String)localObject2))
      {
        ((ArrayList)localObject1).add(Integer.valueOf(i));
        localArrayList.add(localObject2);
      }
      i += 1;
    }
    if (((ArrayList)localObject1).isEmpty())
    {
      GMTrace.o(12910403256320L, 96190);
      return "";
    }
    boolean bool = false;
    Object localObject2 = new StringBuilder();
    StringBuilder localStringBuilder = new StringBuilder();
    int k = 0;
    j = 0;
    i = 0;
    int m = 0;
    if (j < ((ArrayList)localObject1).size())
    {
      i = ((Integer)((ArrayList)localObject1).get(j)).intValue();
      String str = (String)localArrayList.get(j);
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
      bool = localMediaCodecInfo.isEncoder();
      if (!localMediaCodecInfo.isEncoder())
      {
        i = 1;
        label188:
        if (localMediaCodecInfo.getCapabilitiesForType(str) == null) {
          break label228;
        }
        k = 1;
        ((StringBuilder)localObject2).append(localMediaCodecInfo.getName()).append("|");
      }
      for (;;)
      {
        j += 1;
        break;
        i = 0;
        break label188;
        label228:
        m = 1;
        localStringBuilder.append(localMediaCodecInfo.getName()).append("|");
      }
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(1).append(",");
    if ((i != 0) && (bool))
    {
      ((StringBuilder)localObject1).append(3).append(",");
      if ((k == 0) || (m == 0)) {
        break label418;
      }
      ((StringBuilder)localObject1).append(3).append(",");
    }
    for (;;)
    {
      ((StringBuilder)localObject1).append(((StringBuilder)localObject2).toString()).append(",");
      ((StringBuilder)localObject1).append(localStringBuilder.toString());
      localObject1 = ((StringBuilder)localObject1).toString();
      w.i("MicroMsg.MediaCodecUtil", "below api 21 cost[%d] hevc info %s", new Object[] { Long.valueOf(bg.aI(l)), localObject1 });
      GMTrace.o(12910403256320L, 96190);
      return (String)localObject1;
      if (bool)
      {
        ((StringBuilder)localObject1).append(2).append(",");
        break;
      }
      ((StringBuilder)localObject1).append(1).append(",");
      break;
      label418:
      if (m != 0) {
        ((StringBuilder)localObject1).append(2).append(",");
      } else {
        ((StringBuilder)localObject1).append(1).append(",");
      }
    }
  }
  
  @TargetApi(21)
  public static boolean aOy()
  {
    GMTrace.i(17459578929152L, 130084);
    if (d.et(21))
    {
      MediaCodecInfo[] arrayOfMediaCodecInfo = new MediaCodecList(1).getCodecInfos();
      int j = arrayOfMediaCodecInfo.length;
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      int i = 0;
      while (i < j)
      {
        String str = a(arrayOfMediaCodecInfo[i]);
        if (!bg.nm(str))
        {
          localArrayList1.add(Integer.valueOf(i));
          localArrayList2.add(str);
        }
        i += 1;
      }
      if (localArrayList1.isEmpty())
      {
        GMTrace.o(17459578929152L, 130084);
        return false;
      }
      GMTrace.o(17459578929152L, 130084);
      return true;
    }
    GMTrace.o(17459578929152L, 130084);
    return false;
  }
  
  public static boolean aOz()
  {
    GMTrace.i(12910134820864L, 96188);
    if (bg.aH(mVk) > 86400000L)
    {
      GMTrace.o(12910134820864L, 96188);
      return true;
    }
    GMTrace.o(12910134820864L, 96188);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\s\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */