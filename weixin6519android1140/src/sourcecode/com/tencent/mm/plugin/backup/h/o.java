package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class o
  extends com.tencent.mm.bm.a
{
  public String ID;
  public int jhA;
  public int jhB;
  public long jhs;
  public m jhv;
  public int jhx;
  public long jhy;
  public long jhz;
  
  public o()
  {
    GMTrace.i(14831730032640L, 110505);
    GMTrace.o(14831730032640L, 110505);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14831864250368L, 110506);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new b("Not all required fields were included: ID");
      }
      if (this.ID != null) {
        paramVarArgs.e(1, this.ID);
      }
      paramVarArgs.T(2, this.jhy);
      paramVarArgs.T(3, this.jhz);
      paramVarArgs.fk(4, this.jhA);
      paramVarArgs.fk(5, this.jhB);
      paramVarArgs.T(6, this.jhs);
      if (this.jhv != null)
      {
        paramVarArgs.fm(7, this.jhv.aYq());
        this.jhv.a(paramVarArgs);
      }
      paramVarArgs.fk(8, this.jhx);
      GMTrace.o(14831864250368L, 110506);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ID != null) {
        paramInt = b.a.a.b.b.a.f(1, this.ID) + 0;
      }
      i = paramInt + b.a.a.a.S(2, this.jhy) + b.a.a.a.S(3, this.jhz) + b.a.a.a.fh(4, this.jhA) + b.a.a.a.fh(5, this.jhB) + b.a.a.a.S(6, this.jhs);
      paramInt = i;
      if (this.jhv != null) {
        paramInt = i + b.a.a.a.fj(7, this.jhv.aYq());
      }
      i = b.a.a.a.fh(8, this.jhx);
      GMTrace.o(14831864250368L, 110506);
      return paramInt + i;
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
      GMTrace.o(14831864250368L, 110506);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      o localo = (o)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14831864250368L, 110506);
        return -1;
      case 1: 
        localo.ID = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14831864250368L, 110506);
        return 0;
      case 2: 
        localo.jhy = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(14831864250368L, 110506);
        return 0;
      case 3: 
        localo.jhz = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(14831864250368L, 110506);
        return 0;
      case 4: 
        localo.jhA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14831864250368L, 110506);
        return 0;
      case 5: 
        localo.jhB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14831864250368L, 110506);
        return 0;
      case 6: 
        localo.jhs = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(14831864250368L, 110506);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new m();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((m)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localo.jhv = ((m)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14831864250368L, 110506);
        return 0;
      }
      localo.jhx = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(14831864250368L, 110506);
      return 0;
    }
    GMTrace.o(14831864250368L, 110506);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\h\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */