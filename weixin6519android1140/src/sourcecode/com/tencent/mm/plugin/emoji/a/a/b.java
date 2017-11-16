package com.tencent.mm.plugin.emoji.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.model.h;
import com.tencent.mm.pluginsdk.model.h.a;
import com.tencent.mm.pluginsdk.model.p;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ak;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Iterator;

public final class b
{
  public static void a(c paramc, h.a parama)
  {
    GMTrace.i(11349316861952L, 84559);
    if (!q.zQ())
    {
      GMTrace.o(11349316861952L, 84559);
      return;
    }
    if ((paramc == null) || (paramc.size() <= 0) || (parama == null))
    {
      GMTrace.o(11349316861952L, 84559);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramc.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (f)localIterator.next();
      if ((localObject != null) && (((f)localObject).khz != f.a.khI))
      {
        localObject = ((f)localObject).khA;
        boolean bool1 = e.b((rh)localObject);
        boolean bool2 = e.a((rh)localObject);
        if ((!bool1) && (!bool2))
        {
          localArrayList.add(((rh)localObject).tRS);
          localObject = paramc.vK(((rh)localObject).tRS);
          if (localObject != null) {
            ((ak)localObject).vAM = 11;
          }
        }
      }
    }
    paramc = ab.getContext();
    if (localArrayList.size() > 0) {
      h.a(paramc, (String[])localArrayList.toArray(new String[localArrayList.size()]), parama);
    }
    GMTrace.o(11349316861952L, 84559);
  }
  
  public static void a(ArrayList<p> paramArrayList, c paramc)
  {
    GMTrace.i(11349451079680L, 84560);
    if (!q.zQ())
    {
      GMTrace.o(11349451079680L, 84560);
      return;
    }
    if ((paramc == null) || (paramArrayList == null) || (paramArrayList.size() <= 0))
    {
      GMTrace.o(11349451079680L, 84560);
      return;
    }
    paramArrayList = paramArrayList.iterator();
    label205:
    while (paramArrayList.hasNext())
    {
      p localp = (p)paramArrayList.next();
      if (localp != null)
      {
        ak localak = paramc.vK(localp.eEa);
        if (localak != null)
        {
          int i;
          if (localp.tni == 10232)
          {
            localak.vAO = localp.tnf;
            localak.vAM = 12;
            i = localak.vAK;
            if ((!mD(i)) && (!mE(i))) {
              localak.Au(4);
            }
          }
          else
          {
            localak.vAM = 10;
            localak.vAN = localp.tni;
            i = localak.vAK;
            if ((!mD(i)) && (!mE(i)))
            {
              if (i == 3) {}
              for (i = 1;; i = 0)
              {
                if (i != 0) {
                  break label205;
                }
                localak.Au(10);
                break;
              }
            }
          }
        }
      }
    }
    GMTrace.o(11349451079680L, 84560);
  }
  
  private static boolean mD(int paramInt)
  {
    GMTrace.i(11349585297408L, 84561);
    if (paramInt == 7)
    {
      GMTrace.o(11349585297408L, 84561);
      return true;
    }
    GMTrace.o(11349585297408L, 84561);
    return false;
  }
  
  private static boolean mE(int paramInt)
  {
    GMTrace.i(11349719515136L, 84562);
    if (paramInt == 6)
    {
      GMTrace.o(11349719515136L, 84562);
      return true;
    }
    GMTrace.o(11349719515136L, 84562);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */