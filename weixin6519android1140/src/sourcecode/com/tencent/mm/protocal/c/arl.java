package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class arl
  extends azh
{
  public int jzH;
  public String jzI;
  public String tUl;
  public atz tUn;
  public String uHF;
  
  public arl()
  {
    GMTrace.i(19145622028288L, 142646);
    GMTrace.o(19145622028288L, 142646);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19145756246016L, 142647);
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
      paramVarArgs.fk(2, this.jzH);
      if (this.jzI != null) {
        paramVarArgs.e(3, this.jzI);
      }
      if (this.uHF != null) {
        paramVarArgs.e(4, this.uHF);
      }
      if (this.tUl != null) {
        paramVarArgs.e(7, this.tUl);
      }
      if (this.tUn != null)
      {
        paramVarArgs.fm(8, this.tUn.aYq());
        this.tUn.a(paramVarArgs);
      }
      GMTrace.o(19145756246016L, 142647);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jzH);
      paramInt = i;
      if (this.jzI != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jzI);
      }
      i = paramInt;
      if (this.uHF != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uHF);
      }
      paramInt = i;
      if (this.tUl != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tUl);
      }
      i = paramInt;
      if (this.tUn != null) {
        i = paramInt + b.a.a.a.fj(8, this.tUn.aYq());
      }
      GMTrace.o(19145756246016L, 142647);
      return i;
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
      GMTrace.o(19145756246016L, 142647);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      arl localarl = (arl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 5: 
      case 6: 
      default: 
        GMTrace.o(19145756246016L, 142647);
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
          localarl.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19145756246016L, 142647);
        return 0;
      case 2: 
        localarl.jzH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19145756246016L, 142647);
        return 0;
      case 3: 
        localarl.jzI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19145756246016L, 142647);
        return 0;
      case 4: 
        localarl.uHF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19145756246016L, 142647);
        return 0;
      case 7: 
        localarl.tUl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19145756246016L, 142647);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new atz();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((atz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localarl.tUn = ((atz)localObject1);
        paramInt += 1;
      }
      GMTrace.o(19145756246016L, 142647);
      return 0;
    }
    GMTrace.o(19145756246016L, 142647);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\arl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */