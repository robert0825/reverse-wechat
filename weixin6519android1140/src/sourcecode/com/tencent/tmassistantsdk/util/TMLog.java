package com.tencent.tmassistantsdk.util;

import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;

public class TMLog
{
  protected static boolean mDebugFlagForSDK = true;
  protected static String mDebugFlagForSDKTag = "";
  protected static boolean mHardDebugFlag = true;
  protected static HashMap<String, ArrayList<Long>> mUseTimeLongList;
  protected static HashMap<String, ArrayList<String>> mUseTimeStringList = new HashMap();
  
  static
  {
    mUseTimeLongList = new HashMap();
  }
  
  public static void d(String paramString1, String paramString2)
  {
    if (isForDebug())
    {
      String str = paramString2;
      if (paramString2 == null) {
        str = "............";
      }
      w.d(paramString1, str);
    }
  }
  
  public static void debugE(String paramString)
  {
    if ((mDebugFlagForSDK) && (!TextUtils.isEmpty(mDebugFlagForSDKTag))) {
      w.e(mDebugFlagForSDKTag, paramString);
    }
  }
  
  public static void debugV(String paramString)
  {
    if ((mDebugFlagForSDK) && (!TextUtils.isEmpty(mDebugFlagForSDKTag))) {
      w.v(mDebugFlagForSDKTag, paramString);
    }
  }
  
  public static void e(String paramString1, String paramString2)
  {
    if (isForDebug())
    {
      String str = paramString2;
      if (paramString2 == null) {
        str = "............";
      }
      w.e(paramString1, str);
    }
  }
  
  public static void i(String paramString1, String paramString2)
  {
    if (isForDebug())
    {
      String str = paramString2;
      if (paramString2 == null) {
        str = "............";
      }
      w.i(paramString1, str);
    }
  }
  
  public static boolean isForDebug()
  {
    return mHardDebugFlag;
  }
  
  public static void setDebugLog(boolean paramBoolean, String paramString)
  {
    mDebugFlagForSDK = paramBoolean;
    mDebugFlagForSDKTag = paramString;
  }
  
  public static void time(String paramString)
  {
    time("UseTime", paramString, false);
  }
  
  public static void time(String paramString1, String paramString2)
  {
    time(paramString1, paramString2, false);
  }
  
  public static void time(String paramString1, String paramString2, boolean paramBoolean)
  {
    int i = 0;
    if (!isForDebug()) {
      return;
    }
    ArrayList localArrayList = (ArrayList)mUseTimeStringList.get(paramString1);
    if (localArrayList == null)
    {
      localArrayList = new ArrayList();
      mUseTimeStringList.put(paramString1, localArrayList);
    }
    for (;;)
    {
      localArrayList.add(paramString2);
      paramString2 = (ArrayList)mUseTimeLongList.get(paramString1);
      if (paramString2 == null)
      {
        paramString2 = new ArrayList();
        mUseTimeLongList.put(paramString1, paramString2);
      }
      for (;;)
      {
        paramString2.add(Long.valueOf(System.currentTimeMillis()));
        if (!paramBoolean) {
          break;
        }
        StringBuffer localStringBuffer = new StringBuffer();
        long l = ((Long)paramString2.get(0)).longValue();
        localStringBuffer.append("total time:");
        localStringBuffer.append(((Long)paramString2.get(paramString2.size() - 1)).longValue() - l);
        localStringBuffer.append(" ");
        while (i < localArrayList.size())
        {
          localStringBuffer.append(((Long)paramString2.get(i)).longValue() - l);
          l = ((Long)paramString2.get(i)).longValue();
          localStringBuffer.append(" ");
          localStringBuffer.append((String)localArrayList.get(i));
          localStringBuffer.append(" ");
          i += 1;
        }
        w.v(paramString1, localStringBuffer.toString());
        localArrayList.clear();
        paramString2.clear();
        return;
      }
    }
  }
  
  public static void time(String paramString, boolean paramBoolean)
  {
    time("UseTime", paramString, paramBoolean);
  }
  
  public static void v(String paramString1, String paramString2)
  {
    if (isForDebug())
    {
      String str = paramString2;
      if (paramString2 == null) {
        str = "............";
      }
      w.v(paramString1, str);
    }
  }
  
  public static void w(String paramString1, String paramString2)
  {
    if (isForDebug())
    {
      String str = paramString2;
      if (paramString2 == null) {
        str = "............";
      }
      w.w(paramString1, str);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\util\TMLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */