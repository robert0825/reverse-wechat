package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class n
  extends com.tencent.mm.bm.a
{
  public String ID;
  public long jhs;
  public long jht;
  public long jhu;
  public m jhv;
  public long jhw;
  public int jhx;
  
  public n()
  {
    GMTrace.i(14838709354496L, 110557);
    GMTrace.o(14838709354496L, 110557);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14838843572224L, 110558);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new b("Not all required fields were included: ID");
      }
      if (this.ID != null) {
        paramVarArgs.e(1, this.ID);
      }
      paramVarArgs.T(2, this.jhs);
      paramVarArgs.T(3, this.jht);
      paramVarArgs.T(4, this.jhu);
      if (this.jhv != null)
      {
        paramVarArgs.fm(5, this.jhv.aYq());
        this.jhv.a(paramVarArgs);
      }
      paramVarArgs.T(6, this.jhw);
      paramVarArgs.fk(7, this.jhx);
      GMTrace.o(14838843572224L, 110558);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ID != null) {
        paramInt = b.a.a.b.b.a.f(1, this.ID) + 0;
      }
      i = paramInt + b.a.a.a.S(2, this.jhs) + b.a.a.a.S(3, this.jht) + b.a.a.a.S(4, this.jhu);
      paramInt = i;
      if (this.jhv != null) {
        paramInt = i + b.a.a.a.fj(5, this.jhv.aYq());
      }
      i = b.a.a.a.S(6, this.jhw);
      int j = b.a.a.a.fh(7, this.jhx);
      GMTrace.o(14838843572224L, 110558);
      return paramInt + i + j;
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
      GMTrace.o(14838843572224L, 110558);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      n localn = (n)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14838843572224L, 110558);
        return -1;
      case 1: 
        localn.ID = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14838843572224L, 110558);
        return 0;
      case 2: 
        localn.jhs = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(14838843572224L, 110558);
        return 0;
      case 3: 
        localn.jht = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(14838843572224L, 110558);
        return 0;
      case 4: 
        localn.jhu = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(14838843572224L, 110558);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new m();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((m)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localn.jhv = ((m)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14838843572224L, 110558);
        return 0;
      case 6: 
        localn.jhw = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(14838843572224L, 110558);
        return 0;
      }
      localn.jhx = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(14838843572224L, 110558);
      return 0;
    }
    GMTrace.o(14838843572224L, 110558);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\h\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */