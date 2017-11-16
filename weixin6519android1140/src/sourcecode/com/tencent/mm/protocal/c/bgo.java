package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bgo
  extends azh
{
  public LinkedList<bfh> tTQ;
  public bgm uAB;
  public int uEP;
  public int uQD;
  public bfy uQF;
  public String uQz;
  public int uSa;
  public int uSj;
  public long uSk;
  
  public bgo()
  {
    GMTrace.i(3999822512128L, 29801);
    this.tTQ = new LinkedList();
    GMTrace.o(3999822512128L, 29801);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3999956729856L, 29802);
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
      if (this.uQz != null) {
        paramVarArgs.e(2, this.uQz);
      }
      paramVarArgs.fk(3, this.uEP);
      paramVarArgs.d(4, 8, this.tTQ);
      paramVarArgs.fk(5, this.uSj);
      if (this.uAB != null)
      {
        paramVarArgs.fm(6, this.uAB.aYq());
        this.uAB.a(paramVarArgs);
      }
      paramVarArgs.fk(7, this.uSa);
      paramVarArgs.fk(8, this.uQD);
      if (this.uQF != null)
      {
        paramVarArgs.fm(9, this.uQF.aYq());
        this.uQF.a(paramVarArgs);
      }
      paramVarArgs.T(10, this.uSk);
      GMTrace.o(3999956729856L, 29802);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.uQz != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uQz);
      }
      i = i + b.a.a.a.fh(3, this.uEP) + b.a.a.a.c(4, 8, this.tTQ) + b.a.a.a.fh(5, this.uSj);
      paramInt = i;
      if (this.uAB != null) {
        paramInt = i + b.a.a.a.fj(6, this.uAB.aYq());
      }
      i = paramInt + b.a.a.a.fh(7, this.uSa) + b.a.a.a.fh(8, this.uQD);
      paramInt = i;
      if (this.uQF != null) {
        paramInt = i + b.a.a.a.fj(9, this.uQF.aYq());
      }
      i = b.a.a.a.S(10, this.uSk);
      GMTrace.o(3999956729856L, 29802);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tTQ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3999956729856L, 29802);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bgo localbgo = (bgo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3999956729856L, 29802);
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
          localbgo.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3999956729856L, 29802);
        return 0;
      case 2: 
        localbgo.uQz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3999956729856L, 29802);
        return 0;
      case 3: 
        localbgo.uEP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3999956729856L, 29802);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbgo.tTQ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3999956729856L, 29802);
        return 0;
      case 5: 
        localbgo.uSj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3999956729856L, 29802);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bgm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bgm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbgo.uAB = ((bgm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3999956729856L, 29802);
        return 0;
      case 7: 
        localbgo.uSa = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3999956729856L, 29802);
        return 0;
      case 8: 
        localbgo.uQD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3999956729856L, 29802);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbgo.uQF = ((bfy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3999956729856L, 29802);
        return 0;
      }
      localbgo.uSk = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3999956729856L, 29802);
      return 0;
    }
    GMTrace.o(3999956729856L, 29802);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bgo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */