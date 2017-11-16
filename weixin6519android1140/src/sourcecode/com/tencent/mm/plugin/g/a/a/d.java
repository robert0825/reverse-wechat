package com.tencent.mm.plugin.g.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Vector;
import junit.framework.Assert;

public final class d
{
  private final HashMap<c, Vector<Integer>> jkk;
  private b jkl;
  
  public d(b paramb)
  {
    GMTrace.i(4802176090112L, 35779);
    this.jkk = new HashMap();
    this.jkl = null;
    this.jkl = paramb;
    GMTrace.o(4802176090112L, 35779);
  }
  
  private void a(Vector<Integer> paramVector, c paramc)
  {
    GMTrace.i(4802444525568L, 35781);
    w.i("MicroMsg.exdevie.IBeaconManager", "calDistance");
    Object localObject = new int[paramVector.size()];
    int i = 0;
    while (i < localObject.length)
    {
      localObject[i] = ((Integer)paramVector.elementAt(i)).intValue();
      i += 1;
    }
    paramVector = new a((int[])localObject);
    if (1 == paramVector.jkg.length)
    {
      w.d("MicroMsg.exdevice.GaussianFilter", "data group length = 1, no need to filter, just return");
      paramVector = paramVector.jkg;
    }
    while ((paramVector == null) || (paramVector.length == 0))
    {
      throw new NullPointerException("null == ret || 0 == ret.length");
      localObject = new StringBuilder("");
      ((StringBuilder)localObject).append("Data Before GaussianFilter \r\n");
      i = 0;
      while (i < paramVector.jkg.length)
      {
        ((StringBuilder)localObject).append(" " + paramVector.jkg[i]);
        i += 1;
      }
      w.d("MicroMsg.exdevice.GaussianFilter", ((StringBuilder)localObject).toString());
      d1 = i.d(paramVector.jkg, 5);
      d2 = i.g(paramVector.jkg);
      d3 = i.g(0.15D, d2).add(new BigDecimal(d1)).doubleValue();
      double d4 = i.g(3.09D, d2).add(new BigDecimal(d1)).doubleValue();
      w.d("MicroMsg.exdevice.GaussianFilter", "Mean = " + d1 + "SD = " + d2 + "LowerLimit = " + d3 + " UpperLimit = " + d4);
      i = 0;
      localObject = new int[paramVector.jkg.length];
      int j = 0;
      while (j < paramVector.jkg.length)
      {
        int k = i;
        if (paramVector.jkg[j] >= d3)
        {
          k = i;
          if (paramVector.jkg[j] <= d4)
          {
            localObject[i] = paramVector.jkg[j];
            k = i + 1;
          }
        }
        j += 1;
        i = k;
      }
      if (i != 0) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        paramVector = new int[i];
        j = 0;
        while (j < i)
        {
          paramVector[j] = localObject[j];
          j += 1;
        }
      }
      localObject = new StringBuilder("");
      ((StringBuilder)localObject).append("Data After GaussianFilter \r\n");
      i = 0;
      while (i < paramVector.length)
      {
        ((StringBuilder)localObject).append(" " + paramVector[i]);
        i += 1;
      }
      w.d("MicroMsg.exdevice.GaussianFilter", ((StringBuilder)localObject).toString());
    }
    double d2 = i.d(paramVector, 5);
    paramc.jkj = new BigDecimal(d2).divide(new BigDecimal(1), 3, 4).doubleValue();
    double d3 = paramc.jki.jkn.jkR;
    double d1 = 1.0D * d2 / d3;
    if (d1 < 1.0D) {}
    for (d1 = Math.pow(d1, 10.0D);; d1 = Math.pow(d1, 9.9476D) * 0.92093D + 0.54992D)
    {
      w.i("MicroMsg.exdevie.IBeaconManager", "txPower = %f , rssi = %f,distance = %f", new Object[] { Double.valueOf(d3), Double.valueOf(d2), Double.valueOf(d1) });
      this.jkl.a(d1, paramc);
      GMTrace.o(4802444525568L, 35781);
      return;
    }
  }
  
  public final void a(int paramInt, String paramString, e parame)
  {
    GMTrace.i(4802310307840L, 35780);
    w.i("MicroMsg.exdevie.IBeaconManager", "advertismentProcess, brand = %s, rssi = %d", new Object[] { null, Integer.valueOf(paramInt) });
    if (parame == null)
    {
      w.e("MicroMsg.exdevie.IBeaconManager", "null == aProtocal");
      GMTrace.o(4802310307840L, 35780);
      return;
    }
    c localc = new c();
    localc.jkh = null;
    localc.jki = parame;
    localc.aKJ = paramString;
    if (!this.jkk.containsKey(localc))
    {
      paramString = new Vector();
      paramString.add(Integer.valueOf(paramInt));
      this.jkk.put(localc, paramString);
      GMTrace.o(4802310307840L, 35780);
      return;
    }
    paramString = (Vector)this.jkk.get(localc);
    paramString.add(Integer.valueOf(paramInt));
    if (1 <= paramString.size()) {
      try
      {
        a(paramString, localc);
        paramString.clear();
        GMTrace.o(4802310307840L, 35780);
        return;
      }
      catch (Exception parame)
      {
        w.e("MicroMsg.exdevie.IBeaconManager", "calDistance failed!!!, %s", new Object[] { parame.getMessage() });
        paramString.clear();
        GMTrace.o(4802310307840L, 35780);
        return;
      }
      finally
      {
        paramString.clear();
      }
    }
    GMTrace.o(4802310307840L, 35780);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\g\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */