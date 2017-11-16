package com.tencent.mm.plugin.qqmail.b;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class d
  extends com.tencent.mm.bm.a
{
  public String content;
  public int nRV;
  public String nRW;
  public LinkedList<i> nRX;
  public LinkedList<i> nRY;
  public LinkedList<i> nRZ;
  public LinkedList<y> nSa;
  public String nSb;
  public int nSc;
  
  public d()
  {
    GMTrace.i(5475949084672L, 40799);
    this.nRX = new LinkedList();
    this.nRY = new LinkedList();
    this.nRZ = new LinkedList();
    this.nSa = new LinkedList();
    this.nSc = 5;
    GMTrace.o(5475949084672L, 40799);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(5476083302400L, 40800);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.content == null) {
        throw new b("Not all required fields were included: content");
      }
      paramVarArgs.fk(1, this.nRV);
      if (this.nRW != null) {
        paramVarArgs.e(2, this.nRW);
      }
      paramVarArgs.d(3, 8, this.nRX);
      paramVarArgs.d(4, 8, this.nRY);
      paramVarArgs.d(5, 8, this.nRZ);
      paramVarArgs.d(6, 8, this.nSa);
      if (this.nSb != null) {
        paramVarArgs.e(7, this.nSb);
      }
      if (this.content != null) {
        paramVarArgs.e(8, this.content);
      }
      paramVarArgs.fk(9, this.nSc);
      GMTrace.o(5476083302400L, 40800);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.nRV) + 0;
      paramInt = i;
      if (this.nRW != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.nRW);
      }
      i = paramInt + b.a.a.a.c(3, 8, this.nRX) + b.a.a.a.c(4, 8, this.nRY) + b.a.a.a.c(5, 8, this.nRZ) + b.a.a.a.c(6, 8, this.nSa);
      paramInt = i;
      if (this.nSb != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.nSb);
      }
      i = paramInt;
      if (this.content != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.content);
      }
      paramInt = b.a.a.a.fh(9, this.nSc);
      GMTrace.o(5476083302400L, 40800);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.nRX.clear();
      this.nRY.clear();
      this.nRZ.clear();
      this.nSa.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.content == null) {
        throw new b("Not all required fields were included: content");
      }
      GMTrace.o(5476083302400L, 40800);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      d locald = (d)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(5476083302400L, 40800);
        return -1;
      case 1: 
        locald.nRV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(5476083302400L, 40800);
        return 0;
      case 2: 
        locald.nRW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(5476083302400L, 40800);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new i();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((i)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locald.nRX.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(5476083302400L, 40800);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new i();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((i)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locald.nRY.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(5476083302400L, 40800);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new i();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((i)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locald.nRZ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(5476083302400L, 40800);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new y();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((y)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locald.nSa.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(5476083302400L, 40800);
        return 0;
      case 7: 
        locald.nSb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(5476083302400L, 40800);
        return 0;
      case 8: 
        locald.content = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(5476083302400L, 40800);
        return 0;
      }
      locald.nSc = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(5476083302400L, 40800);
      return 0;
    }
    GMTrace.o(5476083302400L, 40800);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */