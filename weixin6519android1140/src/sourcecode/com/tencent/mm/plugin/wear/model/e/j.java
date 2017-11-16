package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvoice.o;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.c.bsj;
import com.tencent.mm.protocal.c.bsk;
import com.tencent.mm.protocal.c.bso;
import com.tencent.mm.protocal.c.bsp;
import com.tencent.mm.protocal.c.bsr;
import com.tencent.mm.protocal.c.bss;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class j
  extends a
{
  public String rAz;
  
  public j()
  {
    GMTrace.i(9201162125312L, 68554);
    this.rAz = "";
    GMTrace.o(9201162125312L, 68554);
  }
  
  public final List<Integer> bBA()
  {
    GMTrace.i(9201296343040L, 68555);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11019));
    localArrayList.add(Integer.valueOf(11020));
    localArrayList.add(Integer.valueOf(11021));
    localArrayList.add(Integer.valueOf(11031));
    GMTrace.o(9201296343040L, 68555);
    return localArrayList;
  }
  
  protected final byte[] m(int paramInt, byte[] paramArrayOfByte)
  {
    boolean bool = true;
    GMTrace.i(9201430560768L, 68556);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(9201430560768L, 68556);
      return null;
      Object localObject2 = new bsj();
      try
      {
        ((bsj)localObject2).aD(paramArrayOfByte);
        localObject1 = new bsk();
        ((bsk)localObject1).vbE = ((bsj)localObject2).vbE;
        if (((bsk)localObject1).vbE) {
          at.AR();
        }
        for (paramArrayOfByte = com.tencent.mm.y.c.yM().F(((bsj)localObject2).tRz, ((bsj)localObject2).uKe);; paramArrayOfByte = com.tencent.mm.y.c.yM().E(((bsj)localObject2).tRz, ((bsj)localObject2).uKe))
        {
          paramInt = 0;
          while ((paramInt < 10) && (paramInt < paramArrayOfByte.size()))
          {
            localObject2 = (au)paramArrayOfByte.get(paramInt);
            ((bsk)localObject1).utS.add(h.V((au)localObject2));
            paramInt += 1;
          }
          at.AR();
        }
        if (paramArrayOfByte.size() > 10) {}
        for (bool = true;; bool = false)
        {
          ((bsk)localObject1).vbm = bool;
          try
          {
            paramArrayOfByte = ((bsk)localObject1).toByteArray();
            GMTrace.o(9201430560768L, 68556);
            return paramArrayOfByte;
          }
          catch (IOException paramArrayOfByte)
          {
            w.printErrStackTrace("MicroMsg.Wear.HttpMessageServer", paramArrayOfByte, "", new Object[0]);
          }
        }
        continue;
        this.rAz = "";
        continue;
        com.tencent.mm.plugin.wear.model.c.a.dC(9, 0);
        com.tencent.mm.plugin.wear.model.c.a.xi(8);
        localObject1 = new bso();
        try
        {
          ((bso)localObject1).aD(paramArrayOfByte);
          this.rAz = ((bso)localObject1).tRz;
          paramArrayOfByte = new bsp();
          at.AR();
          localObject1 = com.tencent.mm.y.c.yM().E(((bso)localObject1).tRz, ((bso)localObject1).uKe);
          paramInt = 0;
          while ((paramInt < 10) && (paramInt < ((List)localObject1).size()))
          {
            localObject2 = (au)((List)localObject1).get(paramInt);
            paramArrayOfByte.utS.add(h.V((au)localObject2));
            paramInt += 1;
          }
          if (((List)localObject1).size() <= 10) {}
        }
        catch (IOException paramArrayOfByte)
        {
          GMTrace.o(9201430560768L, 68556);
          return null;
        }
        for (;;)
        {
          paramArrayOfByte.vbm = bool;
          try
          {
            paramArrayOfByte = paramArrayOfByte.toByteArray();
            GMTrace.o(9201430560768L, 68556);
            return paramArrayOfByte;
          }
          catch (IOException paramArrayOfByte)
          {
            w.printErrStackTrace("MicroMsg.Wear.HttpMessageServer", paramArrayOfByte, "", new Object[0]);
          }
          bool = false;
        }
        continue;
        com.tencent.mm.plugin.wear.model.c.a.dC(12, 0);
        com.tencent.mm.plugin.wear.model.c.a.xi(14);
        localObject1 = new bsr();
      }
      catch (IOException paramArrayOfByte)
      {
        try
        {
          Object localObject1;
          ((bsr)localObject1).aD(paramArrayOfByte);
          at.AR();
          paramArrayOfByte = com.tencent.mm.y.c.yM().cM(((bsr)localObject1).vbw);
          localObject2 = new bss();
          String str = q.getFullPath(paramArrayOfByte.field_imgPath);
          ((bss)localObject2).vbP = o.e(str, 0, true);
          ((bss)localObject2).vbw = ((bsr)localObject1).vbw;
          ((bss)localObject2).tRB = new b(FileOp.c(str, 0, -1));
          q.D(paramArrayOfByte);
          try
          {
            paramArrayOfByte = ((bss)localObject2).toByteArray();
            GMTrace.o(9201430560768L, 68556);
            return paramArrayOfByte;
          }
          catch (IOException paramArrayOfByte)
          {
            GMTrace.o(9201430560768L, 68556);
            return null;
          }
          paramArrayOfByte = paramArrayOfByte;
        }
        catch (IOException paramArrayOfByte)
        {
          for (;;) {}
        }
      }
    }
  }
  
  protected final boolean xj(int paramInt)
  {
    GMTrace.i(9201698996224L, 68558);
    switch (paramInt)
    {
    default: 
      GMTrace.o(9201698996224L, 68558);
      return true;
    }
    GMTrace.o(9201698996224L, 68558);
    return false;
  }
  
  protected final boolean xk(int paramInt)
  {
    GMTrace.i(9201564778496L, 68557);
    switch (paramInt)
    {
    default: 
      GMTrace.o(9201564778496L, 68557);
      return true;
    }
    GMTrace.o(9201564778496L, 68557);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\e\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */