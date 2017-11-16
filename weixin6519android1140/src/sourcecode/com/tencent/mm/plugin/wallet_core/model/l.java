package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.ui.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public abstract class l<K>
{
  Map<String, Integer> rgB;
  List<K> rgC;
  public Vector<l<K>.b> rgD;
  List<String> rgE;
  
  public l()
  {
    GMTrace.i(6872484544512L, 51204);
    this.rgB = new HashMap();
    this.rgC = new LinkedList();
    this.rgD = new Vector();
    this.rgE = new LinkedList();
    GMTrace.o(6872484544512L, 51204);
  }
  
  public abstract String a(Vector<l<K>.b> paramVector, int paramInt);
  
  public final void byq()
  {
    GMTrace.i(6873021415424L, 51208);
    int i = 0;
    int j;
    if (i < this.rgD.size()) {
      if (((b)this.rgD.get(i)).rgL != a.rgH)
      {
        Object localObject = a(this.rgD, i);
        if (this.rgB.containsKey(localObject)) {
          break label166;
        }
        localObject = a.Kv((String)localObject);
        j = 0;
        label75:
        if (j >= this.rgE.size()) {
          break label161;
        }
        k = 0;
        label90:
        if (k >= localObject.length) {
          break label186;
        }
        if (((String)this.rgE.get(j)).contains(localObject[k])) {
          break label147;
        }
      }
    }
    label128:
    label147:
    label161:
    label166:
    label186:
    for (int k = 0;; k = 1)
    {
      if (k != 0)
      {
        j = 1;
        if (j != 0) {
          break label166;
        }
        dx(i, a.rgG);
      }
      for (;;)
      {
        i += 1;
        break;
        k += 1;
        break label90;
        j += 1;
        break label75;
        j = 0;
        break label128;
        dx(i, a.rgI);
      }
      GMTrace.o(6873021415424L, 51208);
      return;
    }
  }
  
  public final void c(List<K> paramList1, List<K> paramList2, List<String> paramList)
  {
    GMTrace.i(6872752979968L, 51206);
    this.rgE = paramList;
    this.rgC = paramList2;
    this.rgD.clear();
    this.rgD = new Vector(paramList1.size());
    int i = 0;
    if (i < paramList1.size())
    {
      paramList2 = new b();
      Object localObject = paramList1.get(i);
      paramList2.rgK = localObject;
      if (this.rgC.contains(localObject)) {}
      for (paramList2.rgL = a.rgH;; paramList2.rgL = a.rgG)
      {
        this.rgD.add(paramList2);
        i += 1;
        break;
      }
    }
    this.rgB.clear();
    i = 0;
    while (i < paramList.size())
    {
      this.rgB.put(paramList.get(i), Integer.valueOf(0));
      i += 1;
    }
    byq();
    GMTrace.o(6872752979968L, 51206);
  }
  
  public final void dx(int paramInt1, int paramInt2)
  {
    GMTrace.i(6872887197696L, 51207);
    ((b)this.rgD.get(paramInt1)).rgL = paramInt2;
    GMTrace.o(6872887197696L, 51207);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(6902549315584L, 51428);
      rgG = 1;
      rgH = 2;
      rgI = 3;
      rgJ = new int[] { rgG, rgH, rgI };
      GMTrace.o(6902549315584L, 51428);
    }
    
    public static int[] byr()
    {
      GMTrace.i(6902415097856L, 51427);
      int[] arrayOfInt = (int[])rgJ.clone();
      GMTrace.o(6902415097856L, 51427);
      return arrayOfInt;
    }
  }
  
  public final class b
  {
    public K rgK;
    public int rgL;
    
    public b()
    {
      GMTrace.i(6892482985984L, 51353);
      GMTrace.o(6892482985984L, 51353);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */