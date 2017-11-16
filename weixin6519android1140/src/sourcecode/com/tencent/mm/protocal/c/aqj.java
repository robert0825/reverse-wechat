package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aqj
  extends com.tencent.mm.bm.a
{
  public int tOG;
  public String tSz;
  public azp tZA;
  public int tZz;
  public nl uGE;
  public int uGF;
  
  public aqj()
  {
    GMTrace.i(13578002235392L, 101164);
    GMTrace.o(13578002235392L, 101164);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13578136453120L, 101165);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uGE == null) {
        throw new b("Not all required fields were included: Oplog");
      }
      if (this.tZA == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      if (this.uGE != null)
      {
        paramVarArgs.fm(1, this.uGE.aYq());
        this.uGE.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tZz);
      if (this.tZA != null)
      {
        paramVarArgs.fm(3, this.tZA.aYq());
        this.tZA.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.tOG);
      if (this.tSz != null) {
        paramVarArgs.e(5, this.tSz);
      }
      paramVarArgs.fk(6, this.uGF);
      GMTrace.o(13578136453120L, 101165);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uGE != null) {
        paramInt = b.a.a.a.fj(1, this.uGE.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tZz);
      paramInt = i;
      if (this.tZA != null) {
        paramInt = i + b.a.a.a.fj(3, this.tZA.aYq());
      }
      i = paramInt + b.a.a.a.fh(4, this.tOG);
      paramInt = i;
      if (this.tSz != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tSz);
      }
      i = b.a.a.a.fh(6, this.uGF);
      GMTrace.o(13578136453120L, 101165);
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
      if (this.uGE == null) {
        throw new b("Not all required fields were included: Oplog");
      }
      if (this.tZA == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      GMTrace.o(13578136453120L, 101165);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aqj localaqj = (aqj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13578136453120L, 101165);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nl();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaqj.uGE = ((nl)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13578136453120L, 101165);
        return 0;
      case 2: 
        localaqj.tZz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13578136453120L, 101165);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaqj.tZA = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13578136453120L, 101165);
        return 0;
      case 4: 
        localaqj.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13578136453120L, 101165);
        return 0;
      case 5: 
        localaqj.tSz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13578136453120L, 101165);
        return 0;
      }
      localaqj.uGF = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13578136453120L, 101165);
      return 0;
    }
    GMTrace.o(13578136453120L, 101165);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aqj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */