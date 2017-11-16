package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.media.ToneGenerator;
import android.provider.Settings.System;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class d
{
  public static Context mContext;
  private static final HashMap<String, Integer> qOx;
  private final int qOA;
  public Object qOy;
  public ToneGenerator qOz;
  
  static
  {
    GMTrace.i(5387231166464L, 40138);
    HashMap localHashMap = new HashMap();
    qOx = localHashMap;
    localHashMap.put("1", Integer.valueOf(1));
    qOx.put("2", Integer.valueOf(2));
    qOx.put("3", Integer.valueOf(3));
    qOx.put("4", Integer.valueOf(4));
    qOx.put("5", Integer.valueOf(5));
    qOx.put("6", Integer.valueOf(6));
    qOx.put("7", Integer.valueOf(7));
    qOx.put("8", Integer.valueOf(8));
    qOx.put("9", Integer.valueOf(9));
    qOx.put("0", Integer.valueOf(0));
    qOx.put("#", Integer.valueOf(11));
    qOx.put("*", Integer.valueOf(10));
    GMTrace.o(5387231166464L, 40138);
  }
  
  private d()
  {
    GMTrace.i(5386828513280L, 40135);
    this.qOy = new Object();
    this.qOA = 250;
    GMTrace.o(5386828513280L, 40135);
  }
  
  public d(Context arg1)
  {
    GMTrace.i(5386694295552L, 40134);
    this.qOy = new Object();
    this.qOA = 250;
    mContext = ???;
    if (??? != null) {
      try
      {
        synchronized (this.qOy)
        {
          if ((bvX()) && (this.qOz == null)) {
            this.qOz = new ToneGenerator(3, 66);
          }
          GMTrace.o(5386694295552L, 40134);
          return;
        }
        GMTrace.o(5386694295552L, 40134);
      }
      catch (Exception ???)
      {
        w.d("MicroMsg.DTMFToneGenerator", "获取音频发生器单例失败！！！");
        w.d("MicroMsg.DTMFToneGenerator", ???.getMessage());
        this.qOz = null;
      }
    }
  }
  
  public static int JT(String paramString)
  {
    GMTrace.i(5387096948736L, 40137);
    if ((paramString == null) || (paramString.equals("")))
    {
      GMTrace.o(5387096948736L, 40137);
      return -1;
    }
    if (qOx.containsKey(paramString))
    {
      int i = ((Integer)qOx.get(paramString)).intValue();
      GMTrace.o(5387096948736L, 40137);
      return i;
    }
    GMTrace.o(5387096948736L, 40137);
    return -1;
  }
  
  public static boolean bvX()
  {
    GMTrace.i(5386962731008L, 40136);
    if (Settings.System.getInt(mContext.getContentResolver(), "dtmf_tone", 1) == 1)
    {
      GMTrace.o(5386962731008L, 40136);
      return true;
    }
    GMTrace.o(5386962731008L, 40136);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\voip\video\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */