package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class asq
  extends azh
{
  public int kBk;
  public String kBl;
  public String lPE;
  public int uIu;
  
  public asq()
  {
    GMTrace.i(3630321106944L, 27048);
    GMTrace.o(3630321106944L, 27048);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3630455324672L, 27049);
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
      paramVarArgs.fk(2, this.kBk);
      if (this.kBl != null) {
        paramVarArgs.e(3, this.kBl);
      }
      if (this.lPE != null) {
        paramVarArgs.e(4, this.lPE);
      }
      paramVarArgs.fk(5, this.uIu);
      GMTrace.o(3630455324672L, 27049);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.kBk);
      paramInt = i;
      if (this.kBl != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.kBl);
      }
      i = paramInt;
      if (this.lPE != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.lPE);
      }
      paramInt = b.a.a.a.fh(5, this.uIu);
      GMTrace.o(3630455324672L, 27049);
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
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3630455324672L, 27049);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      asq localasq = (asq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3630455324672L, 27049);
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
          localasq.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3630455324672L, 27049);
        return 0;
      case 2: 
        localasq.kBk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3630455324672L, 27049);
        return 0;
      case 3: 
        localasq.kBl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3630455324672L, 27049);
        return 0;
      case 4: 
        localasq.lPE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3630455324672L, 27049);
        return 0;
      }
      localasq.uIu = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3630455324672L, 27049);
      return 0;
    }
    GMTrace.o(3630455324672L, 27049);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\asq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */