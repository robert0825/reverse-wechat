package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class qo
  extends azh
{
  public bdz tSl;
  public aho tUS;
  public hz tUT;
  public apx tUU;
  public String ugx;
  
  public qo()
  {
    GMTrace.i(3848961785856L, 28677);
    GMTrace.o(3848961785856L, 28677);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3849096003584L, 28678);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.ugx != null) {
        paramVarArgs.e(2, this.ugx);
      }
      if (this.tUT != null)
      {
        paramVarArgs.fm(3, this.tUT.aYq());
        this.tUT.a(paramVarArgs);
      }
      if (this.tUS != null)
      {
        paramVarArgs.fm(4, this.tUS.aYq());
        this.tUS.a(paramVarArgs);
      }
      if (this.tSl != null)
      {
        paramVarArgs.fm(5, this.tSl.aYq());
        this.tSl.a(paramVarArgs);
      }
      if (this.tUU != null)
      {
        paramVarArgs.fm(6, this.tUU.aYq());
        this.tUU.a(paramVarArgs);
      }
      GMTrace.o(3849096003584L, 28678);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.ugx != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ugx);
      }
      i = paramInt;
      if (this.tUT != null) {
        i = paramInt + b.a.a.a.fj(3, this.tUT.aYq());
      }
      paramInt = i;
      if (this.tUS != null) {
        paramInt = i + b.a.a.a.fj(4, this.tUS.aYq());
      }
      i = paramInt;
      if (this.tSl != null) {
        i = paramInt + b.a.a.a.fj(5, this.tSl.aYq());
      }
      paramInt = i;
      if (this.tUU != null) {
        paramInt = i + b.a.a.a.fj(6, this.tUU.aYq());
      }
      GMTrace.o(3849096003584L, 28678);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3849096003584L, 28678);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      qo localqo = (qo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3849096003584L, 28678);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localqo.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3849096003584L, 28678);
        return 0;
      case 2: 
        localqo.ugx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3849096003584L, 28678);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new hz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((hz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localqo.tUT = ((hz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3849096003584L, 28678);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aho();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aho)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localqo.tUS = ((aho)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3849096003584L, 28678);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localqo.tSl = ((bdz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3849096003584L, 28678);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new apx();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((apx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localqo.tUU = ((apx)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3849096003584L, 28678);
      return 0;
    }
    GMTrace.o(3849096003584L, 28678);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */