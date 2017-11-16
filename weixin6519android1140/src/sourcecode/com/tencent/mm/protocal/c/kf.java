package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class kf
  extends azh
{
  public int jWs;
  public String jWt;
  public int uaU;
  public com.tencent.mm.bm.b uaV;
  
  public kf()
  {
    GMTrace.i(16867678748672L, 125674);
    GMTrace.o(16867678748672L, 125674);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16867812966400L, 125675);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jWs);
      if (this.jWt != null) {
        paramVarArgs.e(3, this.jWt);
      }
      if (this.uaV != null) {
        paramVarArgs.b(4, this.uaV);
      }
      paramVarArgs.fk(5, this.uaU);
      GMTrace.o(16867812966400L, 125675);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jWs);
      paramInt = i;
      if (this.jWt != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jWt);
      }
      i = paramInt;
      if (this.uaV != null) {
        i = paramInt + b.a.a.a.a(4, this.uaV);
      }
      paramInt = b.a.a.a.fh(5, this.uaU);
      GMTrace.o(16867812966400L, 125675);
      return i + paramInt;
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
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(16867812966400L, 125675);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      kf localkf = (kf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(16867812966400L, 125675);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localkf.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16867812966400L, 125675);
        return 0;
      case 2: 
        localkf.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(16867812966400L, 125675);
        return 0;
      case 3: 
        localkf.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16867812966400L, 125675);
        return 0;
      case 4: 
        localkf.uaV = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(16867812966400L, 125675);
        return 0;
      }
      localkf.uaU = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(16867812966400L, 125675);
      return 0;
    }
    GMTrace.o(16867812966400L, 125675);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\kf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */