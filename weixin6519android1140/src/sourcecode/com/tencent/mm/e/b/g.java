package com.tencent.mm.e.b;

import android.os.Build;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.l;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class g
{
  public static final String eyu;
  public static final String eyv;
  
  static
  {
    GMTrace.i(4475221704704L, 33343);
    eyu = com.tencent.mm.compatible.util.e.ghz + "test.wav";
    eyv = com.tencent.mm.compatible.util.e.ghz + "test.pcm";
    GMTrace.o(4475221704704L, 33343);
  }
  
  public g()
  {
    GMTrace.i(4474953269248L, 33341);
    GMTrace.o(4474953269248L, 33341);
  }
  
  public static int k(String paramString, int paramInt)
  {
    GMTrace.i(4475087486976L, 33342);
    try
    {
      int i = bg.getInt(((a)h.h(a.class)).ut().getValue(paramString), paramInt);
      paramInt = i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.RecorderUtil", "getIntValFromDynamicConfig parseInt failed, key: " + paramString);
      }
    }
    catch (Error localError)
    {
      for (;;)
      {
        w.e("MicroMsg.RecorderUtil", "error on parseInt failed, key: " + paramString);
      }
    }
    GMTrace.o(4475087486976L, 33342);
    return paramInt;
  }
  
  public static final class a
  {
    public byte[] buf;
    public int eyw;
    public boolean eyx;
    
    public a(byte[] paramArrayOfByte, int paramInt)
    {
      GMTrace.i(4481261502464L, 33388);
      this.eyw = 0;
      this.eyx = false;
      this.buf = paramArrayOfByte;
      this.eyw = paramInt;
      this.eyx = false;
      GMTrace.o(4481261502464L, 33388);
    }
    
    public a(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
    {
      GMTrace.i(18682570866688L, 139196);
      this.eyw = 0;
      this.eyx = false;
      this.buf = paramArrayOfByte;
      this.eyw = paramInt;
      this.eyx = paramBoolean;
      GMTrace.o(18682570866688L, 139196);
    }
  }
  
  public static final class b
  {
    private static boolean eyy;
    private static boolean eyz;
    
    static
    {
      GMTrace.i(4484885381120L, 33415);
      eyy = false;
      eyz = false;
      int i = l.sK();
      w.i("MicroMsg.RecorderUtil", "abi: %s, abi2: %s, cpuFlag: %d", new Object[] { Build.CPU_ABI, Build.CPU_ABI2, Integer.valueOf(i) });
      if ((!bg.nm(Build.CPU_ABI)) && (!Build.CPU_ABI.contains("armeabi")) && (!bg.nm(Build.CPU_ABI2)) && (!Build.CPU_ABI2.contains("armeabi")))
      {
        w.i("MicroMsg.RecorderUtil", "don't contains armeabi");
        k.b("wechatvoicesilk_v5", g.class.getClassLoader());
        eyy = true;
        eyz = false;
      }
      for (;;)
      {
        w.i("MicroMsg.RecorderUtil", "finish load silk so, canUseSilkDecode: %b, canUseSilkEncode: %b", new Object[] { Boolean.valueOf(eyy), Boolean.valueOf(eyz) });
        GMTrace.o(4484885381120L, 33415);
        return;
        if ((i & 0x400) != 0)
        {
          try
          {
            k.b("wechatvoicesilk_v7a", g.class.getClassLoader());
            eyy = true;
            eyz = true;
          }
          catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
          {
            w.e("MicroMsg.RecorderUtil", "load library failed!");
            eyy = false;
            eyz = false;
          }
        }
        else if ((i & 0x200) != 0)
        {
          k.b("wechatvoicesilk", g.class.getClassLoader());
          eyy = true;
          eyz = true;
        }
        else
        {
          k.b("wechatvoicesilk_v5", g.class.getClassLoader());
          eyy = true;
          eyz = false;
        }
      }
    }
    
    public b()
    {
      GMTrace.i(4484616945664L, 33413);
      GMTrace.o(4484616945664L, 33413);
    }
    
    public static boolean qB()
    {
      GMTrace.i(4484751163392L, 33414);
      boolean bool = eyz;
      GMTrace.o(4484751163392L, 33414);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\e\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */