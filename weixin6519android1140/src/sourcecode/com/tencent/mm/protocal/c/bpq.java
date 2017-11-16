package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bpq
  extends azh
{
  public int uKq;
  public LinkedList<boe> uYH;
  public int uZP;
  public LinkedList<boe> uZQ;
  public int uZR;
  public LinkedList<boe> uZS;
  public int uZT;
  public int uZU;
  public int uZV;
  public int uhU;
  public long uhV;
  
  public bpq()
  {
    GMTrace.i(3911909900288L, 29146);
    this.uZQ = new LinkedList();
    this.uZS = new LinkedList();
    this.uYH = new LinkedList();
    GMTrace.o(3911909900288L, 29146);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3912044118016L, 29147);
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
      paramVarArgs.fk(2, this.uhU);
      paramVarArgs.fk(3, this.uZP);
      paramVarArgs.d(4, 8, this.uZQ);
      paramVarArgs.fk(5, this.uZR);
      paramVarArgs.d(6, 8, this.uZS);
      paramVarArgs.T(7, this.uhV);
      paramVarArgs.fk(8, this.uKq);
      paramVarArgs.fk(9, this.uZT);
      paramVarArgs.d(10, 8, this.uYH);
      paramVarArgs.fk(11, this.uZU);
      paramVarArgs.fk(12, this.uZV);
      GMTrace.o(3912044118016L, 29147);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.uhU);
      int j = b.a.a.a.fh(3, this.uZP);
      int k = b.a.a.a.c(4, 8, this.uZQ);
      int m = b.a.a.a.fh(5, this.uZR);
      int n = b.a.a.a.c(6, 8, this.uZS);
      int i1 = b.a.a.a.S(7, this.uhV);
      int i2 = b.a.a.a.fh(8, this.uKq);
      int i3 = b.a.a.a.fh(9, this.uZT);
      int i4 = b.a.a.a.c(10, 8, this.uYH);
      int i5 = b.a.a.a.fh(11, this.uZU);
      int i6 = b.a.a.a.fh(12, this.uZV);
      GMTrace.o(3912044118016L, 29147);
      return paramInt + i + j + k + m + n + i1 + i2 + i3 + i4 + i5 + i6;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uZQ.clear();
      this.uZS.clear();
      this.uYH.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3912044118016L, 29147);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bpq localbpq = (bpq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3912044118016L, 29147);
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
          localbpq.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3912044118016L, 29147);
        return 0;
      case 2: 
        localbpq.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3912044118016L, 29147);
        return 0;
      case 3: 
        localbpq.uZP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3912044118016L, 29147);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new boe();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((boe)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbpq.uZQ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3912044118016L, 29147);
        return 0;
      case 5: 
        localbpq.uZR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3912044118016L, 29147);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new boe();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((boe)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbpq.uZS.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3912044118016L, 29147);
        return 0;
      case 7: 
        localbpq.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3912044118016L, 29147);
        return 0;
      case 8: 
        localbpq.uKq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3912044118016L, 29147);
        return 0;
      case 9: 
        localbpq.uZT = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3912044118016L, 29147);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new boe();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((boe)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbpq.uYH.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3912044118016L, 29147);
        return 0;
      case 11: 
        localbpq.uZU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3912044118016L, 29147);
        return 0;
      }
      localbpq.uZV = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3912044118016L, 29147);
      return 0;
    }
    GMTrace.o(3912044118016L, 29147);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bpq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */