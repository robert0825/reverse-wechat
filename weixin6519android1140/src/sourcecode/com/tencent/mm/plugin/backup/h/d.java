package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class d
  extends com.tencent.mm.bm.a
{
  public String ID;
  public h jgQ;
  public int jgR;
  public int jgS;
  public int jgT;
  public int jgU;
  public int jgV;
  public int jgW;
  public int jgX;
  public int jgY;
  public int jgZ;
  
  public d()
  {
    GMTrace.i(14837367177216L, 110547);
    GMTrace.o(14837367177216L, 110547);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14837501394944L, 110548);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new b("Not all required fields were included: ID");
      }
      if (this.ID != null) {
        paramVarArgs.e(1, this.ID);
      }
      if (this.jgQ != null)
      {
        paramVarArgs.fm(2, this.jgQ.aYq());
        this.jgQ.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.jgR);
      paramVarArgs.fk(4, this.jgS);
      paramVarArgs.fk(5, this.jgT);
      paramVarArgs.fk(6, this.jgU);
      paramVarArgs.fk(7, this.jgV);
      paramVarArgs.fk(8, this.jgW);
      paramVarArgs.fk(9, this.jgX);
      paramVarArgs.fk(10, this.jgY);
      paramVarArgs.fk(11, this.jgZ);
      GMTrace.o(14837501394944L, 110548);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ID != null) {
        paramInt = b.a.a.b.b.a.f(1, this.ID) + 0;
      }
      i = paramInt;
      if (this.jgQ != null) {
        i = paramInt + b.a.a.a.fj(2, this.jgQ.aYq());
      }
      paramInt = b.a.a.a.fh(3, this.jgR);
      int j = b.a.a.a.fh(4, this.jgS);
      int k = b.a.a.a.fh(5, this.jgT);
      int m = b.a.a.a.fh(6, this.jgU);
      int n = b.a.a.a.fh(7, this.jgV);
      int i1 = b.a.a.a.fh(8, this.jgW);
      int i2 = b.a.a.a.fh(9, this.jgX);
      int i3 = b.a.a.a.fh(10, this.jgY);
      int i4 = b.a.a.a.fh(11, this.jgZ);
      GMTrace.o(14837501394944L, 110548);
      return i + paramInt + j + k + m + n + i1 + i2 + i3 + i4;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ID == null) {
        throw new b("Not all required fields were included: ID");
      }
      GMTrace.o(14837501394944L, 110548);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      d locald = (d)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14837501394944L, 110548);
        return -1;
      case 1: 
        locald.ID = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new h();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((h)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locald.jgQ = ((h)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 3: 
        locald.jgR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 4: 
        locald.jgS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 5: 
        locald.jgT = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 6: 
        locald.jgU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 7: 
        locald.jgV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 8: 
        locald.jgW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 9: 
        locald.jgX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      case 10: 
        locald.jgY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14837501394944L, 110548);
        return 0;
      }
      locald.jgZ = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(14837501394944L, 110548);
      return 0;
    }
    GMTrace.o(14837501394944L, 110548);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\h\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */