package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bev
  extends azh
{
  public String tRP;
  public LinkedList<bfh> tTQ;
  public int uEP;
  public int uQD;
  public int uQE;
  public bfy uQF;
  public String uQz;
  
  public bev()
  {
    GMTrace.i(4007070269440L, 29855);
    this.tTQ = new LinkedList();
    GMTrace.o(4007070269440L, 29855);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4007204487168L, 29856);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uQF == null) {
        throw new b("Not all required fields were included: ServerConfig");
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
      paramVarArgs.fk(5, this.uQD);
      if (this.tRP != null) {
        paramVarArgs.e(6, this.tRP);
      }
      paramVarArgs.fk(7, this.uQE);
      if (this.uQF != null)
      {
        paramVarArgs.fm(8, this.uQF.aYq());
        this.uQF.a(paramVarArgs);
      }
      GMTrace.o(4007204487168L, 29856);
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
      i = i + b.a.a.a.fh(3, this.uEP) + b.a.a.a.c(4, 8, this.tTQ) + b.a.a.a.fh(5, this.uQD);
      paramInt = i;
      if (this.tRP != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tRP);
      }
      i = paramInt + b.a.a.a.fh(7, this.uQE);
      paramInt = i;
      if (this.uQF != null) {
        paramInt = i + b.a.a.a.fj(8, this.uQF.aYq());
      }
      GMTrace.o(4007204487168L, 29856);
      return paramInt;
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
      if (this.uQF == null) {
        throw new b("Not all required fields were included: ServerConfig");
      }
      GMTrace.o(4007204487168L, 29856);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bev localbev = (bev)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4007204487168L, 29856);
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
          localbev.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4007204487168L, 29856);
        return 0;
      case 2: 
        localbev.uQz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4007204487168L, 29856);
        return 0;
      case 3: 
        localbev.uEP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4007204487168L, 29856);
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
          localbev.tTQ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4007204487168L, 29856);
        return 0;
      case 5: 
        localbev.uQD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4007204487168L, 29856);
        return 0;
      case 6: 
        localbev.tRP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4007204487168L, 29856);
        return 0;
      case 7: 
        localbev.uQE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4007204487168L, 29856);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bfy();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bfy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localbev.uQF = ((bfy)localObject1);
        paramInt += 1;
      }
      GMTrace.o(4007204487168L, 29856);
      return 0;
    }
    GMTrace.o(4007204487168L, 29856);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */