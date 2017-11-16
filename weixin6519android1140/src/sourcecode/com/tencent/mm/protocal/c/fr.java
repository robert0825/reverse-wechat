package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class fr
  extends com.tencent.mm.bm.a
{
  public String jhm;
  public int tST;
  public String tTU;
  public String tTZ;
  public aos tUa;
  public agx tUb;
  
  public fr()
  {
    GMTrace.i(3846008995840L, 28655);
    GMTrace.o(3846008995840L, 28655);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3846143213568L, 28656);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tST);
      if (this.tTZ != null) {
        paramVarArgs.e(2, this.tTZ);
      }
      if (this.tUa != null)
      {
        paramVarArgs.fm(3, this.tUa.aYq());
        this.tUa.a(paramVarArgs);
      }
      if (this.tTU != null) {
        paramVarArgs.e(4, this.tTU);
      }
      if (this.jhm != null) {
        paramVarArgs.e(5, this.jhm);
      }
      if (this.tUb != null)
      {
        paramVarArgs.fm(6, this.tUb.aYq());
        this.tUb.a(paramVarArgs);
      }
      GMTrace.o(3846143213568L, 28656);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tST) + 0;
      paramInt = i;
      if (this.tTZ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tTZ);
      }
      i = paramInt;
      if (this.tUa != null) {
        i = paramInt + b.a.a.a.fj(3, this.tUa.aYq());
      }
      paramInt = i;
      if (this.tTU != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tTU);
      }
      i = paramInt;
      if (this.jhm != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.jhm);
      }
      paramInt = i;
      if (this.tUb != null) {
        paramInt = i + b.a.a.a.fj(6, this.tUb.aYq());
      }
      GMTrace.o(3846143213568L, 28656);
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
      GMTrace.o(3846143213568L, 28656);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      fr localfr = (fr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3846143213568L, 28656);
        return -1;
      case 1: 
        localfr.tST = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3846143213568L, 28656);
        return 0;
      case 2: 
        localfr.tTZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3846143213568L, 28656);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aos();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aos)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localfr.tUa = ((aos)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3846143213568L, 28656);
        return 0;
      case 4: 
        localfr.tTU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3846143213568L, 28656);
        return 0;
      case 5: 
        localfr.jhm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3846143213568L, 28656);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new agx();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((agx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localfr.tUb = ((agx)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3846143213568L, 28656);
      return 0;
    }
    GMTrace.o(3846143213568L, 28656);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\fr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */