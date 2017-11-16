package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class apb
  extends com.tencent.mm.bm.a
{
  public agx tUt;
  public agy tUu;
  public int uES;
  
  public apb()
  {
    GMTrace.i(3681189625856L, 27427);
    GMTrace.o(3681189625856L, 27427);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3681323843584L, 27428);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tUt == null) {
        throw new b("Not all required fields were included: HardDevice");
      }
      if (this.tUu == null) {
        throw new b("Not all required fields were included: HardDeviceAttr");
      }
      if (this.tUt != null)
      {
        paramVarArgs.fm(1, this.tUt.aYq());
        this.tUt.a(paramVarArgs);
      }
      if (this.tUu != null)
      {
        paramVarArgs.fm(2, this.tUu.aYq());
        this.tUu.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.uES);
      GMTrace.o(3681323843584L, 27428);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tUt != null) {
        paramInt = b.a.a.a.fj(1, this.tUt.aYq()) + 0;
      }
      i = paramInt;
      if (this.tUu != null) {
        i = paramInt + b.a.a.a.fj(2, this.tUu.aYq());
      }
      paramInt = b.a.a.a.fh(3, this.uES);
      GMTrace.o(3681323843584L, 27428);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tUt == null) {
        throw new b("Not all required fields were included: HardDevice");
      }
      if (this.tUu == null) {
        throw new b("Not all required fields were included: HardDeviceAttr");
      }
      GMTrace.o(3681323843584L, 27428);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      apb localapb = (apb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3681323843584L, 27428);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new agx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((agx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localapb.tUt = ((agx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3681323843584L, 27428);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new agy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((agy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localapb.tUu = ((agy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3681323843584L, 27428);
        return 0;
      }
      localapb.uES = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3681323843584L, 27428);
      return 0;
    }
    GMTrace.o(3681323843584L, 27428);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\apb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */