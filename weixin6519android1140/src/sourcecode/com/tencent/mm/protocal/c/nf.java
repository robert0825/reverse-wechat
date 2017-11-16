package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class nf
  extends com.tencent.mm.bm.a
{
  public int uea;
  public azp ueb;
  public int uec;
  public azp ued;
  
  public nf()
  {
    GMTrace.i(19114215079936L, 142412);
    GMTrace.o(19114215079936L, 142412);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19114349297664L, 142413);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ueb == null) {
        throw new b("Not all required fields were included: OperationInfo");
      }
      paramVarArgs.fk(1, this.uea);
      if (this.ueb != null)
      {
        paramVarArgs.fm(2, this.ueb.aYq());
        this.ueb.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.uec);
      if (this.ued != null)
      {
        paramVarArgs.fm(4, this.ued.aYq());
        this.ued.a(paramVarArgs);
      }
      GMTrace.o(19114349297664L, 142413);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uea) + 0;
      paramInt = i;
      if (this.ueb != null) {
        paramInt = i + b.a.a.a.fj(2, this.ueb.aYq());
      }
      i = paramInt + b.a.a.a.fh(3, this.uec);
      paramInt = i;
      if (this.ued != null) {
        paramInt = i + b.a.a.a.fj(4, this.ued.aYq());
      }
      GMTrace.o(19114349297664L, 142413);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ueb == null) {
        throw new b("Not all required fields were included: OperationInfo");
      }
      GMTrace.o(19114349297664L, 142413);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      nf localnf = (nf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(19114349297664L, 142413);
        return -1;
      case 1: 
        localnf.uea = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19114349297664L, 142413);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localnf.ueb = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19114349297664L, 142413);
        return 0;
      case 3: 
        localnf.uec = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19114349297664L, 142413);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localnf.ued = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(19114349297664L, 142413);
      return 0;
    }
    GMTrace.o(19114349297664L, 142413);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\nf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */