package com.tencent.c.e.a.a;

import com.tencent.c.e.a.b.f;
import com.tencent.c.e.a.b.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class i
{
  final int gaT;
  int kZJ;
  Object[] vm;
  final int xBL;
  private final int xSr;
  
  public i(int paramInt1, int paramInt2, int paramInt3)
  {
    this.xSr = paramInt1;
    this.vm = new Object[(int)Math.ceil(1.0F * paramInt3 / paramInt2)];
    this.kZJ = 0;
    this.gaT = paramInt3;
    this.xBL = paramInt2;
  }
  
  private ArrayList<f> Fb(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    List localList = (List)this.vm[paramInt];
    if (localList == null) {
      return localArrayList;
    }
    paramInt = 0;
    while (paramInt < localList.size())
    {
      j localj = (j)localList.get(paramInt);
      f localf = new f();
      localf.x = localj.values[0];
      localf.y = localj.values[1];
      localf.z = localj.values[2];
      localf.xSN = localj.timestamp;
      localArrayList.add(localf);
      paramInt += 1;
    }
    return localArrayList;
  }
  
  public final Object[] cnG()
  {
    return (Object[])this.vm.clone();
  }
  
  public final ArrayList<g> dh(List<k> paramList)
  {
    ArrayList localArrayList1 = new ArrayList();
    int j = 0;
    if (j < this.vm.length)
    {
      Object localObject = (List)this.vm[j];
      g localg;
      ArrayList localArrayList2;
      HashMap localHashMap;
      int i;
      if ((localObject != null) && (((List)localObject).size() != 0))
      {
        localg = new g();
        localArrayList2 = Fb(j);
        localHashMap = new HashMap();
        if (this.xSr != 1) {
          break label212;
        }
        i = 0;
      }
      for (;;)
      {
        localHashMap.put(Integer.valueOf(i), localArrayList2);
        localg.xSP = localHashMap;
        localObject = (j)((List)localObject).get(0);
        if (localObject != null)
        {
          localg.xSO = ((j)localObject).timestamp;
          if (paramList.size() > j)
          {
            localObject = (k)paramList.get(j);
            if (localObject != null)
            {
              localg.xSt = ((k)localObject).xSt;
              localg.xSu = ((k)localObject).xSu;
              localg.xSv = ((k)localObject).xSv;
              localg.xSw = ((k)localObject).xSw;
            }
          }
          localArrayList1.add(localg);
        }
        j += 1;
        break;
        label212:
        if (this.xSr == 4) {
          i = 2;
        } else if (this.xSr == 9) {
          i = 4;
        } else {
          i = -1;
        }
      }
    }
    return localArrayList1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\e\a\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */