package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bba
  extends azh
{
  public int uAG;
  public azp uOg;
  public int uOu;
  public LinkedList<bbb> uOv;
  public int usw;
  
  public bba()
  {
    GMTrace.i(4037537693696L, 30082);
    this.uOv = new LinkedList();
    GMTrace.o(4037537693696L, 30082);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4037671911424L, 30083);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uOg == null) {
        throw new b("Not all required fields were included: ResBuf");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uOu);
      paramVarArgs.d(3, 8, this.uOv);
      paramVarArgs.fk(4, this.uAG);
      paramVarArgs.fk(5, this.usw);
      if (this.uOg != null)
      {
        paramVarArgs.fm(6, this.uOg.aYq());
        this.uOg.a(paramVarArgs);
      }
      GMTrace.o(4037671911424L, 30083);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uOu) + b.a.a.a.c(3, 8, this.uOv) + b.a.a.a.fh(4, this.uAG) + b.a.a.a.fh(5, this.usw);
      paramInt = i;
      if (this.uOg != null) {
        paramInt = i + b.a.a.a.fj(6, this.uOg.aYq());
      }
      GMTrace.o(4037671911424L, 30083);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uOv.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uOg == null) {
        throw new b("Not all required fields were included: ResBuf");
      }
      GMTrace.o(4037671911424L, 30083);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bba localbba = (bba)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4037671911424L, 30083);
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
          localbba.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4037671911424L, 30083);
        return 0;
      case 2: 
        localbba.uOu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4037671911424L, 30083);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bbb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bbb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbba.uOv.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4037671911424L, 30083);
        return 0;
      case 4: 
        localbba.uAG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4037671911424L, 30083);
        return 0;
      case 5: 
        localbba.usw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4037671911424L, 30083);
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
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localbba.uOg = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(4037671911424L, 30083);
      return 0;
    }
    GMTrace.o(4037671911424L, 30083);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */